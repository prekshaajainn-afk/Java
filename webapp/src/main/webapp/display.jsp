<%@ page import="java.sql.*" %>

<html>
<body>

<h2>Hotel Details</h2>

<table border="2" cellspacing="3">
<tr>
    <th>Name</th>
    <th>Room</th>
    <th>Price</th>
</tr>

<%
try
{
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection connection = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/hotel",
        "root",
        "passwd"
    );

    Statement statement = connection.createStatement();

    ResultSet set = statement.executeQuery("SELECT * FROM hotel");

    while(set.next())
    {
%>

<tr>
    <td><%= set.getString(2) %></td>
    <td><%= set.getString(3) %></td>
    <td><%= set.getInt(4) %></td>
</tr>

<%
    }
    
    connection.close();
}
catch(Exception e)
{
    out.println(e);
}
%>

</table>

</body>
</html>