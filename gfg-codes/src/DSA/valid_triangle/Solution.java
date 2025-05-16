package DSA.valid_triangle;

class Solution {
    public boolean checkValidity(int a, int b, int c) {
        return (a+b)>c && (b+c)>a && (c+a)>b;

    }
}
