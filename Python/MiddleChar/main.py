# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
import math as m

def get_middle(s):
    dl = len(s)
    index = m.floor(dl / 2)
    if (dl%2==0):
        r = s[index-1]
        r += s[index]
        print(r)
    else:
        r = s[index]
        print(r)


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    get_middle('nIoheEqcvEsRHBiSmuk')

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
