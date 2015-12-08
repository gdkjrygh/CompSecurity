// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            RandUtils, LittleEndianConversions, IntegerFunctions, IntUtils

public class Permutation
{

    private int perm[];

    public Permutation(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("invalid length");
        }
        perm = new int[i];
        for (i--; i >= 0; i--)
        {
            perm[i] = i;
        }

    }

    public Permutation(int i, SecureRandom securerandom)
    {
        boolean flag = false;
        super();
        if (i <= 0)
        {
            throw new IllegalArgumentException("invalid length");
        }
        perm = new int[i];
        int ai[] = new int[i];
        for (int j = 0; j < i; j++)
        {
            ai[j] = j;
        }

        int l = i;
        for (int k = ((flag) ? 1 : 0); k < i; k++)
        {
            int i1 = RandUtils.nextInt(securerandom, l);
            l--;
            perm[k] = ai[i1];
            ai[i1] = ai[l];
        }

    }

    public Permutation(byte abyte0[])
    {
        int i = 0;
        super();
        if (abyte0.length <= 4)
        {
            throw new IllegalArgumentException("invalid encoding");
        }
        int j = LittleEndianConversions.OS2IP(abyte0, 0);
        int k = IntegerFunctions.ceilLog256(j - 1);
        if (abyte0.length != j * k + 4)
        {
            throw new IllegalArgumentException("invalid encoding");
        }
        perm = new int[j];
        for (; i < j; i++)
        {
            perm[i] = LittleEndianConversions.OS2IP(abyte0, i * k + 4, k);
        }

        if (!isPermutation(perm))
        {
            throw new IllegalArgumentException("invalid encoding");
        } else
        {
            return;
        }
    }

    public Permutation(int ai[])
    {
        if (!isPermutation(ai))
        {
            throw new IllegalArgumentException("array is not a permutation vector");
        } else
        {
            perm = IntUtils.clone(ai);
            return;
        }
    }

    private boolean isPermutation(int ai[])
    {
        int j = ai.length;
        boolean aflag[] = new boolean[j];
        for (int i = 0; i < j; i++)
        {
            if (ai[i] < 0 || ai[i] >= j || aflag[ai[i]])
            {
                return false;
            }
            aflag[ai[i]] = true;
        }

        return true;
    }

    public Permutation computeInverse()
    {
        Permutation permutation = new Permutation(perm.length);
        for (int i = perm.length - 1; i >= 0; i--)
        {
            permutation.perm[perm[i]] = i;
        }

        return permutation;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Permutation))
        {
            return false;
        } else
        {
            obj = (Permutation)obj;
            return IntUtils.equals(perm, ((Permutation) (obj)).perm);
        }
    }

    public byte[] getEncoded()
    {
        int i = 0;
        int j = perm.length;
        int k = IntegerFunctions.ceilLog256(j - 1);
        byte abyte0[] = new byte[j * k + 4];
        LittleEndianConversions.I2OSP(j, abyte0, 0);
        for (; i < j; i++)
        {
            LittleEndianConversions.I2OSP(perm[i], abyte0, i * k + 4, k);
        }

        return abyte0;
    }

    public int[] getVector()
    {
        return IntUtils.clone(perm);
    }

    public int hashCode()
    {
        return perm.hashCode();
    }

    public Permutation rightMultiply(Permutation permutation)
    {
        if (permutation.perm.length != perm.length)
        {
            throw new IllegalArgumentException("length mismatch");
        }
        Permutation permutation1 = new Permutation(perm.length);
        for (int i = perm.length - 1; i >= 0; i--)
        {
            permutation1.perm[i] = perm[permutation.perm[i]];
        }

        return permutation1;
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("[").append(perm[0]).toString();
        for (int i = 1; i < perm.length; i++)
        {
            s = (new StringBuilder()).append(s).append(", ").append(perm[i]).toString();
        }

        return (new StringBuilder()).append(s).append("]").toString();
    }
}
