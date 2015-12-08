// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import java.util.Comparator;

// Referenced classes of package com.google.common.primitives:
//            UnsignedInts

static final class I extends Enum
    implements Comparator
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/google/common/primitives/UnsignedInts$LexicographicalComparator, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((int[])obj, (int[])obj1);
    }

    public int compare(int ai[], int ai1[])
    {
        int j = Math.min(ai.length, ai1.length);
        for (int i = 0; i < j; i++)
        {
            if (ai[i] != ai1[i])
            {
                return UnsignedInts.compare(ai[i], ai1[i]);
            }
        }

        return ai.length - ai1.length;
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE", 0);
        $VALUES = (new .VALUES[] {
            INSTANCE
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
