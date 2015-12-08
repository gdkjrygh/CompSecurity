// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;

public class NaccacheSternKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private static final BigInteger ONE = BigInteger.valueOf(1L);
    private static int smallPrimes[] = {
        3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 
        37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 
        79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 
        131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 
        181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 
        239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 
        293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 
        359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 
        421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 
        479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 
        557
    };
    private NaccacheSternKeyGenerationParameters param;

    public NaccacheSternKeyPairGenerator()
    {
    }

    private static Vector findFirstPrimes(int i)
    {
        Vector vector = new Vector(i);
        for (int j = 0; j != i; j++)
        {
            vector.addElement(BigInteger.valueOf(smallPrimes[j]));
        }

        return vector;
    }

    private static BigInteger generatePrime(int i, int j, SecureRandom securerandom)
    {
        BigInteger biginteger;
        for (biginteger = new BigInteger(i, j, securerandom); biginteger.bitLength() != i; biginteger = new BigInteger(i, j, securerandom)) { }
        return biginteger;
    }

    private static int getInt(SecureRandom securerandom, int i)
    {
        if ((-i & i) == i)
        {
            return (int)((long)i * (long)(securerandom.nextInt() & 0x7fffffff) >> 31);
        }
        int j;
        int k;
        do
        {
            j = securerandom.nextInt() & 0x7fffffff;
            k = j % i;
        } while ((j - k) + (i - 1) < 0);
        return k;
    }

    private static Vector permuteList(Vector vector, SecureRandom securerandom)
    {
        Vector vector1 = new Vector();
        Vector vector2 = new Vector();
        for (int i = 0; i < vector.size(); i++)
        {
            vector2.addElement(vector.elementAt(i));
        }

        vector1.addElement(vector2.elementAt(0));
        vector2.removeElementAt(0);
        for (; vector2.size() != 0; vector2.removeElementAt(0))
        {
            vector1.insertElementAt(vector2.elementAt(0), getInt(securerandom, vector1.size() + 1));
        }

        return vector1;
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        BigInteger biginteger3;
        SecureRandom securerandom;
        Vector vector;
        BigInteger biginteger4;
        BigInteger biginteger5;
        BigInteger biginteger6;
        BigInteger biginteger7;
        BigInteger biginteger8;
        BigInteger biginteger9;
        BigInteger biginteger10;
        BigInteger biginteger11;
        int k1;
        int l1;
        long l2;
        boolean flag;
        k1 = param.getStrength();
        securerandom = param.getRandom();
        l1 = param.getCertainty();
        flag = param.isDebug();
        if (flag)
        {
            System.out.println((new StringBuilder()).append("Fetching first ").append(param.getCntSmallPrimes()).append(" primes.").toString());
        }
        vector = permuteList(findFirstPrimes(param.getCntSmallPrimes()), securerandom);
        BigInteger biginteger = ONE;
        biginteger3 = ONE;
        for (int i = 0; i < vector.size() / 2; i++)
        {
            biginteger = biginteger.multiply((BigInteger)vector.elementAt(i));
        }

        for (int j = vector.size() / 2; j < vector.size(); j++)
        {
            biginteger3 = biginteger3.multiply((BigInteger)vector.elementAt(j));
        }

        biginteger4 = biginteger.multiply(biginteger3);
        int k = k1 - biginteger4.bitLength() - 48;
        biginteger5 = generatePrime(k / 2 + 1, l1, securerandom);
        biginteger6 = generatePrime(k / 2 + 1, l1, securerandom);
        l2 = 0L;
        if (flag)
        {
            System.out.println("generating p and q");
        }
        biginteger = biginteger5.multiply(biginteger).shiftLeft(1);
        biginteger10 = biginteger6.multiply(biginteger3).shiftLeft(1);
        long l3;
        do
        {
            do
            {
                do
                {
                    l3 = l2 + 1L;
                    biginteger3 = generatePrime(24, l1, securerandom);
                    biginteger7 = biginteger3.multiply(biginteger).add(ONE);
                    l2 = l3;
                } while (!biginteger7.isProbablePrime(l1));
                do
                {
                    do
                    {
                        biginteger8 = generatePrime(24, l1, securerandom);
                    } while (biginteger3.equals(biginteger8));
                    biginteger9 = biginteger8.multiply(biginteger10).add(ONE);
                } while (!biginteger9.isProbablePrime(l1));
                l2 = l3;
            } while (!biginteger4.gcd(biginteger3.multiply(biginteger8)).equals(ONE));
            if (biginteger7.multiply(biginteger9).bitLength() >= k1)
            {
                break;
            }
            l2 = l3;
            if (flag)
            {
                System.out.println((new StringBuilder()).append("key size too small. Should be ").append(k1).append(" but is actually ").append(biginteger7.multiply(biginteger9).bitLength()).toString());
                l2 = l3;
            }
        } while (true);
        if (flag)
        {
            System.out.println((new StringBuilder()).append("needed ").append(l3).append(" tries to generate p and q.").toString());
        }
        biginteger10 = biginteger7.multiply(biginteger9);
        biginteger11 = biginteger7.subtract(ONE).multiply(biginteger9.subtract(ONE));
        l3 = 0L;
        l2 = l3;
        if (flag)
        {
            System.out.println("generating g");
            l2 = l3;
        }
_L3:
        BigInteger biginteger2;
        int j1;
        Vector vector1 = new Vector();
        for (int l = 0; l != vector.size();)
        {
            BigInteger biginteger1 = biginteger11.divide((BigInteger)vector.elementAt(l));
            BigInteger biginteger12;
            long l4;
            do
            {
                l4 = l2 + 1L;
                biginteger12 = new BigInteger(k1, l1, securerandom);
                l2 = l4;
            } while (biginteger12.modPow(biginteger1, biginteger10).equals(ONE));
            vector1.addElement(biginteger12);
            l++;
            l2 = l4;
        }

        biginteger2 = ONE;
        for (int i1 = 0; i1 < vector.size(); i1++)
        {
            biginteger2 = biginteger2.multiply(((BigInteger)vector1.elementAt(i1)).modPow(biginteger4.divide((BigInteger)vector.elementAt(i1)), biginteger10)).mod(biginteger10);
        }

        j1 = 0;
_L5:
        if (j1 >= vector.size())
        {
            break MISSING_BLOCK_LABEL_1499;
        }
        if (!biginteger2.modPow(biginteger11.divide((BigInteger)vector.elementAt(j1)), biginteger10).equals(ONE)) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            System.out.println((new StringBuilder()).append("g has order phi(n)/").append(vector.elementAt(j1)).append("\n g: ").append(biginteger2).toString());
        }
        j1 = 1;
