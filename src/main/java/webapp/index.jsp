<%--
  Created by IntelliJ IDEA.
  User: hawk
  Date: 14.04.2017
  Time: 1:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <title>CRUD</title>
    <style>
        p {font-size: 24px}
        div {font-size: 24px; text-align: center}
        .normal {
            color: green;

        }

        .exceeded {
            color: red;
        }
    </style>
</head>
<body>
<h1>CRUD App</h1>

<%--<p>Search:</p>
<form method="post" action="coms?action=filter">
    <dl>
        <dt>From Date:</dt>
        <dd><input type="date" name="startDate" value="${startDate}"></dd>
    </dl>
    <dl>
        <dt>To Date:</dt>
        <dd><input type="date" name="endDate" value="${endDate}"></dd>
    </dl>
    <dl>
        <dt>From Time:</dt>
        <dd><input type="time" name="startTime" value="${startTime}"></dd>
    </dl>
    <dl>
        <dt>To Time:</dt>
        <dd><input type="time" name="endTime" value="${endTime}"></dd>
    </dl>
    <button type="submit">Filter</button>
</form>--%>

<p>List of Entity</p>
<div><a href="coms?action=create">Create new entity</a></div>

<table>

    <tr>
        <th width="20%">Дата</th><th width="40%">Название</th><th width="20%">Город</th><th></th><th></th>
    </tr>
    <c:forEach var="competition" items="${competitionlist}">
        <c:set var="st" value="normal"></c:set>
        <jsp:useBean id="competition" scope="page" type="com.cherkasov.entity.Competition"/>
<%--       <c:if test="${meal.exceed}" >
            <c:set var="st" value="exceeded"></c:set>
        </c:if>--%>
        <tr class=${st}>
            <td >
                <div>${competition.date_from} : ${competition.date_to}</div>
            </td>
            <td>
                <div><c:out value="${competition.name}"/></div>
            </td>
            <td>
                <div><c:out value="${competition.city}"/></div>

            </td>
            <td>${competition.country}</td>
            <td>${competition.level}</td>
            <td><a href="coms?action=edti&id=${competition.id}">Edit (if has rights)</a></td>
        </tr>

    </c:forEach>


</table>
</body>
</html>
