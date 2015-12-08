// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.twcpresents;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.feed.Module;
import com.weather.Weather.ui.PageIndicator;
import com.weather.commons.analytics.feed.ClickableLocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;

public class TwcPresentsModule extends Module
    implements android.app.LoaderManager.LoaderCallbacks
{

    private static final int TWC_PRESENTS_LOADER = 3;
    private final ClickableLocalyticsModuleHandler localyticsModuleHandler;
    private TwcPresentsAdapter twcPresentsAdapter;

    public TwcPresentsModule(Context context, ModuleConfig moduleconfig, Handler handler, ClickableLocalyticsModuleHandler clickablelocalyticsmodulehandler)
    {
        super(context, moduleconfig, handler, clickablelocalyticsmodulehandler);
        localyticsModuleHandler = clickablelocalyticsmodulehandler;
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f030078, viewgroup, false);
        ((TextView)viewgroup.findViewById(0x7f0d01d2)).setText("Our Favorite Things");
        ViewPager viewpager = (ViewPager)viewgroup.findViewById(0x7f0d01d3);
    /* block-local class not found */
    class TwcPresentsAdapter {}

        twcPresentsAdapter = new TwcPresentsAdapter(null);
        viewpager.setAdapter(twcPresentsAdapter);
        PageIndicator pageindicator = (PageIndicator)viewgroup.findViewById(0x7f0d01d4);
        pageindicator.setViewPager(viewpager);
        initLoader();
        pageindicator.setOnPageChangeListener(new _cls1());
        return viewgroup;
    }

    protected String getBeaconString()
    {
        return FlagshipApplication.getRootContext().getString(0x7f0704ce);
    }

    protected void initLoader()
    {
        ((Activity)context).getLoaderManager().initLoader(3, null, this);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            return null;

        case 3: // '\003'
            return new CursorLoader(context, com.weather.twcpresents.provider.TwcPresentsContract.TWCPresentsItem.TWC_PRESENTS_CONTENT_URI, new String[] {
                "featTitle", "featDescript", "featImage", "url"
            }, null, null, null);
        }
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        twcPresentsAdapter.swapCursor(cursor);
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        twcPresentsAdapter.swapCursor(null);
    }

    protected void updateUi(Object obj)
    {
    }






    /* member class not found */
    class _cls1 {}

}
