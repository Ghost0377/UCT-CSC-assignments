#A program that accepts the name of a month and a year as input and prints out the calendar for that month.
#Rector Ratsaka
#01 April 2022

import math

def day_of_week(day, month, year):
   if month == 1 or month == 2 :
      year -=1 
      month +=12
   h = (day+math.floor((13*(month+1))/5)+year+math.floor(year/4)-math.floor(year/100)+math.floor(year/400))%7
   n = ((h + 5)%7) +1
   return n   #calculate day of week using zeller's congruence      
def is_leap(year):
   if year%4 == 0 and year%400 ==0:
      return True
   elif year%4 == 0 and year%100 !=0:
      return True
   else:
      return False   

def month_num(month_name):
   if month_name == 'january' or month_name == 'JANUARY' or month_name == 'January':
      return 1
   elif month_name == 'february' or month_name == 'FEBRUARY' or month_name == 'February':
      return 2
   elif month_name == 'march' or month_name == 'MARCH' or month_name == 'March':
      return 3
   elif month_name == 'april' or month_name == 'APRIL' or month_name == 'April':
      return 4
   elif month_name == 'may' or month_name == 'MAY' or month_name == 'May':
      return 5
   elif month_name == 'june' or month_name == 'JUNE' or month_name == 'June':
      return 6
   elif month_name == 'july' or month_name == 'JULY' or month_name == 'July':
      return 7
   elif month_name == 'august' or month_name == 'AUGUST' or month_name == 'August':
      return 8
   elif month_name == 'september' or month_name == 'SEPTEMBER' or month_name == 'September':
      return 9
   elif month_name == 'october' or month_name == 'OCTOBER' or month_name == 'October':
      return 10
   elif month_name == 'november' or month_name == 'NOVEMBER' or month_name == 'November':
      return 11
   elif month_name == 'december' or month_name == 'DECEMBER' or month_name == 'December': 
      return 12    

def num_days_in(month_num, year):
    
   if month_num == 1 or month_num == 3 or month_num == 5 or month_num == 7 or month_num == 8 or month_num == 10 or month_num == 12:
      return 31
   elif month_num == 4 or month_num == 6 or month_num == 9 or month_num == 11:
      return 30
   elif month_num == 2 and is_leap(year) == False:
      return 28
   elif month_num == 2 and is_leap(year) == True:
      return 29   
    
def num_weeks(month_num, year):
   return math.ceil((num_days_in(month_num, year)+day_of_week(1, month_num, year)-1)/7)


def week(week_num, start_day, days_in_month):
   begin = (week_num - 1)*7+2-start_day
   output =''
   if begin<1:
      output +='  '
   else:
      output += '{:2d}'.format(begin)
   for day in range(begin+1, begin+7):
      output +=' '
      if day<1 or day> days_in_month:
         output +='  '
      else:
         output += '{:2d}'.format(day)
   return output

def main(): 
   month = input("Enter month:\n")
   year = int(input("Enter year:\n"))   
   print(month)
   print('Mo Tu We Th Fr Sa Su')   
   monthNum = month_num(month)
   start_day = day_of_week(1,monthNum,year)
   days_in_month = num_days_in(monthNum,year)
   
   for week_num in range(1, num_weeks(monthNum,year)+1):
      print(week(week_num, start_day, days_in_month))    
if __name__=='__main__':
   main()






