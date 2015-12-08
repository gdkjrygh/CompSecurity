// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.chat;

import com.google.common.base.Preconditions;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.util.AndroidConstants;
import com.weather.util.TwcPreconditions;

public class ChatOverlayData
{

    private final int logoVisibility;
    private final long pictureTime;
    private final CharSequence userMessage;
    private final int userMessageVisibility;
    private final CurrentWeatherFacade weatherFacade;

    public ChatOverlayData(CharSequence charsequence, int i, long l, CurrentWeatherFacade currentweatherfacade, int j)
    {
        userMessage = (CharSequence)Preconditions.checkNotNull(charsequence);
        pictureTime = l;
        weatherFacade = currentweatherfacade;
        logoVisibility = ((Integer)TwcPreconditions.checkAllowed(Integer.valueOf(j), AndroidConstants.VIEW_VISIBILITIES)).intValue();
        userMessageVisibility = ((Integer)TwcPreconditions.checkAllowed(Integer.valueOf(i), AndroidConstants.VIEW_VISIBILITIES)).intValue();
    }

    public int getLogoVisibility()
    {
        return logoVisibility;
    }

    public long getPictureTime()
    {
        return pictureTime;
    }

    public CharSequence getUserMessage()
    {
        return userMessage;
    }

    public int getUserMessageVisibility()
    {
        return userMessageVisibility;
    }

    public CurrentWeatherFacade getWeatherFacade()
    {
        return weatherFacade;
    }
}
