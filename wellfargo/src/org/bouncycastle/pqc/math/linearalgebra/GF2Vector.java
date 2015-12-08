// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            Vector, RandUtils, IntUtils, LittleEndianConversions, 
//            Permutation, GF2mField, GF2mVector

public class GF2Vector extends Vector
{

    private int v[];

    public GF2Vector(int i)
    {
        if (i < 0)
        {
            throw new ArithmeticException("Negative length.");
        } else
        {
            length = i;
            v = new int[i + 31 >> 5];
            return;
        }
    }

    public GF2Vector(int i, int j, SecureRandom securerandom)
    {
        boolean flag = false;
        super();
        if (j > i)
        {
            throw new ArithmeticException("The hamming weight is greater than the length of vector.");
        }
        length = i;
        v = new int[i + 31 >> 5];
        int ai[] = new int[i];
        int i1 = 0;
        int k;
        int l;
        do
        {
            k = ((flag) ? 1 : 0);
            l = i;
            if (i1 >= i)
            {
                break;
            }
            ai[i1] = i1;
            i1++;
        } while (true);
        for (; k < j; k++)
        {
            i = RandUtils.nextInt(securerandom, l);
            setBit(ai[i]);
            l--;
            ai[i] = ai[l];
        }

    }

    public GF2Vector(int i, SecureRandom securerandom)
    {
        length = i;
        int l = i + 31 >> 5;
        v = new int[l];
        for (int j = l - 1; j >= 0; j--)
        {
            v[j] = securerandom.nextInt();
        }

        i &= 0x1f;
        if (i != 0)
        {
            securerandom = v;
            int k = l - 1;
            securerandom[k] = (1 << i) - 1 & securerandom[k];
        }
    }

    public GF2Vector(int i, int ai[])
    {
        if (i < 0)
        {
            throw new ArithmeticException("negative length");
        }
        length = i;
        int j = i + 31 >> 5;
        if (ai.length != j)
        {
            throw new ArithmeticException("length mismatch");
        }
        v = IntUtils.clone(ai);
        i &= 0x1f;
        if (i != 0)
        {
            ai = v;
            j--;
            ai[j] = (1 << i) - 1 & ai[j];
        }
    }

    public GF2Vector(GF2Vector gf2vector)
    {
        length = gf2vector.length;
        v = IntUtils.clone(gf2vector.v);
    }

    protected GF2Vector(int ai[], int i)
    {
        v = ai;
        length = i;
    }

    public static GF2Vector OS2VP(int i, byte abyte0[])
    {
        if (i < 0)
        {
            throw new ArithmeticException("negative length");
        }
        if (abyte0.length > i + 7 >> 3)
        {
            throw new ArithmeticException("length mismatch");
        } else
        {
            return new GF2Vector(i, LittleEndianConversions.toIntArray(abyte0));
        }
    }

    public Vector add(Vector vector)
    {
        if (!(vector instanceof GF2Vector))
        {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        GF2Vector gf2vector = (GF2Vector)vector;
        if (length != gf2vector.length)
        {
            throw new ArithmeticException("length mismatch");
        }
        vector = IntUtils.clone(((GF2Vector)vector).v);
        for (int i = vector.length - 1; i >= 0; i--)
        {
            vector[i] = vector[i] ^ v[i];
        }

        return new GF2Vector(length, vector);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof GF2Vector)
        {
            if (length == ((GF2Vector) (obj = (GF2Vector)obj)).length && IntUtils.equals(v, ((GF2Vector) (obj)).v))
            {
                return true;
            }
        }
        return false;
    }

    public GF2Vector extractLeftVector(int i)
    {
        if (i > length)
        {
            throw new ArithmeticException("invalid length");
        }
        GF2Vector gf2vector;
        if (i == length)
        {
            gf2vector = new GF2Vector(this);
        } else
        {
            GF2Vector gf2vector1 = new GF2Vector(i);
            int j = i >> 5;
            i &= 0x1f;
            System.arraycopy(v, 0, gf2vector1.v, 0, j);
            gf2vector = gf2vector1;
            if (i != 0)
            {
                gf2vector1.v[j] = (1 << i) - 1 & v[j];
                return gf2vector1;
            }
        }
        return gf2vector;
    }

