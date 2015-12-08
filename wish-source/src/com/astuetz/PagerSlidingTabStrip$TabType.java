// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.astuetz;


// Referenced classes of package com.astuetz:
//            PagerSlidingTabStrip

public static final class  extends Enum
{

    private static final ICON_TAB $VALUES[];
    public static final ICON_TAB ICON_TAB;
    public static final ICON_TAB TEXT_TAB;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/astuetz/PagerSlidingTabStrip$TabType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TEXT_TAB = new <init>("TEXT_TAB", 0);
        ICON_TAB = new <init>("ICON_TAB", 1);
        $VALUES = (new .VALUES[] {
            TEXT_TAB, ICON_TAB
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
