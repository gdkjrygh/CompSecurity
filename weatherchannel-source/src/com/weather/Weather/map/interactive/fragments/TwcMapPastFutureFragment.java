// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive.fragments;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.weather.beacons.analytics.Analytics;
import com.weather.util.sessionm.SessionMUtils;
import com.wsi.android.framework.ui.utils.ComponentsProvider;
import com.wsi.android.framework.ui.utils.Navigator;
import com.wsi.android.framework.wxdata.utils.tessera.LayerDisplayMode;
import com.wsi.android.weather.ui.MapAppFragment;

public class TwcMapPastFutureFragment extends MapAppFragment
    implements android.view.View.OnClickListener
{
    public static interface TwcPastFutureListener
    {

        public abstract void onFinish(LayerDisplayMode layerdisplaymode);
    }


    public TwcMapPastFutureFragment()
    {
    }

    protected void generateContentLayoutParams()
    {
        layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(2, 0x7f0d0120);
        layoutParams.addRule(12);
        layoutParams.bottomMargin = (int)getResources().getDimension(0x7f0a015c);
    }

    protected int getLayout()
    {
        return 0x7f030042;
    }

    protected String getScreenName()
    {
        return null;
    }

    protected void initializeContent(LayoutInflater layoutinflater, ViewGroup viewgroup, View view)
    {
        super.initializeContent(layoutinflater, viewgroup, view);
        ((Button)view.findViewById(0x7f0d012e)).setOnClickListener(this);
        ((Button)view.findViewById(0x7f0d012f)).setOnClickListener(this);
    }

    public void onClick(View view)
    {
        TwcPastFutureListener twcpastfuturelistener = (TwcPastFutureListener)getActivity();
        componentsProvider.getNavigator().popBackStack();
        int i = view.getId();
        if (i == 0x7f0d012f)
        {
            SessionMUtils.logAction("future_radar");
            Analytics.trackAction(getResources().getString(0x7f0704a1), null);
        } else
        {
            Analytics.trackAction(getResources().getString(0x7f0704a3), null);
        }
        if (i == 0x7f0d012e)
        {
            view = LayerDisplayMode.PAST;
        } else
        {
            view = LayerDisplayMode.FUTURE;
        }
        twcpastfuturelistener.onFinish(view);
    }
}
