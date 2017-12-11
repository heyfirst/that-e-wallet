<%-- 
    Document   : confirmtopup
    Created on : Dec 11, 2017, 3:34:36 PM
    Author     : shunq_
--%>

<%@page import="com.tlt.thatewallet.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <title>Confirm Top Up</title>
    </head>
    <body>
        <form action="UpdateAmount">
            <div>
            <h1>Comfirm Top Up</h1>
            <br><br>
            <%
                User user = (User) request.getAttribute("user");
                Double topup = (Double) request.getAttribute("topup");
            %>
            <p>ชื่อ: <%= user.getName() %> </p>
            <p>เบอร์โทรศัพท์: <%= user.getPhoneNumber()%></p>
            <p>จำนวนเงินคงเหลือ: <%= user.getuAmount() %> บาท</p>
            <p>จำนวนเงินที่จะเติม: <%= topup %> บาท</p>
            <p>จำนวนเงินทั้งหมด: <%= user.getuAmount() + topup %> บาท</p>
            <input type="hidden" name="topup" value="<%= topup %>" />
            <input type="hidden" name="phoneNumber" value="<%= user.getPhoneNumber() %>" />
            <br>
                <button type="button" class="btn btn-outline-dark">ย้อนกลับ</button>
                <button type="submit" class="btn btn-outline-success">ยืนยัน</button>
            </div>
        </form>
    </body>
</html>
