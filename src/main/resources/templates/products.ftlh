<!DOCTYPE html>
<html>
<head>
    <title>
        BuyOpt
    </title>
</head>
<body>
<h1 style ="text-align:center">BUYOPT</h1>
<a>все товары :</a>
<form action="/" method="get">
    Поиск по названию объявления: <input type="text" name="title"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list products as product>
<div>
    <p><b>${product.title}</b><b>${product.price} .руб </b> | <a href = "/product/${product.id}">Подробнее...</a></p>

</div>
<#else>
    <h3>товаров нет</h3>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action = "/product/create" method="post">
    Название товара : <input type="text" name="title"/><br><br>
    Описание товара : <input type="text" name="description"/><br><br>
    Цена : <input type="number" name=" price"/><br><br>
    Город : <input type="text" name="city"/><br><br>
    Автор : <input type="text" name="author"/><br><br>
   <input type="submit" value="добавить товар">
</form>
</body>


</html>