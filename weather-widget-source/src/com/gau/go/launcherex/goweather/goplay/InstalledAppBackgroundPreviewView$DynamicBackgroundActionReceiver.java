// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.goweather.livewallpaper.b.h;
import com.gau.go.launcherex.gowidget.scriptengine.parser.DescriptionBean;
import com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.DynamicBgPreviewView;
import com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.DynamicbgDescriptionView;
import com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.d;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.scroller.WeatherDetailScrollGroup;
import com.go.weatherex.themestore.detail.IndicatorView;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            InstalledAppBackgroundPreviewView

public class a extends BroadcastReceiver
{

    final InstalledAppBackgroundPreviewView a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SCREEN_BACKGROUND_PREVIEW_DONE".equals(context))
        {
            InstalledAppBackgroundPreviewView.e(a);
            context = intent.getParcelableArrayListExtra("extra_dynamicbackground_preview");
            if (context != null)
            {
                int j = context.size();
                if (j > 0)
                {
                    InstalledAppBackgroundPreviewView.f(a).b(j);
                    InstalledAppBackgroundPreviewView.f(a).c(0);
                    InstalledAppBackgroundPreviewView.g(a).a(0);
                    for (int i = 0; i < j; i++)
                    {
                        intent = (DescriptionBean)context.get(i);
                        com.gau.go.launcherex.goweather.goplay.InstalledAppBackgroundPreviewView.h(a).a(intent.c(), intent.a());
                    }

                    intent = ((DynamicbgDescriptionView)com.gau.go.launcherex.goweather.goplay.InstalledAppBackgroundPreviewView.h(a).a().getChildAt(0)).c();
                    InstalledAppBackgroundPreviewView.i(a).setText(intent);
                    if (InstalledAppBackgroundPreviewView.j(a) != null)
                    {
                        InstalledAppBackgroundPreviewView.g(a).a(((DescriptionBean)context.get(0)).c(), ((DescriptionBean)context.get(0)).a(), true);
                    }
                }
            }
            InstalledAppBackgroundPreviewView.a(a).setVisibility(0);
        } else
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_DONE".equals(context) || "com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_ALL_SCRIPT_DONE".equals(context))
        {
            InstalledAppBackgroundPreviewView.e(a);
            if (com.gau.go.launcherex.goweather.goplay.InstalledAppBackgroundPreviewView.b(a) != null && !com.gau.go.launcherex.goweather.goplay.InstalledAppBackgroundPreviewView.b(a).u() && h.a(InstalledAppBackgroundPreviewView.c(a).getApplicationContext()))
            {
                Toast.makeText(InstalledAppBackgroundPreviewView.c(a), 0x7f0804c8, 1).show();
                return;
            }
        }
    }

    public (InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        a = installedappbackgroundpreviewview;
        super();
    }
}
