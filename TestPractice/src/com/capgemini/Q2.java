package com.capgemini;

class Q2
{
    public void doA(int k) throws Exception { // 0
        for(int i=0; i< 10; i++) {
            if(i == k) throw new Exception("Index of k is "+i); // 1
        }
    }
    public void doB(boolean f) throws Exception { //2
        if(f) {
            doA(15); //3
        }
        else return;
    }
    public static void main(String[] args) throws Exception { //4
        Q2 a = new Q2();
        a.doB(args.length>0); //5
    }
}

//add throws at line 2 and 4