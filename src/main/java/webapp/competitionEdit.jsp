<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>New Competition</title>
    <style>
        dl {
            background: none repeat scroll 0 0 #FAFAFA;
            margin: 8px 0;
            padding: 0;
        }

        dt {
            display: inline-block;
            width: 170px;
        }

        dd {
            display: inline-block;
            margin-left: 8px;
            vertical-align: top;
        }
    </style>
</head>
<body>
<section>
    <h2><a href="index.jsp">Home</a></h2>
    <h3>${param.action == 'create' ? 'Create Comp' : 'Edit Comp'}</h3>
    <hr>
    <jsp:useBean id="competition" type="com.cherkasov.entity.Competition" scope="request"/>
    <form method="post" action="coms">
        <input type="hidden" name="id" value="${competition.id}">
        <input type="hidden" name="act" value="save">

        <dl>
            <dt>DateTime:</dt>
            <dd><input type="datetime-local" value="${competition.date_from}" name="dateTime"></dd>
        </dl>
        <dl>
            <dt>Name:</dt>
            <dd><input type="text" value="${competition.name}" size=40 name="name"></dd>
        </dl>
        <dl>
            <dt>Country:</dt>
            <%--<dd><input type="number" value="${competition.country}" name="country"></dd>--%>
            <dd><input type="text" value="${competition.country}" name="country"></dd>
        </dl>
        <button type="submit">Save</button>
        <button onclick="window.history.back()">Cancel</button>
    </form>
</section>
</body>
</html>
