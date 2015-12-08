// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.walmart.android.data.SlapResponse;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.data.StoreInfo;
import com.walmart.android.data.WalmartStore;
import com.walmartlabs.storelocator.StoreLocationManager;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.walmart.android.util:
//            SharedPreferencesUtil

public class AvailabilityUtils
{

    private static final String DEFAULT_COUNTRY_CODE = "USA";
    private static final String DUMMY_STORE_ID = "2648";
    private static final String DUMMY_STORE_STATE = "CA";
    private static final String DUMMY_STORE_ZIPCODE = "94066";
    private static final int MAX_STORES_TO_USE = 10;

    public AvailabilityUtils()
    {
    }

    public static StoreAvailabilityData getAvailabilityForPreferredStore(Context context, StoreAvailabilityData astoreavailabilitydata[])
    {
        StoreAvailabilityData storeavailabilitydata;
        Object obj;
        int i;
        int j;
        j = 0;
        i = 0;
        obj = null;
        storeavailabilitydata = obj;
        if (astoreavailabilitydata == null) goto _L2; else goto _L1
_L1:
        StoreInfo storeinfo = SharedPreferencesUtil.getSavedLocalAdStore(context);
        if (storeinfo == null) goto _L4; else goto _L3
_L3:
        j = astoreavailabilitydata.length;
_L7:
        storeavailabilitydata = obj;
        if (i >= j) goto _L2; else goto _L5
_L5:
        storeavailabilitydata = astoreavailabilitydata[i];
        if (!storeavailabilitydata.storeId.equals(storeinfo.storeID)) goto _L6; else goto _L2
_L2:
        return storeavailabilitydata;
_L6:
        i++;
          goto _L7
_L4:
        context = StoreLocationManager.getInstance(context).getNearbyByStores();
        storeavailabilitydata = obj;
        if (context.isEmpty()) goto _L2; else goto _L8
_L8:
        int k;
        context = (WalmartStore)context.get(0);
        k = astoreavailabilitydata.length;
        i = j;
_L10:
        storeavailabilitydata = obj;
        if (i >= k) goto _L2; else goto _L9
_L9:
        StoreAvailabilityData storeavailabilitydata1 = astoreavailabilitydata[i];
        if (storeavailabilitydata1.storeId.equals(context.getId()))
        {
            return storeavailabilitydata1;
        }
        i++;
          goto _L10
    }

    public static String[] getNearbyAndMyStoreIDs(Context context)
    {
        HashSet hashset = new HashSet();
        StoreInfo storeinfo = SharedPreferencesUtil.getSavedLocalAdStore(context);
        if (storeinfo != null)
        {
            hashset.add(storeinfo.storeID);
        }
        context = StoreLocationManager.getInstance(context).getNearbyByStores();
        for (int i = 0; i < context.size() && hashset.size() < 10; i++)
        {
            String s = ((WalmartStore)context.get(i)).getId();
            if (s != null)
            {
                hashset.add(s);
            }
        }

        return (String[])hashset.toArray(new String[hashset.size()]);
    }

    public static WalmartStore getPreferredOrDummyStore(Context context)
    {
        WalmartStore walmartstore = SharedPreferencesUtil.getSavedLocalAdJsonStore(context);
        if (walmartstore != null)
        {
            walmartstore.getAddress().setCountry("USA");
            return walmartstore;
        }
        context = StoreLocationManager.getInstance(context).getNearbyByStores();
        if (!context.isEmpty())
        {
            ((WalmartStore)context.get(0)).getAddress().setCountry("USA");
            return (WalmartStore)context.get(0);
        } else
        {
            context = new WalmartStore();
            context.setiD("2648");
            com.walmart.android.data.WalmartStore.Address address = new com.walmart.android.data.WalmartStore.Address();
            address.setCountry("USA");
            address.setState("CA");
            address.setZip("94066");
            context.setAddress(address);
            return context;
        }
    }

    public static String getPreferredStore(Context context)
    {
        String s = null;
        Object obj = SharedPreferencesUtil.getSavedLocalAdStore(context);
        if (obj != null)
        {
            s = ((StoreInfo) (obj)).storeID;
        }
        obj = s;
        if (TextUtils.isEmpty(s))
        {
            context = StoreLocationManager.getInstance(context).getNearbyByStores();
            obj = s;
            if (!context.isEmpty())
            {
                obj = ((WalmartStore)context.get(0)).getId();
            }
        }
        return ((String) (obj));
    }

