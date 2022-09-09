Scriptling tags

scriptlet

<%@page import="java.util.List,java.util.Date"%>
 scriptlet - goes in the service method
 
 <%
 
 Date d=new Date();
 out.println(d);
 
 List list;
 out.println(name);
 sayhello();
 
 String name=request.getParameter("name");
 session.setAttribute("myname",name);
 %>
 
 declaration - goes outside the service method(cant use implicit objects here)
 <%!
 String name="hello world";
 public void sayhello(){
	 System.out.println("heloo jii");
 }
 
 %>
 
 Expression- a single line code,which only gives an output
 
<%="hello world"%>
<h1>
<%=session.getAttribute("myname") %>
</h1>