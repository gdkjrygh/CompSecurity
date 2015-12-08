// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.flu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.weather.Weather.feed.Module;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.ColdFluCondition;
import com.weather.commons.facade.FluFacade;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.weather.Weather.flu:
//            BarGraphItem, ColdFluBarGraphAdapter

public class ColdFluHistoryModule extends Module
{

    private static final int NO_OF_WEEKS = 7;
    ColdFluBarGraphAdapter barGraphAdapter;
    List barGraphItems;
    private RecyclerView recyclerView;

    protected ColdFluHistoryModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
        barGraphItems = new ArrayList();
    }

    private void populateChartValues(int i, FluFacade flufacade)
    {
        barGraphItems.clear();
        for (int j = 0; j < i; j++)
        {
            int k = getBarGraphHeight(flufacade.getFluCondition(j));
            Object obj = flufacade.getDate(j);
            if (obj != null)
            {
                obj = new BarGraphItem(k, ((String) (obj)));
                barGraphItems.add(obj);
            }
        }

    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f03002a, viewgroup, false);
        recyclerView = (RecyclerView)viewgroup.findViewById(0x7f0d00e2);
        return viewgroup;
    }

    int getBarGraphHeight(ColdFluCondition coldflucondition)
    {
        Resources resources = context.getResources();
        switch (_cls1..SwitchMap.com.weather.commons.facade.ColdFluCondition[coldflucondition.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown flu condition : ").append(coldflucondition).toString());

        case 1: // '\001'
            return resources.getDimensionPixelSize(0x7f0a00d0);

        case 2: // '\002'
            return resources.getDimensionPixelSize(0x7f0a00cd);

        case 3: // '\003'
            return resources.getDimensionPixelSize(0x7f0a00cf);

        case 4: // '\004'
            return resources.getDimensionPixelSize(0x7f0a00ce);

        case 5: // '\005'
            return 0;
        }
    }

    public void onReceiveFluData(FluFacade flufacade)
    {
        setModuleData(flufacade);
    }

    protected void updateUi(FluFacade flufacade)
    {
        if (flufacade == null || !flufacade.hasData())
        {
            return;
        } else
        {
            populateChartValues(Math.min(7, flufacade.getSize()), flufacade);
            barGraphAdapter = new ColdFluBarGraphAdapter(barGraphItems);
            flufacade = new LinearLayoutManager(context);
            flufacade.setOrientation(0);
            recyclerView.setLayoutManager(flufacade);
            recyclerView.setAdapter(barGraphAdapter);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setHasFixedSize(true);
            return;
        }
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((FluFacade)obj);
    }

    /* member class not found */
    class _cls1 {}

}
