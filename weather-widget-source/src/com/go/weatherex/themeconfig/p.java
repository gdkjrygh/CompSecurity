// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themeconfig;

import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.j.c.d;
import com.go.weatherex.j.c.l;
import com.go.weatherex.j.g;
import com.go.weatherex.j.m;

// Referenced classes of package com.go.weatherex.themeconfig:
//            q

public class p extends a
    implements m
{

    protected FrameLayout a;
    protected AppWidgetProviderInfo b;
    protected AppWidgetHostView c;
    protected g d;
    protected q e;
    private int f;
    private int g;

    public p()
    {
        f = 96;
    }

    public void a(AppWidgetProviderInfo appwidgetproviderinfo)
    {
        b = appwidgetproviderinfo;
    }

    public void a(g g1)
    {
        d = g1;
    }

    protected void b(int i, Object obj)
    {
        i;
        JVM INSTR tableswitch 2 2: default 20
    //                   2 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (e != null && obj != null)
        {
            obj = (b)obj;
            e.a(((b) (obj)).x());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        e = new q(getActivity());
        if (d instanceof d)
        {
            c = new l(getActivity());
        } else
        {
            c = new AppWidgetHostView(getActivity());
        }
        c.setAppWidget(d.o(), b);
        g = (int)((float)f * getResources().getDisplayMetrics().density);
        d.j();
        JVM INSTR tableswitch 1 5: default 124
    //                   1 189
    //                   2 221
    //                   3 221
    //                   4 189
    //                   5 221;
           goto _L1 _L2 _L3 _L3 _L2 _L3
_L1:
        bundle = new android.widget.FrameLayout.LayoutParams(-1, g, 17);
        a.addView(c, bundle);
        e.a(this);
        e.a(d);
        return;
_L2:
        a.getLayoutParams().height = getResources().getDimensionPixelSize(0x7f0c00c3);
        g = g * 2;
        continue; /* Loop/switch isn't completed */
_L3:
        a.getLayoutParams().height = getResources().getDimensionPixelSize(0x7f0c00c4);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new int[] {
            2
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03009a, viewgroup, false);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        e.a();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a = (FrameLayout)c(0x7f0903b6);
    }

    public void onViewUpdate(boolean flag, RemoteViews remoteviews)
    {
        if (flag)
        {
            c.updateAppWidget(new RemoteViews("com.gau.go.launcherex.gowidget.weatherwidget", 0x7f030139));
        }
        c.updateAppWidget(remoteviews);
    }
}