_L6:
        if (j1 == 0) goto _L4; else goto _L3
_L2:
        j1++;
          goto _L5
_L4:
        if (biginteger2.modPow(biginteger11.divide(BigInteger.valueOf(4L)), biginteger10).equals(ONE))
        {
            if (flag)
            {
                System.out.println((new StringBuilder()).append("g has order phi(n)/4\n g:").append(biginteger2).toString());
            }
        } else
        if (biginteger2.modPow(biginteger11.divide(biginteger3), biginteger10).equals(ONE))
        {
            if (flag)
            {
                System.out.println((new StringBuilder()).append("g has order phi(n)/p'\n g: ").append(biginteger2).toString());
            }
        } else
        if (biginteger2.modPow(biginteger11.divide(biginteger8), biginteger10).equals(ONE))
        {
            if (flag)
            {
                System.out.println((new StringBuilder()).append("g has order phi(n)/q'\n g: ").append(biginteger2).toString());
            }
        } else
        if (biginteger2.modPow(biginteger11.divide(biginteger5), biginteger10).equals(ONE))
        {
            if (flag)
            {
                System.out.println((new StringBuilder()).append("g has order phi(n)/a\n g: ").append(biginteger2).toString());
            }
        } else
        if (biginteger2.modPow(biginteger11.divide(biginteger6), biginteger10).equals(ONE))
        {
            if (flag)
            {
                System.out.println((new StringBuilder()).append("g has order phi(n)/b\n g: ").append(biginteger2).toString());
            }
        } else
        {
            if (flag)
            {
                System.out.println((new StringBuilder()).append("needed ").append(l2).append(" tries to generate g").toString());
                System.out.println();
                System.out.println("found new NaccacheStern cipher variables:");
                System.out.println((new StringBuilder()).append("smallPrimes: ").append(vector).toString());
                System.out.println((new StringBuilder()).append("sigma:...... ").append(biginteger4).append(" (").append(biginteger4.bitLength()).append(" bits)").toString());
                System.out.println((new StringBuilder()).append("a:.......... ").append(biginteger5).toString());
                System.out.println((new StringBuilder()).append("b:.......... ").append(biginteger6).toString());
                System.out.println((new StringBuilder()).append("p':......... ").append(biginteger3).toString());
                System.out.println((new StringBuilder()).append("q':......... ").append(biginteger8).toString());
                System.out.println((new StringBuilder()).append("p:.......... ").append(biginteger7).toString());
                System.out.println((new StringBuilder()).append("q:.......... ").append(biginteger9).toString());
                System.out.println((new StringBuilder()).append("n:.......... ").append(biginteger10).toString());
                System.out.println((new StringBuilder()).append("phi(n):..... ").append(biginteger11).toString());
                System.out.println((new StringBuilder()).append("g:.......... ").append(biginteger2).toString());
                System.out.println();
            }
            return new AsymmetricCipherKeyPair(new NaccacheSternKeyParameters(false, biginteger2, biginteger10, biginteger4.bitLength()), new NaccacheSternPrivateKeyParameters(biginteger2, biginteger10, biginteger4.bitLength(), vector, biginteger11));
        }
          goto _L3
        j1 = 0;
          goto _L6
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        param = (NaccacheSternKeyGenerationParameters)keygenerationparameters;
    }

}
