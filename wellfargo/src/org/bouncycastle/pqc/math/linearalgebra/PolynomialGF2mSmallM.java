// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            GF2mField, GF2mVector, IntUtils, RandUtils

public class PolynomialGF2mSmallM
{

    public static final char RANDOM_IRREDUCIBLE_POLYNOMIAL = 73;
    private int coefficients[];
    private int degree;
    private GF2mField field;

    public PolynomialGF2mSmallM(GF2mField gf2mfield)
    {
        field = gf2mfield;
        degree = -1;
        coefficients = new int[1];
    }

    public PolynomialGF2mSmallM(GF2mField gf2mfield, int i)
    {
        field = gf2mfield;
        degree = i;
        coefficients = new int[i + 1];
        coefficients[i] = 1;
    }

    public PolynomialGF2mSmallM(GF2mField gf2mfield, int i, char c, SecureRandom securerandom)
    {
        field = gf2mfield;
        switch (c)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append(" Error: type ").append(c).append(" is not defined for GF2smallmPolynomial").toString());

        case 73: // 'I'
            coefficients = createRandomIrreduciblePolynomial(i, securerandom);
            break;
        }
        computeDegree();
    }

    public PolynomialGF2mSmallM(GF2mField gf2mfield, byte abyte0[])
    {
        field = gf2mfield;
        int i = 8;
        int j = 1;
        for (; gf2mfield.getDegree() > i; i += 8)
        {
            j++;
        }

        if (abyte0.length % j != 0)
        {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        coefficients = new int[abyte0.length / j];
        j = 0;
        int k = 0;
        for (; j < coefficients.length; j++)
        {
            for (int l = 0; l < i;)
            {
                gf2mfield = coefficients;
                int i1 = gf2mfield[j];
                gf2mfield[j] = (abyte0[k] & 0xff) << l ^ i1;
                l += 8;
                k++;
            }

            if (!field.isElementOfThisField(coefficients[j]))
            {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
        }

        if (coefficients.length != 1 && coefficients[coefficients.length - 1] == 0)
        {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        } else
        {
            computeDegree();
            return;
        }
    }

    public PolynomialGF2mSmallM(GF2mField gf2mfield, int ai[])
    {
        field = gf2mfield;
        coefficients = normalForm(ai);
        computeDegree();
    }

    public PolynomialGF2mSmallM(GF2mVector gf2mvector)
    {
        this(gf2mvector.getField(), gf2mvector.getIntArrayForm());
    }

    public PolynomialGF2mSmallM(PolynomialGF2mSmallM polynomialgf2msmallm)
    {
        field = polynomialgf2msmallm.field;
        degree = polynomialgf2msmallm.degree;
        coefficients = IntUtils.clone(polynomialgf2msmallm.coefficients);
    }

    private int[] add(int ai[], int ai1[])
    {
        int i;
        if (ai.length < ai1.length)
        {
            int ai2[] = new int[ai1.length];
            System.arraycopy(ai1, 0, ai2, 0, ai1.length);
            ai1 = ai;
            ai = ai2;
        } else
        {
            int ai3[] = new int[ai.length];
            System.arraycopy(ai, 0, ai3, 0, ai.length);
            ai = ai3;
        }
        for (i = ai1.length - 1; i >= 0; i--)
        {
            ai[i] = field.add(ai[i], ai1[i]);
        }

        return ai;
    }

    private static int computeDegree(int ai[])
    {
        int i;
        for (i = ai.length - 1; i >= 0 && ai[i] == 0; i--) { }
        return i;
    }

    private void computeDegree()
    {
        for (degree = coefficients.length - 1; degree >= 0 && coefficients[degree] == 0; degree = degree - 1) { }
    }

    private int[] createRandomIrreduciblePolynomial(int i, SecureRandom securerandom)
    {
        int j = 1;
        int ai[] = new int[i + 1];
        ai[i] = 1;
        ai[0] = field.getRandomNonZeroElement(securerandom);
        for (; j < i; j++)
        {
            ai[j] = field.getRandomElement(securerandom);
        }

        while (!isIrreducible(ai)) 
        {
            int k = RandUtils.nextInt(securerandom, i);
            if (k == 0)
            {
                ai[0] = field.getRandomNonZeroElement(securerandom);
            } else
            {
                ai[k] = field.getRandomElement(securerandom);
            }
        }
        return ai;
    }

    private int[][] div(int ai[], int ai1[])
    {
        int i = computeDegree(ai1);
        int j = computeDegree(ai);
        if (i == -1)
        {
            throw new ArithmeticException("Division by zero.");
        }
        int ai2[][] = new int[2][];
        ai2[0] = new int[1];
        ai2[1] = new int[j + 1];
        j = headCoefficient(ai1);
        j = field.inverse(j);
        ai2[0][0] = 0;
        System.arraycopy(ai, 0, ai2[1], 0, ai2[1].length);
        int ai3[];
        for (; i <= computeDegree(ai2[1]); ai2[1] = add(ai3, ai2[1]))
        {
            ai = new int[1];
            ai[0] = field.mult(headCoefficient(ai2[1]), j);
            ai3 = multWithElement(ai1, ai[0]);
            int k = computeDegree(ai2[1]) - i;
            ai3 = multWithMonomial(ai3, k);
            ai2[0] = add(multWithMonomial(ai, k), ai2[0]);
        }

        return ai2;
    }

    private int[] gcd(int ai[], int ai1[])
    {
        int ai3[] = ai;
        int ai2[] = ai1;
        if (computeDegree(ai) == -1)
        {
            return ai1;
        }
        for (; computeDegree(ai2) != -1; System.arraycopy(ai, 0, ai2, 0, ai2.length))
        {
            ai = mod(ai3, ai2);
            ai3 = new int[ai2.length];
            System.arraycopy(ai2, 0, ai3, 0, ai3.length);
            ai2 = new int[ai.length];
        }

        return multWithElement(ai3, field.inverse(headCoefficient(ai3)));
    }

    private static int headCoefficient(int ai[])
    {
        int i = computeDegree(ai);
        if (i == -1)
        {
            return 0;
        } else
        {
            return ai[i];
        }
    }

    private static boolean isEqual(int ai[], int ai1[])
    {
        int j = computeDegree(ai);
        if (j == computeDegree(ai1)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i > j)
                {
                    break label1;
                }
                if (ai[i] != ai1[i])
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private boolean isIrreducible(int ai[])
    {
        if (ai[0] != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int k = computeDegree(ai);
        int ai1[] = new int[2];
        ai1;
        ai1[0] = 0;
        ai1[1] = 1;
        int l = field.getDegree();
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= k >> 1)
                {
                    break label1;
                }
                for (int j = l - 1; j >= 0; j--)
                {
                    ai1 = modMultiply(ai1, ai1, ai);
                }

                ai1 = normalForm(ai1);
                if (computeDegree(gcd(add(ai1, new int[] {
    0, 1
}), ai)) != 0)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private int[] mod(int ai[], int ai1[])
    {
        int i = computeDegree(ai1);
        if (i == -1)
        {
            throw new ArithmeticException("Division by zero");
        }
        int ai2[] = new int[ai.length];
        int j = headCoefficient(ai1);
        j = field.inverse(j);
        System.arraycopy(ai, 0, ai2, 0, ai2.length);
        int k;
        for (ai = ai2; i <= computeDegree(ai); ai = add(multWithElement(multWithMonomial(ai1, computeDegree(ai) - i), k), ai))
        {
            k = field.mult(headCoefficient(ai), j);
        }

        return ai;
    }

    private int[] modDiv(int ai[], int ai1[], int ai2[])
    {
        int ai4[] = normalForm(ai2);
        int ai3[] = mod(ai1, ai2);
        ai1 = new int[1];
        ai1[0] = 0;
        Object obj;
        for (ai = mod(ai, ai2); computeDegree(ai3) != -1; ai = normalForm(((int []) (obj))))
        {
            obj = div(ai4, ai3);
            ai4 = normalForm(ai3);
            ai3 = normalForm(obj[1]);
            obj = add(ai1, modMultiply(obj[0], ai, ai2));
            ai1 = normalForm(ai);
        }

        int i = headCoefficient(ai4);
        return multWithElement(ai1, field.inverse(i));
    }

    private int[] modMultiply(int ai[], int ai1[], int ai2[])
    {
        return mod(multiply(ai, ai1), ai2);
    }

    private int[] multWithElement(int ai[], int i)
    {
        int j = computeDegree(ai);
        if (j != -1 && i != 0) goto _L2; else goto _L1
_L1:
        int ai1[] = new int[1];
_L4:
        return ai1;
_L2:
        if (i == 1)
        {
            return IntUtils.clone(ai);
        }
        int ai2[] = new int[j + 1];
        do
        {
            ai1 = ai2;
            if (j < 0)
            {
                continue;
            }
            ai2[j] = field.mult(ai[j], i);
            j--;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static int[] multWithMonomial(int ai[], int i)
    {
        int j = computeDegree(ai);
        if (j == -1)
        {
            return new int[1];
        } else
        {
            int ai1[] = new int[j + i + 1];
            System.arraycopy(ai, 0, ai1, i, j + 1);
            return ai1;
        }
    }

    private int[] multiply(int ai[], int ai1[])
    {
        int ai5[];
        if (computeDegree(ai) >= computeDegree(ai1))
        {
            int ai2[] = ai;
            ai = ai1;
            ai1 = ai2;
        }
        ai1 = normalForm(ai1);
        ai5 = normalForm(ai);
        if (ai5.length == 1)
        {
            return multWithElement(ai1, ai5[0]);
        }
        int i = ai1.length;
        int j = ai5.length;
        ai = new int[(i + j) - 1];
        if (j != i)
        {
            ai = new int[j];
            int ai3[] = new int[i - j];
            System.arraycopy(ai1, 0, ai, 0, ai.length);
            System.arraycopy(ai1, j, ai3, 0, ai3.length);
            return add(multiply(ai, ai5), multWithMonomial(multiply(ai3, ai5), j));
        } else
        {
            int k = i + 1 >>> 1;
            i -= k;
            int ai6[] = new int[k];
            int ai7[] = new int[k];
            ai = new int[i];
            int ai4[] = new int[i];
            System.arraycopy(ai1, 0, ai6, 0, ai6.length);
            System.arraycopy(ai1, k, ai, 0, ai.length);
            System.arraycopy(ai5, 0, ai7, 0, ai7.length);
            System.arraycopy(ai5, k, ai4, 0, ai4.length);
            ai1 = add(ai6, ai);
            ai5 = add(ai7, ai4);
            ai6 = multiply(ai6, ai7);
            ai1 = multiply(ai1, ai5);
            ai = multiply(ai, ai4);
            return add(multWithMonomial(add(add(add(ai1, ai6), ai), multWithMonomial(ai, k)), k), ai6);
        }
    }

    private static int[] normalForm(int ai[])
    {
        int i = computeDegree(ai);
        if (i == -1)
        {
            return new int[1];
        }
        if (ai.length == i + 1)
        {
            return IntUtils.clone(ai);
        } else
        {
            int ai1[] = new int[i + 1];
            System.arraycopy(ai, 0, ai1, 0, i + 1);
            return ai1;
        }
    }

    public PolynomialGF2mSmallM add(PolynomialGF2mSmallM polynomialgf2msmallm)
    {
        polynomialgf2msmallm = add(coefficients, polynomialgf2msmallm.coefficients);
        return new PolynomialGF2mSmallM(field, polynomialgf2msmallm);
    }

    public PolynomialGF2mSmallM addMonomial(int i)
    {
        int ai[] = new int[i + 1];
        ai[i] = 1;
        ai = add(coefficients, ai);
        return new PolynomialGF2mSmallM(field, ai);
    }

    public void addToThis(PolynomialGF2mSmallM polynomialgf2msmallm)
    {
        coefficients = add(coefficients, polynomialgf2msmallm.coefficients);
        computeDegree();
    }

    public PolynomialGF2mSmallM[] div(PolynomialGF2mSmallM polynomialgf2msmallm)
    {
        polynomialgf2msmallm = div(coefficients, polynomialgf2msmallm.coefficients);
        return (new PolynomialGF2mSmallM[] {
            new PolynomialGF2mSmallM(field, polynomialgf2msmallm[0]), new PolynomialGF2mSmallM(field, polynomialgf2msmallm[1])
        });
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof PolynomialGF2mSmallM))
        {
            if (field.equals(((PolynomialGF2mSmallM) (obj = (PolynomialGF2mSmallM)obj)).field) && degree == ((PolynomialGF2mSmallM) (obj)).degree && isEqual(coefficients, ((PolynomialGF2mSmallM) (obj)).coefficients))
            {
                return true;
            }
        }
        return false;
    }

    public int evaluateAt(int i)
    {
        int k = coefficients[degree];
        for (int j = degree - 1; j >= 0; j--)
        {
            k = field.mult(k, i) ^ coefficients[j];
        }

        return k;
    }

    public PolynomialGF2mSmallM gcd(PolynomialGF2mSmallM polynomialgf2msmallm)
    {
        polynomialgf2msmallm = gcd(coefficients, polynomialgf2msmallm.coefficients);
        return new PolynomialGF2mSmallM(field, polynomialgf2msmallm);
    }

    public int getCoefficient(int i)
    {
        if (i < 0 || i > degree)
        {
            return 0;
        } else
        {
            return coefficients[i];
        }
    }

    public int getDegree()
    {
        int j = coefficients.length - 1;
        int i = j;
        if (coefficients[j] == 0)
        {
            i = -1;
        }
        return i;
    }

    public byte[] getEncoded()
    {
        int i = 8;
        int j = 1;
        for (; field.getDegree() > i; i += 8)
        {
            j++;
        }

        byte abyte0[] = new byte[j * coefficients.length];
        j = 0;
        int k = 0;
        for (; j < coefficients.length; j++)
        {
            for (int l = 0; l < i;)
            {
                abyte0[k] = (byte)(coefficients[j] >>> l);
                l += 8;
                k++;
            }

        }

        return abyte0;
    }

    public int getHeadCoefficient()
    {
        if (degree == -1)
        {
            return 0;
        } else
        {
            return coefficients[degree];
        }
    }

    public int hashCode()
    {
        int j = field.hashCode();
        for (int i = 0; i < coefficients.length; i++)
        {
            j = j * 31 + coefficients[i];
        }

        return j;
    }

    public PolynomialGF2mSmallM mod(PolynomialGF2mSmallM polynomialgf2msmallm)
    {
        polynomialgf2msmallm = mod(coefficients, polynomialgf2msmallm.coefficients);
        return new PolynomialGF2mSmallM(field, polynomialgf2msmallm);
    }

    public PolynomialGF2mSmallM modDiv(PolynomialGF2mSmallM polynomialgf2msmallm, PolynomialGF2mSmallM polynomialgf2msmallm1)
    {
        polynomialgf2msmallm = modDiv(coefficients, polynomialgf2msmallm.coefficients, polynomialgf2msmallm1.coefficients);
        return new PolynomialGF2mSmallM(field, polynomialgf2msmallm);
    }

    public PolynomialGF2mSmallM modInverse(PolynomialGF2mSmallM polynomialgf2msmallm)
    {
        int ai[] = coefficients;
        polynomialgf2msmallm = polynomialgf2msmallm.coefficients;
        polynomialgf2msmallm = modDiv(new int[] {
            1
        }, ai, polynomialgf2msmallm);
        return new PolynomialGF2mSmallM(field, polynomialgf2msmallm);
    }

    public PolynomialGF2mSmallM modMultiply(PolynomialGF2mSmallM polynomialgf2msmallm, PolynomialGF2mSmallM polynomialgf2msmallm1)
    {
        polynomialgf2msmallm = modMultiply(coefficients, polynomialgf2msmallm.coefficients, polynomialgf2msmallm1.coefficients);
        return new PolynomialGF2mSmallM(field, polynomialgf2msmallm);
    }

    public PolynomialGF2mSmallM[] modPolynomialToFracton(PolynomialGF2mSmallM polynomialgf2msmallm)
    {
        int i = polynomialgf2msmallm.degree;
        Object obj = normalForm(polynomialgf2msmallm.coefficients);
        int ai[] = mod(coefficients, polynomialgf2msmallm.coefficients);
        int ai2[] = new int[1];
        ai2[0] = 0;
        int ai1[] = new int[1];
        ai1[0] = 1;
        int ai3[];
        for (; computeDegree(ai) > i >> 1; ai = ai3)
        {
            obj = div(((int []) (obj)), ai);
            ai3 = obj[1];
            obj = add(ai2, modMultiply(obj[0], ai1, polynomialgf2msmallm.coefficients));
            ai2 = ai1;
            ai1 = ((int []) (obj));
            obj = ai;
        }

        return (new PolynomialGF2mSmallM[] {
            new PolynomialGF2mSmallM(field, ai), new PolynomialGF2mSmallM(field, ai1)
        });
    }

    public PolynomialGF2mSmallM modSquareMatrix(PolynomialGF2mSmallM apolynomialgf2msmallm[])
    {
        int l = apolynomialgf2msmallm.length;
        int ai[] = new int[l];
        int ai1[] = new int[l];
        for (int i = 0; i < coefficients.length; i++)
        {
            ai1[i] = field.mult(coefficients[i], coefficients[i]);
        }

        for (int j = 0; j < l; j++)
        {
            int k = 0;
            while (k < l) 
            {
                if (j < apolynomialgf2msmallm[k].coefficients.length)
                {
                    int i1 = field.mult(apolynomialgf2msmallm[k].coefficients[j], ai1[k]);
                    ai[j] = field.add(ai[j], i1);
                }
                k++;
            }
        }

        return new PolynomialGF2mSmallM(field, ai);
    }

    public PolynomialGF2mSmallM modSquareRoot(PolynomialGF2mSmallM polynomialgf2msmallm)
    {
        int ai1[] = IntUtils.clone(coefficients);
        for (int ai[] = modMultiply(ai1, ai1, polynomialgf2msmallm.coefficients); !isEqual(ai, coefficients); ai = modMultiply(ai1, ai1, polynomialgf2msmallm.coefficients))
        {
            ai1 = normalForm(ai);
        }

        return new PolynomialGF2mSmallM(field, ai1);
    }

    public PolynomialGF2mSmallM modSquareRootMatrix(PolynomialGF2mSmallM apolynomialgf2msmallm[])
    {
        boolean flag = false;
        int k = apolynomialgf2msmallm.length;
        int ai[] = new int[k];
        int i = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= k)
            {
                break;
            }
            j = 0;
            do
            {
                if (j >= k)
                {
                    break;
                }
                if (i < apolynomialgf2msmallm[j].coefficients.length && j < coefficients.length)
                {
                    int l = field.mult(apolynomialgf2msmallm[j].coefficients[i], coefficients[j]);
                    ai[i] = field.add(ai[i], l);
                }
                j++;
            } while (true);
            i++;
        } while (true);
        for (; j < k; j++)
        {
            ai[j] = field.sqRoot(ai[j]);
        }

        return new PolynomialGF2mSmallM(field, ai);
    }

    public void multThisWithElement(int i)
    {
        if (!field.isElementOfThisField(i))
        {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        } else
        {
            coefficients = multWithElement(coefficients, i);
            computeDegree();
            return;
        }
    }

    public PolynomialGF2mSmallM multWithElement(int i)
    {
        if (!field.isElementOfThisField(i))
        {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        } else
        {
            int ai[] = multWithElement(coefficients, i);
            return new PolynomialGF2mSmallM(field, ai);
        }
    }

    public PolynomialGF2mSmallM multWithMonomial(int i)
    {
        int ai[] = multWithMonomial(coefficients, i);
        return new PolynomialGF2mSmallM(field, ai);
    }

    public PolynomialGF2mSmallM multiply(PolynomialGF2mSmallM polynomialgf2msmallm)
    {
        polynomialgf2msmallm = multiply(coefficients, polynomialgf2msmallm.coefficients);
        return new PolynomialGF2mSmallM(field, polynomialgf2msmallm);
    }

    public String toString()
    {
        String s = (new StringBuilder()).append(" Polynomial over ").append(field.toString()).append(": \n").toString();
        for (int i = 0; i < coefficients.length; i++)
        {
            s = (new StringBuilder()).append(s).append(field.elementToStr(coefficients[i])).append("Y^").append(i).append("+").toString();
        }

        return (new StringBuilder()).append(s).append(";").toString();
    }
}
