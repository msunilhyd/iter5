from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
from webdriver_manager.chrome import ChromeDriverManager
from bs4 import BeautifulSoup
import lxml
import time 

options = Options()
options.add_argument('--allow-running-insecure-content')
options.add_argument('--ignore-certificate-errors')

driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()), options=options)

driver.get("https://www.goal.com/en-us/fixtures/2023-08-20")

time.sleep(10)

divs = driver.find_elements("xpath", "//div[contains(@class, 'competition_competition__s2ULZ')]")

driver.close
i = 0
print(type(divs))

while i < len(divs):
    div = divs[i]
    div_txt = div.text
    league_name = div.find_element("xpath", "//a[contains(@class, 'competition_name__YEMb_')]")
    team_a = div.find_element("xpath", "//div[contains(@class, 'team_team___lVK_ team_team-a__2YS_9')]")
    team_b = div.find_element("xpath", "//div[contains(@class, 'team_team___lVK_ team_team-b__YaeU1')]")
    
    print("league = " +league_name.text)
    print(team_a.text)
    print(team_b.text)
    print("div.txt = " + div_txt)
    i += 1;
    if (i == 3):
        break
# for div in divs:
#     league_name = div.find_element("xpath", "//a[contains(@class, 'competition_name__YEMb_')]")
#     team_a = div.find_element("xpath", "//div[contains(@class, 'team_team___lVK_ team_team-a__2YS_9')]")
#     team_b = div.find_element("xpath", "//div[contains(@class, 'team_team___lVK_ team_team-b__YaeU1')]")
    
#     print("league = " +league_name.text)
#     print(team_a.text)
#     print(team_b.text)
#     print(div.text)
#     i += 1;
#     print("============")
#     if (i == 2):
#       break

# # driver.get("https://www.goal.com/en-us/fixtures/2023-08-18")
