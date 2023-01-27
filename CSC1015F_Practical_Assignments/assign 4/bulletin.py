# Months.
# Rector Ratsaka
# 13 March 2022
message = ('no message yet')   # the program starts with no message
while True:  # this will loop until you need to break it
  print('Welcome to UCT BBS')
  print('MENU')
  print('(E)nter a message')
  print('(V)iew message')
  print('(L)ist files')
  print('(D)isplay file')
  print('e(X)it') 
  selection = input('Enter your selection:\n')
  if selection == 'e':
    message = input('Enter the message:\n')
  elif selection == 'v':
    print('The message is:' ,message) # this will print the message tha you have
  elif selection == 'x':               # inserted
    print('Goodbye!')
    break               # the loop will break
  elif selection == 'l':
    print('List of files: 42.txt, 1015.txt')
  elif selection == 'd':
    filename = input('Enter the filename:\n')
    if filename == '42.txt':
        print('The meaning of life is blah blah blah ...')       
    elif filename == '1015.txt':
        print('Computer Science class notes ... simplified \nDo all work \nPass course \nBe happy')
    else:
        print('File not found') # recognised files will show up, but when the file 
                                # is not recognised it will say file not found.
    