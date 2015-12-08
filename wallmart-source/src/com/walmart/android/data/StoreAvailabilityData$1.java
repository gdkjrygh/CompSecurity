// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            StoreAvailabilityData

static class tockStatus
{

    static final int $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[];

    static 
    {
        $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus = new int[com.walmart.android.service.item.us.values().length];
        try
        {
            $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[com.walmart.android.service.item.us.AVAILABLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[com.walmart.android.service.item.us.LIMITED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[com.walmart.android.service.item.us.UNAVAILABLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[com.walmart.android.service.item.us.UNKNOWN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
