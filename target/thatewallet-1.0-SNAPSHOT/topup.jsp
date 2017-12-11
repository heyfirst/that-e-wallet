<%-- 
    Document   : topup
    Created on : Dec 11, 2017, 2:15:53 PM
    Author     : KS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <title>Top Up</title>
    </head>
    <body>
    <center>
        <div class="w-25 p-3">
            <h1>Top Up</h1>
            <form action="topup" method="POST"><br>
                <div class="form-group" style="text-align: left">
                    <label for="inputTopup">จำนวนเงิน</label>
                    <input type="text" class="form-control" id="inputTopup" name="topup" placeholder="0.00">
                </div>
                <div class="form-group" style="text-align: left">
                    <label for="inputPhonenumber">เบอร์โทรศัพท์</label>
                    <input type="text" class="form-control" id="inputPhonenumber" name="phoneNumber" placeholder="0XX-XXX-XXXX">
                </div>
                <button type="button" class="btn btn-outline-dark">ย้อนกลับ</button>
                <button type="submit" class="btn btn-outline-success">ยืนยัน</button>
            </form>
        </div>
    </center>
</body>
</html>
