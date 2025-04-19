<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%!
    public void work(String p, PageContext pageContext) {
        try {
            JspWriter out = pageContext.getOut();    // point 1
            if (p.equalsIgnoreCase("include")) {
                out.print("-- include 전 -- <br>");
                pageContext.include("test.jsp");     // point 2
                out.print("-- include 후 -- <br>");
            } else if (p.equalsIgnoreCase("forward")) {
                pageContext.forward("test.jsp");     // point 2
            }
        } catch (Exception e) {
            System.out.println("오류 발생!");
        }
    }
%>

<html>
<head>
    <title>pageContext</title>
</head>
<body>
    <h3>example13.jsp 페이지 시작</h3>
<%
    String p = request.getParameter("p");
    this.work(p, pageContext);
%>
    <h3>example13.jsp 페이지 끝</h3>
</body>
</html>
