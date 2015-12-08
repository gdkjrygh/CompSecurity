// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.walmart.android.data.StoreInfo;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.storelocator.FilterManager;
import com.walmartlabs.storelocator.LayoutConfig;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreFinderConfigurator;

public class WalmartStoreConfigurator extends StoreFinderConfigurator
{
    public class StoreInfoWindowAdapter
        implements com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    {

        private final View mWindowView;
        final WalmartStoreConfigurator this$0;

        public View getInfoContents(Marker marker)
        {
            return null;
        }

        public View getInfoWindow(Marker marker)
        {
            Object obj = marker.getTitle();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                ((TextView)mWindowView.findViewById(0x7f10004f)).setText(((CharSequence) (obj)));
                marker = marker.getSnippet();
                obj = (TextView)mWindowView.findViewById(0x7f1005c2);
                if (!TextUtils.isEmpty(marker))
                {
                    ((TextView) (obj)).setText(marker);
                } else
                {
                    ((TextView) (obj)).setText("");
                }
                return mWindowView;
            } else
            {
                return null;
            }
        }

        public StoreInfoWindowAdapter(Context context)
        {
            this$0 = WalmartStoreConfigurator.this;
            super();
            mWindowView = LayoutInflater.from(context).inflate(0x7f0401aa, null);
        }
    }


    public static final String SERVICE_FILTER_ARRAY[] = {
        "Pharmacy", "Photo", "Gas Station", "Site to Store"
    };
    private static final String WALMART_REFERRER = "US_Android_storefinder";
    private Context mContext;
    private FilterManager mFilterManager;
    private String mSavedStoreId;

    public WalmartStoreConfigurator(Context context)
    {
        mContext = context;
        updateStoreData();
    }

    public static LayoutConfig createLayoutConfig()
    {
        LayoutConfig layoutconfig = new LayoutConfig();
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.MAP_VIEW, 0x7f1004cc);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.LIST_VIEW, 0x7f1001a0);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.EMPTY_LIST_VIEW, 0x7f1004b4);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.LOCATION_BUTTON, 0x7f1005b6);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.FILTER_BUTTON, 0x7f1005b7);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.LIST_BUTTON, 0x7f1005b8);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.MAP_VIEW_CONTAINER, 0x7f1005b3);
        layoutconfig.setIdForLayoutEnum(com.walmartlabs.storelocator.LayoutConfig.LayoutEnum.LIST_ONLY_LAYOUT, 0x7f0401a3);
        layoutconfig.setIdForLayoutEnum(com.walmartlabs.storelocator.LayoutConfig.LayoutEnum.MAP_AND_LIST_LAYOUT, 0x7f0401a4);
        layoutconfig.setIdForLayoutEnum(com.walmartlabs.storelocator.LayoutConfig.LayoutEnum.SEARCH_LIST_LAYOUT, 0x7f0401ad);
        layoutconfig.setIdForDrawableEnum(com.walmartlabs.storelocator.LayoutConfig.DrawableEnum.LIST_BUTTON_DRAWABLE, 0x7f0201e1);
        layoutconfig.setIdForDrawableEnum(com.walmartlabs.storelocator.LayoutConfig.DrawableEnum.MAP_BUTTON_DRAWABLE, 0x7f0201e3);
        layoutconfig.setIdForDrawableEnum(com.walmartlabs.storelocator.LayoutConfig.DrawableEnum.FILTER_BUTTON, 0x7f0201df);
        layoutconfig.setIdForDrawableEnum(com.walmartlabs.storelocator.LayoutConfig.DrawableEnum.FILTER_BUTTON_ACTIVE, 0x7f0201e0);
        layoutconfig.setIdForDrawableEnum(com.walmartlabs.storelocator.LayoutConfig.DrawableEnum.SEARCH_HINT_ICON, 0x7f020196);
        layoutconfig.setIdForLayoutEnum(com.walmartlabs.storelocator.LayoutConfig.LayoutEnum.SEARCH_SUGGESTION_ITEM, 0x7f040180);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_ITEM_TEXT, 0x7f100538);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_ITEM_ENTRY, 0x7f100536);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_ITEM_ARROW, 0x7f100537);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_ITEM_NOTE, 0x7f100539);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_BUTTON, 0x7f100068);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_FIELD, 0x7f100525);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.CLEAR_TEXT_BUTTON, 0x7f100529);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.VOICE_SEARCH_BUTTON, 0x7f100527);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_RESULT_LIST, 0x7f1005c9);
        layoutconfig.setIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_BAR_CONTAINER, 0x7f10019e);
        return layoutconfig;
    }

    public com.google.android.gms.maps.GoogleMap.InfoWindowAdapter createInfoWindowAdapter(Context context)
    {
        return new StoreInfoWindowAdapter(context);
    }

    public MarkerOptions createMarkerOptions(WalmartStore walmartstore, LatLng latlng)
    {
        Object obj;
        int i;
        if (walmartstore.getId().equals(mSavedStoreId))
        {
            i = 0x7f0201e6;
        } else
        {
            i = 0x7f0201e5;
        }
        obj = walmartstore.getAddress();
        obj = (new StringBuilder()).append(((com.walmart.android.data.WalmartStore.Address) (obj)).getStreet1()).append(", ").append(((com.walmart.android.data.WalmartStore.Address) (obj)).getCity()).append(", ").append(((com.walmart.android.data.WalmartStore.Address) (obj)).getState()).toString();
        return (new MarkerOptions()).position(latlng).title(walmartstore.getDescription()).snippet(((String) (obj))).icon(BitmapDescriptorFactory.fromResource(i));
    }

    public volatile MarkerOptions createMarkerOptions(StoreData storedata, LatLng latlng)
    {
        return createMarkerOptions((WalmartStore)storedata, latlng);
    }

    public LatLngBounds getDefaultBounds()
    {
        LatLng latlng = new LatLng(49.384472000000002D, -66.949777999999995D);
        return new LatLngBounds(new LatLng(24.520833D, -124.771694D), latlng);
    }

    public FilterManager getFilterManager(Context context)
    {
        if (mFilterManager == null)
        {
            mFilterManager = new FilterManager(SERVICE_FILTER_ARRAY);
        }
        return mFilterManager;
    }

    public LayoutConfig getLayoutConfig()
    {
        return createLayoutConfig();
    }

    public String getReferrer()
    {
        return "US_Android_storefinder";
    }

    public void updateStoreData()
    {
        Object obj = SharedPreferencesUtil.getSavedLocalAdStore(mContext);
        if (obj != null)
        {
            obj = ((StoreInfo) (obj)).storeID;
        } else
        {
            obj = null;
        }
        mSavedStoreId = ((String) (obj));
    }

}
