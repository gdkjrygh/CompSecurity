// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.math.BigInteger;
import java.util.Random;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            GF2nElement, GF2nField, GF2nONBField, GFElement

public class GF2nONBElement extends GF2nElement
{

    private static final int MAXLONG = 64;
    private static final long mBitmask[] = {
        1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 
        1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 0x10000L, 0x20000L, 0x40000L, 0x80000L, 
        0x100000L, 0x200000L, 0x400000L, 0x800000L, 0x1000000L, 0x2000000L, 0x4000000L, 0x8000000L, 0x10000000L, 0x20000000L, 
        0x40000000L, 0x80000000L, 0x100000000L, 0x200000000L, 0x400000000L, 0x800000000L, 0x1000000000L, 0x2000000000L, 0x4000000000L, 0x8000000000L, 
        0x10000000000L, 0x20000000000L, 0x40000000000L, 0x80000000000L, 0x100000000000L, 0x200000000000L, 0x400000000000L, 0x800000000000L, 0x1000000000000L, 0x2000000000000L, 
        0x4000000000000L, 0x8000000000000L, 0x10000000000000L, 0x20000000000000L, 0x40000000000000L, 0x80000000000000L, 0x100000000000000L, 0x200000000000000L, 0x400000000000000L, 0x800000000000000L, 
        0x1000000000000000L, 0x2000000000000000L, 0x4000000000000000L, 0x8000000000000000L
    };
    private static final int mIBY64[] = {
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 
        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
        1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 
        2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
        2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
        2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
        2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
        2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
        2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
        2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 
        3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
        3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
        3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
        3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
        3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
        3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 
        4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 
        4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 
        4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 
        4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 
        4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 
        4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 
        5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 
        5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 
        5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 
        5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 
        5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 
        5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 
        5, 5, 5, 5
    };
    private static final long mMaxmask[] = {
        1L, 3L, 7L, 15L, 31L, 63L, 127L, 255L, 511L, 1023L, 
        2047L, 4095L, 8191L, 16383L, 32767L, 65535L, 0x1ffffL, 0x3ffffL, 0x7ffffL, 0xfffffL, 
        0x1fffffL, 0x3fffffL, 0x7fffffL, 0xffffffL, 0x1ffffffL, 0x3ffffffL, 0x7ffffffL, 0xfffffffL, 0x1fffffffL, 0x3fffffffL, 
        0x7fffffffL, 0xffffffffL, 0x1ffffffffL, 0x3ffffffffL, 0x7ffffffffL, 0xfffffffffL, 0x1fffffffffL, 0x3fffffffffL, 0x7fffffffffL, 0xffffffffffL, 
        0x1ffffffffffL, 0x3ffffffffffL, 0x7ffffffffffL, 0xfffffffffffL, 0x1fffffffffffL, 0x3fffffffffffL, 0x7fffffffffffL, 0xffffffffffffL, 0x1ffffffffffffL, 0x3ffffffffffffL, 
        0x7ffffffffffffL, 0xfffffffffffffL, 0x1fffffffffffffL, 0x3fffffffffffffL, 0x7fffffffffffffL, 0xffffffffffffffL, 0x1ffffffffffffffL, 0x3ffffffffffffffL, 0x7ffffffffffffffL, 0xfffffffffffffffL, 
        0x1fffffffffffffffL, 0x3fffffffffffffffL, 0x7fffffffffffffffL, -1L
    };
    private int mBit;
    private int mLength;
    private long mPol[];

    public GF2nONBElement(GF2nONBElement gf2nonbelement)
    {
        mField = gf2nonbelement.mField;
        mDegree = mField.getDegree();
        mLength = ((GF2nONBField)mField).getONBLength();
        mBit = ((GF2nONBField)mField).getONBBit();
        mPol = new long[mLength];
        assign(gf2nonbelement.getElement());
    }

    public GF2nONBElement(GF2nONBField gf2nonbfield, BigInteger biginteger)
    {
        mField = gf2nonbfield;
        mDegree = mField.getDegree();
        mLength = gf2nonbfield.getONBLength();
        mBit = gf2nonbfield.getONBBit();
        mPol = new long[mLength];
        assign(biginteger);
    }

