// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;


// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyManager

public static final class  extends Enum
{

    private static final YES $VALUES[];
    public static final YES NO;
    public static final YES UNKNOWN;
    public static final YES YES;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/android/pharmacy/PharmacyManager$HasRxEnabledAccountResult, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        NO = new <init>("NO", 1);
        YES = new <init>("YES", 2);
        $VALUES = (new .VALUES[] {
            UNKNOWN, NO, YES
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
