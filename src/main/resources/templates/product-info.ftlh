<!DOCTYPE html>
<html>
<head>
    <title>
        BuyOpt
    </title>
</head>
<body>
<h1 style ="text-align:center">BUYOPT</h1>
<a>подробнее о товаре :</a>
<b>Название товара : </b> ${product.title}<br>
<b>Описание товара : </b> ${product.description}<br>
<b>Цена : </b> ${product.price}<br>
<b>Город : </b> ${product.city}<br>
<b>Автор : </b> ${product.author}<br>


<form action = "/product/delete/${product.id}" method="post">
    <input type="submit" value="удалить товар">
</form>
</body>


</html>