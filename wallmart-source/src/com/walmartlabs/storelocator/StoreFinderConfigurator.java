// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreData, FilterManager, LayoutConfig

public abstract class StoreFinderConfigurator
{

    public StoreFinderConfigurator()
    {
    }

    public abstract com.google.android.gms.maps.GoogleMap.InfoWindowAdapter createInfoWindowAdapter(Context context);

    public abstract MarkerOptions createMarkerOptions(StoreData storedata, LatLng latlng);

    public boolean forceShowZoomButtons()
    {
        return false;
    }

    public String getCountryRestriction()
    {
        return "us";
    }

    public abstract LatLngBounds getDefaultBounds();

    public FilterManager getFilterManager(Context context)
    {
        return null;
    }

    public abstract LayoutConfig getLayoutConfig();

    public int getMarkerWidth()
    {
        return 250;
    }

    public String getReferrer()
    {
        return null;
    }

    public View getStoreListItemView(LayoutInflater layoutinflater, View view, StoreData storedata)
    {
        return null;
    }

    public void onPrepareSearchBar(View view)
    {
    }
}
