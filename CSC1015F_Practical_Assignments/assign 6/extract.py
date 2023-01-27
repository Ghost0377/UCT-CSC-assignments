#extract useful data from a raw data stream obtained from a sensor. 
#Rector Ratsaka
#04 April 2022

def location(block):
    start = block.find(',') +6 
    end = block.find('END') -1
    location = block[start:end]
    reverse = ''
    for i in location: #reversing a word
        reverse = i + reverse
    location = reverse.title()
    return location      
    
def temperature(block):
    start = block.find('BEGIN') +6
    end = block.find('_')
    temperature = float(block[start:end])
    return temperature

def x_coordinate(block):
    start = block.find(':') +1
    end = block.find(',')
    xcoordinate = block[start:end]
    return xcoordinate

def y_coordinate(block):
    start = block.find(',') +1
    block2 = block[start:]  #new string or sentence
    end = block2.find(' ')
    ycoordinate = block2[:end]
    return ycoordinate

def pressure(block):
    start = block.find('_') +1
    end = block.find(':') 
    pressure = float(block[start:end])
    return pressure

def get_block(data):
    start = data.find('BEGIN')
    end = data.find('END') +3
    block = data[start:end]
    return block   
   

def main():
    data = input('Enter the raw data:\n')
    block = get_block(data)
    print('Site information:')
    print('Location:', location(block))
    print('Coordinates:', y_coordinate(block), x_coordinate(block))
    print('Temperature: {:.2f} C'.format(temperature(block)))
    print('Pressure: {:.2f} hPa'.format(pressure(block)))

if __name__=='__main__':
    main()
