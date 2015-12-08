// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


public final class CircularIntArray
{

    private int mCapacityBitmask;
    private int mElements[];
    private int mHead;
    private int mTail;

    public CircularIntArray()
    {
        this(8);
    }

    public CircularIntArray(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("capacity must be positive");
        }
        int j = i;
        if (Integer.bitCount(i) != 1)
        {
            j = 1 << Integer.highestOneBit(i) + 1;
        }
        mCapacityBitmask = j - 1;
        mElements = new int[j];
    }

    private void doubleCapacity()
    {
        int i = mElements.length;
        int j = i - mHead;
        int k = i << 1;
        if (k < 0)
        {
            throw new RuntimeException("Max array capacity exceeded");
        } else
        {
            int ai[] = new int[k];
            System.arraycopy(mElements, mHead, ai, 0, j);
            System.arraycopy(mElements, 0, ai, j, mHead);
            mElements = ai;
            mHead = 0;
            mTail = i;
            mCapacityBitmask = k - 1;
            return;
        }
    }

    public void addFirst(int i)
    {
        mHead = mHead - 1 & mCapacityBitmask;
        mElements[mHead] = i;
        if (mHead == mTail)
        {
            doubleCapacity();
        }
    }

    public void addLast(int i)
    {
        mElements[mTail] = i;
        mTail = mTail + 1 & mCapacityBitmask;
        if (mTail == mHead)
        {
            doubleCapacity();
        }
    }

    public void clear()
    {
        mTail = mHead;
    }

    public int get(int i)
    {
        if (i < 0 || i >= size())
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            return mElements[mHead + i & mCapacityBitmask];
        }
    }

    public int getFirst()
    {
        if (mHead == mTail)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            return mElements[mHead];
        }
    }

    public int getLast()
    {
        if (mHead == mTail)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            return mElements[mTail - 1 & mCapacityBitmask];
        }
    }

    public boolean isEmpty()
    {
        return mHead == mTail;
    }

    public int popFirst()
    {
        if (mHead == mTail)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            int i = mElements[mHead];
            mHead = mHead + 1 & mCapacityBitmask;
            return i;
        }
    }

    public int popLast()
    {
        if (mHead == mTail)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            int i = mTail - 1 & mCapacityBitmask;
            int j = mElements[i];
            mTail = i;
            return j;
        }
    }

    public void removeFromEnd(int i)
    {
        if (i <= 0)
        {
            return;
        }
        if (i > size())
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            mTail = mTail - i & mCapacityBitmask;
            return;
        }
    }

    public void removeFromStart(int i)
    {
        if (i <= 0)
        {
            return;
        }
        if (i > size())
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            mHead = mHead + i & mCapacityBitmask;
            return;
        }
    }

    public int size()
    {
        return mTail - mHead & mCapacityBitmask;
    }
}
