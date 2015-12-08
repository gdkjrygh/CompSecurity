// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            WalmartStore

public class StoreInfo
{

    public String addressLine1;
    public String addressLine2;
    public double latitude;
    public double longitude;
    public String storeDescription;
    public String storeID;

    public StoreInfo()
    {
    }

    public StoreInfo(WalmartStore walmartstore)
    {
        String as[] = WalmartStore.getAddressLines(walmartstore.getAddress());
        addressLine1 = as[0];
        addressLine2 = as[1];
        storeID = walmartstore.getId();
        storeDescription = walmartstore.getDescription();
        latitude = walmartstore.getLatitude();
        longitude = walmartstore.getLongitude();
    }

    public String getCity()
    {
        if (addressLine2 != null)
        {
            String as[] = addressLine2.split(",");
            if (as.length > 0)
            {
                return as[0];
            }
        }
        return null;
    }
}
