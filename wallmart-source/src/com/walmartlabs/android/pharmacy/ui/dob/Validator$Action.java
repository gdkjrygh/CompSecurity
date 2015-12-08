// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.ui.dob;


// Referenced classes of package com.walmartlabs.android.pharmacy.ui.dob:
//            Validator

public static final class  extends Enum
{

    private static final REJECT $VALUES[];
    public static final REJECT ACCEPT;
    public static final REJECT PAD;
    public static final REJECT REJECT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/android/pharmacy/ui/dob/Validator$Action, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ACCEPT = new <init>("ACCEPT", 0);
        PAD = new <init>("PAD", 1);
        REJECT = new <init>("REJECT", 2);
        $VALUES = (new .VALUES[] {
            ACCEPT, PAD, REJECT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
