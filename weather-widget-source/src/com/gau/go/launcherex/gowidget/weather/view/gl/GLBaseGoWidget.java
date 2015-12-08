// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.framework.GLGoWidgetFrame;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.d;
import com.gau.go.launcherex.gowidget.weather.service.AppWidgetService;
import com.go.gl.view.GLView;
import com.go.gl.view.GLViewWrapper;
import com.go.gowidget.core.WidgetCallback;
import com.go.weatherex.j.c.e;
import com.go.weatherex.j.c.n;
import com.go.weatherex.j.c.p;
import com.go.weatherex.j.c.t;
import com.go.weatherex.j.l;
import com.go.weatherex.j.m;
import com.gtp.a.a.b.c;

public abstract class GLBaseGoWidget extends GLGoWidgetFrame
    implements com.go.gl.view.GLView.OnLongClickListener, m
{

    private d a;
    protected boolean mIsOnAppleThemeCalled;
    protected boolean mIsOnStartCalled;
    protected boolean mIsUserAdd;
    protected l mRemoteViewsManager;
    protected GLViewWrapper mWidgetContainer;
    protected com.go.weatherex.j.c.d mWidgetDataBean;
    protected com.go.weatherex.j.c.l mWidgetHostView;

    public GLBaseGoWidget(Context context)
    {
        super(context);
    }

    public GLBaseGoWidget(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public GLBaseGoWidget(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void a()
    {
        a = new d(getContext());
        mRemoteViewsManager = new n(getContext());
        mRemoteViewsManager.a(this);
        mWidgetDataBean = new com.go.weatherex.j.c.d(getContext(), getWidgetType());
        mWidgetHostView = new com.go.weatherex.j.c.l(getContext());
        mWidgetContainer = new GLViewWrapper(getContext());
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -2, 17);
        addView(mWidgetContainer, layoutparams);
        mWidgetContainer.setOnLongClickListener(this);
    }

    private void b()
    {
        android.appwidget.AppWidgetProviderInfo appwidgetproviderinfo = t.a(mWidgetDataBean);
        mWidgetHostView.setAppWidget(mWidgetDataBean.o(), appwidgetproviderinfo);
        mWidgetContainer.setView(mWidgetHostView, new android.view.ViewGroup.LayoutParams(-2, -2));
    }

    public static void freeGLView(GLView glview)
    {
        if (glview != null)
        {
            glview.cleanup();
        }
    }

    public GLView getContentView()
    {
        return this;
    }

    public int getVersion()
    {
        return 0;
    }

    protected abstract int getWidgetType();

    public boolean onActivate(boolean flag, Bundle bundle)
    {
        c.a("GLBaseGoWidget", "onActivate");
        return false;
    }

    public boolean onApplyTheme(Bundle bundle)
    {
label0:
        {
            mIsOnAppleThemeCalled = true;
            bundle = bundle.getString("gowidget_theme");
            c.a("GLBaseGoWidget", (new StringBuilder()).append("onApplyTheme: ").append(bundle).toString());
            if (mIsOnStartCalled && !TextUtils.isEmpty(bundle))
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
        a.a(0, bundle);
        return true;
    }

    public void onClearMemory()
    {
        c.a("GLBaseGoWidget", "onClearMemory");
    }

    public boolean onDeactivate(boolean flag, Bundle bundle)
    {
        c.a("GLBaseGoWidget", "onDeactivate");
        return false;
    }

    public void onDelete()
    {
        c.a("GLBaseGoWidget", "onDelete");
        mRemoteViewsManager.a();
        a.a();
        p.o().m().b(mWidgetDataBean);
        super.onDelete();
    }

    public void onEnter()
    {
        c.a("GLBaseGoWidget", "onEnter");
        if (!com.go.weatherex.i.a.c(mContext, com/gau/go/launcherex/gowidget/weather/service/AppWidgetService.getName()))
        {
            mContext.startService(new Intent(mContext, com/gau/go/launcherex/gowidget/weather/service/AppWidgetService));
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a();
    }

    public void onLeave()
    {
        c.a("GLBaseGoWidget", "onLeave");
    }

    public boolean onLongClick(GLView glview)
    {
        performLongClick();
        return true;
    }

    public void onRemove()
    {
        c.a("GLBaseGoWidget", "onRemove");
        super.onRemove();
    }

    public void onStart(Bundle bundle)
    {
        c.a("GLBaseGoWidget", (new StringBuilder()).append("onStart").append(Thread.currentThread().getId()).toString());
        mIsOnStartCalled = true;
        if (bundle == null)
        {
            return;
        } else
        {
            mIsUserAdd = bundle.getBoolean("gowidget_add_to_screen");
            mWidgetDataBean.a(bundle.getInt("gowidget_Id"));
            p.o().m().a(mWidgetDataBean);
            b();
            mRemoteViewsManager.a(mWidgetDataBean);
            return;
        }
    }

    public void onStop()
    {
        c.a("GLBaseGoWidget", "onStop");
    }

    public void onViewUpdate(boolean flag, RemoteViews remoteviews)
    {
        if (remoteviews == null)
        {
            return;
        }
        if (flag)
        {
            mWidgetHostView.updateAppWidget(new RemoteViews("com.gau.go.launcherex.gowidget.weatherwidget", 0x7f030139));
        }
        mWidgetHostView.updateAppWidget(remoteviews);
    }

    public void setWidgetCallback(WidgetCallback widgetcallback)
    {
    }
}
