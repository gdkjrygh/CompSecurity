// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.payment;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import com.walmart.android.data.AppConfig;
import com.walmart.android.data.StoreInfo;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.service.mpay.PilotRegion;
import com.walmartlabs.utils.WLog;
import java.util.HashSet;
import java.util.Set;

public class WalmartPayManager extends MobilePayManager
{

    private static final String TAG = com/walmart/android/service/payment/WalmartPayManager.getSimpleName();

    private WalmartPayManager(Context context)
    {
        super(context);
    }

    public static WalmartPayManager create(Context context)
    {
        context = new WalmartPayManager(context);
        setInstance(context);
        context.init();
        return context;
    }

    private void setPilotAreas(com.walmart.android.data.AppConfig.WalmartPay.Pilot.Region aregion[])
    {
        HashSet hashset = new HashSet();
        if (aregion != null)
        {
            int j = aregion.length;
            for (int i = 0; i < j; i++)
            {
                com.walmart.android.data.AppConfig.WalmartPay.Pilot.Region region = aregion[i];
                if (region != null)
                {
                    Location location = new Location("");
                    location.setLatitude(region.latitude);
                    location.setLongitude(region.longitude);
                    hashset.add(new PilotRegion(location, region.radius));
                }
            }

        }
        setPilotRegions(hashset);
    }

    public void StoreUpdateEvent(com.walmart.android.util.SharedPreferencesUtil.StoreUpdateEvent storeupdateevent)
    {
        if (storeupdateevent.hasStoreSet())
        {
            setPreferredStore(storeupdateevent.store.getId());
            return;
        } else
        {
            setPreferredStore(null);
            return;
        }
    }

    public void destroy()
    {
        innerDestroy();
        setInstance(null);
    }

    protected void init()
    {
        Object obj;
        long l;
        long l1;
        super.init();
        obj = SharedPreferencesUtil.getSavedLocalAdStore(getContext());
        if (obj != null)
        {
            setPreferredStore(((StoreInfo) (obj)).storeID);
        }
        l1 = 0L;
        obj = null;
        l = l1;
        Object obj1 = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0);
        l = l1;
        l1 = ((PackageInfo) (obj1)).firstInstallTime;
        l = l1;
        obj1 = ((PackageInfo) (obj1)).versionName;
        l = l1;
        obj = obj1;
_L2:
        String s = SharedPreferencesUtil.getInstallationId(getContext());
        setMetaData((new StringBuilder()).append(getContext().getPackageName()).append("_").append(((String) (obj))).toString(), s, l);
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        WLog.e(TAG, "Didn't find package info for our own app!", namenotfoundexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onAppConfig(AppConfig appconfig)
    {
        boolean flag = false;
        if (appconfig.walmartPay != null)
        {
            appconfig = appconfig.walmartPay;
            if (((com.walmart.android.data.AppConfig.WalmartPay) (appconfig)).pilot != null)
            {
                setPilotStores(((com.walmart.android.data.AppConfig.WalmartPay) (appconfig)).pilot.storeIds);
                setPilotAreas(((com.walmart.android.data.AppConfig.WalmartPay) (appconfig)).pilot.regions);
            } else
            {
                setPilotStores(null);
                setPilotAreas(null);
            }
            if (((com.walmart.android.data.AppConfig.WalmartPay) (appconfig)).pilot != null)
            {
                flag = true;
            }
            setPilot(flag);
            setEnabled(((com.walmart.android.data.AppConfig.WalmartPay) (appconfig)).enabled);
            return;
        } else
        {
            setEnabled(false);
            return;
        }
    }

}
