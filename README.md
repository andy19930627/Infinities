# 1. 新增一本書籍

## a. method:POST，http://localhost:8080/books  
## b. body
```
{
  "id": 9999,
  "name": "Horry potter2",
  "author": "JK",
  "translator": "Li Li",
  "isbn": "TKU",
  "publisher": "cuban",
  "publicationDate": "2022/01/22",
  "price": 6000
}
```
## c. response
回傳新增書籍的資訊
```
{
  "id": 9999,
  "name": "Horry potter2",
  "author": "JK",
  "translator": "Li Li",
  "isbn": "TKU",
  "publisher": "cuban",
  "publicationDate": "2022/01/22",
  "price": 6000
}
```
# 2. 更新一本書籍資料

## a. method:PUT，http://localhost:8080/books/{id}
## b.body
先查詢若有責更新書籍資訊，若沒有則新增書籍
```
http://localhost:8080/books/1

{
  "id": 1,
  "name": "Horry potter2",
  "author": "JK",
  "translator": "Li Li",
  "isbn": "TKU",
  "publisher": "cuban",
  "publicationDate": "2022/01/22",
  "price": 1000
}
```
## c. response

```
{
  "id": 1,
  "name": "Horry potter2",
  "author": "JK",
  "translator": "Li Li",
  "isbn": "TKU",
  "publisher": "cuban",
  "publicationDate": "2022/01/22",
  "price": 1000
}
```
# 3. 刪除一本書籍

## a. method:DEL，http://localhost:8080/books/9998
## b. body

## c. response
回傳刪除的書籍的資訊
```
{
    "id": 9998,
    "name": "Horry potter",
    "author": "JK",
    "translator": "Li Li",
    "isbn": "TKU",
    "publisher": "cuban",
    "publicationDate": "2022/01/22",
    "price": 6000
}
```
# 4. 列出所有書籍

## a. method:GET，http://localhost:8080/books
## b. body
## c. response
回傳新增書籍的資訊
```
[
    {
        "id": 9998,
        "name": "Horry potter",
        "author": "JK",
        "translator": "Li Li",
        "isbn": "TKU",
        "publisher": "cuban",
        "publicationDate": "2022/01/22",
        "price": 6000
    },
    {
        "id": 9999,
        "name": "Horry potter2",
        "author": "JK",
        "translator": "Li Li",
        "isbn": "TKU",
        "publisher": "cuban",
        "publicationDate": "2022/01/22",
        "price": 6000
    }
]
```




