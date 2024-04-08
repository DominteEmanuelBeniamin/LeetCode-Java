class Solution {
public:
    bool isPalindrome(int x) {
        if (x<0)
        {return false;}
        long long aux,y,z;
        y=x;
        z=0;
        while(y!=0)
        {
            aux=y%10;
            z=10*z+aux;
            y=y/10;

        }
     return(z==x);

    }
};
