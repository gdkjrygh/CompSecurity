// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;


// Referenced classes of package com.mixpanel.android.viewcrawler:
//            Pathfinder

private static class mStackSize
{

    private static final int MAX_INDEX_STACK_SIZE = 256;
    private final int mStack[] = new int[256];
    private int mStackSize;

    public int alloc()
    {
        int i = mStackSize;
        mStackSize = mStackSize + 1;
        mStack[i] = 0;
        return i;
    }

    public void free()
    {
        mStackSize = mStackSize - 1;
        if (mStackSize < 0)
        {
            throw new ArrayIndexOutOfBoundsException(mStackSize);
        } else
        {
            return;
        }
    }

    public boolean full()
    {
        return mStack.length == mStackSize;
    }

    public void increment(int i)
    {
        int ai[] = mStack;
        ai[i] = ai[i] + 1;
    }

    public int read(int i)
    {
        return mStack[i];
    }

    public ()
    {
        mStackSize = 0;
    }
}
