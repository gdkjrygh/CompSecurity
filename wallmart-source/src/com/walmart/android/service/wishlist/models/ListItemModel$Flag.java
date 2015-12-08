// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist.models;


// Referenced classes of package com.walmart.android.service.wishlist.models:
//            ListItemModel

public static final class  extends Enum
{

    private static final BEST_SELLER $VALUES[];
    public static final BEST_SELLER BEST_SELLER;
    public static final BEST_SELLER CLEARANCE;
    public static final BEST_SELLER NEW;
    public static final BEST_SELLER ROLLBACK;
    public static final BEST_SELLER SPECIAL_BUY;
    public static final BEST_SELLER WALMART_ONLY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmart/android/service/wishlist/models/ListItemModel$Flag, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ROLLBACK = new <init>("ROLLBACK", 0);
        CLEARANCE = new <init>("CLEARANCE", 1);
        WALMART_ONLY = new <init>("WALMART_ONLY", 2);
        SPECIAL_BUY = new <init>("SPECIAL_BUY", 3);
        NEW = new <init>("NEW", 4);
        BEST_SELLER = new <init>("BEST_SELLER", 5);
        $VALUES = (new .VALUES[] {
            ROLLBACK, CLEARANCE, WALMART_ONLY, SPECIAL_BUY, NEW, BEST_SELLER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
