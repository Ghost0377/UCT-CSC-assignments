#A programme s devising a set of tests for a Python function that cumulatively achieve path coverage. 
#Rector Ratsaka
#10 April 2022
"""
>>> from numberutil import aswords

>>> aswords(0)
'zero'
>>> aswords(32)
'thirty two'
>>> aswords(650)
'six hundred and fifty'
>>> aswords(502)
'five hundred and two'
>>> aswords(100)
'one hundred'
>>> aswords(50)
'fifty'
>>> aswords(12)
'twelve'
>>> aswords(999)
'nine hundred and ninety nine'

"""

import doctest
doctest.testmod(verbose=True)
