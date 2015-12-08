// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import com.walmart.android.util.WalmartUri;
import com.walmartlabs.ui.merchandising.BannerData;
import java.util.ArrayList;
import java.util.HashMap;

public class AppConfig
{
    private static class FeaturedCategories
    {

        public String shelves[];

        private FeaturedCategories()
        {
        }

    }

    public static class MerchandisingData
    {

        public boolean autoMerchandisingModuleProgression;
        public String clearClientCache;
        private FeaturedCategories featuredCategories;
        public boolean force;
        public boolean guestCheckoutEnabled;
        private BannerData mHomescreenMerchandising[];
        private HashMap mShelfData;
        public boolean rxRefillByScanEnabled;
        public String saverUrl;
        public String url;
        public String version;

        public String[] getFeaturedCategories()
        {
            return featuredCategories.shelves;
        }

        public BannerData[] getHomescreenMerchandising()
        {
            return mHomescreenMerchandising;
        }

        public HashMap getShelfData()
        {
            return mShelfData;
        }

        public void setHomescreenMerchandising(BannerData abannerdata[])
        {
            if (abannerdata != null)
            {
                ArrayList arraylist = new ArrayList();
                int j = abannerdata.length;
                for (int i = 0; i < j; i++)
                {
                    BannerData bannerdata = abannerdata[i];
                    if ("votd".equals(bannerdata.type))
                    {
                        continue;
                    }
                    arraylist.add(bannerdata);
                    bannerdata.data = new Object();
                    WalmartUri walmarturi = WalmartUri.parse(bannerdata.action);
                    if (walmarturi != null && walmarturi.getType() == 6)
                    {
                        ShelfData shelfdata = new ShelfData();
                        shelfdata.name = bannerdata.text;
                        mShelfData.put(walmarturi.getParam(0), shelfdata);
                    }
                }

                mHomescreenMerchandising = (BannerData[])arraylist.toArray(new BannerData[arraylist.size()]);
            }
        }

        public void setMerchandising(BannerData abannerdata[])
        {
            mHomescreenMerchandising = abannerdata;
        }

        public void setShelfData(HashMap hashmap)
        {
            mShelfData.putAll(hashmap);
        }

        public MerchandisingData()
        {
            featuredCategories = new FeaturedCategories();
            mShelfData = new HashMap();
            mHomescreenMerchandising = new BannerData[0];
        }
    }

    public static class SaverBanner
    {

        public String imageUrl;
        public String target;

        public SaverBanner()
        {
        }
    }

    public static class ShelfData
    {

        public int maxItems;
        public String name;
        public String theme;

        public ShelfData()
        {
        }
    }

    public static class ShippingPassSettings
    {

        public String targetBannerImageUrl;

        public ShippingPassSettings()
        {
        }
    }

    public static class StoreMapPOC
    {

        public boolean enabled;
        public String storeMapsIdsUrl;

        public StoreMapPOC()
        {
        }
    }

    public static class StoreSearchBanner
    {

        public String action;
        public String message;

        public StoreSearchBanner()
        {
        }
    }

    public static class WalmartPay
    {

        public boolean enabled;
        public Pilot pilot;

        public WalmartPay()
        {
        }
    }

    public static class WalmartPay.Pilot
    {

        public Region regions[];
        public String storeIds[];

        public WalmartPay.Pilot()
        {
        }
    }

    public static class WalmartPay.Pilot.Region
    {

        public double latitude;
        public double longitude;
        public int radius;

        public WalmartPay.Pilot.Region()
        {
        }
    }


    public String abSegments;
    public boolean allowSaverWithoutEReceipt;
    public boolean barcodeAsSuggestion;
    public boolean bluebirdEnabled;
    public int configRefreshRate;
    public boolean eReceiptPhoneRegDisabled;
    public boolean inStoreSearchOn;
    public MerchandisingData merchData;
    public String minSdkVersion;
    public String minVersion;
    public boolean mitigateStartupRequests;
    public boolean photoDisabled;
    public boolean registryDisabled;
    public int registryMinVersion;
    public boolean saverManualSubmit;
    public String saverPilotEndDate;
    public SaverBanner scBanner;
    public boolean scRecommendationsEnabled;
    public ShippingPassSettings shippingPass;
    public String sid;
    public StoreMapPOC storeMapPOC;
    public boolean storePickup;
    public StoreSearchBanner storeSearchBanner;
    public String vid;
    public WalmartPay walmartPay;

    public AppConfig()
    {
        bluebirdEnabled = true;
        eReceiptPhoneRegDisabled = true;
    }

    public String getShippingPassBannerUrl()
    {
        if (shippingPass != null)
        {
            return shippingPass.targetBannerImageUrl;
        } else
        {
            return null;
        }
    }
}
