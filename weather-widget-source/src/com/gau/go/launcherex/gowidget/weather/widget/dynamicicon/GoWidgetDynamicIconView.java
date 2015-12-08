// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.gtp.a.a.b.c;
import com.jiubang.core.a.i;
import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon:
//            e, g, h, f

public class GoWidgetDynamicIconView extends View
{

    private e a;
    private f b;

    public GoWidgetDynamicIconView(Context context)
    {
        super(context);
        a();
    }

    public GoWidgetDynamicIconView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    static f a(GoWidgetDynamicIconView gowidgetdynamiciconview)
    {
        return gowidgetdynamiciconview.b;
    }

    private void a()
    {
        a = new e(new WeakReference(this));
    }

    public void a(Bitmap bitmap, boolean flag)
    {
        g g1 = new g(getContext());
        g1.b();
        g1.a(bitmap, flag, getWidth(), getHeight());
        b = g1;
        if (flag)
        {
            a.a();
            return;
        } else
        {
            invalidate();
            return;
        }
    }

    public void a(i i, boolean flag)
    {
        h h1 = new h(getContext());
        h1.a(flag);
        h1.a(i);
        h1.a(this);
        b = h1;
        a.a();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (b != null)
        {
            b.a(canvas, this);
            c.a("LJL", "mWeatherDynamic.drawFrame(canvas, this);");
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (b != null)
        {
            b.a(this);
        }
    }
}