    public GF2Vector extractRightVector(int i)
    {
        int j = 0;
        if (i > length)
        {
            throw new ArithmeticException("invalid length");
        }
        Object obj;
        if (i == length)
        {
            obj = new GF2Vector(this);
        } else
        {
            GF2Vector gf2vector = new GF2Vector(i);
            int k = length - i >> 5;
            int l = length - i & 0x1f;
            int i1 = i + 31 >> 5;
            if (l != 0)
            {
                for (i = k; j < i1 - 1; i = k)
                {
                    obj = gf2vector.v;
                    int ai1[] = v;
                    k = i + 1;
                    obj[j] = ai1[i] >>> l | v[k] << 32 - l;
                    j++;
                }

                obj = gf2vector.v;
                int ai2[] = v;
                j = i + 1;
                obj[i1 - 1] = ai2[i] >>> l;
                obj = gf2vector;
                if (j < v.length)
                {
                    int ai[] = gf2vector.v;
                    i = i1 - 1;
                    ai[i] = ai[i] | v[j] << 32 - l;
                    return gf2vector;
                }
            } else
            {
                System.arraycopy(v, k, gf2vector.v, 0, i1);
                return gf2vector;
            }
        }
        return ((GF2Vector) (obj));
    }

    public GF2Vector extractVector(int ai[])
    {
        int j = ai.length;
        if (ai[j - 1] > length)
        {
            throw new ArithmeticException("invalid index set");
        }
        GF2Vector gf2vector = new GF2Vector(j);
        for (int i = 0; i < j; i++)
        {
            if ((v[ai[i] >> 5] & 1 << (ai[i] & 0x1f)) != 0)
            {
                int ai1[] = gf2vector.v;
                int k = i >> 5;
                ai1[k] = ai1[k] | 1 << (i & 0x1f);
            }
        }

        return gf2vector;
    }

    public int getBit(int i)
    {
        if (i >= length)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            int j = i & 0x1f;
            return (v[i >> 5] & 1 << j) >>> j;
        }
    }

    public byte[] getEncoded()
    {
        int i = length;
        return LittleEndianConversions.toByteArray(v, i + 7 >> 3);
    }

    public int getHammingWeight()
    {
        int i = 0;
        int j = 0;
        for (; i < v.length; i++)
        {
            int l = v[i];
            for (int k = 0; k < 32;)
            {
                int i1 = j;
                if ((l & 1) != 0)
                {
                    i1 = j + 1;
                }
                l >>>= 1;
                k++;
                j = i1;
            }

        }

        return j;
    }

    public int[] getVecArray()
    {
        return v;
    }

    public int hashCode()
    {
        return length * 31 + v.hashCode();
    }

    public boolean isZero()
    {
        for (int i = v.length - 1; i >= 0; i--)
        {
            if (v[i] != 0)
            {
                return false;
            }
        }

        return true;
    }

    public Vector multiply(Permutation permutation)
    {
        permutation = permutation.getVector();
        if (length != permutation.length)
        {
            throw new ArithmeticException("length mismatch");
        }
        GF2Vector gf2vector = new GF2Vector(length);
        for (int i = 0; i < permutation.length; i++)
        {
            if ((v[permutation[i] >> 5] & 1 << (permutation[i] & 0x1f)) != 0)
            {
                int ai[] = gf2vector.v;
                int j = i >> 5;
                ai[j] = ai[j] | 1 << (i & 0x1f);
            }
        }

        return gf2vector;
    }

    public void setBit(int i)
    {
        if (i >= length)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            int ai[] = v;
            int j = i >> 5;
            ai[j] = ai[j] | 1 << (i & 0x1f);
            return;
        }
    }

    public GF2mVector toExtensionFieldVector(GF2mField gf2mfield)
    {
        int i = gf2mfield.getDegree();
        if (length % i != 0)
        {
            throw new ArithmeticException("conversion is impossible");
        }
        i = length / i;
        int ai[] = new int[i];
        int j = 0;
        for (i--; i >= 0; i--)
        {
            for (int k = gf2mfield.getDegree() - 1; k >= 0; k--)
            {
                if ((v[j >>> 5] >>> (j & 0x1f) & 1) == 1)
                {
                    ai[i] = ai[i] ^ 1 << k;
                }
                j++;
            }

        }

        return new GF2mVector(gf2mfield, ai);
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
        while (i < length) 
        {
            if (i != 0 && (i & 0x1f) == 0)
            {
                stringbuffer.append(' ');
            }
            if ((v[i >> 5] & 1 << (i & 0x1f)) == 0)
            {
                stringbuffer.append('0');
            } else
            {
                stringbuffer.append('1');
            }
            i++;
        }
        return stringbuffer.toString();
    }
}
