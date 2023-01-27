#A programme s for translating sentences between English and a variant of Pig Latin
#Rector Ratsaka
#17 April 2022

vowel = 'a','e','i','o','u'
def to_pig_latin(sentense): #Return the Pig Latin sentence for a given English sentence.
    count = 0
    new_sentense = ''
    words = sentense.split()
    for  word in words:
        count = 0
        if word[0].lower() in vowel:
            new_sentense += word+'way'+' '
                      
        else:
            count = 0
            for strings in word:
                if strings.lower() not in vowel:
                    count+=1
                    continue
                else:
                    break
            new_sentense += word[count:]+'a' + word[:count]+'ay'+' '
              
    return new_sentense
      
def to_english(sentense): #Return the English sentence for a given Pig Latin sentence.
    new_sentense=''
    words = sentense.split()
    for  word in words:
        if word[-3::1]=='way':
            end = word.find('way')
            new_sentense+= word[:end]+' '
        else:
            no_ay=word[:len(word)-2]
            last_a = no_ay.split('a')[-1]
            no_last_a = no_ay[:len(no_ay)-(len(last_a)+1)]
            new_sentense+= last_a + no_last_a +' '
            
    return new_sentense 
            