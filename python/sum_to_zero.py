#Given an array find any three numbers which sum to zero.

import itertools
import unittest


def sum_to_zero(a):
    for triplet in combinations(a, 3):
        if sum(triplet) == 0:
            return list(triplet)
    return None

def combinations(iterable, r):
    # combinations('ABCD', 2) --> AB AC AD BC BD CD
    # combinations(range(4), 3) --> 012 013 023 123
    pool = tuple(iterable)
    n = len(pool)
    if r > n:
        return
    indices = range(r)
    yield tuple(pool[i] for i in indices)
    while True:
        for i in reversed(range(r)):
            if indices[i] != i + n - r:
                break
        else:
            return
        indices[i] += 1
        for j in range(i+1, r):
            indices[j] = indices[j-1] + 1
        yield tuple(pool[i] for i in indices)


class SumToZeroTest(unittest.TestCase):

    def test_sum_to_zero_basic(self):
        a = [1, 2, 3, -1, -2, -3, -5, 1, 10, 100, -200]
        res = sum_to_zero(a)
        self.assertEqual([1, 2, -3], res, str(res))

    def test_sum_to_zero_no_res(self):
        a = [1, 1, 1, 1]
        res = sum_to_zero(a)
        self.assertEqual(res, None, str(res))

    def test_small_array(self):
        a = [1, 2, -3]
        res = sum_to_zero(a)
        self.assertEqual(res, [1, 2, -3], str(res))

    def test_invalid_array(self):
        a = [1, 2]
        res = sum_to_zero(a)
        self.assertEqual(res, None, str(res))

    def test_four(self):
        res = sum_to_zero([125, 124, -100, -25])
        self.assertEqual(res, [125, -100, -25], str(res))

#nosetests sum_to_zero.py
