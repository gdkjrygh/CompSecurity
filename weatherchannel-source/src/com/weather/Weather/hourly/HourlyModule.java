// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hourly;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.weather.Weather.feed.Module;
import com.weather.commons.analytics.feed.ClickableLocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.HourlyWeatherFacade;
import java.util.List;

// Referenced classes of package com.weather.Weather.hourly:
//            HourlyAdapter, HourlyDataUnavailableEvent

public final class HourlyModule extends Module
{

    private static final int NO_HOURS = 5;
    private final HourlyAdapter adapter;
    private LinearLayout content;
    private View hourlySummaryView;
    private RelativeLayout invalidData;
    private final ClickableLocalyticsModuleHandler localyticsModuleHandler;
    private final android.view.View.OnClickListener onClickListener = new _cls1();
    private final android.widget.AdapterView.OnItemClickListener onItemClickListener = new _cls2();

    public HourlyModule(Context context, ModuleConfig moduleconfig, Handler handler, ClickableLocalyticsModuleHandler clickablelocalyticsmodulehandler)
    {
        super(context, moduleconfig, handler, clickablelocalyticsmodulehandler);
        localyticsModuleHandler = clickablelocalyticsmodulehandler;
        adapter = new HourlyAdapter(context, 0x7f03005d);
    }

    protected View createView(ViewGroup viewgroup)
    {
        hourlySummaryView = LayoutInflater.from(context).inflate(0x7f03005a, viewgroup, false);
        hourlySummaryView.setOnClickListener(onClickListener);
        content = (LinearLayout)hourlySummaryView.findViewById(0x7f0d016a);
        invalidData = (RelativeLayout)hourlySummaryView.findViewById(0x7f0d016d);
        viewgroup = (ListView)hourlySummaryView.findViewById(0x7f0d0166);
        viewgroup.setOnItemClickListener(onItemClickListener);
        viewgroup.setAdapter(adapter);
        return hourlySummaryView;
    }

    public void onHourlyDataUnavailable(HourlyDataUnavailableEvent hourlydataunavailableevent)
    {
        ((Activity)context).runOnUiThread(new _cls3());
    }

    public void onReceiveData(HourlyWeatherFacade hourlyweatherfacade)
    {
        setModuleData(hourlyweatherfacade);
    }

    protected void updateUi(HourlyWeatherFacade hourlyweatherfacade)
    {
        if (hourlyweatherfacade == null)
        {
            content.setVisibility(8);
            invalidData.setVisibility(0);
            hourlySummaryView.setEnabled(false);
        } else
        {
            content.setVisibility(0);
            invalidData.setVisibility(8);
            hourlySummaryView.setEnabled(true);
            if (hourlyweatherfacade.getFilteredHourlyList().size() >= 5)
            {
                adapter.setHourlyWeatherList(hourlyweatherfacade.getFilteredHourlyList().subList(0, 5));
                return;
            }
        }
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((HourlyWeatherFacade)obj);
    }





    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
