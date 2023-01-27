#A programme devising a set of tests for a Python function that cumulatively achieve statement coverage.
#Rector Ratsaka
#17 April 2022

"""
>>> from timeutil import validate

>>> validate('1:1 a.m.')
False
>>> validate('21:15 p.m.')
False
>>> validate('12:61 am')
False
>>> validate('111:01 p.m.')
False
>>> validate('59 a.m.')
False
>>> validate('00:01 p.m.')
False

"""

import doctest
doctest.testmod(verbose=True)