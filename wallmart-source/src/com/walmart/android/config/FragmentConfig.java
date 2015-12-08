// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import java.util.HashMap;

public class FragmentConfig
{
    public static interface Extras
    {

        public static final String ARG_WEBVIEW_URL = "webview_url";
        public static final String LOCAL_AD_EXTRA_PROMOTION_ID = "promotion";
        public static final String PRODUCT_DETAILS_ITEM_ID = "item_id";
        public static final String REGISTRY_EXTRA_ADD_PATH = "registry_add_path";
        public static final String SAVER_BLUEBIRD_RESULT = "saver_bluebird_result";
        public static final String SAVER_BLUEBIRD_RESULT_TEXT = "saver_bluebird_result_text";
        public static final String SAVER_START_SYNC = "START_SYNC";
        public static final String SAVER_TC_NUMBER = "EXTRA_TC_NUMBER";
        public static final String SHOP_EXTRA_FROM_QR_SCAN = "from_qr_scan";
        public static final String SHOP_EXTRA_MANUAL_BROWSE_TOKEN = "browse_token";
        public static final String SHOP_EXTRA_MANUAL_SEARCH_BY_BARCODE = "search_barcode";
        public static final String SHOP_EXTRA_MANUAL_SEARCH_DEPARTMENT = "search_department";
        public static final String SHOP_EXTRA_MANUAL_SEARCH_QUERY = "search_query";
        public static final String SHOP_EXTRA_MANUAL_SEARCH_TYPE = "search_type";
        public static final String SHOP_EXTRA_MANUAL_SHELF_ID = "shelf_id";
        public static final String SHOP_EXTRA_MANUAL_SHELF_MAX_ITEMS = "shelf_max_items";
        public static final String SHOP_EXTRA_MANUAL_SHELF_TITLE = "shelf_title";
        public static final String SHOP_EXTRA_START_MODE = "start_mode";
        public static final String SHOP_EXTRA_START_MODE_VALUE_ROLLBACKS = "rollbacks";
        public static final String SHOP_EXTRA_START_MODE_VALUE_ROOT = "root";
        public static final String SHOP_EXTRA_START_MODE_VALUE_SHOWCASE = "savings_showcase";
        public static final String WEB_FRAGMENT_EXTRA_RELOAD = "reload";
        public static final String WEEKLY_ADS_FLYER_ID = "flyer_id";
        public static final String WEEKLY_ADS_FLYER_TYPE = "flyer_type";
        public static final String WEEKLY_ADS_PREVIEW_CODE = "preview_code";
        public static final String WISHLIST_ID = "wishlist_id";
        public static final String WISH_LIST_ITEM_DETAILS = "wish_list_item";
    }

    public static final class FragmentName extends Enum
    {

        private static final FragmentName $VALUES[];
        public static final FragmentName FAST_PICKUP;
        public static final FragmentName HOME;
        public static final FragmentName HYBRID_CART;
        public static final FragmentName LOCAL_AD;
        public static final FragmentName MOBILE_PAY;
        public static final FragmentName PAYMENT;
        public static final FragmentName PHARMACY;
        public static final FragmentName PHARMACY_HYBRID;
        public static final FragmentName PRODUCT_DETAILS;
        public static final FragmentName REGISTRY;
        public static final FragmentName SAVER_DASHBOARD;
        public static final FragmentName SHOP;
        public static final FragmentName STORE_FINDER;
        public static final FragmentName TRACK_ORDER;
        public static final FragmentName WEB_FRAGMENT;
        public static final FragmentName WISHLIST;

        public static FragmentName valueOf(String s)
        {
            return (FragmentName)Enum.valueOf(com/walmart/android/config/FragmentConfig$FragmentName, s);
        }

        public static FragmentName[] values()
        {
            return (FragmentName[])$VALUES.clone();
        }

