// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;


// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            HourlyTypeView, WeatherTrendView

interface y
{

    public abstract HourlyTypeView getHourlyTypeView();

    public abstract boolean getIfHourSwitchReady();

    public abstract boolean getIfTrendSwitchReady();

    public abstract WeatherTrendView getTrendView();

    public abstract void onHourlyViewHide();

    public abstract void onTrendViewHide();

    public abstract void setHourDisappearStart();

    public abstract void setTrendDisappearStart();
}
