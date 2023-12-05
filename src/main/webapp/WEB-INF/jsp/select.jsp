<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>select</title>
</head>
<body>
<h1 align="center">TotalPolicies [JSP]</h1>
<br>
<br>
<table id="userTable">
    <thead>
    <tr>
        <th>DomainID</th>
        <th>PolicyID</th>
        <th>PolicyName</th>
        <th>RegDate</th>
        <th>LastModifyDate</th>
        <th>Memo</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${result }" var="r" >
        <tr >
            <td style="border-right: 1px solid">${r.domainId }</td>
            <td style="border-right: 1px solid">${r.policyId }</td>
            <td style="border-right: 1px solid">${r.policyName }</td>
            <td style="border-right: 1px solid">${fn:substring(r.regDate,0,4) }-${fn:substring(r.regDate,4,6) }-${fn:substring(r.regDate,6,8) } ${fn:substring(r.regDate,8,10) }:${fn:substring(r.regDate,10,12) }:${fn:substring(r.regDate,12,14) }</td>
            <td style="border-right: 1px solid">${fn:substring(r.lastModifyDate,0,4) }-${fn:substring(r.lastModifyDate,4,6) }-${fn:substring(r.lastModifyDate,6,8) } ${fn:substring(r.lastModifyDate,8,10) }:${fn:substring(r.lastModifyDate,10,12) }:${fn:substring(r.lastModifyDate,12,14) }</td>
            <td style="border-right: 1px solid">${r.memo }</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>