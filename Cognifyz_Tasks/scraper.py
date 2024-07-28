import requests
from bs4 import BeautifulSoup

req=requests.get("https://cognifyz.com/")


soup=BeautifulSoup(req.content,"html.parser")

#res=soup.title
#print(soup.get_text())


print(soup.prettify());