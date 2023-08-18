from bs4 import BeautifulSoup

html_file = open('data.html', "r", encoding="utf-8")
soup = BeautifulSoup(html_file.read(), 'lxml')

league_divs = soup.find_all('div', class_='competition_competition__s2ULZ')

with open('matches.txt', 'w', encoding='utf-8') as f:
    for div in league_divs:
        div_txt = div.text
        league_name = div.find('a', class_='competition_name__YEMb_')
        f.write(league_name.text + '\n')
        matches_div = div.find('div', class_='round-wrapper')
        all_matches = matches_div.find_all('div', class_='row_row__UQmGm row')
        for match in all_matches:
            team_a = match.find("div", class_='team_team___lVK_ team_team-a__2YS_9')
            team_b = match.find("div", class_='team_team___lVK_ team_team-b__YaeU1')
        
            f.write(team_a.text + ' vs ' + team_b.text + '\n')

        f.write('\n\n\n\n')
