// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import com.weather.Weather.map.interactive.fragments.TwcMapAlertFragment;
import com.weather.Weather.map.interactive.fragments.TwcMapAuxiliaryFragment;
import com.weather.Weather.map.interactive.fragments.TwcMapGeoCalloutFragment;
import com.weather.Weather.map.interactive.fragments.TwcMapPastFutureFragment;
import com.weather.Weather.map.interactive.fragments.TwcMapSettingsFragment;
import com.wsi.android.weather.ui.MapAppFragment;
import com.wsi.android.weather.ui.MapAuxiliaryFragment;
import com.wsi.android.weather.ui.MapGeoCalloutFragment;
import com.wsi.android.weather.utils.WSIMapActivityNavigationManager;

public class TwcActivityNavigationManager extends WSIMapActivityNavigationManager
{

    public TwcActivityNavigationManager(Activity activity)
    {
        super(activity);
    }

    protected MapAppFragment chooseNext(int i, FragmentManager fragmentmanager, FragmentTransaction fragmenttransaction)
    {
        Object obj;
        parent = -1;
        obj = null;
        i;
        JVM INSTR tableswitch 2 4: default 36
    //                   2 57
    //                   3 159
    //                   4 108;
           goto _L1 _L2 _L3 _L4
_L1:
        MapAppFragment mapappfragment = ((MapAppFragment) (obj));
        if (obj == null)
        {
            mapappfragment = super.chooseNext(i, fragmentmanager, fragmenttransaction);
        }
        return mapappfragment;
_L2:
        MapAppFragment mapappfragment1 = (MapAppFragment)fragmentmanager.findFragmentByTag("map_settings_fragment");
        obj = mapappfragment1;
        if (mapappfragment1 == null)
        {
            obj = new TwcMapSettingsFragment();
            fragmenttransaction.add(0x7f0d0196, ((android.app.Fragment) (obj)), "map_settings_fragment");
        }
        parent = current;
        continue; /* Loop/switch isn't completed */
_L4:
        MapAppFragment mapappfragment2 = (MapAppFragment)fragmentmanager.findFragmentByTag("map_past_future_fragment");
        obj = mapappfragment2;
        if (mapappfragment2 == null)
        {
            obj = new TwcMapPastFutureFragment();
            fragmenttransaction.add(0x7f0d0196, ((android.app.Fragment) (obj)), "map_past_future_fragment");
        }
        parent = current;
        continue; /* Loop/switch isn't completed */
_L3:
        MapAppFragment mapappfragment3 = (MapAppFragment)fragmentmanager.findFragmentByTag("map_alerts_fragment");
        obj = mapappfragment3;
        if (mapappfragment3 == null)
        {
            obj = new TwcMapAlertFragment();
            fragmenttransaction.add(0x7f0d0196, ((android.app.Fragment) (obj)), "map_alerts_fragment");
        }
        parent = current;
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected MapAuxiliaryFragment createMapAuxiliaryFragment()
    {
        return new TwcMapAuxiliaryFragment();
    }

    protected MapGeoCalloutFragment createMapGeoCalloutFragment()
    {
        return new TwcMapGeoCalloutFragment();
    }

    protected int getFragmentContentHolderViewId()
    {
        return 0x7f0d0196;
    }

    public TwcMapAuxiliaryFragment getMapAuxiliaryFragment()
    {
        return (TwcMapAuxiliaryFragment)context.getFragmentManager().findFragmentByTag("map_auxiliary_fragment");
    }

    public void navigateToOrClose(int i)
    {
        if (isDestinationActive(i))
        {
            popBackStack();
        } else
        if (current == 1)
        {
            navigateTo(i);
            return;
        }
    }

    public void pokeMap()
    {
        MapAppFragment mapappfragment = (MapAppFragment)context.getFragmentManager().findFragmentByTag("map_auxiliary_fragment");
        if (mapappfragment != null)
        {
            mapappfragment.onStart();
        }
    }
}
