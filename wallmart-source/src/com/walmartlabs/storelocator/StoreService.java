// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;


// Referenced classes of package com.walmartlabs.storelocator:
//            StoreData

public abstract class StoreService
{
    public static interface GetStoresCallback
    {

        public abstract void onFailure(int i);

        public abstract void onStoresReceived(StoreData astoredata[]);
    }


    private static StoreService sStoreLocatorService;

    public StoreService()
    {
    }

    public static StoreService getStoreService()
    {
        return sStoreLocatorService;
    }

    public static void initStoreService(StoreService storeservice)
    {
        sStoreLocatorService = storeservice;
    }

    public void getStore(int i, GetStoresCallback getstorescallback)
    {
    }

    public abstract void getStores(double d, double d1, int i, int j, int k, 
            GetStoresCallback getstorescallback);

    public abstract void getStoresForItems(double d, double d1, String as[], int i, int j, 
            GetStoresCallback getstorescallback);
}
