// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.a.a.an;
import com.jiubang.core.b.a;

// Referenced classes of package com.go.weatherex.home:
//            ae, af, aa, ab, 
//            ac, ad

public class SidebarIcon extends View
{

    private ae a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private RectF h;
    private Paint i;
    private af j;
    private boolean k;
    private boolean l;
    private float m;
    private SharedPreferences n;
    private an o;
    private boolean p;

    public SidebarIcon(Context context)
    {
        super(context);
        k = false;
        l = false;
        m = 1.05F;
        a(context);
    }

    public SidebarIcon(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        k = false;
        l = false;
        m = 1.05F;
        a(context);
    }

    public SidebarIcon(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = false;
        l = false;
        m = 1.05F;
        a(context);
    }

    private void a(Context context)
    {
        n = (new a(context)).a();
        p = n.getBoolean("key_sidebar_show_tips", false);
        a = new ae(this, null);
        i = new Paint(35);
        i.setTextAlign(android.graphics.Paint.Align.CENTER);
        i.setColor(-1);
        h = new RectF();
        m = m * context.getResources().getDisplayMetrics().density;
        j = new af(this, null);
        j.setStartOffset(1L);
        j.setDuration(450L);
        j.setInterpolator(new AccelerateDecelerateInterpolator());
        o = an.b(new int[] {
            255, 0
        });
        o.b(2);
        o.a(new AccelerateDecelerateInterpolator());
        o.c(1500L);
        o.a(-1);
    }

    static boolean a(SidebarIcon sidebaricon)
    {
        return sidebaricon.l;
    }

    static boolean a(SidebarIcon sidebaricon, boolean flag)
    {
        sidebaricon.k = flag;
        return flag;
    }

    static boolean b(SidebarIcon sidebaricon)
    {
        return sidebaricon.k;
    }

    static boolean b(SidebarIcon sidebaricon, boolean flag)
    {
        sidebaricon.l = flag;
        return flag;
    }

    static ae c(SidebarIcon sidebaricon)
    {
        return sidebaricon.a;
    }

    static Paint d(SidebarIcon sidebaricon)
    {
        return sidebaricon.i;
    }

    public void a()
    {
        if (!j.hasStarted() || j.hasEnded())
        {
            j.setAnimationListener(null);
            clearAnimation();
            k = false;
            if (!l)
            {
                a.d(0.0F);
            } else
            {
                a.d(1.0F);
            }
            startAnimation(j);
            return;
        } else
        {
            j.setAnimationListener(new aa(this));
            return;
        }
    }

    public void b()
    {
        if (!j.hasStarted() || j.hasEnded())
        {
            if (l)
            {
                return;
            } else
            {
                j.setAnimationListener(null);
                clearAnimation();
                k = false;
                a.d(0.0F);
                startAnimation(j);
                return;
            }
        }
        if (l)
        {
            j.setAnimationListener(new ab(this));
            return;
        } else
        {
            j.setAnimationListener(null);
            return;
        }
    }

    public void c()
    {
        if (!j.hasStarted() || j.hasEnded())
        {
            if (!l)
            {
                return;
            } else
            {
                j.setAnimationListener(null);
                clearAnimation();
                k = false;
                a.d(1.0F);
                startAnimation(j);
                return;
            }
        }
        if (!l)
        {
            j.setAnimationListener(new ac(this));
            return;
        } else
        {
            j.setAnimationListener(null);
            return;
        }
    }

    public void d()
    {
        if (p)
        {
            return;
        } else
        {
            o.a();
            o.a(new ad(this));
            return;
        }
    }

    public void e()
    {
        if (p)
        {
            return;
        } else
        {
            o.c();
            i.setAlpha(255);
            invalidate();
            android.content.SharedPreferences.Editor editor = n.edit();
            editor.putBoolean("key_sidebar_show_tips", true);
            editor.commit();
            p = true;
            return;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        if (l)
        {
            i.setAlpha(255);
        }
        float f2 = g + c;
        float f3 = (g - f) + b;
        float f1 = f;
        canvas.save();
        canvas.rotate(a.a(), g + c, g + b);
        float f4 = m + f1 + (f * (float)Math.sqrt(2D) - f1 - m) * (1.0F - a.d());
        float f5 = m;
        h.set(f2 - f4, f3 - f5, f2 + f4, f3 + f5);
        canvas.drawRect(h, i);
        canvas.restore();
        f2 = g + c;
        f3 = g + b;
        canvas.save();
        canvas.rotate(a.b(), g + c, g + b);
        f4 = f * (float)Math.sqrt(2D);
        f5 = m;
        h.set(f2 - f4, f3 - f5, f2 + f4, f3 + f5);
        canvas.drawRect(h, i);
        canvas.restore();
        f2 = g + c;
        f3 = g + f + b;
        canvas.save();
        canvas.rotate(a.c(), g + c, g + b);
        f4 = m;
        f1 = (f * (float)Math.sqrt(2D) - f1 - m) * (1.0F - a.d()) + (f4 + f1);
        f4 = m;
        h.set(f2 - f1, f3 - f4, f2 + f1, f3 + f4);
        canvas.drawRect(h, i);
        canvas.restore();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        b = getPaddingTop();
        c = getPaddingLeft();
        d = getWidth() - getPaddingLeft() - getPaddingRight();
        e = getHeight() - getPaddingTop() - getPaddingBottom();
        f = (Math.min(d, e) * (float)Math.sqrt(2D)) / 4F;
        g = Math.min(d, e) / 2.0F;
    }
}
