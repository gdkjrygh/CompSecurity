// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.pollen;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.weather.Weather.feed.Module;
import com.weather.Weather.ui.DialView;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.ColdFluCondition;
import com.weather.commons.facade.FluFacade;
import com.weather.commons.facade.HealthFacadeBundle;
import com.weather.commons.facade.PollenFacade;
import com.weather.commons.facade.PollenUnavailableEvent;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.config.ConfigException;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.weather.Weather.pollen:
//            HealthLocalyticsModuleHandler

public final class PollenModule extends Module
{

    private TextView allergyDesc;
    private DialView allergyDial;
    private RelativeLayout allergyLayout;
    private String dialText;
    private volatile FluFacade fluData;
    private TextView fluDesc;
    private DialView fluDial;
    private RelativeLayout fluDialLayout;
    private final HealthLocalyticsModuleHandler localyticsModuleHandler;
    private int majorContributor;
    private volatile PollenFacade pollenData;
    private String toBeDisplayed;

    public PollenModule(Context context, ModuleConfig moduleconfig, Handler handler, HealthLocalyticsModuleHandler healthlocalyticsmodulehandler)
    {
        super(context, moduleconfig, handler, healthlocalyticsmodulehandler);
        localyticsModuleHandler = healthlocalyticsmodulehandler;
    }

    private int extractPollenValue(com.weather.dal2.dsx.Breathing.BreathingDoc breathingdoc)
    {
label0:
        {
            int i = 0;
            int k = 0;
            Resources resources = context.getResources();
            if (pollenData != null)
            {
                int j = pollenData.getMaxPollenIndexForGivenDay(0);
                int l;
                int i1;
                if (j != 0)
                {
                    j = j * 2 + 1;
                }
                l = j;
                toBeDisplayed = resources.getString(0x7f070251);
                majorContributor = 0;
                dialText = pollenData.getMaxPollenLabelForGivenDay(0);
                i1 = pollenData.getMoldCount();
                i = j;
                k = l;
                if (i1 > -1)
                {
                    j = Math.max(j, i1);
                    i = j;
                    k = l;
                    if (l != j)
                    {
                        toBeDisplayed = resources.getString(0x7f070248);
                        majorContributor = 2;
                        dialText = pollenData.getMoldPhrase(context, i1);
                        k = j;
                        i = j;
                    }
                }
            }
            j = i;
            if (breathingdoc == null)
            {
                break label0;
            }
            breathingdoc = breathingdoc.getBreathingValue();
            j = i;
            if (breathingdoc == null)
            {
                break label0;
            }
            j = i;
            if (breathingdoc.isEmpty())
            {
                break label0;
            }
            i = Math.max(i, 10 - getBreathingValue(breathingdoc));
            if (k == i)
            {
                j = i;
                if (i != 0)
                {
                    break label0;
                }
            }
            j = i;
            if (i == 0)
            {
                j = i + 1;
            }
            toBeDisplayed = resources.getString(0x7f07023e);
            majorContributor = 1;
            breathingdoc = (com.weather.dal2.dsx.Breathing.BreathingDay)breathingdoc.get(0);
            if (breathingdoc == null)
            {
                breathingdoc = "";
            } else
            {
                breathingdoc = breathingdoc.getBreathingIndexPhrase();
            }
            dialText = breathingdoc;
        }
        return j;
    }

    private int getBreathingValue(List list)
    {
        if (list != null && !list.isEmpty())
        {
            if ((list = ((com.weather.dal2.dsx.Breathing.BreathingDay)list.get(0)).getBreathingIndexCode()) != null)
            {
                return list.intValue();
            }
        }
        return -1;
    }

    private int getMaxPollenColor(int i)
    {
        if (i == 0)
        {
            return 0x7f0b0051;
        }
        if (i > 0 && i <= 3)
        {
            return 0x7f0b0053;
        }
        if (i > 3 && i <= 5)
        {
            return 0x7f0b0054;
        }
        return i <= 5 || i > 7 ? 0x7f0b0055 : 0x7f0b0052;
    }

    private void setAllergyData(PollenFacade pollenfacade)
    {
        Object obj = context.getResources();
        if (pollenfacade == null || pollenfacade.getPollenDoc() == null && pollenfacade.getBreathingDoc() == null)
        {
            allergyLayout.setEnabled(false);
            allergyDial.setText(((Resources) (obj)).getString(0x7f070158));
            allergyDial.setProgress(0.0F);
            allergyDesc.setText(((Resources) (obj)).getString(0x7f07017f));
            return;
        }
        allergyLayout.setEnabled(true);
        int i = extractPollenValue(pollenfacade.getBreathingDoc());
        allergyDial.setProgress((float)i / 10F);
        obj = allergyDial;
        if (dialText == null || dialText.isEmpty())
        {
            pollenfacade = "";
        } else
        {
            pollenfacade = dialText.toUpperCase(Locale.getDefault());
        }
        ((DialView) (obj)).setText(pollenfacade);
        allergyDial.setColor(context.getResources().getColor(getMaxPollenColor(i)));
        allergyDesc.setText(pollenData.getDescription(dialText, toBeDisplayed));
        allergyLayout.setOnClickListener(new _cls2());
    }

