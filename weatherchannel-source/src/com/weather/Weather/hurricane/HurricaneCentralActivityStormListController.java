// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane;

import android.app.FragmentManager;
import android.support.v4.view.ViewPager;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.tropical.StormData;
import com.weather.commons.tropical.StormDataManager;
import com.weather.commons.tropical.Storms;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.TwcPreconditions;
import com.weather.util.geometry.LatLng;
import dagger.ObjectGraph;
import java.util.List;

// Referenced classes of package com.weather.Weather.hurricane:
//            HurricanePagerAdapter, HurricaneCentralInjection, HurricaneCentralFragment

public class HurricaneCentralActivityStormListController
{

    private Storms currentStorms;
    private final FragmentManager fragmentManager;
    LocationManager locationManager;
    private HurricanePagerAdapter pagerAdapter;
    private String startingStorm;
    StormDataManager stormDataManager;
    private final ViewPager viewPager;

    public HurricaneCentralActivityStormListController(ViewPager viewpager, FragmentManager fragmentmanager)
    {
        TwcPreconditions.checkOnMainThread();
        viewPager = (ViewPager)Preconditions.checkNotNull(viewpager, "viewPager cannot be null");
        fragmentManager = (FragmentManager)Preconditions.checkNotNull(fragmentmanager, "fragmentManager cannot be null");
        pagerAdapter = new HurricanePagerAdapter(fragmentmanager, ImmutableList.of(), FlagshipApplication.getInstance().getBaseObjectGraph().plus(new Object[] {
            new HurricaneCentralInjection()
        }));
        viewpager.setAdapter(pagerAdapter);
    }

    public StormData getCurrentDisplayedStorm()
    {
        TwcPreconditions.checkOnMainThread();
        if (currentStorms != null)
        {
            int i = viewPager.getCurrentItem();
            List list = pagerAdapter.getStormIds();
            if (list.size() > i)
            {
                return currentStorms.getDataFor((String)list.get(i));
            }
        }
        return null;
    }

    public HurricaneCentralFragment getCurrentFragment()
    {
        TwcPreconditions.checkOnMainThread();
        int i = viewPager.getCurrentItem();
        if (i < pagerAdapter.getCount())
        {
            return (HurricaneCentralFragment)pagerAdapter.instantiateItem(viewPager, i);
        } else
        {
            return null;
        }
    }

    public boolean isStormDataLoaded()
    {
        return currentStorms != null && currentStorms.isDataAvailable();
    }

    public void refresh()
    {
        TwcPreconditions.checkOnMainThread();
        boolean flag;
        if (stormDataManager != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "refresh called before injecting dependencies");
        stormDataManager.refresh();
    }

    public void setStartingStorm(String s)
    {
        TwcPreconditions.checkOnMainThread();
        startingStorm = s;
    }

    public void updateStormList(Storms storms)
    {
        TwcPreconditions.checkOnMainThread();
        SavedLocation savedlocation;
        boolean flag;
        if (locationManager != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "updateStormList called before injecting dependencies");
        savedlocation = locationManager.getCurrentLocation();
        currentStorms = storms;
        if (savedlocation == null)
        {
            storms = currentStorms.getStormIds();
        } else
        {
            storms = currentStorms.getStormIdsOrderedByNearest(new LatLng(Double.valueOf(savedlocation.getLat()), Double.valueOf(savedlocation.getLng())));
        }
        storms = ImmutableList.copyOf(storms);
        if (!Objects.equal(storms, pagerAdapter.getStormIds()))
        {
            pagerAdapter = new HurricanePagerAdapter(fragmentManager, storms, FlagshipApplication.getInstance().getBaseObjectGraph().plus(new Object[] {
                new HurricaneCentralInjection()
            }));
            viewPager.setAdapter(pagerAdapter);
            if (startingStorm != null)
            {
                int i = storms.indexOf(startingStorm);
                if (i != -1)
                {
                    viewPager.setCurrentItem(i);
                }
            }
            if (!storms.isEmpty())
            {
                startingStorm = null;
            }
        }
    }
}
