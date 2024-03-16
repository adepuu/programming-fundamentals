package com.adepuu;

import java.math.BigInteger;

public class Fibonacci {
  static int complexity = 0;

  public static void main(String ...args) {
    int n = 200;
    BigInteger[] memoization = new BigInteger[n + 1];
    System.out.println("fibonacci of "+ n + " is : " + fibByDivCon(n, memoization));
    System.out.println("Complexity is "+complexity);
  }


  static BigInteger fibByDivCon(int n, BigInteger[] memoization){
    if(memoization[n]!=null){
      return memoization[n];
    }
    complexity++;
    if (n == 1 || n== 2){
      memoization[n] = BigInteger.ONE;
      return BigInteger.ONE;
    }

    // creates 2 further entries in stack
    BigInteger fibOfn = fibByDivCon(n-1, memoization).add( fibByDivCon(n-2, memoization)) ;

    memoization[n] = fibOfn;

    return fibOfn;

  }
}

