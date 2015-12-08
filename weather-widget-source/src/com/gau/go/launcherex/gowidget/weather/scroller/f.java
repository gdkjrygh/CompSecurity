// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.scroller;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public class f
{

    private final int A;
    private final Drawable a;
    private final Drawable b;
    private int c;
    private int d;
    private final int e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private long r;
    private float s;
    private final Interpolator t = new DecelerateInterpolator();
    private int u;
    private float v;
    private final Rect w = new Rect();
    private final int x;
    private final int y;
    private final int z;

    public f(Context context)
    {
        u = 0;
        context = context.getResources();
        a = context.getDrawable(0x7f0203a8);
        b = context.getDrawable(0x7f0203a9);
        PorterDuffColorFilter porterduffcolorfilter = new PorterDuffColorFilter(0xff00d2ff, android.graphics.PorterDuff.Mode.SRC_ATOP);
        b.setColorFilter(porterduffcolorfilter);
        a.setColorFilter(porterduffcolorfilter);
        x = a.getIntrinsicHeight();
        y = b.getIntrinsicHeight();
        z = b.getIntrinsicWidth();
        A = (int)(Math.min((((float)y * 4F * (float)y) / (float)z) * 0.6F, (float)y * 4F) + 0.5F);
        e = (int)(context.getDisplayMetrics().density * 300F + 0.5F);
    }

    private void b()
    {
        float f1;
        float f3;
        f1 = Math.min((float)(AnimationUtils.currentAnimationTimeMillis() - r) / s, 1.0F);
        f3 = t.getInterpolation(f1);
        f = j + (k - j) * f3;
        g = l + (m - l) * f3;
        h = n + (o - n) * f3;
        i = p + (q - p) * f3;
        if (f1 < 0.999F) goto _L2; else goto _L1
_L1:
        u;
        JVM INSTR tableswitch 1 4: default 152
    //                   1 224
    //                   2 153
    //                   3 352
    //                   4 295;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        return;
_L4:
        u = 3;
        r = AnimationUtils.currentAnimationTimeMillis();
        s = 1000F;
        j = f;
        l = g;
        n = h;
        p = i;
        k = 0.0F;
        m = 0.0F;
        o = 0.0F;
        q = 0.0F;
        return;
_L3:
        u = 4;
        r = AnimationUtils.currentAnimationTimeMillis();
        s = 1000F;
        j = f;
        l = g;
        n = h;
        p = i;
        k = 0.0F;
        m = 0.0F;
        o = 0.0F;
        q = 0.0F;
        return;
_L6:
        float f2;
        float f4;
        if (q != 0.0F)
        {
            f2 = 1.0F / (q * q);
        } else
        {
            f2 = 3.402823E+38F;
        }
        f4 = l;
        g = f2 * (f3 * (m - l)) + f4;
        u = 3;
        return;
_L5:
        u = 0;
        return;
    }

    public void a()
    {
        v = 0.0F;
        if (u != 1 && u != 4)
        {
            return;
        } else
        {
            u = 3;
            j = f;
            l = g;
            n = h;
            p = i;
            k = 0.0F;
            m = 0.0F;
            o = 0.0F;
            q = 0.0F;
            r = AnimationUtils.currentAnimationTimeMillis();
            s = 1000F;
            return;
        }
    }

    public void a(float f1)
    {
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        if (u == 4 && (float)(l1 - r) < s)
        {
            return;
        }
        if (u != 1)
        {
            i = 1.0F;
        }
        u = 1;
        r = l1;
        s = 167F;
        v = v + f1;
        float f2 = Math.abs(v);
        float f3 = Math.max(0.6F, Math.min(f2, 1.0F));
        j = f3;
        f = f3;
        f2 = Math.max(0.5F, Math.min(f2 * 7F, 1.0F));
        l = f2;
        g = f2;
        f2 = Math.min(1.0F, h + Math.abs(f1) * 1.1F);
        n = f2;
        h = f2;
        f3 = Math.abs(f1);
        f2 = f3;
        if (f1 > 0.0F)
        {
            f2 = f3;
            if (v < 0.0F)
            {
                f2 = -f3;
            }
        }
        if (v == 0.0F)
        {
            i = 0.0F;
        }
        f1 = Math.min(4F, Math.max(0.0F, f2 * 7F + i));
        p = f1;
        i = f1;
        k = f;
        m = g;
        o = h;
        q = i;
    }

    public void a(int i1)
    {
        u = 2;
        i1 = Math.max(100, Math.abs(i1));
        r = AnimationUtils.currentAnimationTimeMillis();
        s = 0.1F + (float)i1 * 0.03F;
        j = 0.0F;
        l = 0.0F;
        g = 0.0F;
        n = 0.5F;
        p = 0.0F;
        k = Math.max(0, Math.min(i1 * 8, 1));
        m = Math.max(0.5F, Math.min(i1 * 8, 1.0F));
        q = Math.min(0.025F + (float)((i1 / 100) * i1) * 0.00015F, 1.75F);
        o = Math.max(n, Math.min((float)(i1 * 16) * 1E-05F, 1.0F));
    }

    public void a(int i1, int j1)
    {
        c = i1;
        d = j1;
    }

    public boolean a(Canvas canvas)
    {
        boolean flag = false;
        b();
        b.setAlpha((int)(Math.max(0.0F, Math.min(h, 1.0F)) * 255F));
        int i1 = (int)Math.min((((float)y * i * (float)y) / (float)z) * 0.6F, (float)y * 4F);
        int k1;
        if (c < e)
        {
            int j1 = (c - e) / 2;
            b.setBounds(j1, 0, c - j1, i1);
        } else
        {
            b.setBounds(0, 0, c, i1);
        }
        b.draw(canvas);
        a.setAlpha((int)(Math.max(0.0F, Math.min(f, 1.0F)) * 255F));
        k1 = (int)((float)x * g);
        if (c < e)
        {
            int l1 = (c - e) / 2;
            a.setBounds(l1, 0, c - l1, k1);
        } else
        {
            a.setBounds(0, 0, c, k1);
        }
        a.draw(canvas);
        if (u == 3 && i1 == 0 && k1 == 0)
        {
            u = 0;
        }
        if (u != 0)
        {
            flag = true;
        }
        return flag;
    }
}
