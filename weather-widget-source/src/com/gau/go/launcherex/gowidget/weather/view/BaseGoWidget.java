// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.framework.GoWidgetFrame;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.d;
import com.go.weatherex.j.c.e;
import com.go.weatherex.j.c.n;
import com.go.weatherex.j.c.p;
import com.go.weatherex.j.c.t;
import com.go.weatherex.j.l;
import com.go.weatherex.j.m;
import com.gtp.a.a.b.c;

public abstract class BaseGoWidget extends GoWidgetFrame
    implements android.view.View.OnLongClickListener, m
{

    protected boolean a;
    protected boolean b;
    protected boolean c;
    protected com.go.weatherex.j.c.l d;
    protected l e;
    protected com.go.weatherex.j.c.d f;
    private d g;

    public BaseGoWidget(Context context)
    {
        super(context);
    }

    public BaseGoWidget(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public BaseGoWidget(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void b()
    {
        g = new d(getContext());
        e = new n(getContext());
        e.a(this);
        f = new com.go.weatherex.j.c.d(getContext(), a());
        d = new com.go.weatherex.j.c.l(getContext());
        d.setOnLongClickListener(this);
    }

    private void c()
    {
        Object obj = t.a(f);
        d.setAppWidget(f.o(), ((android.appwidget.AppWidgetProviderInfo) (obj)));
        obj = new android.widget.FrameLayout.LayoutParams(-2, -2, 17);
        addView(d, ((android.view.ViewGroup.LayoutParams) (obj)));
    }

    protected abstract int a();

    public boolean onApplyTheme(Bundle bundle)
    {
label0:
        {
            c = true;
            bundle = bundle.getString("gowidget_theme");
            com.gtp.a.a.b.c.a("BaseGoWidget", (new StringBuilder()).append("onApplyTheme: ").append(bundle).toString());
            if (a && !TextUtils.isEmpty(bundle))
            {
                if ("com.gau.go.launcherex.gowidget.weatherwidget".equals(bundle) || "app_widget_theme_white".equals(bundle) || "app_widget_theme_black".equals(bundle))
                {
                    bundle = com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.b(getResources());
                } else
                {
                    bundle = com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(getContext(), bundle, getResources());
                }
                if (bundle != null)
                {
                    if (!com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(bundle))
                    {
                        break label0;
                    }
                    com.go.weatherex.i.a.a(getContext(), bundle.x());
                }
            }
            return true;
        }
        g.a(0, bundle);
        return true;
    }

    public void onDelete(int i)
    {
        com.gtp.a.a.b.c.a("BaseGoWidget", "onDelete");
        e.a();
        g.a();
        p.o().m().b(f);
        super.onDelete(i);
    }

    public void onEnter(int i)
    {
        com.gtp.a.a.b.c.a("BaseGoWidget", "onEnter");
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b();
    }

    public void onLeave(int i)
    {
        com.gtp.a.a.b.c.a("BaseGoWidget", "onLeave");
    }

    public boolean onLongClick(View view)
    {
        performLongClick();
        return true;
    }

    public void onPause(int i)
    {
        com.gtp.a.a.b.c.a("BaseGoWidget", "onPause");
    }

    public void onRemove(int i)
    {
        com.gtp.a.a.b.c.a("BaseGoWidget", "onRemove");
        super.onRemove(i);
    }

    public void onResume(int i)
    {
        com.gtp.a.a.b.c.a("BaseGoWidget", "onResume");
    }

    public void onStart(Bundle bundle)
    {
        com.gtp.a.a.b.c.a("BaseGoWidget", (new StringBuilder()).append("onStart").append(Thread.currentThread().getId()).toString());
        a = true;
        if (bundle == null)
        {
            return;
        } else
        {
            b = bundle.getBoolean("gowidget_add_to_screen");
            f.a(bundle.getInt("gowidget_Id"));
            p.o().m().a(f);
            c();
            e.a(f);
            return;
        }
    }

    public void onViewUpdate(boolean flag, RemoteViews remoteviews)
    {
        if (remoteviews == null)
        {
            return;
        }
        if (flag)
        {
            d.updateAppWidget(new RemoteViews("com.gau.go.launcherex.gowidget.weatherwidget", 0x7f030139));
        }
        d.updateAppWidget(remoteviews);
    }
}
