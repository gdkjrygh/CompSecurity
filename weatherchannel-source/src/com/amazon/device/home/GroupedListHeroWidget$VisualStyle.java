// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.home;


// Referenced classes of package com.amazon.device.home:
//            GroupedListHeroWidget

public static final class  extends Enum
{

    private static final SIMPLE $VALUES[];
    public static final SIMPLE DEFAULT;
    public static final SIMPLE PEEKABLE;
    public static final SIMPLE SHOPPING;
    public static final SIMPLE SIMPLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/amazon/device/home/GroupedListHeroWidget$VisualStyle, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        PEEKABLE = new <init>("PEEKABLE", 1);
        SHOPPING = new <init>("SHOPPING", 2);
        SIMPLE = new <init>("SIMPLE", 3);
        $VALUES = (new .VALUES[] {
            DEFAULT, PEEKABLE, SHOPPING, SIMPLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
