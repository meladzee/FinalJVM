private static final String DB_URL = "jdbc:mysql://localhost:3306/btu"

private static  final String USERNAME = "kanistrate"

private static final String PASSWORD = "123456"


public static void main(String[] args) throws SQLException {
    Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM POINTS WHERE MY_POINTS >= AVERAGE_POINT ORDER BY 1 DESC");
    
    
    
    while (resultSet.next()) {
        System.out.println(resultSet.getInt("ID"));
        System.out.println(resultSet.getString("AUTHOR"));
    }
        }
        
        resultSet.close()