    private void setFluData(FluFacade flufacade)
    {
        Resources resources;
        boolean flag;
        resources = context.getResources();
        flag = false;
        boolean flag1 = ConfigurationManagers.getInstance().getFlagshipConfig().enableFluModule;
        flag = flag1;
_L2:
        if (!flag)
        {
            fluDialLayout.setEnabled(false);
            fluDial.setText(resources.getString(0x7f070158));
            fluDial.setProgress(0.0F);
            fluDesc.setText(resources.getString(0x7f07010d));
            return;
        }
        break; /* Loop/switch isn't completed */
        ConfigException configexception;
        configexception;
        EventLog.e(TAG, "Can not get enableFluModule", configexception);
        if (true) goto _L2; else goto _L1
_L1:
        if (flufacade == null || !flufacade.hasData())
        {
            fluDialLayout.setEnabled(false);
            fluDial.setText(resources.getString(0x7f070158));
            fluDial.setProgress(0.0F);
            fluDesc.setText(resources.getString(0x7f07011c));
            return;
        } else
        {
            fluDialLayout.setEnabled(true);
            setFluDialColorAndProgress(flufacade.getFluCondition(0), resources);
            return;
        }
    }

    private void setFluDialColorAndProgress(ColdFluCondition coldflucondition, Resources resources)
    {
        _cls3..SwitchMap.com.weather.commons.facade.ColdFluCondition[coldflucondition.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 72
    //                   2 142
    //                   3 174
    //                   4 206
    //                   5 238;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown flu condition : ").append(coldflucondition).toString());
_L2:
        int i;
        int j;
        j = 85;
        i = 0x7f0b0055;
        coldflucondition = resources.getString(0x7f070119);
        fluDesc.setText(resources.getString(0x7f070122));
_L8:
        fluDial.setText(coldflucondition);
        fluDial.setProgress((float)j / 100F);
        fluDial.setColor(context.getResources().getColor(i));
        return;
_L3:
        j = 65;
        i = 0x7f0b0052;
        coldflucondition = resources.getString(0x7f070114);
        fluDesc.setText(resources.getString(0x7f07011d));
        continue; /* Loop/switch isn't completed */
_L4:
        j = 45;
        i = 0x7f0b0054;
        coldflucondition = resources.getString(0x7f070110);
        fluDesc.setText(resources.getString(0x7f07010e));
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f0b0053;
        j = 25;
        coldflucondition = resources.getString(0x7f070116);
        fluDesc.setText(resources.getString(0x7f070120));
        continue; /* Loop/switch isn't completed */
_L6:
        j = 0;
        i = 0x7f0b0051;
        coldflucondition = resources.getString(0x7f070113);
        fluDesc.setText(resources.getString(0x7f07011b));
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f030068, viewgroup, false);
        allergyDial = (DialView)viewgroup.findViewById(0x7f0d004c);
        allergyLayout = (RelativeLayout)viewgroup.findViewById(0x7f0d0198);
        allergyDesc = (TextView)viewgroup.findViewById(0x7f0d019a);
        fluDialLayout = (RelativeLayout)viewgroup.findViewById(0x7f0d019b);
        fluDial = (DialView)viewgroup.findViewById(0x7f0d00d6);
        fluDesc = (TextView)viewgroup.findViewById(0x7f0d00d7);
        fluDialLayout.setOnClickListener(new _cls1());
        return viewgroup;
    }

    public void onPollenClear(PollenUnavailableEvent pollenunavailableevent)
    {
        setModuleData(null);
    }

    public void onReceiveData(PollenFacade pollenfacade)
    {
        pollenData = pollenfacade;
        setModuleData(new HealthFacadeBundle(pollenfacade, fluData));
    }

    public void onReceiveFluData(FluFacade flufacade)
    {
        fluData = flufacade;
        setModuleData(new HealthFacadeBundle(pollenData, flufacade));
    }

    protected void updateUi(HealthFacadeBundle healthfacadebundle)
    {
        if (healthfacadebundle == null)
        {
            allergyLayout.setEnabled(false);
            fluDialLayout.setEnabled(false);
            return;
        } else
        {
            setAllergyData(healthfacadebundle.getPollenFacade());
            setFluData(healthfacadebundle.getFluFacade());
            return;
        }
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((HealthFacadeBundle)obj);
    }







    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}

}
