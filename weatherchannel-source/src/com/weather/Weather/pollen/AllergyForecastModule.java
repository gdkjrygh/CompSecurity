// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.pollen;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import com.weather.Weather.feed.Module;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.PollenFacade;
import com.weather.commons.facade.PollenUnavailableEvent;
import com.weather.dal2.dsx.PastPollenData;
import com.weather.util.app.AbstractTwcApplication;

// Referenced classes of package com.weather.Weather.pollen:
//            AllergyType, PollenDataBundle, PastPollenDataFetcher, BreathingForecastGridAdapter, 
//            AllergyAdapter, PollenForecastGridAdapter

public class AllergyForecastModule extends Module
{

    private static final int DAYS_OF_BREATHING_FORECAST = 4;
    private AllergyAdapter adapter;
    AllergyType allergyType;
    private TextView footer;
    private GridView forecastGrid;
    private volatile PastPollenData pastPollenData;
    private volatile PollenFacade pollenFacade;
    private TextView statement;
    private TextView title;

    protected AllergyForecastModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
    }

    private CharSequence getPollenStatement()
    {
        com.weather.commons.facade.PollenFacade.RelativePollen relativepollen;
label0:
        {
            String s = "";
            relativepollen = pollenFacade.getRelativeForecast();
            if (relativepollen != null)
            {
                if (relativepollen != com.weather.commons.facade.PollenFacade.RelativePollen.DECREASE)
                {
                    break label0;
                }
                s = AbstractTwcApplication.getRootContext().getString(0x7f070250);
            }
            return s;
        }
        if (relativepollen == com.weather.commons.facade.PollenFacade.RelativePollen.INCREASE)
        {
            return AbstractTwcApplication.getRootContext().getString(0x7f07024e);
        } else
        {
            return AbstractTwcApplication.getRootContext().getString(0x7f07024f);
        }
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f03000e, viewgroup, false);
        title = (TextView)viewgroup.findViewById(0x7f0d0048);
        statement = (TextView)viewgroup.findViewById(0x7f0d0049);
        footer = (TextView)viewgroup.findViewById(0x7f0d004b);
        forecastGrid = (GridView)viewgroup.findViewById(0x7f0d004a);
        if (allergyType == AllergyType.POLLEN)
        {
            refresh();
        }
        if (allergyType == AllergyType.MOLD)
        {
            viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            setActive(false);
        }
        return viewgroup;
    }

    public void onPollenClear(PollenUnavailableEvent pollenunavailableevent)
    {
        setModuleData(null);
    }

    public void onReceivePastPollen(PastPollenData pastpollendata)
    {
        pastPollenData = pastpollendata;
        setModuleData(new PollenDataBundle(pollenFacade, pastpollendata));
    }

    public void onReceivePollenData(PollenFacade pollenfacade)
    {
        pollenFacade = pollenfacade;
        setModuleData(new PollenDataBundle(pollenfacade, pastPollenData));
    }

    public void refresh()
    {
        PastPollenDataFetcher.getInstance().refresh(false, new _cls1(), null);
    }

    protected void updateUi(PollenDataBundle pollendatabundle)
    {
        if (pollendatabundle != null && AllergyType.MOLD != allergyType && pollenFacade != null)
        {
            if (adapter == null)
            {
                if (allergyType == AllergyType.BREATHING)
                {
                    title.setText(0x7f07006d);
                    footer.setVisibility(8);
                    if (pollenFacade.getBreathingDoc() != null)
                    {
                        statement.setText(pollendatabundle.getPollenFacade().getBreathingStatement(4));
                        adapter = new BreathingForecastGridAdapter(context);
                    }
                } else
                if (allergyType == AllergyType.POLLEN && pollenFacade.getPollenDoc() != null)
                {
                    title.setText(0x7f070242);
                    statement.setText(getPollenStatement());
                    footer.setVisibility(0);
                    adapter = new PollenForecastGridAdapter(context);
                }
            }
            if (adapter != null)
            {
                adapter.setData(pollendatabundle.getPollenFacade(), pollendatabundle.getPastPollenData());
                forecastGrid.setAdapter(adapter);
                return;
            }
        }
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((PollenDataBundle)obj);
    }



    /* member class not found */
    class _cls1 {}

}
