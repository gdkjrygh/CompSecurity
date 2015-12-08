// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.utils;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.weather.ui.MapAppFragment;
import com.wsi.android.weather.ui.MapAuxiliaryFragment;
import com.wsi.android.weather.ui.MapGeoCalloutFragment;

// Referenced classes of package com.wsi.android.weather.utils:
//            AbstractNavigator

public class WSIMapActivityNavigationManager extends AbstractNavigator
{

    private int fragmentContentHolderId;

    public WSIMapActivityNavigationManager(Activity activity)
    {
        super(activity);
        fragmentContentHolderId = getFragmentContentHolderViewId();
    }

    protected MapAppFragment chooseNext(int i, FragmentManager fragmentmanager, FragmentTransaction fragmenttransaction)
    {
        MapAppFragment mapappfragment;
        parent = -1;
        mapappfragment = null;
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   1: 60
    //                   1003: 126;
           goto _L1 _L2 _L3
_L1:
        fragmentmanager = mapappfragment;
        if (ConfigInfo.DEBUG)
        {
            Log.w(TAG, "navigateTo: unknown destination");
            fragmentmanager = mapappfragment;
        }
_L5:
        return fragmentmanager;
_L2:
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "navigateTo: SCREEN_MAP");
        }
        mapappfragment = (MapAppFragment)fragmentmanager.findFragmentByTag("map_auxiliary_fragment");
        fragmentmanager = mapappfragment;
        if (mapappfragment != null) goto _L5; else goto _L4
_L4:
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "initFragment: SCREEN_MAP");
        }
        fragmentmanager = createMapAuxiliaryFragment();
        fragmenttransaction.add(fragmentmanager, "map_auxiliary_fragment");
        return fragmentmanager;
_L3:
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "navigateTo: POPUP_MAP_GEO_CALLOUT");
        }
        MapAppFragment mapappfragment1 = (MapAppFragment)fragmentmanager.findFragmentByTag("map_geo_callout_fragment");
        Object obj = mapappfragment1;
        if (mapappfragment1 == null)
        {
            if (ConfigInfo.DEBUG)
            {
                Log.d(TAG, "initFragment: POPUP_MAP_GEO_CALLOUT");
            }
            MapGeoCalloutFragment mapgeocalloutfragment = createMapGeoCalloutFragment();
            mapgeocalloutfragment.setArguments(new Bundle(1));
            MapAppFragment mapappfragment2 = (MapAppFragment)fragmentmanager.findFragmentByTag("map_auxiliary_fragment");
            obj = mapappfragment2;
            if (mapappfragment2 == null)
            {
                obj = chooseNext(1, fragmentmanager, fragmenttransaction);
            }
            mapgeocalloutfragment.setTargetFragment(((android.app.Fragment) (obj)), 0);
            fragmenttransaction.add(fragmentContentHolderId, mapgeocalloutfragment, "map_geo_callout_fragment");
            obj = mapgeocalloutfragment;
        }
        parent = 1;
        return ((MapAppFragment) (obj));
    }

    protected MapAuxiliaryFragment createMapAuxiliaryFragment()
    {
        return new MapAuxiliaryFragment();
    }

    protected MapGeoCalloutFragment createMapGeoCalloutFragment()
    {
        return new MapGeoCalloutFragment();
    }

    protected int getFragmentContentHolderViewId()
    {
        return -1;
    }
}
