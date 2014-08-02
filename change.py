def change(n):
    dollar = n//1;
    quarter = ((n-dollar)*100)//25
    dime = ((n - dollar - (quarter/4))*100)//10
    nickel = ((n - dollar - (quarter/4) - (dime/10))*100)//5
    cents = (n - dollar - (quarter/4) - (dime/10) - (nickel/20))*100
    print int(dollar),"dollar"
    print int(quarter),"quarters"
    print int(dime),"dimes"
    print int(nickel),"nickels"
    print int(cents),"cents"
change(25.76)
