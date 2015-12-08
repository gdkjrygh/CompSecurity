// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.core.utils.Typefaces;
import com.google.android.youtube.h;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bu

public class TimeBar extends View
{

    private static final int a[] = {
        0xfefeff62
    };
    private bu b;
    private final DisplayMetrics c;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final Paint g = new Paint();
    private final Paint h = new Paint();
    private final Paint i = new Paint();
    private final Paint j = new Paint(1);
    private final StateListDrawable k;
    private final int l;
    private final int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private String y;
    private final Rect z = new Rect();

    public TimeBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = context.getResources().getDisplayMetrics();
        r = true;
        s = true;
        t = true;
        g.setColor(Color.parseColor("#B2212121"));
        h.setColor(Color.parseColor("#B2777777"));
        float f1 = c.density;
        j.setTypeface(Typefaces.ROBOTO_REGULAR.toTypeface(context));
        j.setShadowLayer(6F, 1.0F, 1.0F, Color.parseColor("#50000000"));
        j.setColor(-1);
        j.setTextSize(f1 * 12F);
        j.setTextAlign(android.graphics.Paint.Align.CENTER);
        j.getTextBounds("0:00:00", 0, 7, z);
        y = a(0L);
        k = (StateListDrawable)getResources().getDrawable(h.aw);
        l = (int)(c.density * 13F);
        m = (int)(c.density * 10F);
        e();
    }

    private String a(long l1)
    {
        byte byte0 = 3;
        if (u < 0x36ee80) goto _L2; else goto _L1
_L1:
        byte0 = 5;
_L4:
        return com.google.android.apps.youtube.common.e.m.a((int)l1 / 1000, byte0);
_L2:
        if (u >= 60000)
        {
            byte0 = 4;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(float f1)
    {
        int i1 = k.getIntrinsicWidth() / 2;
        int j1 = d.right;
        int k1 = d.left;
        o = (int)f1 - i1;
        o = Math.min(j1 - i1, Math.max(k1 - i1, o));
    }

    private void c()
    {
        e.set(d);
        f.set(d);
        int i1;
        if (q)
        {
            i1 = w;
        } else
        {
            i1 = v;
        }
        if (u > 0)
        {
            int j1 = (d.width() * x) / 100;
            e.right = j1 + d.left;
            j1 = (int)(((long)d.width() * (long)v) / (long)u);
            f.right = j1 + d.left;
            o = (int)(((long)d.width() * (long)i1) / (long)u) + (d.left - k.getIntrinsicWidth() / 2);
        } else
        {
            e.right = d.left;
            f.right = d.left;
            o = d.left - k.getIntrinsicWidth() / 2;
        }
        invalidate();
    }

    private void d()
    {
        if (q && !isEnabled())
        {
            h();
            c();
            return;
        }
        StateListDrawable statelistdrawable = k;
        int ai[];
        if (q)
        {
            ai = PRESSED_ENABLED_FOCUSED_STATE_SET;
        } else
        if (isEnabled())
        {
            ai = ENABLED_STATE_SET;
        } else
        {
            ai = a;
        }
        statelistdrawable.setState(ai);
    }

    private void e()
    {
        n = z.width() + m * 2 + k.getIntrinsicWidth() / 2;
    }

    private boolean f()
    {
        return r && u > 0;
    }

    private int g()
    {
        return (int)(((long)((o + k.getIntrinsicWidth() / 2) - d.left) * (long)u) / (long)d.width());
    }

    private void h()
    {
        q = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        d();
        invalidate();
    }

    public final void a()
    {
        setTime(0, 0, 0);
    }

    public final int b()
    {
        return (int)(40F * c.density);
    }

    public void draw(Canvas canvas)
    {
        L.a();
        super.draw(canvas);
        canvas.drawRect(d, g);
        if (t)
        {
            canvas.drawRect(e, h);
        }
        canvas.drawRect(f, i);
        if (s)
        {
            k.setBounds(o, p, o + k.getIntrinsicWidth(), p + k.getIntrinsicHeight());
            k.draw(canvas);
        }
        if (f())
        {
            long l1;
            if (q)
            {
                l1 = w;
            } else
            {
                l1 = v;
            }
            canvas.drawText(a(l1), (n * 3) / 7, getHeight() / 2 + z.height() / 2, j);
            canvas.drawText(y, getWidth() - (n * 3) / 7, getHeight() / 2 + z.height() / 2, j);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = (int)(c.density * 4F);
        if (f() || s)
        {
            k1 = b();
        }
        i1 = getDefaultSize(0, i1);
        k1 = resolveSize(k1, j1);
        setMeasuredDimension(i1, k1);
        if (!f() && !s)
        {
            d.set(0, 0, i1, k1);
        } else
        {
            p = k1 / 2 - k.getIntrinsicHeight() / 2;
            j1 = (int)(c.density * 4F);
            k1 = k1 / 2 - j1 / 2;
            d.set(getPaddingLeft() + n, k1, i1 - getPaddingRight() - n, j1 + k1);
        }
        c();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        if (!isEnabled()) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = (int)motionevent.getX();
        i1 = (int)motionevent.getY();
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 60
    //                   0 66
    //                   1 284
    //                   2 252
    //                   3 284;
           goto _L2 _L3 _L4 _L5 _L4
_L2:
        flag = false;
_L9:
        return flag;
_L3:
        float f1 = j1;
        float f2 = i1;
        i1 = p;
        int k1 = k.getIntrinsicHeight();
        int l1 = d.left;
        int i2 = k.getIntrinsicWidth();
        int j2 = d.right;
        int k2 = k.getIntrinsicWidth();
        if ((float)(l1 - i2) < f1 && f1 < (float)(j2 + k2) && (float)(p - l) < f2 && f2 < (float)(l + (i1 + k1)))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!i1) goto _L2; else goto _L6
_L6:
        q = true;
        getParent().requestDisallowInterceptTouchEvent(true);
        a(j1);
        w = g();
        if (b != null)
        {
            b.a();
        }
        d();
        c();
        invalidate();
        return true;
_L5:
        if (!q) goto _L2; else goto _L7
_L7:
        a(j1);
        w = g();
        c();
        invalidate();
        return true;
_L4:
        if (!q) goto _L2; else goto _L8
_L8:
        h();
        v = w;
        if (b != null)
        {
            b.a(g());
            return true;
        }
          goto _L9
    }

    public void setBufferedPercent(int i1)
    {
        x = i1;
        c();
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        d();
    }

    public void setListener(bu bu1)
    {
        b = bu1;
    }

    public void setProgressColor(int i1)
    {
        i.setColor(i1);
        c();
    }

    public void setScrubberTime(int i1)
    {
        w = i1;
        c();
    }

    public void setScrubbing(boolean flag)
    {
        q = flag;
    }

    public void setShowBuffered(boolean flag)
    {
        t = flag;
        c();
    }

    public void setShowScrubber(boolean flag)
    {
        s = flag;
        if (!flag && q)
        {
            if (b != null)
            {
                b.a(g());
            }
            q = false;
        }
        requestLayout();
    }

    public void setShowTimes(boolean flag)
    {
        r = flag;
        requestLayout();
    }

    public void setTime(int i1, int j1, int k1)
    {
        if (v != i1 || u != j1 || x != k1)
        {
            if (u != j1)
            {
                u = j1;
                y = a(j1);
                j.getTextBounds(y, 0, y.length(), z);
                e();
                d();
            }
            v = i1;
            x = k1;
            c();
        }
    }

}
