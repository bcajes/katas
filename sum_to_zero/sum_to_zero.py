#Given an array find any three numbers which sum to zero.

import unittest


def sum_to_zero(a):
    a.sort(reverse=True)
    len_a = len(a)
    if  len_a < 3:
        return []
    for i in xrange(0, len(a)):
        j = i + 1
        for k in xrange(j + 1, len(a)):
            if a[j] + a[k] == -1 * a[i]:
                return [a[i], a[j], a[k]]
    return []


class SumToZeroTest(unittest.TestCase):

    def test_sum_to_zero_basic(self):
        a = [1, 2, 3, -1, -2, -3, -5, 1, 10, 100, -200]
        res = sum_to_zero(a)
        self.assertEqual([3, 2, -5], res, str(res))

    def test_sum_to_zero_no_res(self):
        a = [1, 1, 1, 1]
        res = sum_to_zero(a)
        self.assertEqual(res, [], str(res))

    def test_small_array(self):
        a = [1, 2, -3]
        res = sum_to_zero(a)
        self.assertEqual(res, [2, 1, -3], str(res))

    def test_invalid_array(self):
        a = [1, 2]
        res = sum_to_zero(a)
        self.assertEqual(res, [], str(res))

#nosetests sume_to_zero.py
