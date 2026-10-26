<%@ page import="java.sql.*" %>

<%
String name = request.getParameter("n1");
String room = request.getParameter("n2");
String price = request.getParameter("n3");

try
{
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection connection = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/hotel",
        "root",
        "passwd"
    );

    PreparedStatement ps = connection.prepareStatement(
        "INSERT INTO hotel(name, room, price) VALUES(?,?,?)"
    );

    ps.setString(1, name);
    ps.setString(2, room);
    ps.setInt(3, Integer.parseInt(price));

    ps.executeUpdate();

    out.println("Hotel Added Successfully!");
    out.println("<br><a href='display.jsp'>View Hotels</a>");
}
catch(Exception e)
{
    out.println(e);
}
%>