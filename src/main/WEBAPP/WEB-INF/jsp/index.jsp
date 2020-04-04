<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Viruses</title>
    <style>
        table {
            font-family: arial, "Roboto Light";
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 3px solid black;
            text-align: center;
            padding: 8px;

        }

        tr:nth-child(even) {
            background-color: white;
        }
    </style>
</head>
<body>

<h2>Madison's Most Deadly Virus Table</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Duration</th>
        <th>Mortality Rate</th>
    </tr>
    <c:forEach var = "listitem" items = "${viruslist}">
        <tr>
            <td>${listitem.getId()}</td>
            <td>${listitem.getName()}</td>
            <td>${listitem.getDescription()}</td>
            <td>${listitem.getSymptoms()}</td>
            <td>${listitem.getDuration()}</td>
            <td>${listitem.getMortalityrate()}</td>

        </tr>
    </c:forEach>

</table>

</body>
</html>