        static 
        {
            HOME = new FragmentName("HOME", 0);
            SHOP = new FragmentName("SHOP", 1);
            STORE_FINDER = new FragmentName("STORE_FINDER", 2);
            TRACK_ORDER = new FragmentName("TRACK_ORDER", 3);
            LOCAL_AD = new FragmentName("LOCAL_AD", 4);
            PHARMACY = new FragmentName("PHARMACY", 5);
            SAVER_DASHBOARD = new FragmentName("SAVER_DASHBOARD", 6);
            PRODUCT_DETAILS = new FragmentName("PRODUCT_DETAILS", 7);
            WEB_FRAGMENT = new FragmentName("WEB_FRAGMENT", 8);
            FAST_PICKUP = new FragmentName("FAST_PICKUP", 9);
            REGISTRY = new FragmentName("REGISTRY", 10);
            PHARMACY_HYBRID = new FragmentName("PHARMACY_HYBRID", 11);
            HYBRID_CART = new FragmentName("HYBRID_CART", 12);
            PAYMENT = new FragmentName("PAYMENT", 13);
            WISHLIST = new FragmentName("WISHLIST", 14);
            MOBILE_PAY = new FragmentName("MOBILE_PAY", 15);
            $VALUES = (new FragmentName[] {
                HOME, SHOP, STORE_FINDER, TRACK_ORDER, LOCAL_AD, PHARMACY, SAVER_DASHBOARD, PRODUCT_DETAILS, WEB_FRAGMENT, FAST_PICKUP, 
                REGISTRY, PHARMACY_HYBRID, HYBRID_CART, PAYMENT, WISHLIST, MOBILE_PAY
            });
        }

        private FragmentName(String s, int i)
        {
            super(s, i);
        }
    }


    private static HashMap sClassNameToFragmentNameMap = new HashMap();
    private static HashMap sFragmentNameToClassMap = new HashMap();

    public FragmentConfig()
    {
    }

    public static Class getFragmentClass(FragmentName fragmentname)
    {
        return (Class)sFragmentNameToClassMap.get(fragmentname);
    }

    public static FragmentName getFragmentName(String s)
    {
        return (FragmentName)sClassNameToFragmentNameMap.get(s);
    }

    private static void registerFragment(FragmentName fragmentname, String s)
    {
        try
        {
            Class class1 = Class.forName(s);
            sFragmentNameToClassMap.put(fragmentname, class1);
            sClassNameToFragmentNameMap.put(class1.getName(), fragmentname);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FragmentName fragmentname)
        {
            throw new RuntimeException((new StringBuilder()).append("App not configured correctly. Could not find ").append(s).toString());
        }
    }

    static 
    {
        registerFragment(FragmentName.HOME, "com.walmart.android.fragments.HomeFragment");
        registerFragment(FragmentName.SHOP, "com.walmart.android.fragments.ShopFragment");
        registerFragment(FragmentName.STORE_FINDER, "com.walmart.android.fragments.StoreFragment");
        registerFragment(FragmentName.TRACK_ORDER, "com.walmart.android.fragments.OrderFragment");
        registerFragment(FragmentName.LOCAL_AD, "com.walmart.android.fragments.WeeklyAdFragment");
        registerFragment(FragmentName.PHARMACY, "com.walmart.android.fragments.PharmacyFragment");
        registerFragment(FragmentName.SAVER_DASHBOARD, "com.walmart.android.fragments.SaverDashboardFragment");
        registerFragment(FragmentName.PRODUCT_DETAILS, "com.walmart.android.fragments.ProductDetailsFragment");
        registerFragment(FragmentName.WEB_FRAGMENT, "com.walmart.android.fragments.WebFragment");
        registerFragment(FragmentName.FAST_PICKUP, "com.walmart.android.fragments.FastPickupFragment");
        registerFragment(FragmentName.REGISTRY, "com.walmart.android.fragments.RegistryFragment");
        registerFragment(FragmentName.PHARMACY_HYBRID, "com.walmart.android.fragments.PharmacyHybridFragment");
        registerFragment(FragmentName.HYBRID_CART, "com.walmart.android.fragments.HybridCartFragment");
        registerFragment(FragmentName.PAYMENT, "com.walmart.android.fragments.PaymentFragment");
        registerFragment(FragmentName.WISHLIST, "com.walmart.android.fragments.WishListFragment");
        registerFragment(FragmentName.MOBILE_PAY, "com.walmart.android.fragments.MobilePayFragment");
    }
}
