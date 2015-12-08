// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;


// Referenced classes of package com.walmart.android.util:
//            AvailabilityUtils

static class el.StockStatus
{

    static final int $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[];

    static 
    {
        $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus = new int[com.walmart.android.service.item.Status.values().length];
        try
        {
            $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[com.walmart.android.service.item.Status.AVAILABLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[com.walmart.android.service.item.Status.LIMITED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[com.walmart.android.service.item.Status.UNAVAILABLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[com.walmart.android.service.item.Status.UNKNOWN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
