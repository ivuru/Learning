import re
def wareki2seireki(wareki_s, def_value=0):
    era_dic = {"明治": 1868, "大正": 1912, "昭和": 1926, "平成": 1989, "令和": 2019}
    s = re.match(r'(明治|大正|昭和|平成|令和)([0-9]+|元)年', str(wareki_s))
    if s is None: return def_value
    y = int(s.group(2)) if s.group(2) != '元' else 1
    return era_dic[s.group(1)] + y - 1

print(wareki2seireki('昭和60年'))
print(wareki2seireki('令和元年'))