    public GF2nONBElement(GF2nONBField gf2nonbfield, Random random)
    {
        int i = 0;
        super();
        mField = gf2nonbfield;
        mDegree = mField.getDegree();
        mLength = gf2nonbfield.getONBLength();
        mBit = gf2nonbfield.getONBBit();
        mPol = new long[mLength];
        if (mLength > 1)
        {
            for (; i < mLength - 1; i++)
            {
                mPol[i] = random.nextLong();
            }

            long l = random.nextLong();
            mPol[mLength - 1] = l >>> 64 - mBit;
            return;
        } else
        {
            mPol[0] = random.nextLong();
            mPol[0] = mPol[0] >>> 64 - mBit;
            return;
        }
    }

    public GF2nONBElement(GF2nONBField gf2nonbfield, byte abyte0[])
    {
        mField = gf2nonbfield;
        mDegree = mField.getDegree();
        mLength = gf2nonbfield.getONBLength();
        mBit = gf2nonbfield.getONBBit();
        mPol = new long[mLength];
        assign(abyte0);
    }

    private GF2nONBElement(GF2nONBField gf2nonbfield, long al[])
    {
        mField = gf2nonbfield;
        mDegree = mField.getDegree();
        mLength = gf2nonbfield.getONBLength();
        mBit = gf2nonbfield.getONBBit();
        mPol = al;
    }

    public static GF2nONBElement ONE(GF2nONBField gf2nonbfield)
    {
        int j = gf2nonbfield.getONBLength();
        long al[] = new long[j];
        for (int i = 0; i < j - 1; i++)
        {
            al[i] = -1L;
        }

        al[j - 1] = mMaxmask[gf2nonbfield.getONBBit() - 1];
        return new GF2nONBElement(gf2nonbfield, al);
    }

    public static GF2nONBElement ZERO(GF2nONBField gf2nonbfield)
    {
        return new GF2nONBElement(gf2nonbfield, new long[gf2nonbfield.getONBLength()]);
    }

    private void assign(BigInteger biginteger)
    {
        assign(biginteger.toByteArray());
    }

    private void assign(byte abyte0[])
    {
        mPol = new long[mLength];
        for (int i = 0; i < abyte0.length; i++)
        {
            long al[] = mPol;
            int j = i >>> 3;
            al[j] = al[j] | ((long)abyte0[abyte0.length - 1 - i] & 255L) << ((i & 7) << 3);
        }

    }

    private void assign(long al[])
    {
        System.arraycopy(al, 0, mPol, 0, mLength);
    }

    private long[] getElement()
    {
        long al[] = new long[mPol.length];
        System.arraycopy(mPol, 0, al, 0, mPol.length);
        return al;
    }

    private long[] getElementReverseOrder()
    {
        long al[] = new long[mPol.length];
        for (int i = 0; i < mDegree; i++)
        {
            if (testBit(mDegree - i - 1))
            {
                int j = i >>> 6;
                al[j] = al[j] | mBitmask[i & 0x3f];
            }
        }

        return al;
    }

    public GFElement add(GFElement gfelement)
    {
        GF2nONBElement gf2nonbelement = new GF2nONBElement(this);
        gf2nonbelement.addToThis(gfelement);
        return gf2nonbelement;
    }

    public void addToThis(GFElement gfelement)
    {
        if (!(gfelement instanceof GF2nONBElement))
        {
            throw new RuntimeException();
        }
        if (!mField.equals(((GF2nONBElement)gfelement).mField))
        {
            throw new RuntimeException();
        }
        for (int i = 0; i < mLength; i++)
        {
            long al[] = mPol;
            al[i] = al[i] ^ ((GF2nONBElement)gfelement).mPol[i];
        }

    }

    void assignOne()
    {
        for (int i = 0; i < mLength - 1; i++)
        {
            mPol[i] = -1L;
        }

        mPol[mLength - 1] = mMaxmask[mBit - 1];
    }

    void assignZero()
    {
        mPol = new long[mLength];
    }

