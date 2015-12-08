// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.storelocator;

import android.app.Activity;
import android.content.Context;
import com.walmart.android.config.WalmartStoreConfigurator;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.android.pharmacy.PharmacyStoreHelper;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreFinderConfigurator;

// Referenced classes of package com.walmart.android.app.storelocator:
//            StoreDetailPresenter

public class WalmartStoreHelper
    implements PharmacyStoreHelper
{

    private static final String WALMART_HOME_DELIVERY_PHONE_NUMBER = "1-800-273-3455";
    private WalmartStoreConfigurator mStoreConfigurator;

    public WalmartStoreHelper()
    {
    }

    public String getHomeDeliveryPhoneNumber()
    {
        return "1-800-273-3455";
    }

    public String getPharmacyPhoneNumber(StoreData storedata)
    {
        Object obj = null;
        String s = obj;
        if (storedata != null)
        {
            s = obj;
            if (storedata instanceof WalmartStore)
            {
                storedata = ((WalmartStore)storedata).getStoreService("Pharmacy");
                s = obj;
                if (storedata != null)
                {
                    s = storedata.getPhone();
                }
            }
        }
        return s;
    }

    public Presenter getStoreDetailPresenter(Activity activity, StoreData storedata)
    {
        if (storedata != null && (storedata instanceof WalmartStore))
        {
            return new StoreDetailPresenter(activity, (WalmartStore)storedata);
        } else
        {
            return null;
        }
    }

    public StoreFinderConfigurator getStoreFinderConfigurator(Context context)
    {
        if (mStoreConfigurator == null)
        {
            mStoreConfigurator = new WalmartStoreConfigurator(context);
        }
        return mStoreConfigurator;
    }
}
