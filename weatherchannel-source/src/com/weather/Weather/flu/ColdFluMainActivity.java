// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.flu;

import android.os.Bundle;
import android.widget.ListView;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.feed.FeedJumpController;
import com.weather.Weather.feed.ListAutoScroller;
import com.weather.Weather.feed.ModuleListAdapter;
import com.weather.Weather.feed.ModuleVisibilityScrollListener;
import com.weather.Weather.feed.ModulesFactory;
import com.weather.Weather.feed.ModulesManager;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.util.ui.CompositeOnScrollListener;
import dagger.ObjectGraph;

// Referenced classes of package com.weather.Weather.flu:
//            ColdFluInjection

public class ColdFluMainActivity extends TWCBaseActivity
{

    Supplier adConfigSupplier;
    private FeedJumpController feedJumpController;
    LocalyticsHandler localyticsHandler;
    Supplier modulesConfigSupplier;
    ModulesFactory modulesFactory;
    private ListView modulesListView;
    private ModulesManager modulesManager;
    private final ObjectGraph objectGraph = FlagshipApplication.getInstance().getBaseObjectGraph().plus(new Object[] {
        new ColdFluInjection()
    });

    public ColdFluMainActivity()
    {
    }

    private boolean setModules()
    {
        boolean flag = modulesManager.refreshModulesList(feedJumpController.getConfigOverride());
        if (flag)
        {
            ModuleListAdapter modulelistadapter = new ModuleListAdapter(modulesManager.getModules());
            modulesListView.setAdapter(modulelistadapter);
            modulesManager.createAdViews(modulesListView, modulelistadapter);
        }
        return flag;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        objectGraph.inject(this);
        modulesManager = new ModulesManager(this, modulesConfigSupplier, adConfigSupplier, modulesFactory);
        setContentView(0x7f03000d);
        modulesListView = (ListView)findViewById(0x7f0d0028);
        bundle = new ListAutoScroller(modulesListView);
        feedJumpController = new FeedJumpController(modulesManager, bundle, modulesListView);
        ModuleVisibilityScrollListener modulevisibilityscrolllistener = new ModuleVisibilityScrollListener(modulesListView);
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(modulevisibilityscrolllistener);
        bundle.addListener(modulevisibilityscrolllistener);
        modulesListView.setOnScrollListener(new CompositeOnScrollListener(builder.build()));
    }

    public void onPause()
    {
        modulesManager.pauseModules();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        if (!setModules())
        {
            modulesManager.resumeModules();
        }
    }
}
