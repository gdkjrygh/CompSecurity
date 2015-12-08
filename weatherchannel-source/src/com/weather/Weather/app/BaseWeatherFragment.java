// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseWeatherFragment extends Fragment
{

    public BaseWeatherFragment()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public abstract void sendDisplayPageBeacon();

    public abstract void setOrientation(Activity activity, boolean flag);

    public void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        if (flag)
        {
            sendDisplayPageBeacon();
        }
    }
}
