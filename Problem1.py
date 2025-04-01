# Problem1.py - Number Operations Solution
# With robust input handling

def solve_sum(a, b):
    return a + b


def solve_product(a, b):
    return a * b


def solve_even_odd(a, b):
    return "even" if (a + b) % 2 == 0 else "odd"


def get_input():
    while True:
        try:
            a, b = map(int, input().split())
            return a, b
        except ValueError:
            print("Invalid input. Please enter two integers separated by space.")
            continue


if __name__ == "__main__":
    a, b = get_input()
    print(solve_sum(a, b))
    print(solve_product(a, b))
    print(solve_even_odd(a, b))
