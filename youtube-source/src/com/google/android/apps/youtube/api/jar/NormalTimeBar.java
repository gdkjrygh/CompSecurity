// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.api.b;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            af, ae, ag

public class NormalTimeBar extends View
{

    private final af a;
    private final ae b;
    private final StateListDrawable c = new StateListDrawable();
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final Rect j = new Rect();
    private final Paint k = new Paint();
    private com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style l;
    private boolean m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private int r;
    private String s;
    private String t;

    public NormalTimeBar(Context context, af af1)
    {
        super(context);
        a = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1, "listener cannot be null");
        context = getResources();
        af1 = context.getDisplayMetrics();
        float f1 = ((DisplayMetrics) (af1)).density;
        d = (int)(230F * f1 + 0.5F);
        f = (int)(5F * f1 + 0.5F);
        g = (int)(12F * f1 + 0.5F);
        e = (int)(f1 * 8F + 0.5F);
        b = new ae(context);
        c.addState(View.PRESSED_ENABLED_STATE_SET, context.getDrawable(b.z));
        c.addState(View.ENABLED_STATE_SET, context.getDrawable(b.y));
        c.setState(View.ENABLED_STATE_SET);
        k.setTextSize(TypedValue.applyDimension(2, 14F, af1));
        k.setColor(-1);
        k.setAntiAlias(true);
        k.getTextBounds("00:00", 0, 5, h);
        setStyle(com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style.YOUTUBE);
        setTimes(0, 0, 0);
    }

    private long a(int i1)
    {
        Rect rect = b.getBounds();
        int j1 = rect.left + g;
        int k1 = rect.right - g;
        i1 = Math.min(k1, Math.max(j1, i1));
        return (q * (long)(i1 - j1)) / (long)(k1 - j1);
    }

    private String a(long l1)
    {
        int i1 = (int)l1 / 1000;
        String s2 = String.format("%02d:%02d", new Object[] {
            Integer.valueOf((i1 / 60) % 60), Integer.valueOf(i1 % 60)
        });
        i1 /= 3600;
        String s1 = s2;
        if (q >= 0x36ee80L)
        {
            s1 = String.format("%d:%s", new Object[] {
                Integer.valueOf(i1), s2
            });
        }
        return s1;
    }

    private void a()
    {
        boolean flag;
        if (l.supportsScrubber && isEnabled() && q > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m = flag;
        if (n && !m)
        {
            b();
        }
        c();
    }

    private void a(int i1, int j1)
    {
        String s1;
        int k1;
        if (q >= 0x2255100L)
        {
            s1 = "10:00:00";
        } else
        if (q >= 0x36ee80L)
        {
            s1 = "0:00:00";
        } else
        {
            s1 = "00:00";
        }
        k.getTextBounds(s1, 0, s1.length(), h);
        k1 = b.getIntrinsicHeight();
        if (i1 >= d)
        {
            b.setBounds(h.width() + e, j1 / 2 - k1 / 2, i1 - e - h.width(), (j1 / 2 - k1 / 2) + k1);
            h.offset(0, b.getBounds().centerY() - h.centerY());
        } else
        {
            b.setBounds(e, j1 / 2 - k1 / 2, i1 - e, (j1 / 2 - k1 / 2) + k1);
        }
        b.copyBounds(j);
        j.inset(0, -(j1 - k1) / 2);
    }

    private void b()
    {
        n = false;
        c.setState(ENABLED_STATE_SET);
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(false);
    }

    private void c()
    {
        long l3 = 0L;
        Rect rect = b.getBounds();
        int j1 = g;
        int k1 = rect.width() - g;
        StateListDrawable statelistdrawable;
        int i1;
        int l1;
        int i2;
        int j2;
        int k2;
        long l2;
        if (n)
        {
            l2 = o;
        } else
        {
            l2 = p;
        }
        if (q != 0L)
        {
            l3 = (long)j1 + ((long)(k1 - j1) * l2) / q;
        }
        l1 = (int)l3;
        statelistdrawable = c;
        i1 = rect.left + l1;
        i2 = rect.centerY();
        j2 = statelistdrawable.getIntrinsicWidth();
        k2 = statelistdrawable.getIntrinsicHeight();
        statelistdrawable.setBounds(i1 - j2 / 2, i2 - k2 / 2, (i1 - j2 / 2) + j2, (i2 - k2 / 2) + k2);
        c.copyBounds(i);
        i.inset(-f, -f);
        if (rect.width() > 0)
        {
            i1 = (l1 * 100) / rect.width();
        } else
        {
            i1 = 0;
        }
        if (k1 - j1 > 0)
        {
            j1 = ((l1 - j1) * 100) / (k1 - j1);
        } else
        {
            j1 = 0;
        }
        if (m)
        {
            j1 = i1;
        }
        b.setLevel(j1 + r * 1000);
        s = a(l2);
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        b.draw(canvas);
        if (m)
        {
            c.draw(canvas);
        }
        if (getWidth() >= d)
        {
            k.setTextAlign(android.graphics.Paint.Align.RIGHT);
            canvas.drawText(s, h.right, h.bottom, k);
            k.setTextAlign(android.graphics.Paint.Align.RIGHT);
            canvas.drawText(t, getWidth(), h.bottom, k);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = Math.max(i.height(), j.height());
        k1 = Math.max(h.height(), k1);
        setMeasuredDimension(getDefaultSize(b.getIntrinsicWidth(), i1), getDefaultSize(k1, j1));
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        a(i1, j1);
        c();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 185
    //                   2 153
    //                   3 179;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        if (!n && m)
        {
            int i1 = (int)motionevent.getX();
            int j1 = (int)motionevent.getY();
            boolean flag;
            if (i.contains(i1, j1) || j.contains(i1, j1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                n = true;
                getParent().requestDisallowInterceptTouchEvent(true);
                c.setState(View.PRESSED_ENABLED_STATE_SET);
                o = a((int)motionevent.getX());
                c();
                a.a();
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (n)
        {
            o = a((int)motionevent.getX());
            c();
            return true;
        }
        if (true) goto _L1; else goto _L5
_L5:
        b();
        return true;
_L3:
        if (n)
        {
            b();
            a.a((int)o);
            return true;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        a();
    }

    public void setScrubberTime(int i1)
    {
        o = i1;
        c();
    }

    public void setScrubbing(boolean flag)
    {
        n = flag;
    }

    public void setStyle(com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style style)
    {
        l = style;
        a();
        ae ae1 = b;
        if (style == com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style.AD)
        {
            style = com.google.android.apps.youtube.api.jar.ag.b;
        } else
        {
            style = ag.a;
        }
        ae1.setState(style);
        invalidate();
    }

    public void setTimes(int i1, int j1, int k1)
    {
        long l1 = q;
        p = i1;
        r = k1;
        q = j1;
        if ((long)j1 != l1 || t == null)
        {
            a();
            t = a(j1);
            if ((long)j1 / 0x36ee80L != l1 / 0x36ee80L)
            {
                a(getWidth(), getHeight());
            }
        }
        c();
        invalidate();
    }
}
