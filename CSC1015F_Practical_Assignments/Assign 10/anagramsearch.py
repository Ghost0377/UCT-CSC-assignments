#A programme that  searches a file for anagrams of a given word, printing the results in alphabetical order. 
#Rector Ratsaka
#01 May 2022

print("***** Anagram Finder *****")
try:                                               #check if the file exist
    file = open("EnglishWords.txt","r")
    arrayfile = file.readlines()           
    word = input("Enter a word: ")
    start = 0
    for i in arrayfile:
        i = i.replace("\n","")                    #remove next line inorder to be able read the contents
        if(i == "START"):                         # if the word in file is START,begin reading the words after START
            break
        start +=1
    dictWord = {}
    for k in word:
        dictWord[k] = 1
    arrayWord = []
    for x in range(start, len(arrayfile)):
        arrayfile[x] = arrayfile[x].replace("\n","")       
        if len(word) == len(arrayfile[x]) :               #if words have equal lengths put them inside a dictionary  
            dictArry = {}
            for line in arrayfile[x]:
                dictArry[line] = 1            
            if dictArry == dictWord and word != arrayfile[x]:  #check if the words that have equal lengths also have the same letters
                arrayWord.append(arrayfile[x])           
    if arrayWord == []:
        print()
        print("Sorry, anagrams of '"+word+"' could not be found.")
    else:
        print()
        print(sorted(arrayWord))                           
except IOError:                                              
    print("Sorry, could not find file 'EnglishWords.txt'.") #if the file doesn't exist print this 
    
        