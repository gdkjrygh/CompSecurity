// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.weather.Weather.feed.Module;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.ModuleConfig;

// Referenced classes of package com.weather.Weather.hurricane.modules:
//            SafetyModuleLocalyticsHandler

public class SafetyModule extends Module
{

    ConfigurationManagers configurationManagers;
    private android.view.ViewGroup.LayoutParams layoutParams;
    private final SafetyModuleLocalyticsHandler localyticsModuleHandler;
    private View moduleView;
    private View redCrossLayout;
    private View safetyAndPreparednessLayout;
    String stormId;

    public SafetyModule(Context context, ModuleConfig moduleconfig, Handler handler, SafetyModuleLocalyticsHandler safetymodulelocalyticshandler)
    {
        super(context, moduleconfig, handler, safetymodulelocalyticshandler);
        localyticsModuleHandler = safetymodulelocalyticshandler;
    }

    private void hide()
    {
        moduleView.setOnClickListener(null);
        if (isHideable)
        {
            moduleView.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            return;
        } else
        {
            moduleView.setLayoutParams(layoutParams);
            return;
        }
    }

    private void show()
    {
        moduleView.setLayoutParams(layoutParams);
        redCrossLayout.setOnClickListener(new _cls1());
        safetyAndPreparednessLayout.setOnClickListener(new _cls2());
        visible = true;
    }

    protected View createView(ViewGroup viewgroup)
    {
        moduleView = LayoutInflater.from(context).inflate(0x7f030089, viewgroup, false);
        layoutParams = moduleView.getLayoutParams();
        redCrossLayout = moduleView.findViewById(0x7f0d0237);
        safetyAndPreparednessLayout = moduleView.findViewById(0x7f0d0234);
        return moduleView;
    }

    public void resume()
    {
        super.resume();
        boolean flag;
        if (!isHideable || stormId != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setActive(flag);
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((Void)obj);
    }

    protected void updateUi(Void void1)
    {
        boolean flag;
        if (stormId == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            hide();
            return;
        } else
        {
            show();
            return;
        }
    }




    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
