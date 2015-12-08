// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import android.text.TextUtils;
import com.walmart.android.service.item.ItemPrice;
import com.walmart.android.service.item.StoreItemModel;

public class StoreAvailabilityData
{

    public static final int ERROR_NO_AVAILABILITY_FOUND = 10000;
    public static final String STORE_AVAIL_TAG = "INSTORE_DEBUG";
    public String aisleLocations[];
    public String department;
    public InStoreSearchResult.Detailed detailedLocations[];
    public boolean hasStoreLocationData;
    public boolean isPutAvailable;
    public String name;
    public String ppuDisplayString;
    public String price;
    public String priceUnitString;
    public String productId;
    public String productImageUrl;
    public String stockStatus;
    public String storeAddress;
    public String storeId;
    public String upc;
    public String wwwItemId;

    public StoreAvailabilityData()
    {
    }

    public StoreAvailabilityData(InStoreSearchResult.Result result)
    {
        setDataFromStoreSearchResult(result);
    }

    public StoreAvailabilityData(SlapResponse.Store store, SlapResponse.Item item)
    {
        setDataFromSlapStore(store, item);
    }

    public StoreAvailabilityData(StoreItemModel storeitemmodel)
    {
        setDataFromStoreItemModel(storeitemmodel);
    }

    private void setDataFromSlapStore(SlapResponse.Store store, SlapResponse.Item item)
    {
        if (store.stockStatus != null)
        {
            stockStatus = store.stockStatus.trim();
        }
        if (store.address != null)
        {
            storeAddress = store.address.street1;
        }
        price = String.valueOf(store.price);
        storeId = store.storeId;
        isPutAvailable = store.putAvailable.booleanValue();
        if (item != null)
        {
            name = item.name;
            if (TextUtils.isEmpty(name))
            {
                name = item.signingDesc;
            }
            wwwItemId = item.id;
            upc = item.upc;
            productImageUrl = item.productImageUrl;
        }
    }

    private void setDataFromStoreItemModel(StoreItemModel storeitemmodel)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[];

            static 
            {
                $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus = new int[com.walmart.android.service.item.StoreItemModel.StockStatus.values().length];
                try
                {
                    $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[com.walmart.android.service.item.StoreItemModel.StockStatus.AVAILABLE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[com.walmart.android.service.item.StoreItemModel.StockStatus.LIMITED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[com.walmart.android.service.item.StoreItemModel.StockStatus.UNAVAILABLE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$StoreItemModel$StockStatus[com.walmart.android.service.item.StoreItemModel.StockStatus.UNKNOWN.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.walmart.android.service.item.StoreItemModel.StockStatus[storeitemmodel.getStockStatus().ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 77
    //                   2 86
    //                   3 95;
           goto _L1 _L2 _L3 _L4
_L1:
        stockStatus = null;
_L6:
        storeAddress = storeitemmodel.getStoreAddress();
        price = storeitemmodel.getItemPrice().getPriceString();
        storeId = storeitemmodel.getStoreId();
        isPutAvailable = storeitemmodel.isPutAvailable();
        return;
_L2:
        stockStatus = "In Stock";
        continue; /* Loop/switch isn't completed */
_L3:
        stockStatus = "Limited Stock";
        continue; /* Loop/switch isn't completed */
_L4:
        stockStatus = "Out of Stock";
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void setDataFromStoreSearchResult(InStoreSearchResult.Result result)
    {
        stockStatus = result.getInventoryStatus();
        price = result.getPriceString();
        aisleLocations = result.getAisles();
        detailedLocations = result.getDetailedLocations();
        department = result.getDepartmentName();
        storeId = result.storeNumber;
        hasStoreLocationData = true;
        name = result.name;
        wwwItemId = result.getWWWItemId();
        productId = result.getProductId();
        upc = result.getUpc();
        productImageUrl = result.getThumbNailUrl();
        priceUnitString = result.getPriceUnit();
        ppuDisplayString = result.getFormattedPricePerUnit();
    }
}
