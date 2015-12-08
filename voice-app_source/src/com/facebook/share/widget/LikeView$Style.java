// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;


// Referenced classes of package com.facebook.share.widget:
//            LikeView

public static final class intValue extends Enum
{

    public static final STANDARD BOX_COUNT;
    public static final STANDARD BUTTON;
    static STANDARD DEFAULT;
    private static final STANDARD ENUM$VALUES[];
    public static final STANDARD STANDARD;
    private int intValue;
    private String stringValue;

    static intValue fromInt(int i)
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

    private int getValue()
    {
        return intValue;
    }

    public static intValue valueOf(String s)
    {
        return (intValue)Enum.valueOf(com/facebook/share/widget/LikeView$Style, s);
    }

    public static intValue[] values()
    {
        intValue aintvalue[] = ENUM$VALUES;
        int i = aintvalue.length;
        intValue aintvalue1[] = new ENUM.VALUES[i];
        System.arraycopy(aintvalue, 0, aintvalue1, 0, i);
        return aintvalue1;
    }

    public String toString()
    {
        return stringValue;
    }

    static 
    {
        STANDARD = new <init>("STANDARD", 0, "standard", 0);
        BUTTON = new <init>("BUTTON", 1, "button", 1);
        BOX_COUNT = new <init>("BOX_COUNT", 2, "box_count", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            STANDARD, BUTTON, BOX_COUNT
        });
        DEFAULT = STANDARD;
    }


    private (String s, int i, String s1, int j)
    {
        super(s, i);
        stringValue = s1;
        intValue = j;
    }
}
