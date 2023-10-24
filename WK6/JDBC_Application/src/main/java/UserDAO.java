import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public enum UserDAO {
	instance;
	
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		
		String DRIVER_URL = "jdbc:hsqldb:hsql://localhost/oneDB";
		String USERNAME = "sa";
		String PASSWORD = "";
		
		// Load the driver class
		Class.forName("org.hsqldb.jdbcDriver");
		
		// Get connection from DriverManager
		Connection connection;
		connection = DriverManager.getConnection(DRIVER_URL, USERNAME, PASSWORD);
		return connection;
	}
	
	public void insertUser(User newUser) throws Exception{
		// Get connection
		Connection connection = getConnection();
		
		// Create prepared statement with placeholders for the parameters
		PreparedStatement query = connection.prepareStatement("INSERT INTO USER (name, address) VALUES (?, ?)");
		
		// Update placeholders with the properties
		query.setString(1, newUser.getName());
		query.setString(2, newUser.getAddress());
		
		// Execute the statement
		query.executeUpdate();
	}
	
	public void deleteUser(String name) throws Exception{
		Connection connection = getConnection();
		
		PreparedStatement query = connection.prepareStatement("DELETE FROM USER WHERE name = ?");
		
		query.setString(1, name);
		
		query.executeUpdate();
	}
	
	public void selectUser() throws Exception{
		Connection connection = getConnection();
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT name, address FROM USER");

		while (resultSet.next()) {
			String name = resultSet.getString("name");
			String address = resultSet.getString("address");
			System.out.println("Name: " + name + "\nAddress: " + address);
		}
	}
	
	public void updateAddress(String address, String name) throws Exception{
		Connection connection = getConnection();
		
		String updateAddress = "UPDATE user SET address = " + address + "WHERE name = ?";
		
		PreparedStatement statement = connection.prepareStatement(updateAddress);
		
		statement.setString(1, name);
		statement.executeUpdate();
		
	}
	
	public List<User> list() throws ClassNotFoundException, SQLException{
		Connection connection = getConnection();
		
		ArrayList<User> list = new ArrayList<>();
		
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT name, address FROM USER");
		list.add((User) rs);

		return list;
	}
	
	public static void main(String[] args) throws Exception {
		
		User u1 = new User("Lilly", "Athone");
		
		//instance.insertUser(u1);
		//instance.selectUser();
		//instance.deleteUser("john");
		
		//u1.setAddress("Roscommon");
		
		instance.updateAddress("Roscommon", "Lilly");
		
		
		
	}

}
