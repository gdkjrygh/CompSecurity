// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;


// Referenced classes of package com.mixpanel.android.surveys:
//            CardCarouselLayout

public static final class  extends Enum
{

    public static final BACKWARD BACKWARD;
    private static final BACKWARD ENUM$VALUES[];
    public static final BACKWARD FORWARD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/mixpanel/android/surveys/CardCarouselLayout$Direction, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        FORWARD = new <init>("FORWARD", 0);
        BACKWARD = new <init>("BACKWARD", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            FORWARD, BACKWARD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
