// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;


// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            Vector, GF2mField, IntUtils, Permutation

public class GF2mVector extends Vector
{

    private GF2mField field;
    private int vector[];

    public GF2mVector(GF2mField gf2mfield, byte abyte0[])
    {
        field = new GF2mField(gf2mfield);
        int i = 8;
        int j = 1;
        for (; gf2mfield.getDegree() > i; i += 8)
        {
            j++;
        }

        if (abyte0.length % j != 0)
        {
            throw new IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
        }
        length = abyte0.length / j;
        vector = new int[length];
        j = 0;
        int k = 0;
        for (; j < vector.length; j++)
        {
            for (int l = 0; l < i;)
            {
                int ai[] = vector;
                int i1 = ai[j];
                ai[j] = (abyte0[k] & 0xff) << l | i1;
                l += 8;
                k++;
            }

            if (!gf2mfield.isElementOfThisField(vector[j]))
            {
                throw new IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
            }
        }

    }

    public GF2mVector(GF2mField gf2mfield, int ai[])
    {
        field = gf2mfield;
        length = ai.length;
        for (int i = ai.length - 1; i >= 0; i--)
        {
            if (!gf2mfield.isElementOfThisField(ai[i]))
            {
                throw new ArithmeticException("Element array is not specified over the given finite field.");
            }
        }

        vector = IntUtils.clone(ai);
    }

    public GF2mVector(GF2mVector gf2mvector)
    {
        field = new GF2mField(gf2mvector.field);
        length = gf2mvector.length;
        vector = IntUtils.clone(gf2mvector.vector);
    }

    public Vector add(Vector vector1)
    {
        throw new RuntimeException("not implemented");
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof GF2mVector)
        {
            if (field.equals(((GF2mVector) (obj = (GF2mVector)obj)).field))
            {
                return IntUtils.equals(vector, ((GF2mVector) (obj)).vector);
            }
        }
        return false;
    }

    public byte[] getEncoded()
    {
        int i = 8;
        int j = 1;
        for (; field.getDegree() > i; i += 8)
        {
            j++;
        }

        byte abyte0[] = new byte[j * vector.length];
        j = 0;
        int k = 0;
        for (; j < vector.length; j++)
        {
            for (int l = 0; l < i;)
            {
                abyte0[k] = (byte)(vector[j] >>> l);
                l += 8;
                k++;
            }

        }

        return abyte0;
    }

    public GF2mField getField()
    {
        return field;
    }

    public int[] getIntArrayForm()
    {
        return IntUtils.clone(vector);
    }

    public int hashCode()
    {
        return field.hashCode() * 31 + vector.hashCode();
    }

    public boolean isZero()
    {
        for (int i = vector.length - 1; i >= 0; i--)
        {
            if (vector[i] != 0)
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
            throw new ArithmeticException("permutation size and vector size mismatch");
        }
        int ai[] = new int[length];
        for (int i = 0; i < permutation.length; i++)
        {
            ai[i] = vector[permutation[i]];
        }

        return new GF2mVector(field, ai);
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < vector.length; i++)
        {
            int j = 0;
            while (j < field.getDegree()) 
            {
                if ((1 << (j & 0x1f) & vector[i]) != 0)
                {
                    stringbuffer.append('1');
                } else
                {
                    stringbuffer.append('0');
                }
                j++;
            }
            stringbuffer.append(' ');
        }

        return stringbuffer.toString();
    }
}
