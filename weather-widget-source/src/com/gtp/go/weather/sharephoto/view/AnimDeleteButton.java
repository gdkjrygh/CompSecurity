// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.a.c.a;

// Referenced classes of package com.gtp.go.weather.sharephoto.view:
//            a

public class AnimDeleteButton extends FrameLayout
    implements android.view.animation.Animation.AnimationListener
{

    private Drawable a;
    private Drawable b;
    private TextView c;
    private com.gtp.go.weather.sharephoto.view.a d;
    private boolean e;
    private boolean f;
    private float g;
    private float h;
    private float i;
    private Rect j;
    private Resources k;

    public AnimDeleteButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = 255F;
        j = new Rect();
        a(context);
    }

    public AnimDeleteButton(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        g = 255F;
        j = new Rect();
        a(context);
    }

    private float a(float f1, float f2, float f3)
    {
        if (f3 <= f1)
        {
            return 0.0F;
        }
        if (f3 >= f2)
        {
            return 1.0F;
        } else
        {
            return (f3 - f1) / (f2 - f1);
        }
    }

    private void a(Context context)
    {
        k = context.getResources();
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            c.setTextColor(0xff00a0e9);
            b = f();
            return;
        } else
        {
            c.setTextColor(-1);
            b = g();
            return;
        }
    }

    private void h()
    {
        a = e();
        b = g();
        c = (TextView)findViewById(0x7f0904a9);
        c.setVisibility(4);
        c.setText(d());
        d = new com.gtp.go.weather.sharephoto.view.a(this);
        d.setAnimationListener(this);
        d.setFillAfter(true);
        d.setDuration(500L);
    }

    public void a()
    {
        if (!f)
        {
            f = true;
            e = true;
            c.setVisibility(0);
            startAnimation(d);
        }
    }

    public void a(float f1)
    {
        int l = c.getWidth() - a.getIntrinsicWidth();
        if (e)
        {
            h = -180F * f1;
            i = (float)(-l) * f1;
            g = a(0.5F, 1.0F, f1) * 255F;
        } else
        {
            h = 180F * f1 + 180F;
            float f2 = -l;
            i = (float)l * f1 + f2;
            g = a(0.0F, 0.5F, f1) * 255F;
        }
        invalidate();
    }

    public void b()
    {
        f = true;
        e = false;
        startAnimation(d);
    }

    public boolean c()
    {
        return e;
    }

    protected String d()
    {
        return k.getString(0x7f0804be);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        int l = (int)(255F - g);
        Rect rect = a.getBounds();
        int i1 = (int)((float)rect.left + i);
        b.setBounds(i1, rect.top, rect.right, rect.bottom);
        b.draw(canvas);
        i1 = canvas.save();
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (e)
        {
            com.a.c.a.a(c, g);
        } else
        {
            com.a.c.a.a(c, l);
        }
        rect = a.getBounds();
        j1 = rect.left;
        k1 = rect.width() / 2;
        l1 = rect.top;
        i2 = rect.height() / 2;
        j2 = canvas.save();
        canvas.rotate(h, (float)(j1 + k1) + i, i2 + l1);
        canvas.translate(i, 0.0F);
        if (e)
        {
            a.setAlpha(l);
        } else
        {
            a.setAlpha((int)g);
        }
        a.draw(canvas);
        canvas.restoreToCount(j2);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(i1);
    }

    protected Drawable e()
    {
        return k.getDrawable(0x7f0203d6);
    }

    protected Drawable f()
    {
        return k.getDrawable(0x7f0203d7);
    }

    protected Drawable g()
    {
        return k.getDrawable(0x7f0203d7);
    }

    public void onAnimationEnd(Animation animation)
    {
        f = false;
        if (!e)
        {
            c.setVisibility(4);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        h();
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        super.onLayout(flag, l, i1, j1, k1);
        l = getWidth() - a.getIntrinsicWidth() - getPaddingRight();
        i1 = c.getTop();
        j.set(l, i1, a.getIntrinsicWidth() + l, a.getIntrinsicHeight() + i1);
        a.setBounds(j);
        b.setBounds(j);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 46
    //                   1 61
    //                   2 40
    //                   3 61;
           goto _L1 _L2 _L3 _L1 _L3
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        if (e)
        {
            a(true);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (e)
        {
            a(false);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
