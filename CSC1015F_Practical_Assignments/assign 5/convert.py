# convert date and time
# Rector Ratsaka
# 19 March 2022

date_time = str(input('Enter the date and time (yyyy-mm-dd hh:mm):\n'))

#slicing date_time and assign to different components
time = int(date_time[11:13])
day = int(date_time[8:10])
month = int(date_time[5:7])
year = int(date_time[2:4])

#for time and assigning am and pm. 
if 1 <= time <= 9:
    print(date_time[12:16],'am on the',end=' ')
elif 10 <= time <= 11:
    print(date_time[11:16],'am on the',end=' ')
elif time == 12:
    print(date_time[11:16],'pm on the',end=' ')
elif time == 13:
    print('1',date_time[13:16],' pm on the',end=' ',sep='') 
elif time == 14:
    print('2',date_time[13:16],' pm on the',end=' ',sep='') 
elif time == 15:
    print('3',date_time[13:16],' pm on the',end=' ',sep='')
elif time == 16:
    print('4',date_time[13:16],' pm on the',end=' ',sep='')
elif time == 17:
    print('5',date_time[13:16],' pm on the',end=' ',sep='')
elif time == 18:
    print('6',date_time[13:16],' pm on the',end=' ',sep='')
elif time == 19:
    print('7',date_time[13:16],' pm on the',end=' ',sep='')
elif time == 20:
    print('8',date_time[13:16],' pm on the',end=' ',sep='')
elif time == 21:
    print('9',date_time[13:16],' pm on the',end=' ',sep='')
elif time == 22:
    print('10',date_time[13:16],' pm on the',end=' ',sep='')
elif time == 23:
    print('11',date_time[13:16],' pm on the',end=' ',sep='') 
elif time == 0o0:
    print('12',date_time[13:16],' am on the',end=' ',sep='')   
#for day  and assigning suffix(st,nd,rd,th) 
if day == 0o1:
    print(date_time[9:10],'st of',end=' ',sep='')
elif day == 0o2:
    print(date_time[9:10],'nd of',end=' ',sep='')
elif day == 0o3:
    print(date_time[9:10],'rd of',end=' ',sep='')
elif 0o4 <= day <= 9:
    print(date_time[9:10],'th of',end=' ',sep='')
elif 10 <= day <= 30 and day!=21 and day!=22 and day!=23:
    print(date_time[8:10],'th of',end=' ',sep='')
elif day == 21:
    print(date_time[8:10],'st of',end=' ',sep='') 
elif day == 22:
    print(date_time[8:10],'nd of',end=' ',sep='')
elif day == 23:
    print(date_time[8:10],'rd of',end=' ',sep='')
elif day == 31:
    print(date_time[8:10],'st of',end=' ',sep='')
#for month 
if month == 0o1:
    print('January',end='')
elif month == 0o2:
    print('February',end='')
elif month == 0o3:
    print('March',end='')
elif month == 0o4:
    print('April',end='')
elif month == 0o5:
    print('May',end='')
elif month == 0o6:
    print('June',end='')
elif month == 0o7:
    print('July',end='')
elif month == 8:
    print('August',end='')
elif month == 9:
    print('September',end='')
elif month == 10:
    print('October',end='')
elif month == 11:
    print('November',end='')
elif month == 12:
    print('December',end='')
#for year and showing year as '(last two digits)
if year == 0o0:  
    print(" '","00",sep='')
else:
    print(" '",year,sep='')