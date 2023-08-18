from bs4 import BeautifulSoup

html_file = open('source.html', "r", encoding="utf-8")
soup = BeautifulSoup(html_file.read(), 'lxml')


league_divs = soup.find_all('div', class_='competition_competition__s2ULZ')

for div in league_divs:
    div_txt = div.text
    league_name = div.find('a', class_='competition_name__YEMb_')
    team_a = div.find("div", class_='team_team___lVK_ team_team-a__2YS_9')
    team_b = div.find("div", class_='team_team___lVK_ team_team-b__YaeU1')
    
    print(league_name.text)
    print(team_a.text)
    print(team_b.text)

    print('\n\n\n\n')
