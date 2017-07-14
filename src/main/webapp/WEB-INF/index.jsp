<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add User From</title>
</head>
<body>
<form action="login" method="post">
    <fieldset>
        <legend>创建用户</legend>
        <p>
            <label>姓名：</label> <input type="text" id="name" name="name"
                                      tabindex="1">
        </p>
        <p>
            <label>年龄：</label> <input type="text" id="age" name="age"
                                      tabindex="2">
        </p>
        <p>
            <label>密码：</label> <input type="text" id="pwd" name="pwd"
                                      tabindex="3">
        </p>
        <div><img src="images/1.png"></div>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4" value="取消"> <input
                id="submit" type="submit" tabindex="5" value="登陆">
        </p>
    </fieldset>
</form>
</body>
</html>