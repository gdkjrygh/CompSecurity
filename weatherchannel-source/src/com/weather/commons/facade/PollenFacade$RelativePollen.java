// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;


// Referenced classes of package com.weather.commons.facade:
//            PollenFacade

public static final class  extends Enum
{

    private static final INCREASE $VALUES[];
    public static final INCREASE DECREASE;
    public static final INCREASE INCREASE;
    public static final INCREASE SAME;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/commons/facade/PollenFacade$RelativePollen, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DECREASE = new <init>("DECREASE", 0);
        SAME = new <init>("SAME", 1);
        INCREASE = new <init>("INCREASE", 2);
        $VALUES = (new .VALUES[] {
            DECREASE, SAME, INCREASE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
