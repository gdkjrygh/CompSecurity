// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.flu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.weather.Weather.feed.Module;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.FluFacade;
import com.weather.commons.facade.FluFacadeUnavailableEvent;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Locale;

public final class FluModule extends Module
{

    private static final String TAG = "FluModule";
    private ImageView conditionImage;
    private TextView conditionSummary;
    private TextView dateLabel;
    private LinearLayout invalidData;
    private TextView noneActivityLabel;
    private TextView previousLabel;
    private TextView regionalLabel;
    private final Resources resources;
    private TextView sporadicLabel;
    private ImageView stateMapImage;
    private RelativeLayout validDataContainer;
    private TextView widespreadLabel;

    public FluModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
        resources = context.getResources();
    }

    private int getResourceId(String s)
    {
        return resources.getIdentifier(s, "drawable", AbstractTwcApplication.getRootContext().getPackageName());
    }

    private void setLabel(String s)
    {
        if (s.equalsIgnoreCase("purple"))
        {
            conditionSummary.setText(resources.getText(0x7f07011a));
            setSelectedLabel(widespreadLabel);
            return;
        }
        if (s.equalsIgnoreCase("orange") || s.equalsIgnoreCase("red"))
        {
            conditionSummary.setText(resources.getText(0x7f070115));
            setSelectedLabel(regionalLabel);
            return;
        }
        if (s.equalsIgnoreCase("yellow"))
        {
            conditionSummary.setText(resources.getText(0x7f070117));
            setSelectedLabel(sporadicLabel);
            return;
        }
        if (s.equalsIgnoreCase("white") || s.equalsIgnoreCase("green"))
        {
            conditionSummary.setText(resources.getText(0x7f070112));
            setSelectedLabel(noneActivityLabel);
            return;
        } else
        {
            Log.w("FluModule", (new StringBuilder()).append("unexpected color=").append(s).toString());
            conditionSummary.setText(resources.getText(0x7f070118));
            setSelectedLabel(null);
            return;
        }
    }

    private void setSelectedLabel(TextView textview)
    {
        if (previousLabel != null)
        {
            previousLabel.setTextColor(resources.getColor(0x7f0b0048));
            previousLabel.setTextSize(0, resources.getDimension(0x7f0a010d));
        }
        previousLabel = textview;
        if (textview != null)
        {
            textview.setTextColor(resources.getColor(0x7f0b0047));
            textview.setTextSize(0, resources.getDimension(0x7f0a010c));
        }
    }

    private void setVisibility(int i, int j)
    {
        validDataContainer.setVisibility(i);
        invalidData.setVisibility(j);
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = (RelativeLayout)LayoutInflater.from(context).inflate(0x7f03003c, viewgroup, false);
        validDataContainer = (RelativeLayout)viewgroup.findViewById(0x7f0d0104);
        stateMapImage = (ImageView)validDataContainer.findViewById(0x7f0d010d);
        Object obj = (RelativeLayout)validDataContainer.findViewById(0x7f0d0106);
        conditionImage = (ImageView)((RelativeLayout) (obj)).findViewById(0x7f0d0107);
        widespreadLabel = (TextView)((RelativeLayout) (obj)).findViewById(0x7f0d0109);
        sporadicLabel = (TextView)((RelativeLayout) (obj)).findViewById(0x7f0d010b);
        regionalLabel = (TextView)((RelativeLayout) (obj)).findViewById(0x7f0d010a);
        noneActivityLabel = (TextView)((RelativeLayout) (obj)).findViewById(0x7f0d010c);
        obj = (LinearLayout)validDataContainer.findViewById(0x7f0d010f);
        conditionSummary = (TextView)((LinearLayout) (obj)).findViewById(0x7f0d0112);
        dateLabel = (TextView)((LinearLayout) (obj)).findViewById(0x7f0d0111);
        invalidData = (LinearLayout)viewgroup.findViewById(0x7f0d0114);
        return viewgroup;
    }

    public void onReceiveData(FluFacade flufacade)
    {
        setModuleData(flufacade);
    }

    public void onReceiveData(FluFacadeUnavailableEvent flufacadeunavailableevent)
    {
        setModuleData(null);
    }

    protected void updateUi(FluFacade flufacade)
    {
        if (flufacade == null || !flufacade.hasData())
        {
            setVisibility(8, 0);
            return;
        }
        String s = flufacade.getColor(0);
        String s1 = flufacade.getState(0);
        if (s != null && s1 != null)
        {
            flufacade = flufacade.getDate(0);
            TextView textview = dateLabel;
            int i;
            if (flufacade == null)
            {
                flufacade = "";
            } else
            {
                flufacade = flufacade.toUpperCase(Locale.getDefault());
            }
            textview.setText(flufacade);
            i = getResourceId(s1);
            LogUtil.d("FluModule", LoggingMetaTags.TWC_UI, "state=%s, drawableId=%d", new Object[] {
                s1, Integer.valueOf(i)
            });
            stateMapImage.setBackgroundResource(i);
            conditionImage.setBackgroundResource(getResourceId(s));
            setLabel(s);
            setVisibility(0, 8);
            return;
        } else
        {
            setVisibility(8, 0);
            return;
        }
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((FluFacade)obj);
    }
}
