// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;


// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            ItemLoader

public static final class  extends Enum
{

    private static final OTHER $VALUES[];
    public static final OTHER NO_NETWORK;
    public static final OTHER NO_RESULTS;
    public static final OTHER OTHER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmart/android/app/shop/itemloader/ItemLoader$PageLoadError, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NO_NETWORK = new <init>("NO_NETWORK", 0);
        NO_RESULTS = new <init>("NO_RESULTS", 1);
        OTHER = new <init>("OTHER", 2);
        $VALUES = (new .VALUES[] {
            NO_NETWORK, NO_RESULTS, OTHER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
