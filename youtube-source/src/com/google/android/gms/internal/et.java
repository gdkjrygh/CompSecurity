// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            ev, ey, hb

public final class et extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{

    private int a;
    private long b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private ey j;
    private Drawable k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;

    public et(Drawable drawable, Drawable drawable1)
    {
        this(null);
        Object obj = drawable;
        if (drawable == null)
        {
            obj = ev.a();
        }
        k = ((Drawable) (obj));
        ((Drawable) (obj)).setCallback(this);
        drawable = j;
        drawable.b = ((ey) (drawable)).b | ((Drawable) (obj)).getChangingConfigurations();
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = ev.a();
        }
        l = drawable;
        drawable.setCallback(this);
        drawable1 = j;
        drawable1.b = ((ey) (drawable1)).b | drawable.getChangingConfigurations();
    }

    et(ey ey1)
    {
        a = 0;
        e = 255;
        g = 0;
        h = true;
        j = new ey(ey1);
    }

    private boolean b()
    {
        if (!m)
        {
            boolean flag;
            if (k.getConstantState() != null && l.getConstantState() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            n = flag;
            m = true;
        }
        return n;
    }

    public final Drawable a()
    {
        return l;
    }

    public final void a(int i1)
    {
        c = 0;
        d = e;
        g = 0;
        f = 250;
        a = 1;
        invalidateSelf();
    }

    public final void draw(Canvas canvas)
    {
        int i1;
        int j1;
        boolean flag;
        j1 = 1;
        i1 = 1;
        flag = false;
        a;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 106
    //                   2 125;
           goto _L1 _L2 _L3
_L1:
        Drawable drawable;
        Drawable drawable1;
        boolean flag1;
        j1 = g;
        flag1 = h;
        drawable = k;
        drawable1 = l;
        if (i1 != 0)
        {
            if (!flag1 || j1 == 0)
            {
                drawable.draw(canvas);
            }
            if (j1 == e)
            {
                drawable1.setAlpha(e);
                drawable1.draw(canvas);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        b = SystemClock.uptimeMillis();
        a = 2;
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L3:
        if (b >= 0L)
        {
            float f1 = (float)(SystemClock.uptimeMillis() - b) / (float)f;
            float f2;
            if (f1 >= 1.0F)
            {
                i1 = j1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                a = 0;
            }
            f1 = Math.min(f1, 1.0F);
            f2 = c;
            g = (int)(f1 * (float)(d - c) + f2);
        }
        continue; /* Loop/switch isn't completed */
        if (flag1)
        {
            drawable.setAlpha(e - j1);
        }
        drawable.draw(canvas);
        if (flag1)
        {
            drawable.setAlpha(e);
        }
        if (j1 > 0)
        {
            drawable1.setAlpha(j1);
            drawable1.draw(canvas);
            drawable1.setAlpha(e);
        }
        invalidateSelf();
        return;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final int getChangingConfigurations()
    {
        return super.getChangingConfigurations() | j.a | j.b;
    }

    public final android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        if (b())
        {
            j.a = getChangingConfigurations();
            return j;
        } else
        {
            return null;
        }
    }

    public final int getIntrinsicHeight()
    {
        return Math.max(k.getIntrinsicHeight(), l.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth()
    {
        return Math.max(k.getIntrinsicWidth(), l.getIntrinsicWidth());
    }

    public final int getOpacity()
    {
        if (!o)
        {
            p = Drawable.resolveOpacity(k.getOpacity(), l.getOpacity());
            o = true;
        }
        return p;
    }

    public final void invalidateDrawable(Drawable drawable)
    {
        if (hb.a())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.invalidateDrawable(this);
            }
        }
    }

    public final Drawable mutate()
    {
        if (!i && super.mutate() == this)
        {
            if (!b())
            {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            k.mutate();
            l.mutate();
            i = true;
        }
        return this;
    }

    protected final void onBoundsChange(Rect rect)
    {
        k.setBounds(rect);
        l.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l1)
    {
        if (hb.a())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.scheduleDrawable(this, runnable, l1);
            }
        }
    }

    public final void setAlpha(int i1)
    {
        if (g == e)
        {
            g = i1;
        }
        e = i1;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        k.setColorFilter(colorfilter);
        l.setColorFilter(colorfilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        if (hb.a())
        {
            drawable = getCallback();
            if (drawable != null)
            {
                drawable.unscheduleDrawable(this, runnable);
            }
        }
    }
}
