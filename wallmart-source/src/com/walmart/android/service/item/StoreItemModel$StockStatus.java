// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;


// Referenced classes of package com.walmart.android.service.item:
//            StoreItemModel

public static final class A extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN AVAILABLE;
    public static final UNKNOWN LIMITED;
    public static final UNKNOWN UNAVAILABLE;
    public static final UNKNOWN UNKNOWN;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/walmart/android/service/item/StoreItemModel$StockStatus, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        AVAILABLE = new <init>("AVAILABLE", 0);
        LIMITED = new <init>("LIMITED", 1);
        UNAVAILABLE = new <init>("UNAVAILABLE", 2);
        UNKNOWN = new <init>("UNKNOWN", 3);
        $VALUES = (new .VALUES[] {
            AVAILABLE, LIMITED, UNAVAILABLE, UNKNOWN
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
