<%@ page import="entity.User" %>
<%@ page import="java.util.List" %>
<html>
<body>
<%
    List<User> users=(List<User>) request.getAttribute("users");
    for(User user:users){
%>
    ID:  <%=user.getId() %>
    NAME:<%=user.getName() %>
    AGE: <%=user.getAge() %>
    <br>
<%
    }
%>
</body>
</html>
