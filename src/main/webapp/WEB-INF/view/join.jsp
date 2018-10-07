<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<form action="/join" method="post">
    <label for="name">이름</label><input type="text" placeholder="이름" id="name" name="name"/>
    <label for="age">나이</label><input type="text" placeholder="나이" id="age" name="age"/>
    <input type="submit" value="제출"/>
</form>
</body>
</html>
