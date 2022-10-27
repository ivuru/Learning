turn = 1
symbol = "O"
win = False

board = [[(i + 1) + (j * 3) for i in range(3)] for j in range(3)]

def view():

    print(board[0][0], "|", board[0][1], "|", board[0][2], "\n", "--+---+--", "\n", \
        board[1][0], "|", board[1][1], "|", board[1][2], "\n", "--+---+--", "\n", \
        board[2][0], "|", board[2][1], "|", board[2][2])

while turn <= 9:

    view()

    print(turn, "ターン目。", symbol, "を置く場所を選んでください。")
    position = input("入力：")

    if position == "1" and board[0][0] == 1:
        board[0][0] = symbol
    elif position == "2" and board[0][1] == 2:
        board[0][1] = symbol
    elif position == "3" and board[0][2] == 3:
        board[0][2] = symbol
    elif position == "4" and board[1][0] == 4:
        board[1][0] = symbol
    elif position == "5" and board[1][1] == 5:
        board[1][1] = symbol
    elif position == "6" and board[1][2] == 6:
        board[1][2] = symbol
    elif position == "7" and board[2][0] == 7:
        board[2][0] = symbol
    elif position == "8" and board[2][1] == 8:
        board[2][1] = symbol
    elif position == "9" and board[2][2] == 9:
        board[2][2] = symbol
    else:
        print("表示されている数字を入力してください。")
        continue

    if board[0][0] == board[0][1] == board[0][2] == symbol or \
        board[1][0] == board[1][1] == board[1][2] == symbol or \
        board[2][0] == board[2][1] == board[2][2] == symbol or \
        \
        board[0][0] == board[1][0] == board[2][0] == symbol or \
        board[0][1] == board[1][1] == board[2][1] == symbol or \
        board[0][2] == board[1][2] == board[2][2] == symbol or \
        \
        board[0][0] == board[1][1] == board[2][2] == symbol or \
        board[2][0] == board[1][1] == board[0][2] == symbol:

        win = True
        break

    symbol = "X" if turn % 2 == 1 else "O"

    turn += 1

view()

if win == True:
    print(symbol, "の勝ちです。")

else:
    print("引き分けです。")