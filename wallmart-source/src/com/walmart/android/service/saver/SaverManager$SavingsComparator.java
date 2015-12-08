// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import java.util.Comparator;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager

public static class <init>
    implements Comparator
{

    private final boolean mSortByPrice;

    public int compare(<init> <init>1, <init> <init>2)
    {
        int i;
        int j;
        byte byte0;
        byte0 = -1;
        if (!mSortByPrice)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        j = 0;
        i = j;
        if (<init>1.s != null)
        {
            i = j;
            if (<init>1.s != null)
            {
                i = <init>1.s.intValue() - <init>1.s.torUnitPrice;
            }
        }
        boolean flag = false;
        j = ((flag) ? 1 : 0);
        if (<init>2.s != null)
        {
            j = ((flag) ? 1 : 0);
            if (<init>2.s != null)
            {
                j = <init>2.s.intValue() - <init>2.s.torUnitPrice;
            }
        }
        if (i == j) goto _L2; else goto _L1
_L1:
        if (i <= 0 || j <= 0) goto _L4; else goto _L3
_L3:
        int k = j - i;
_L6:
        return k;
_L4:
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = byte0;
        if (j < 0) goto _L6; else goto _L5
_L5:
        if (i == 0 && j != 0)
        {
            return 1;
        }
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = byte0;
        if (j == 0) goto _L6; else goto _L7
_L7:
        if (i < 0 && j > 0)
        {
            return 1;
        }
        if (i < 0 && j < 0)
        {
            return i - j;
        }
        break MISSING_BLOCK_LABEL_211;
_L2:
        if (<init>1.torUnitPrice == null)
        {
            break; /* Loop/switch isn't completed */
        }
        k = byte0;
        if (<init>2.torUnitPrice == null) goto _L6; else goto _L8
_L8:
        if (<init>1.torUnitPrice == null && <init>2.torUnitPrice != null)
        {
            return 1;
        }
        return <init>1. - <init>2.;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((compare)obj, (compare)obj1);
    }

    private (boolean flag)
    {
        mSortByPrice = flag;
    }

    mSortByPrice(boolean flag, mSortByPrice msortbyprice)
    {
        this(flag);
    }
}
