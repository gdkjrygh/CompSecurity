// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.Weather.feed.Module;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.ModuleConfig;

public class TropicalOutlookModule extends Module
{

    ConfigurationManagers configurationManagers;
    Picasso picasso;

    public TropicalOutlookModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f0300b0, viewgroup, false);
        View view = viewgroup.findViewById(0x7f0d02c4);
        View view1 = viewgroup.findViewById(0x7f0d02c6);
        ImageView imageview = (ImageView)viewgroup.findViewById(0x7f0d02c5);
        ImageView imageview1 = (ImageView)viewgroup.findViewById(0x7f0d02c7);
        picasso.load(context.getString(0x7f0705b4)).placeholder(0x7f020450).into(imageview);
        picasso.load(context.getString(0x7f0705b7)).placeholder(0x7f020450).into(imageview1);
        view.setOnClickListener(new _cls1());
        view1.setOnClickListener(new _cls2());
        return viewgroup;
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((Void)obj);
    }

    protected void updateUi(Void void1)
    {
    }





    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
