# Classification of animals.
# Rector Ratsaka
# 06 March 2022

print('Welcome to the Biology Expert')
print('-----------------------------')
print('Answer the following questions by selecting from among the options.')
Question_1 = input('The skeleton is (internal/external)?\n')
if Question_1 == 'internal':
  Question_2 = input('The fertilisation of eggs occurs (within the body/outside the body)?\n')
  if Question_2 == 'within the body':
    Question_3 = input('Young are produced by (waterproof eggs/live birth)?\n')
    if Question_3 == 'waterproof eggs':
      Question_4 = input('The skin is covered by (scales/feathers)?\n')
      if Question_4 == 'scales':
        print('Type of animal: Reptile')
      elif Question_4 == 'feathers':
        print('Type of animal: Bird')
    elif Question_3 == 'live birth':
      print('Type of animal: Mammal')
  elif Question_2 == 'outside the body':
    Question_5 = input('It lives (in water/near water)?\n')
    if Question_5 == 'in water':
      print('Type of animal: Fish')
    elif Question_5 == 'near water':
      print('Type of animal: Amphibian')    
elif Question_1 == 'external':
    print('Type of animal: Arthropod')
    


