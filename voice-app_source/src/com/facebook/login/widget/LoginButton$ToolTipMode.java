// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;


// Referenced classes of package com.facebook.login.widget:
//            LoginButton

public static final class intValue extends Enum
{

    public static final AUTOMATIC AUTOMATIC;
    public static AUTOMATIC DEFAULT;
    public static final AUTOMATIC DISPLAY_ALWAYS;
    private static final AUTOMATIC ENUM$VALUES[];
    public static final AUTOMATIC NEVER_DISPLAY;
    private int intValue;
    private String stringValue;

    public static intValue fromInt(int i)
    {
        intValue aintvalue[];
        int j;
        int k;
        aintvalue = values();
        k = aintvalue.length;
        j = 0;
_L6:
        if (j < k) goto _L2; else goto _L1
_L1:
        intValue intvalue = null;
_L4:
        return intvalue;
_L2:
        intValue intvalue1;
        intvalue1 = aintvalue[j];
        intvalue = intvalue1;
        if (intvalue1.getValue() == i) goto _L4; else goto _L3
_L3:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static getValue valueOf(String s)
    {
        return (getValue)Enum.valueOf(com/facebook/login/widget/LoginButton$ToolTipMode, s);
    }

    public static getValue[] values()
    {
        getValue agetvalue[] = ENUM$VALUES;
        int i = agetvalue.length;
        getValue agetvalue1[] = new ENUM.VALUES[i];
        System.arraycopy(agetvalue, 0, agetvalue1, 0, i);
        return agetvalue1;
    }

    public int getValue()
    {
        return intValue;
    }

    public String toString()
    {
        return stringValue;
    }

    static 
    {
        AUTOMATIC = new <init>("AUTOMATIC", 0, "automatic", 0);
        DISPLAY_ALWAYS = new <init>("DISPLAY_ALWAYS", 1, "display_always", 1);
        NEVER_DISPLAY = new <init>("NEVER_DISPLAY", 2, "never_display", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            AUTOMATIC, DISPLAY_ALWAYS, NEVER_DISPLAY
        });
        DEFAULT = AUTOMATIC;
    }

    private (String s, int i, String s1, int j)
    {
        super(s, i);
        stringValue = s1;
        intValue = j;
    }
}
