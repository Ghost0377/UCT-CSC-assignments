cost = eval(input('Enter the cost (in cents):\n'))
if cost == 0: #print nothing when there is no cost
    print()
else:
    deposit = eval(input('Deposit a coin or note (in cents):\n'))
    while deposit < cost:    # if the deposit is less than cost, add more coins       
        deposit = deposit + eval(input('Deposit a coin or note (in cents):\n'))
    change = deposit - cost # calculate the change
    if change > 0:
        print('Your change is:\n',end='')
    
    #calculations for R5    
    c = change//500                   # c is coin
    if c > 0:                        #r is remainder
        print(c, 'x R5')
    r = change%500
    #calculations for R2   
    c1 = r//200
    if c1 > 0:
        print(c1, 'x R2')
    r1 = r%200
    #calculations for R1   
    c2 = r1//100
    if c2 > 0:
        print(c2, 'x R1')
    r2 = r1%100  
    #calculations for 50c
    c3 = r2//50
    if c3 > 0:
        print(c3, 'x 50c')
    r3 = r2%50
    #calculations for 20c
    c4 = r3//20
    if c4 > 0:
        print(c4, 'x 20c')
    r4 = r3%20
    #calculations for 10c
    c5 = r4//10
    if c5 > 0:
        print(c5, 'x 10c')
    r5 = r3%10
    #calculations for 5c
    c6 = r5//5
    if c6 > 0:
        print(c6, 'x 5c')
    r6 = r5%5
