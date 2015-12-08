// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;


// Referenced classes of package com.walmart.android.service.item:
//            ItemModel

public static final class  extends Enum
{

    private static final AS_SEEN_ON_TV $VALUES[];
    public static final AS_SEEN_ON_TV AS_ADVERTISED;
    public static final AS_SEEN_ON_TV AS_SEEN_ON_TV;
    public static final AS_SEEN_ON_TV AWARD_WINNING;
    public static final AS_SEEN_ON_TV CERTIFIED_ITEM;
    public static final AS_SEEN_ON_TV CLEARANCE;
    public static final AS_SEEN_ON_TV COMING_SOON;
    public static final AS_SEEN_ON_TV DARE_TO_COMPARE;
    public static final AS_SEEN_ON_TV EXCLUSIVE;
    public static final AS_SEEN_ON_TV FREE_SHIPPING;
    public static final AS_SEEN_ON_TV NEW;
    public static final AS_SEEN_ON_TV NEW_ITEM;
    public static final AS_SEEN_ON_TV PERSONALIZE_IT;
    public static final AS_SEEN_ON_TV REBATE_AVAILABLE;
    public static final AS_SEEN_ON_TV REDUCED_PRICE;
    public static final AS_SEEN_ON_TV ROLLBACK;
    public static final AS_SEEN_ON_TV SAME_DAY_DELIVERY;
    public static final AS_SEEN_ON_TV SAVE_ON_SHIPPING;
    public static final AS_SEEN_ON_TV SPECIAL_BUY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmart/android/service/item/ItemModel$PriceFlags, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FREE_SHIPPING = new <init>("FREE_SHIPPING", 0);
        ROLLBACK = new <init>("ROLLBACK", 1);
        CLEARANCE = new <init>("CLEARANCE", 2);
        DARE_TO_COMPARE = new <init>("DARE_TO_COMPARE", 3);
        SAME_DAY_DELIVERY = new <init>("SAME_DAY_DELIVERY", 4);
        COMING_SOON = new <init>("COMING_SOON", 5);
        EXCLUSIVE = new <init>("EXCLUSIVE", 6);
        PERSONALIZE_IT = new <init>("PERSONALIZE_IT", 7);
        SPECIAL_BUY = new <init>("SPECIAL_BUY", 8);
        SAVE_ON_SHIPPING = new <init>("SAVE_ON_SHIPPING", 9);
        REBATE_AVAILABLE = new <init>("REBATE_AVAILABLE", 10);
        AS_ADVERTISED = new <init>("AS_ADVERTISED", 11);
        AWARD_WINNING = new <init>("AWARD_WINNING", 12);
        NEW = new <init>("NEW", 13);
        NEW_ITEM = new <init>("NEW_ITEM", 14);
        CERTIFIED_ITEM = new <init>("CERTIFIED_ITEM", 15);
        REDUCED_PRICE = new <init>("REDUCED_PRICE", 16);
        AS_SEEN_ON_TV = new <init>("AS_SEEN_ON_TV", 17);
        $VALUES = (new .VALUES[] {
            FREE_SHIPPING, ROLLBACK, CLEARANCE, DARE_TO_COMPARE, SAME_DAY_DELIVERY, COMING_SOON, EXCLUSIVE, PERSONALIZE_IT, SPECIAL_BUY, SAVE_ON_SHIPPING, 
            REBATE_AVAILABLE, AS_ADVERTISED, AWARD_WINNING, NEW, NEW_ITEM, CERTIFIED_ITEM, REDUCED_PRICE, AS_SEEN_ON_TV
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
