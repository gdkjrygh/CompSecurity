// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.flu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.weather.Weather.feed.Module;
import com.weather.Weather.ui.DialView;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.ColdFluCondition;
import com.weather.commons.facade.FluFacade;

public class ColdFluHeroModule extends Module
{

    private TextView coldFluDesc;
    private DialView fluDial;

    protected ColdFluHeroModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
    }

    private void setFluDialColorAndProgress(ColdFluCondition coldflucondition)
    {
        Resources resources = context.getResources();
        _cls1..SwitchMap.com.weather.commons.facade.ColdFluCondition[coldflucondition.ordinal()];
        JVM INSTR tableswitch 1 5: default 52
    //                   1 79
    //                   2 146
    //                   3 176
    //                   4 206
    //                   5 236;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown flu condition : ").append(coldflucondition).toString());
_L2:
        int i;
        int j;
        j = 85;
        i = 0x7f0b0055;
        coldflucondition = resources.getString(0x7f070119);
        coldFluDesc.setText(resources.getString(0x7f070123));
_L8:
        fluDial.setText(coldflucondition);
        fluDial.setProgress((float)j / 100F);
        fluDial.setColor(context.getResources().getColor(i));
        return;
_L3:
        j = 65;
        i = 0x7f0b0052;
        coldflucondition = resources.getString(0x7f070114);
        coldFluDesc.setText(resources.getString(0x7f07011e));
        continue; /* Loop/switch isn't completed */
_L4:
        j = 45;
        i = 0x7f0b0054;
        coldflucondition = resources.getString(0x7f070110);
        coldFluDesc.setText(resources.getString(0x7f07010f));
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f0b0053;
        j = 25;
        coldflucondition = resources.getString(0x7f070116);
        coldFluDesc.setText(resources.getString(0x7f070121));
        continue; /* Loop/switch isn't completed */
_L6:
        j = 0;
        i = 0x7f0b0051;
        coldflucondition = resources.getString(0x7f070113);
        coldFluDesc.setText(resources.getString(0x7f07011b));
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f030029, viewgroup, false);
        fluDial = (DialView)viewgroup.findViewById(0x7f0d00d6);
        coldFluDesc = (TextView)viewgroup.findViewById(0x7f0d00d7);
        return viewgroup;
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
            setFluDialColorAndProgress(flufacade.getFluCondition(0));
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
