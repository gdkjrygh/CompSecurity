// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist.models;


// Referenced classes of package com.walmart.android.service.wishlist.models:
//            ListItemModel

public static final class mOfferType extends Enum
{

    private static final ONLINE_AND_STORE $VALUES[];
    public static final ONLINE_AND_STORE ONLINE_AND_STORE;
    public static final ONLINE_AND_STORE ONLINE_ONLY;
    public static final ONLINE_AND_STORE STORE_ONLY;
    private final String mOfferType;

    public static mOfferType from(String s)
    {
        mOfferType amoffertype[] = values();
        int j = amoffertype.length;
        for (int i = 0; i < j; i++)
        {
            mOfferType moffertype = amoffertype[i];
            if (moffertype.mOfferType.equalsIgnoreCase(s))
            {
                return moffertype;
            }
        }

        return STORE_ONLY;
    }

    public static STORE_ONLY valueOf(String s)
    {
        return (STORE_ONLY)Enum.valueOf(com/walmart/android/service/wishlist/models/ListItemModel$OfferType, s);
    }

    public static STORE_ONLY[] values()
    {
        return (STORE_ONLY[])$VALUES.clone();
    }

    static 
    {
        STORE_ONLY = new <init>("STORE_ONLY", 0, "Store only");
        ONLINE_ONLY = new <init>("ONLINE_ONLY", 1, "Online only");
        ONLINE_AND_STORE = new <init>("ONLINE_AND_STORE", 2, "Online and store");
        $VALUES = (new .VALUES[] {
            STORE_ONLY, ONLINE_ONLY, ONLINE_AND_STORE
        });
    }

    private I(String s, int i, String s1)
    {
        super(s, i);
        mOfferType = s1;
    }
}
