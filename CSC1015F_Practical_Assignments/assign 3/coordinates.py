# Coordinates.
# Rector Ratsaka
# 06 March 2022

latitude_degrees = eval(input('Enter first number:\n'))
latitude_minutes = eval(input('Enter second number:\n'))
latitude_seconds = eval(input('Enter third number:\n'))
longitude_degrees = eval(input('Enter fourth number:\n'))
longitude_minutes = eval(input('Enter fifth number:\n'))
longitude_seconds = eval(input('Enter sixth number:\n'))

if -90<=latitude_degrees<=90 and -180<=longitude_degrees<=180 and 0<=latitude_minutes<=59 and 0<=longitude_minutes<=59 and 0<=latitude_seconds<=59 and 0<=longitude_seconds<=59:
    print('WOW! Looks like geographic coordinates!')
else:
    print('Hmmm ... looks like 6 random numbers.')
