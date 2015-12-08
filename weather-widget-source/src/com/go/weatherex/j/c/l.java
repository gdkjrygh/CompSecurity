// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.c;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import android.widget.RemoteViews;

public class l extends AppWidgetHostView
{

    Context a;
    Context b;
    int c;
    View d;
    int e;
    int f;
    long g;
    Paint h;

    public l(Context context)
    {
        super(context);
        e = 0;
        f = -1;
        g = -1L;
        h = new Paint();
        a();
    }

    private Context a(RemoteViews remoteviews)
    {
        remoteviews = remoteviews.getPackage();
        if (remoteviews == null)
        {
            return a;
        }
        Context context;
        try
        {
            context = a.createPackageContext(remoteviews, 4);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.e("GoWidgetHostView", (new StringBuilder()).append("Package name ").append(remoteviews).append(" not found").toString());
            return a;
        }
        return context;
    }

    private void a()
    {
        a = getContext();
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        return super.drawChild(canvas, view, l1);
    }

    public int getAppWidgetId()
    {
        return c;
    }

    protected View getDefaultView()
    {
        View view = null;
        if (true)
        {
            view = getErrorView();
        }
        return view;
    }

    protected void prepareView(View view)
    {
        android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        }
        layoutparams.gravity = 17;
        view.setLayoutParams(layoutparams);
    }

    public void updateAppWidget(RemoteViews remoteviews)
    {
        Object obj;
        Object obj1;
        boolean flag;
        int i;
        obj1 = null;
        obj = null;
        flag = false;
        i = 0;
        if (remoteviews != null) goto _L2; else goto _L1
_L1:
        if (e != 3) goto _L4; else goto _L3
_L3:
        return;
_L4:
        remoteviews = getDefaultView();
        f = -1;
        e = 3;
        flag = i;
_L7:
        obj1 = remoteviews;
        if (remoteviews != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (e == 2) goto _L3; else goto _L5
_L5:
        Log.w("GoWidgetHostView", "updateAppWidget couldn't find any view, using error view", ((Throwable) (obj)));
        obj1 = getErrorView();
        e = 2;
        if (!flag)
        {
            prepareView(((View) (obj1)));
            addView(((View) (obj1)));
        }
        if (d == obj1) goto _L3; else goto _L6
_L6:
        removeView(d);
        d = ((View) (obj1));
        return;
_L2:
        b = a(remoteviews);
        i = remoteviews.getLayoutId();
        if (false || i != f)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        Object obj2;
        remoteviews.reapply(a, d);
        obj2 = d;
        flag = true;
        obj = null;
        obj1 = obj2;
_L9:
        Object obj3;
        obj2 = obj;
        obj3 = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        obj3 = remoteviews.apply(a, this);
        obj2 = obj;
_L8:
        f = i;
        e = 1;
        remoteviews = ((RemoteViews) (obj3));
        obj = obj2;
          goto _L7
        obj2;
        obj3 = obj1;
          goto _L8
        obj;
          goto _L9
        obj = null;
          goto _L9
    }
}
