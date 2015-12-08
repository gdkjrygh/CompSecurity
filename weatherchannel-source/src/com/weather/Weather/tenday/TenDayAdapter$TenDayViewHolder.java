// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.tenday;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.weather.Weather.ui.ColorArc;
import com.weather.commons.facade.DailyWeather;
import com.weather.commons.facade.FacadeUtils;
import com.weather.commons.facade.PrecipitationRoundedValue;
import com.weather.commons.facade.Temperature;
import com.weather.commons.facade.Wind;
import com.weather.commons.ui.WxIconBitmapCache;
import com.weather.commons.ups.ui.WxIconItem;

// Referenced classes of package com.weather.Weather.tenday:
//            TenDayAdapter

static final class nightWindSpeed
{

    final TextView date;
    final TextView dayOfWeek;
    final TextView dayPartTitle;
    final TextView dayPrecipitation;
    final TextView dayTemperature;
    final View dayView;
    final TextView dayWindSpeed;
    final View dividerImage;
    final ImageView forecastDayIcon;
    final TextView forecastDayPhrase;
    final TextView forecastDayPhraseAlt;
    final TextView forecastDayText;
    final ImageView forecastNightIcon;
    final TextView forecastNightPhrase;
    final TextView forecastNightText;
    final TextView nightPartTitle;
    final TextView nightPrecipitation;
    final TextView nightTemperature;
    final TextView nightWindSpeed;
    final ColorArc sunArc;
    final TextView sunrise;
    final TextView sunset;

    void updateContents(DailyWeather dailyweather, boolean flag)
    {
        date.setText(dailyweather.formatMonthDate());
        dayOfWeek.setText(dailyweather.formatDayLong());
        sunrise.setText(dailyweather.getSunrise());
        sunset.setText(dailyweather.getSunset());
        float f;
        String s;
        String s1;
        if (flag)
        {
            f = FacadeUtils.howMuchDayGone(dailyweather.getSunriseMs(), dailyweather.getSunsetMs(), System.currentTimeMillis());
        } else
        {
            f = 0.0F;
        }
        sunArc.animateProgress(f);
        if (!dailyweather.isUseDayPart())
        {
            dayView.setVisibility(8);
            dividerImage.setVisibility(8);
        } else
        {
            dayView.setVisibility(0);
            dividerImage.setVisibility(0);
            forecastDayText.setText(dailyweather.getDayHeadline());
            forecastDayIcon.setImageBitmap(WxIconBitmapCache.getBitmap((new WxIconItem(dailyweather.getDayIcon())).getSvgIconId()));
            dayPartTitle.setText(dailyweather.formatDayTitle());
            dayTemperature.setText(dailyweather.getHiTemp().formatShort());
            dayWindSpeed.setText(dailyweather.getDayWind().format());
            dayPrecipitation.setText(dailyweather.getDayPrecipitation().format());
        }
        s = dailyweather.getDayPhrase();
        s1 = dailyweather.getNightPhrase();
        if (TextUtils.isEmpty(s1))
        {
            forecastDayPhrase.setVisibility(8);
            forecastNightPhrase.setVisibility(8);
            forecastDayPhraseAlt.setVisibility(0);
            forecastDayPhraseAlt.setText(s);
        } else
        {
            forecastDayPhrase.setVisibility(0);
            forecastDayPhrase.setText(s);
            forecastNightPhrase.setVisibility(0);
            forecastNightPhrase.setText(s1);
            forecastDayPhraseAlt.setVisibility(8);
        }
        forecastNightText.setText(dailyweather.getNightHeadLine());
        forecastNightIcon.setImageBitmap(WxIconBitmapCache.getBitmap((new WxIconItem(dailyweather.getNightIcon())).getSvgIconId()));
        nightPartTitle.setText(dailyweather.formatNightTitle());
        nightTemperature.setText(dailyweather.getLoTemp().formatShort());
        nightWindSpeed.setText(dailyweather.getNightWind().format());
        nightPrecipitation.setText(dailyweather.getNightPrecipitation().format());
    }

    (View view)
    {
        dayView = (View)Preconditions.checkNotNull(view.findViewById(0x7f0d0298));
        dividerImage = (View)Preconditions.checkNotNull(view.findViewById(0x7f0d02a2));
        date = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d0293));
        dayOfWeek = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d0292));
        sunrise = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d0295));
        sunset = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d0296));
        sunArc = (ColorArc)Preconditions.checkNotNull((ColorArc)view.findViewById(0x7f0d0221));
        forecastDayText = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d02a0));
        forecastDayPhrase = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d02a1));
        forecastDayPhraseAlt = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d0299));
        forecastDayIcon = (ImageView)Preconditions.checkNotNull((ImageView)view.findViewById(0x7f0d029f));
        dayPartTitle = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d029a));
        dayTemperature = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d029b));
        dayPrecipitation = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d029d));
        dayWindSpeed = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d029c));
        nightTemperature = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d02a5));
        nightPartTitle = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d02a4));
        forecastNightText = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d02aa));
        forecastNightPhrase = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d02ab));
        forecastNightIcon = (ImageView)Preconditions.checkNotNull((ImageView)view.findViewById(0x7f0d02a9));
        nightPrecipitation = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d02a7));
        nightWindSpeed = (TextView)Preconditions.checkNotNull((TextView)view.findViewById(0x7f0d02a6));
    }
}
