// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import java.util.Comparator;

// Referenced classes of package com.google.common.primitives:
//            Doubles

private static final class  extends Enum
    implements Comparator
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/common/primitives/Doubles$LexicographicalComparator, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((double[])obj, (double[])obj1);
    }

    public int compare(double ad[], double ad1[])
    {
        int j = Math.min(ad.length, ad1.length);
        for (int i = 0; i < j; i++)
        {
            int k = Double.compare(ad[i], ad1[i]);
            if (k != 0)
            {
                return k;
            }
        }

        return ad.length - ad1.length;
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE", 0);
        $VALUES = (new .VALUES[] {
            INSTANCE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
