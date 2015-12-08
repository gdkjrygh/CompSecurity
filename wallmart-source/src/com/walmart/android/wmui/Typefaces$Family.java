// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;


// Referenced classes of package com.walmart.android.wmui:
//            Typefaces

public static final class platformFont extends Enum
{

    private static final LIGHT $VALUES[];
    public static final LIGHT LIGHT;
    public static final LIGHT MEDIUM;
    public static final LIGHT REGULAR;
    private String familyName;
    private boolean platformFont;

    public static platformFont valueOf(String s)
    {
        return (platformFont)Enum.valueOf(com/walmart/android/wmui/Typefaces$Family, s);
    }

    public static platformFont[] values()
    {
        return (platformFont[])$VALUES.clone();
    }

    static 
    {
        REGULAR = new <init>("REGULAR", 0, "sans-serif", true);
        MEDIUM = new <init>("MEDIUM", 1, "fonts/Roboto-Medium.ttf", false);
        LIGHT = new <init>("LIGHT", 2, "sans-serif-light", true);
        $VALUES = (new .VALUES[] {
            REGULAR, MEDIUM, LIGHT
        });
    }



    private (String s, int i, String s1, boolean flag)
    {
        super(s, i);
        familyName = s1;
        platformFont = flag;
    }
}
