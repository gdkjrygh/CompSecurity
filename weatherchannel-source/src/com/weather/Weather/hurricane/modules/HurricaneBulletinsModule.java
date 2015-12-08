// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.weather.Weather.feed.Module;
import com.weather.Weather.lastupdate.LastUpdatedUtil;
import com.weather.Weather.nhc.NhcWeatherAlertFetcher;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.WeatherAlert;
import com.weather.commons.ui.fonts.TextViewWithFont;
import com.weather.util.time.TimeProvider;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HurricaneBulletinsModule extends Module
{
    static final class ModuleData
    {

        private final WeatherAlert publicAdvisoryAlert;
        private final long recordCreationTime;
        private final WeatherAlert tropicalDiscussionAlert;

        boolean hasData()
        {
            return publicAdvisoryAlert != null || tropicalDiscussionAlert != null;
        }




        ModuleData(List list, String s, long l)
        {
            publicAdvisoryAlert = NhcWeatherAlertFetcher.getWeatherAlert(list, s, com.weather.Weather.nhc.NhcDetailsActivity.NhcData.PUBLIC_ADVISORY);
            tropicalDiscussionAlert = NhcWeatherAlertFetcher.getWeatherAlert(list, s, com.weather.Weather.nhc.NhcDetailsActivity.NhcData.DISCUSSION_DETAILS);
            recordCreationTime = l;
        }
    }


    private static final long LAST_UPDATED_UPDATE_DELAY_MILLIS;
    private Runnable delayedUpdater;
    private View dividerView;
    private android.view.ViewGroup.LayoutParams layoutParams;
    private ModuleData moduleData;
    private View moduleView;
    NhcWeatherAlertFetcher nhcWeatherAlertFetcher;
    private TextViewWithFont noBulletinTextView;
    private LinearLayout publicAdvisoryLayout;
    private TextViewWithFont publicAdvisoryTimeAgo;
    String stormId;
    TimeProvider timeProvider;
    private LinearLayout tropicalDiscussionLayout;
    private TextViewWithFont tropicalDiscussionTimeAgo;

    public HurricaneBulletinsModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
    }

    private void hide()
    {
        moduleView.setOnClickListener(null);
        if (isHideable)
        {
            moduleView.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            setActive(false);
            return;
        } else
        {
            setActive(true);
            moduleView.setLayoutParams(layoutParams);
            noBulletinTextView.setVisibility(0);
            publicAdvisoryLayout.setVisibility(8);
            dividerView.setVisibility(8);
            tropicalDiscussionLayout.setVisibility(8);
            return;
        }
    }

    private void show(WeatherAlert weatheralert, WeatherAlert weatheralert1)
    {
        boolean flag1 = false;
        setActive(true);
        moduleView.setLayoutParams(layoutParams);
        noBulletinTextView.setVisibility(8);
        Object obj;
        boolean flag;
        int i;
        int j;
        if (weatheralert1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = publicAdvisoryLayout;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((LinearLayout) (obj)).setVisibility(i);
        if (weatheralert != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj = dividerView;
        if (flag && i != 0)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((View) (obj)).setVisibility(j);
        obj = tropicalDiscussionLayout;
        if (i != 0)
        {
            j = ((flag1) ? 1 : 0);
        } else
        {
            j = 8;
        }
        ((LinearLayout) (obj)).setVisibility(j);
        if (flag)
        {
            publicAdvisoryLayout.setOnClickListener(new _cls2(weatheralert1));
        }
        if (i != 0)
        {
            tropicalDiscussionLayout.setOnClickListener(new _cls3(weatheralert));
        }
        visible = true;
        updateUpdatedTimes();
    }

    private void updateUpdatedTimes()
    {
        android.content.res.Resources resources = context.getResources();
        if (moduleData != null) goto _L2; else goto _L1
_L1:
        publicAdvisoryTimeAgo.setText("");
        tropicalDiscussionTimeAgo.setText("");
_L4:
        if (visible && delayedUpdater == null)
        {
            delayedUpdater = new _cls4();
            if (!handler.postDelayed(delayedUpdater, LAST_UPDATED_UPDATE_DELAY_MILLIS))
            {
                delayedUpdater = null;
            }
        }
        return;
_L2:
        if (publicAdvisoryLayout.getVisibility() == 0)
        {
            publicAdvisoryTimeAgo.setText(LastUpdatedUtil.calculateLastUpdatedString(resources, moduleData.recordCreationTime, timeProvider.currentTimeMillis()));
        }
        if (tropicalDiscussionLayout.getVisibility() == 0)
        {
            tropicalDiscussionTimeAgo.setText(LastUpdatedUtil.calculateLastUpdatedString(resources, moduleData.recordCreationTime, timeProvider.currentTimeMillis()));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected View createView(ViewGroup viewgroup)
    {
        moduleView = LayoutInflater.from(context).inflate(0x7f030060, viewgroup, false);
        publicAdvisoryLayout = (LinearLayout)moduleView.findViewById(0x7f0d017c);
        dividerView = moduleView.findViewById(0x7f0d0182);
        tropicalDiscussionLayout = (LinearLayout)moduleView.findViewById(0x7f0d0183);
        publicAdvisoryTimeAgo = (TextViewWithFont)moduleView.findViewById(0x7f0d0180);
        tropicalDiscussionTimeAgo = (TextViewWithFont)moduleView.findViewById(0x7f0d0187);
        layoutParams = moduleView.getLayoutParams();
        noBulletinTextView = (TextViewWithFont)moduleView.findViewById(0x7f0d017b);
        return moduleView;
    }

    public void destroy()
    {
        if (delayedUpdater != null)
        {
            handler.removeCallbacks(delayedUpdater);
        }
        super.destroy();
    }

    public void resume()
    {
        super.resume();
        boolean flag;
        if (stormId != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            nhcWeatherAlertFetcher.refresh(false, new _cls1(), null);
        }
    }

    protected void updateUi(ModuleData moduledata)
    {
        moduleData = moduledata;
        if (stormId == null || moduledata == null)
        {
            hide();
            return;
        } else
        {
            show(moduledata.tropicalDiscussionAlert, moduledata.publicAdvisoryAlert);
            return;
        }
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((ModuleData)obj);
    }

    static 
    {
        LAST_UPDATED_UPDATE_DELAY_MILLIS = TimeUnit.SECONDS.toMillis(3L);
    }









/*
    static Runnable access$902(HurricaneBulletinsModule hurricanebulletinsmodule, Runnable runnable)
    {
        hurricanebulletinsmodule.delayedUpdater = runnable;
        return runnable;
    }

*/

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}

}
