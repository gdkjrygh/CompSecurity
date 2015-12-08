// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;


// Referenced classes of package com.walmart.android.service.item:
//            BundleModel

public static final class  extends Enum
{

    private static final OPTIONAL $VALUES[];
    public static final OPTIONAL OPTIONAL;
    public static final OPTIONAL REQUIRED;
    public static final OPTIONAL STANDARD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmart/android/service/item/BundleModel$GroupType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        STANDARD = new <init>("STANDARD", 0);
        REQUIRED = new <init>("REQUIRED", 1);
        OPTIONAL = new <init>("OPTIONAL", 2);
        $VALUES = (new .VALUES[] {
            STANDARD, REQUIRED, OPTIONAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
