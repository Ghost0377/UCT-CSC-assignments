# reference format
# Rector Ratsaka
# 19 March 2022

reference = input('Enter the reference:\n')

#title for names
end = reference.find(')')+3 
name_up = reference[0:end] 
#lower case for info after brackets and before comma.
start = reference.find(')')+3
new_reference = reference[start:]  #reference excluding names and year.
end2 = new_reference.find(',')
other_info = new_reference[0:end2]
#print next info as it is.
other_info2 = new_reference[end2:]

print('Reformatted reference:\n',name_up.title(),other_info.lower(),other_info2,end='',sep='')
