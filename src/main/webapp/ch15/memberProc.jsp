<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.servlet.ch15.MemberService" %>

<jsp:useBean id="member" class="com.example.bean.Member" />
<jsp:setProperty name="member" property="*" />

<%
    MemberService memberService = new MemberService();
    memberService.memberInsert(member);

    request.getRequestDispatcher("memberOutput.jsp").forward(request, response);
%>
