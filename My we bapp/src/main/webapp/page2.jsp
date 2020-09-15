<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style2.css">
    <title>Page2</title>
</head>
<body>
    <h4> Hello <%= request.getParameter("name") %></h4>
    <br>
    <p>Make your order:</p>
    <select name = "product">
        <option>Book</option>
        <option>Mobile Phone</option>
        <option>хз</option>
    </select>
</body>
</html>