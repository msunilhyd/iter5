from selenium import webdriver
import time

driver = webdriver.Firefox()
driver.get('https://www.goal.com/en-us/fixtures/2023-08-20')
time.sleep(10)

f = open('data.html', "w", encoding='utf-8')
f.write(driver.page_source)
f.close()

