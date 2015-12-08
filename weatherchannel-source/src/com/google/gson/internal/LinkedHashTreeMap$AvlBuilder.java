// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;


// Referenced classes of package com.google.gson.internal:
//            LinkedHashTreeMap

static final class 
{

    private int leavesSkipped;
    private int leavesToSkip;
    private int size;
    private  stack;

    void add( )
    {
        . = null;
        . = null;
        . = null;
        . = 1;
        if (leavesToSkip > 0 && (size & 1) == 0)
        {
            size = size + 1;
            leavesToSkip = leavesToSkip - 1;
            leavesSkipped = leavesSkipped + 1;
        }
        . = stack;
        stack = ;
        size = size + 1;
        if (leavesToSkip > 0 && (size & 1) == 0)
        {
            size = size + 1;
            leavesToSkip = leavesToSkip - 1;
            leavesSkipped = leavesSkipped + 1;
        }
        int i = 4;
        while ((size & i - 1) == i - 1) 
        {
            if (leavesSkipped == 0)
            {
                 = stack;
                 1 = .;
                 3 = 1.;
                1. = 3.;
                stack = 1;
                1.stack = 3;
                1.stack = ;
                1. = . + 1;
                3. = 1;
                . = 1;
            } else
            if (leavesSkipped == 1)
            {
                 = stack;
                 2 = .;
                stack = 2;
                2.stack = ;
                2. = . + 1;
                . = 2;
                leavesSkipped = 0;
            } else
            if (leavesSkipped == 2)
            {
                leavesSkipped = 0;
            }
            i *= 2;
        }
    }

    void reset(int i)
    {
        leavesToSkip = Integer.highestOneBit(i) * 2 - 1 - i;
        size = 0;
        leavesSkipped = 0;
        stack = null;
    }

    stack root()
    {
        stack stack1 = stack;
        if (stack1. != null)
        {
            throw new IllegalStateException();
        } else
        {
            return stack1;
        }
    }

    ()
    {
    }
}
