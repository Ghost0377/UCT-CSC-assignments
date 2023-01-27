# Rows.
# Rector Ratsaka
# 06 March 2022

n = eval(input('Enter the start number:\n'))
if -6<n<93:
  for r in range(n, n+7):
    if r < 0 or r >= 10:
      print(r, end=' ')
    else:
      print('',r, end = ' ')
    
    