    public static com.walmart.android.data.SlapResponse.Store getPreferredStoreForAvailabilityAndPricing(Context context, SlapResponse slapresponse)
    {
        com.walmart.android.data.SlapResponse.Store store;
        Object obj;
        int i;
        int j;
        j = 0;
        i = 0;
        obj = null;
        store = obj;
        if (slapresponse.stores == null) goto _L2; else goto _L1
_L1:
        StoreInfo storeinfo = SharedPreferencesUtil.getSavedLocalAdStore(context);
        if (storeinfo == null) goto _L4; else goto _L3
_L3:
        context = slapresponse.stores;
        j = context.length;
_L7:
        store = obj;
        if (i >= j) goto _L2; else goto _L5
_L5:
        store = context[i];
        if (!store.storeId.equals(storeinfo.storeID)) goto _L6; else goto _L2
_L2:
        return store;
_L6:
        i++;
          goto _L7
_L4:
        context = StoreLocationManager.getInstance(context).getNearbyByStores();
        store = obj;
        if (context.isEmpty()) goto _L2; else goto _L8
_L8:
        int k;
        context = (WalmartStore)context.get(0);
        slapresponse = slapresponse.stores;
        k = slapresponse.length;
        i = j;
_L10:
        store = obj;
        if (i >= k) goto _L2; else goto _L9
_L9:
        com.walmart.android.data.SlapResponse.Store store1 = slapresponse[i];
        if (store1.storeId.equals(context.getId()))
        {
            return store1;
        }
        i++;
          goto _L10
    }

    public static SpannableStringBuilder getStockString(Context context, com.walmart.android.service.item.StoreItemModel.StockStatus stockstatus)
    {
        Resources resources = context.getResources();
        if (stockstatus == null) goto _L2; else goto _L1
_L1:
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

        _cls1..SwitchMap.com.walmart.android.service.item.StoreItemModel.StockStatus[stockstatus.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 53
    //                   2 63
    //                   3 73;
           goto _L3 _L4 _L5 _L6
_L3:
        context = "Unknown";
_L8:
        return getStockString(resources, ((String) (context)));
_L4:
        context = resources.getString(0x7f09056c);
        continue; /* Loop/switch isn't completed */
_L5:
        context = resources.getString(0x7f09056d);
        continue; /* Loop/switch isn't completed */
_L6:
        context = resources.getString(0x7f09056e);
        continue; /* Loop/switch isn't completed */
_L2:
        context = "Not carried";
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static SpannableStringBuilder getStockString(Context context, String s)
    {
        return getStockString(context.getResources(), s);
    }

    public static SpannableStringBuilder getStockString(Resources resources, String s)
    {
        String s1 = resources.getString(0x7f09056c);
        String s2 = resources.getString(0x7f09056e);
        String s3 = resources.getString(0x7f09056d);
        int i;
        if (s1.equalsIgnoreCase(s))
        {
            s = s1;
            i = resources.getColor(0x7f0f0008);
            resources = s;
        } else
        if (s2.equalsIgnoreCase(s))
        {
            s = s2;
            i = resources.getColor(0x7f0f000a);
            resources = s;
        } else
        if (s3.equalsIgnoreCase(s))
        {
            s = s3;
            i = resources.getColor(0x7f0f0009);
            resources = s;
        } else
        {
            i = resources.getColor(0x7f0f000b);
            resources = s;
        }
        resources = new SpannableStringBuilder(resources);
        resources.setSpan(new ForegroundColorSpan(i), 0, resources.length(), 17);
        return resources;
    }

    public static CharSequence getStockString(Context context, com.walmart.android.data.SlapResponse.Store store)
    {
        if (store != null && store.stockStatus != null)
        {
            store = store.stockStatus.trim();
        } else
        {
            store = context.getResources().getString(0x7f090573);
        }
        return getStockString(context, ((String) (store)));
    }

    public static boolean shouldDisplayStockStatus(Context context, String s)
    {
        context = context.getString(0x7f09056a);
        return !TextUtils.isEmpty(s) && !context.equalsIgnoreCase(s);
    }
}
