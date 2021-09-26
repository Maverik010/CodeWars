

def number(bus_stops):
    wynik = 0
    for i in bus_stops:
        wynik += i[0] - i[1]
    print("Wynik: ", wynik)

if __name__ == '__main__':
    liczby=([[3,0],[9,1],[4,10],[12,2],[6,1],[7,10]])
    number(liczby)