    public Object clone()
    {
        return new GF2nONBElement(this);
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof GF2nONBElement)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (GF2nONBElement)obj;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= mLength)
                {
                    break label1;
                }
                if (mPol[i] != ((GF2nONBElement) (obj)).mPol[i])
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

    public int hashCode()
    {
        return mPol.hashCode();
    }

    public GF2nElement increase()
    {
        GF2nONBElement gf2nonbelement = new GF2nONBElement(this);
        gf2nonbelement.increaseThis();
        return gf2nonbelement;
    }

    public void increaseThis()
    {
        addToThis(ONE((GF2nONBField)mField));
    }

    public GFElement invert()
    {
        GF2nONBElement gf2nonbelement = new GF2nONBElement(this);
        gf2nonbelement.invertThis();
        return gf2nonbelement;
    }

    public void invertThis()
    {
        if (isZero())
        {
            throw new ArithmeticException();
        }
        int i = 31;
        for (boolean flag = false; !flag && i >= 0; i--)
        {
            if (((long)(mDegree - 1) & mBitmask[i]) != 0L)
            {
                flag = true;
            }
        }

        ZERO((GF2nONBField)mField);
        GF2nONBElement gf2nonbelement = new GF2nONBElement(this);
        int j = (i + 1) - 1;
        i = 1;
        for (; j >= 0; j--)
        {
            GF2nElement gf2nelement = (GF2nElement)gf2nonbelement.clone();
            for (int k = 1; k <= i; k++)
            {
                gf2nelement.squareThis();
            }

            gf2nonbelement.multiplyThisBy(gf2nelement);
            int l = i << 1;
            i = l;
            if (((long)(mDegree - 1) & mBitmask[j]) != 0L)
            {
                gf2nonbelement.squareThis();
                gf2nonbelement.multiplyThisBy(this);
                i = l + 1;
            }
        }

        gf2nonbelement.squareThis();
    }

    public boolean isOne()
    {
        int i = 0;
        boolean flag = true;
        while (i < mLength - 1 && flag) 
        {
            if (flag && (mPol[i] & -1L) == -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i++;
        }
        if (flag)
        {
            return flag && (mPol[mLength - 1] & mMaxmask[mBit - 1]) == mMaxmask[mBit - 1];
        } else
        {
            return flag;
        }
    }

    public boolean isZero()
    {
        int i = 0;
        boolean flag = true;
        while (i < mLength && flag) 
        {
            if (flag && (mPol[i] & -1L) == 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i++;
        }
        return flag;
    }

    public GFElement multiply(GFElement gfelement)
    {
        GF2nONBElement gf2nonbelement = new GF2nONBElement(this);
        gf2nonbelement.multiplyThisBy(gfelement);
        return gf2nonbelement;
    }

    public void multiplyThisBy(GFElement gfelement)
    {
        if (!(gfelement instanceof GF2nONBElement))
        {
            throw new RuntimeException("The elements have different representation: not yet implemented");
        }
        if (!mField.equals(((GF2nONBElement)gfelement).mField))
        {
            throw new RuntimeException();
        }
        if (equals(gfelement))
        {
            squareThis();
            return;
        }
        long al[] = mPol;
        gfelement = ((GF2nONBElement)gfelement).mPol;
        long al1[] = new long[mLength];
        int ai[][] = ((GF2nONBField)mField).mMult;
        int j2 = mLength - 1;
        int i = mBit;
        long l3 = mBitmask[63];
        long l4 = mBitmask[i - 1];
        int l1 = 0;
        while (l1 < mDegree) 
        {
            int l = 0;
            for (int i2 = 0; i2 < mDegree;)
            {
                int j1 = mIBY64[i2];
                int i3 = mIBY64[ai[i2][0]];
                int k2 = ai[i2][0];
                int j = l;
                if ((al[j1] & mBitmask[i2 & 0x3f]) != 0L)
                {
                    long l5 = gfelement[i3];
                    int k1 = l;
                    if ((mBitmask[k2 & 0x3f] & l5) != 0L)
                    {
                        k1 = l ^ 1;
                    }
                    j = k1;
                    if (ai[i2][1] != -1)
                    {
                        l = mIBY64[ai[i2][1]];
                        int l2 = ai[i2][1];
                        j = k1;
                        if ((gfelement[l] & mBitmask[l2 & 0x3f]) != 0L)
                        {
                            j = k1 ^ 1;
                        }
                    }
                }
                i2++;
                l = j;
            }

            int k = mIBY64[l1];
            if (l != 0)
            {
                long l6 = al1[k];
                al1[k] = mBitmask[l1 & 0x3f] ^ l6;
            }
            if (mLength > 1)
            {
                boolean flag;
                int i1;
                boolean flag2;
                if ((al[j2] & 1L) == 1L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i1 = j2 - 1;
                flag2 = flag;
                while (i1 >= 0) 
                {
                    if ((al[i1] & 1L) != 0L)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    al[i1] = al[i1] >>> 1;
                    if (flag2)
                    {
                        al[i1] = al[i1] ^ l3;
                    }
                    i1--;
                    flag2 = flag;
                }
                al[j2] = al[j2] >>> 1;
                if (flag2)
                {
                    al[j2] = al[j2] ^ l4;
                }
                if ((gfelement[j2] & 1L) == 1L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i1 = j2 - 1;
                flag2 = flag;
                while (i1 >= 0) 
                {
                    if ((gfelement[i1] & 1L) != 0L)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    gfelement[i1] = gfelement[i1] >>> 1;
                    if (flag2)
                    {
                        gfelement[i1] = gfelement[i1] ^ l3;
                    }
                    i1--;
                    flag2 = flag;
                }
                gfelement[j2] = gfelement[j2] >>> 1;
                if (flag2)
                {
                    gfelement[j2] = gfelement[j2] ^ l4;
                }
            } else
            {
                boolean flag1;
                if ((al[0] & 1L) == 1L)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                al[0] = al[0] >>> 1;
                if (flag1)
                {
                    al[0] = al[0] ^ l4;
                }
                if ((gfelement[0] & 1L) == 1L)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                gfelement[0] = gfelement[0] >>> 1;
                if (flag1)
                {
                    gfelement[0] = gfelement[0] ^ l4;
                }
            }
            l1++;
        }
        assign(al1);
    }

    void reverseOrder()
    {
        mPol = getElementReverseOrder();
    }

    public GF2nElement solveQuadraticEquation()
    {
        if (trace() == 1)
        {
            throw new RuntimeException();
        }
        long l4 = mBitmask[63];
        long al[] = new long[mLength];
        long l1 = 0L;
        int i = 0;
        do
        {
            if (i >= mLength - 1)
            {
                break;
            }
            for (int k = 1; k < 64;)
            {
                long l2;
label0:
                {
                    if ((mBitmask[k] & mPol[i]) != 0L)
                    {
                        l2 = l1;
                        if ((mBitmask[k - 1] & l1) != 0L)
                        {
                            break label0;
                        }
                    }
                    if ((mPol[i] & mBitmask[k]) == 0L)
                    {
                        l2 = l1;
                        if ((mBitmask[k - 1] & l1) == 0L)
                        {
                            break label0;
                        }
                    }
                    l2 = l1 ^ mBitmask[k];
                }
                k++;
                l1 = l2;
            }

            al[i] = l1;
            if ((l4 & l1) != 0L && (mPol[i + 1] & 1L) == 1L || (l1 & l4) == 0L && (mPol[i + 1] & 1L) == 0L)
            {
                l1 = 0L;
            } else
            {
                l1 = 1L;
            }
            i++;
        } while (true);
        int l = mDegree;
        l4 = mPol[mLength - 1];
        for (int j = 1; j < (l & 0x3f);)
        {
            long l3;
label1:
            {
                if ((mBitmask[j] & l4) != 0L)
                {
                    l3 = l1;
                    if ((mBitmask[j - 1] & l1) != 0L)
                    {
                        break label1;
                    }
                }
                if ((mBitmask[j] & l4) == 0L)
                {
                    l3 = l1;
                    if ((mBitmask[j - 1] & l1) == 0L)
                    {
                        break label1;
                    }
                }
                l3 = l1 ^ mBitmask[j];
            }
            j++;
            l1 = l3;
        }

        al[mLength - 1] = l1;
        return new GF2nONBElement((GF2nONBField)mField, al);
    }

    public GF2nElement square()
    {
        GF2nONBElement gf2nonbelement = new GF2nONBElement(this);
        gf2nonbelement.squareThis();
        return gf2nonbelement;
    }

    public GF2nElement squareRoot()
    {
        GF2nONBElement gf2nonbelement = new GF2nONBElement(this);
        gf2nonbelement.squareRootThis();
        return gf2nonbelement;
    }

    public void squareRootThis()
    {
        long al[] = getElement();
        int j = mLength - 1;
        int k = mBit;
        long l = mBitmask[63];
        boolean flag;
        int i;
        boolean flag1;
        if ((al[0] & 1L) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = j;
        flag1 = flag;
        while (i >= 0) 
        {
            if ((al[i] & 1L) != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            al[i] = al[i] >>> 1;
            if (flag1)
            {
                if (i == j)
                {
                    al[i] = al[i] ^ mBitmask[k - 1];
                } else
                {
                    al[i] = al[i] ^ l;
                }
            }
            i--;
            flag1 = flag;
        }
        assign(al);
    }

    public void squareThis()
    {
        long al[] = getElement();
        int j = mLength - 1;
        int k = mBit - 1;
        long l = mBitmask[63];
        boolean flag;
        boolean flag1;
        int i;
        if ((al[j] & mBitmask[k]) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = 0;
        flag1 = flag;
        while (i < j) 
        {
            if ((al[i] & l) != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            al[i] = al[i] << 1;
            if (flag1)
            {
                al[i] = al[i] ^ 1L;
            }
            i++;
            flag1 = flag;
        }
        if ((al[j] & mBitmask[k]) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        al[j] = al[j] << 1;
        if (flag1)
        {
            al[j] = al[j] ^ 1L;
        }
        if (flag)
        {
            al[j] = al[j] ^ mBitmask[k + 1];
        }
        assign(al);
    }

    boolean testBit(int i)
    {
        while (i < 0 || i > mDegree || (mPol[i >>> 6] & mBitmask[i & 0x3f]) == 0L) 
        {
            return false;
        }
        return true;
    }

    public boolean testRightmostBit()
    {
        return (mPol[mLength - 1] & mBitmask[mBit - 1]) != 0L;
    }

    public byte[] toByteArray()
    {
        int j = (mDegree - 1 >> 3) + 1;
        byte abyte0[] = new byte[j];
        for (int i = 0; i < j; i++)
        {
            abyte0[j - i - 1] = (byte)(int)((mPol[i >>> 3] & 255L << ((i & 7) << 3)) >>> ((i & 7) << 3));
        }

        return abyte0;
    }

    public BigInteger toFlexiBigInt()
    {
        return new BigInteger(1, toByteArray());
    }

    public String toString()
    {
        return toString(16);
    }

    public String toString(int i)
    {
        String s1 = "";
        long al[] = getElement();
        int j = mBit;
        String s;
        if (i == 2)
        {
            i = j - 1;
            s = "";
            while (i >= 0) 
            {
                if ((al[al.length - 1] & 1L << i) == 0L)
                {
                    s = (new StringBuilder()).append(s).append("0").toString();
                } else
                {
                    s = (new StringBuilder()).append(s).append("1").toString();
                }
                i--;
            }
            i = al.length - 2;
            s1 = s;
            do
            {
                s = s1;
                if (i < 0)
                {
                    break;
                }
                int k = 63;
                s = s1;
                while (k >= 0) 
                {
                    if ((al[i] & mBitmask[k]) == 0L)
                    {
                        s = (new StringBuilder()).append(s).append("0").toString();
                    } else
                    {
                        s = (new StringBuilder()).append(s).append("1").toString();
                    }
                    k--;
                }
                i--;
                s1 = s;
            } while (true);
        } else
        {
            s = s1;
            if (i == 16)
            {
                char ac[] = new char[16];
                char[] _tmp = ac;
                ac[0] = '0';
                ac[1] = '1';
                ac[2] = '2';
                ac[3] = '3';
                ac[4] = '4';
                ac[5] = '5';
                ac[6] = '6';
                ac[7] = '7';
                ac[8] = '8';
                ac[9] = '9';
                ac[10] = 'a';
                ac[11] = 'b';
                ac[12] = 'c';
                ac[13] = 'd';
                ac[14] = 'e';
                ac[15] = 'f';
                i = al.length - 1;
                do
                {
                    s = s1;
                    if (i < 0)
                    {
                        break;
                    }
                    s = (new StringBuilder()).append(s1).append(ac[(int)(al[i] >>> 60) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 56) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 52) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 48) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 44) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 40) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 36) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 32) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 28) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 24) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 20) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 16) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 12) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 8) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)(al[i] >>> 4) & 0xf]).toString();
                    s = (new StringBuilder()).append(s).append(ac[(int)al[i] & 0xf]).toString();
                    s1 = (new StringBuilder()).append(s).append(" ").toString();
                    i--;
                } while (true);
            }
        }
        return s;
    }

    public int trace()
    {
        boolean flag = false;
        int l1 = mLength - 1;
        int j = 0;
        int i = 0;
        for (; j < l1; j++)
        {
            for (int l = 0; l < 64;)
            {
                int j1 = i;
                if ((mPol[j] & mBitmask[l]) != 0L)
                {
                    j1 = i ^ 1;
                }
                l++;
                i = j1;
            }

        }

        int k1 = mBit;
        for (int k = ((flag) ? 1 : 0); k < k1;)
        {
            int i1 = i;
            if ((mPol[l1] & mBitmask[k]) != 0L)
            {
                i1 = i ^ 1;
            }
            k++;
            i = i1;
        }

        return i;
    }

}
