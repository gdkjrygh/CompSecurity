// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            WalmartStore

public class ItemAvailabilityResult
{
    public static class StoreWithStockStatus
    {

        private String stockStatus;
        private WalmartStore store;

        public String getStockStatus()
        {
            return stockStatus;
        }

        public WalmartStore getStore()
        {
            return store;
        }

        public void setStockStatus(String s)
        {
            stockStatus = s;
        }

        public void setStore(WalmartStore walmartstore)
        {
            store = walmartstore;
        }

        public StoreWithStockStatus()
        {
        }
    }


    private int distanceSearched;
    private StoreQueryResult.Item item;
    private StoreWithStockStatus stores[];
    private int totalStoreCount;
    private String updatedDate;
    private String updatedTime;

    public ItemAvailabilityResult()
    {
    }

    public int getDistanceSearched()
    {
        return distanceSearched;
    }

    public StoreQueryResult.Item getItem()
    {
        return item;
    }

    public StoreWithStockStatus[] getStores()
    {
        return stores;
    }

    public int getTotalStoreCount()
    {
        return totalStoreCount;
    }

    public String getUpdatedDate()
    {
        return updatedDate;
    }

    public String getUpdatedTime()
    {
        return updatedTime;
    }

    public void setDistanceSearched(int i)
    {
        distanceSearched = i;
    }

    public void setItem(StoreQueryResult.Item item1)
    {
        item = item1;
    }

    public void setStores(StoreWithStockStatus astorewithstockstatus[])
    {
        stores = astorewithstockstatus;
    }

    public void setTotalStoreCount(int i)
    {
        totalStoreCount = i;
    }

    public void setUpdatedDate(String s)
    {
        updatedDate = s;
    }

    public void setUpdatedTime(String s)
    {
        updatedTime = s;
    }
}
