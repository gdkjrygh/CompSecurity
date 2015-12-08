// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ski;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.weather.Weather.feed.Module;
import com.weather.Weather.ui.PageIndicator;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.SkiFacade;
import com.weather.commons.facade.SkiFacadeUnavailableEvent;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.app.AbstractTwcApplication;

// Referenced classes of package com.weather.Weather.ski:
//            SkiPagerAdapter

public final class SkiModule extends Module
{

    private LinearLayout content;
    private SavedLocation currentLocation;
    private RelativeLayout invalidData;
    private final boolean isHideable;
    private android.view.ViewGroup.LayoutParams layoutParams;
    private SkiPagerAdapter skiPagerAdapter;
    private View view;
    private ViewPager viewPager;

    public SkiModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
        currentLocation = LocationManager.getLocationManager().getCurrentLocation();
        isHideable = moduleconfig.isHideable;
    }

    private String getBeaconString()
    {
        return AbstractTwcApplication.getRootContext().getString(0x7f0704cc);
    }

    protected View createView(ViewGroup viewgroup)
    {
        view = LayoutInflater.from(context).inflate(0x7f03009b, viewgroup, false);
        viewPager = (ViewPager)view.findViewById(0x7f0d025e);
        skiPagerAdapter = new SkiPagerAdapter(context);
        viewPager.setAdapter(skiPagerAdapter);
        viewgroup = (PageIndicator)view.findViewById(0x7f0d025f);
        viewgroup.setViewPager(viewPager);
        content = (LinearLayout)view.findViewById(0x7f0d025d);
        invalidData = (RelativeLayout)view.findViewById(0x7f0d0260);
        layoutParams = content.getLayoutParams();
        viewgroup.setOnPageChangeListener(new _cls1());
        return view;
    }

    public void onReceiveData(SkiFacade skifacade)
    {
        SkiFacade skifacade1 = skifacade;
        if (skifacade.getTotalNumberOfResorts() == 0)
        {
            skifacade1 = null;
        }
        setModuleData(skifacade1);
    }

    public void onReceiveData(SkiFacadeUnavailableEvent skifacadeunavailableevent)
    {
        setModuleData(null);
    }

    protected void updateUi(SkiFacade skifacade)
    {
        if (skifacade == null)
        {
            if (isHideable)
            {
                view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
                setActive(false);
                return;
            } else
            {
                content.setVisibility(8);
                invalidData.setVisibility(0);
                setActive(true);
                return;
            }
        }
        content.setVisibility(0);
        invalidData.setVisibility(8);
        content.setLayoutParams(layoutParams);
        skiPagerAdapter.updateSkiData(skifacade);
        skifacade = LocationManager.getLocationManager().getCurrentLocation();
        if (currentLocation != null && !currentLocation.equals(skifacade))
        {
            viewPager.setCurrentItem(0);
            currentLocation = skifacade;
        }
        setActive(true);
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((SkiFacade)obj);
    }


    /* member class not found */
    class _cls1 {}

}
