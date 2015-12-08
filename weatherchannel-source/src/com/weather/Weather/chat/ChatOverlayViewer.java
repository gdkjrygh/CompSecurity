// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.chat;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.Temperature;
import com.weather.commons.ui.WxIconBitmapCache;
import com.weather.commons.ups.ui.WxIconItem;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.device.LocaleUtil;
import java.util.Date;

// Referenced classes of package com.weather.Weather.chat:
//            ChatOverlayData

public class ChatOverlayViewer
{

    private final TextView currentTemp;
    private final TextView currentTempShort;
    private final java.text.DateFormat dateFormat;
    private final TextView locationDateTime;
    private String locationDateTimeFormat;
    private final View logo;
    private final TextView phrase;
    private final TextView pictureDate;
    private final TextView pictureTime;
    private final TextView savedLocationName;
    private final ImageView skyIcon;
    private final java.text.DateFormat timeFormat;
    private final TextView userMessage;

    public ChatOverlayViewer(Context context, View view)
    {
        locationDateTimeFormat = "%s - %s  %s";
        timeFormat = DateFormat.getTimeFormat(context);
        dateFormat = DateFormat.getMediumDateFormat(context);
        locationDateTimeFormat = context.getString(0x7f0704f1);
        if (view == null)
        {
            userMessage = null;
            skyIcon = null;
            currentTemp = null;
            currentTempShort = null;
            phrase = null;
            savedLocationName = null;
            pictureTime = null;
            pictureDate = null;
            logo = null;
            locationDateTime = null;
            return;
        } else
        {
            userMessage = (TextView)view.findViewById(0x7f0d008f);
            skyIcon = (ImageView)view.findViewById(0x7f0d0091);
            currentTemp = (TextView)view.findViewById(0x7f0d0092);
            currentTempShort = (TextView)view.findViewById(0x7f0d0097);
            phrase = (TextView)view.findViewById(0x7f0d0093);
            savedLocationName = (TextView)view.findViewById(0x7f0d009a);
            pictureTime = (TextView)view.findViewById(0x7f0d009d);
            pictureDate = (TextView)view.findViewById(0x7f0d009e);
            logo = view.findViewById(0x7f0d0095);
            locationDateTime = (TextView)view.findViewById(0x7f0d0094);
            return;
        }
    }

    public void setLogoVisibility(int i)
    {
        if (logo != null)
        {
            logo.setVisibility(i);
        }
    }

    public void update(ChatOverlayData chatoverlaydata)
    {
        updateUserMessage(chatoverlaydata.getUserMessage(), chatoverlaydata.getUserMessageVisibility());
        update(chatoverlaydata.getWeatherFacade(), chatoverlaydata.getPictureTime());
        setLogoVisibility(chatoverlaydata.getLogoVisibility());
    }

    public void update(CurrentWeatherFacade currentweatherfacade, long l)
    {
        String s = "";
        Object obj = "";
        if (l != 0L)
        {
            obj = new Date(l);
            s = dateFormat.format(((Date) (obj)));
            obj = timeFormat.format(((Date) (obj)));
        }
        if (pictureTime != null)
        {
            pictureTime.setText(((CharSequence) (obj)));
        }
        if (pictureDate != null)
        {
            pictureDate.setText(s);
        }
        if (currentweatherfacade != null)
        {
            if (locationDateTime != null)
            {
                String s1 = "";
                SavedLocation savedlocation = currentweatherfacade.getSavedLocation();
                if (savedlocation != null)
                {
                    s1 = savedlocation.getNickname().toUpperCase(LocaleUtil.getLocale());
                }
                locationDateTime.setText(String.format(LocaleUtil.getLocale(), locationDateTimeFormat, new Object[] {
                    s1, s, obj
                }));
            }
            if (skyIcon != null)
            {
                skyIcon.setImageBitmap(WxIconBitmapCache.getBitmap((new WxIconItem(Integer.valueOf(currentweatherfacade.getSkyCode()))).getSvgIconId()));
            }
            if (currentTemp != null)
            {
                currentTemp.setText(currentweatherfacade.getCurrentTemp().format());
            }
            if (currentTempShort != null)
            {
                currentTempShort.setText(currentweatherfacade.getCurrentTemp().formatShort());
            }
            if (phrase != null)
            {
                phrase.setText(currentweatherfacade.getPhrase());
            }
            if (savedLocationName != null)
            {
                currentweatherfacade = currentweatherfacade.getSavedLocation();
                if (currentweatherfacade != null)
                {
                    savedLocationName.setText(currentweatherfacade.getNickname());
                }
            }
        }
    }

    public void updateUserMessage(CharSequence charsequence, int i)
    {
        if (userMessage != null)
        {
            userMessage.setText(charsequence);
            userMessage.setVisibility(i);
        }
    }

    public void updateUserMessageVisibility(int i)
    {
        if (userMessage != null)
        {
            userMessage.setVisibility(i);
        }
    }
}
