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
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.weather.Weather.feed.Module;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.Percentage;
import com.weather.commons.facade.Temperature;
import com.weather.util.app.AbstractTwcApplication;

// Referenced classes of package com.weather.Weather.pollen:
//            AllergyType

public class MoldHumidityModule extends Module
{

    private static final int MOLD_COMFORTABLE_LOWER_LIMIT = 31;
    private static final int MOLD_COMFORTABLE_UPPER_LIMIT = 51;
    private static final int MOLD_WET_UPPER_LIMIT = 30;
    AllergyType allergyType;
    private View comfortBackground;
    private ImageView comfortIcon;
    private TextView comfortLevel;
    ConfigurationManagers configurationManagers;
    private TextView consequence1;
    private TextView consequence2;
    private TextView consequence3;
    private TextView consequence4;
    private int humidity;
    private TextView humidityText;
    private TextView indoorTemp;
    Picasso picasso;
    private int temp;
    private TextView tempText;
    private SeekBar thermostat;

    protected MoldHumidityModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
    }

    private void setComfortLevel()
    {
        double d = humidity;
        double d2 = 0.55555555555555558D * ((double)thermostat.getProgress() - 32D);
        double d1 = 0.55555555555555558D * ((double)temp - 32D);
        d2 = Math.pow(10D, (7.5D * d2) / (237.69999999999999D + d2));
        d1 = Math.round((d * (6.1100000000000003D * Math.pow(10D, (7.5D * d1) / (237.69999999999999D + d1)))) / (6.1100000000000003D * d2));
        d = d1;
        if (d1 > 100D)
        {
            d = 100D;
        }
        d1 = d;
        if (d < 0.0D)
        {
            d1 = 0.0D;
        }
        Resources resources = AbstractTwcApplication.getRootContext().getResources();
        if (d1 >= 0.0D && d1 <= 30D)
        {
            comfortIcon.setImageResource(0x7f020447);
            comfortBackground.setBackgroundColor(resources.getColor(0x7f0b0068));
            comfortLevel.setText(resources.getText(0x7f0701c1));
            comfortLevel.requestLayout();
            comfortLevel.invalidate();
            consequence1.setText(resources.getText(0x7f0701bc));
            consequence2.setText(resources.getText(0x7f0701bd));
            consequence3.setText(resources.getText(0x7f0701be));
            consequence4.setText(resources.getText(0x7f0701bf));
            consequence3.setVisibility(0);
            consequence4.setVisibility(0);
            return;
        }
        if (d1 >= 31D && d1 <= 51D)
        {
            comfortIcon.setImageResource(0x7f02004f);
            comfortBackground.setBackgroundColor(resources.getColor(0x7f0b0067));
            comfortLevel.setText(resources.getText(0x7f0701c2));
            comfortLevel.requestLayout();
            comfortLevel.invalidate();
            consequence1.setText(resources.getText(0x7f0701b9));
            consequence2.setText(resources.getText(0x7f0701ba));
            consequence3.setVisibility(8);
            consequence4.setVisibility(8);
            return;
        } else
        {
            comfortIcon.setImageResource(0x7f020447);
            comfortBackground.setBackgroundColor(resources.getColor(0x7f0b0069));
            comfortLevel.setText(resources.getText(0x7f0701c3));
            comfortLevel.requestLayout();
            comfortLevel.invalidate();
            consequence1.setText(resources.getText(0x7f0701c4));
            consequence2.setText(resources.getText(0x7f0701c5));
            consequence3.setText(resources.getText(0x7f0701c6));
            consequence4.setText(resources.getText(0x7f0701c7));
            consequence3.setVisibility(0);
            consequence4.setVisibility(0);
            return;
        }
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f030070, viewgroup, false);
        tempText = (TextView)viewgroup.findViewById(0x7f0d01bd);
        humidityText = (TextView)viewgroup.findViewById(0x7f0d01c0);
        indoorTemp = (TextView)viewgroup.findViewById(0x7f0d01bb);
        thermostat = (SeekBar)viewgroup.findViewById(0x7f0d01c3);
        thermostat.setOnSeekBarChangeListener(new _cls1());
        comfortBackground = viewgroup.findViewById(0x7f0d01c4);
        comfortIcon = (ImageView)viewgroup.findViewById(0x7f0d01c5);
        comfortLevel = (TextView)viewgroup.findViewById(0x7f0d01c6);
        consequence1 = (TextView)viewgroup.findViewById(0x7f0d01c8);
        consequence2 = (TextView)viewgroup.findViewById(0x7f0d01c9);
        consequence3 = (TextView)viewgroup.findViewById(0x7f0d01ca);
        consequence4 = (TextView)viewgroup.findViewById(0x7f0d01cb);
        if (allergyType != AllergyType.MOLD)
        {
            viewgroup.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            setActive(false);
        }
        return viewgroup;
    }

    public void onCurrentWeatherFacade(CurrentWeatherFacade currentweatherfacade)
    {
        setModuleData(currentweatherfacade);
    }

    protected void updateUi(CurrentWeatherFacade currentweatherfacade)
    {
        boolean flag = false;
        if (currentweatherfacade == null)
        {
            return;
        }
        Temperature temperature = currentweatherfacade.getCurrentTemp();
        int i;
        if (temperature == null || temperature.value == null)
        {
            i = 0;
        } else
        {
            i = ((Integer)temperature.value).intValue();
        }
        temp = i;
        currentweatherfacade = currentweatherfacade.getHumidity();
        i = ((flag) ? 1 : 0);
        if (currentweatherfacade != null)
        {
            if (((Percentage) (currentweatherfacade)).value == null)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = ((Integer)((Percentage) (currentweatherfacade)).value).intValue();
            }
        }
        humidity = i;
        tempText.setText(temperature.formatShort());
        humidityText.setText(currentweatherfacade.format());
        indoorTemp.setText(Integer.toString(thermostat.getProgress()));
        setComfortLevel();
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((CurrentWeatherFacade)obj);
    }



    /* member class not found */
    class _cls1 {}

}
