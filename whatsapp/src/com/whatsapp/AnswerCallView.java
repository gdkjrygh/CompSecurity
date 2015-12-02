// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

// Referenced classes of package com.whatsapp:
//            App, t2, ps

public class AnswerCallView extends View
{

    private static final int d[] = {
        0, 70, 130
    };
    private static final boolean q;
    private Drawable a;
    private int b;
    private ps c;
    private int e;
    private Path f;
    private float g;
    private Drawable h;
    private Path i;
    private Paint j;
    private float k;
    private t2 l;
    private boolean m;
    private Drawable n;
    private Path o;
    private float p;
    private boolean r;
    private Drawable s;

    public AnswerCallView(Context context)
    {
        this(context, null);
    }

    public AnswerCallView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = new Paint(1);
        f = new Path();
        i = new Path();
        o = new Path();
        e = -1;
        b = -1;
        h = context.getResources().getDrawable(0x7f02051d);
        s = context.getResources().getDrawable(0x7f02051c);
        n = context.getResources().getDrawable(0x7f02051f);
        a = context.getResources().getDrawable(0x7f02051e);
    }

    static float a(AnswerCallView answercallview, float f1)
    {
        answercallview.k = f1;
        return f1;
    }

    private void a(MotionEvent motionevent)
    {
        r = false;
        m = false;
    }

    private void b(MotionEvent motionevent)
    {
        float f1;
label0:
        {
            if (q)
            {
                f1 = motionevent.getX(motionevent.getActionIndex());
                if (App.am == 0)
                {
                    break label0;
                }
            }
            f1 = motionevent.getX();
        }
        g = f1;
        invalidate();
    }

    private void c(MotionEvent motionevent)
    {
        float f1;
label0:
        {
            if (q)
            {
                f1 = motionevent.getX(motionevent.getActionIndex());
                if (App.am == 0)
                {
                    break label0;
                }
            }
            f1 = motionevent.getX();
        }
        if (f1 > 0.0F && f1 < (float)((getHeight() * 5) / 4))
        {
            r = true;
        }
        if (f1 < (float)getWidth() && f1 > (float)(getWidth() - (getHeight() * 5) / 4))
        {
            m = true;
        }
        p = f1;
        g = f1;
    }

    private void d(MotionEvent motionevent)
    {
        float f1;
        int i1;
label0:
        {
            i1 = App.am;
            if (q)
            {
                f1 = motionevent.getX(motionevent.getActionIndex());
                if (i1 == 0)
                {
                    break label0;
                }
            }
            f1 = motionevent.getX();
        }
label1:
        {
            if (r && f1 > (float)(getWidth() / 2))
            {
                if (l == null)
                {
                    break label1;
                }
                l.a();
                if (i1 == 0)
                {
                    break label1;
                }
            }
            if (m && f1 < (float)(getWidth() / 2))
            {
                if (l == null)
                {
                    break label1;
                }
                l.b();
                if (i1 == 0)
                {
                    break label1;
                }
            }
            if (l != null)
            {
                l.a(r);
            }
        }
        r = false;
        m = false;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        c = new ps(this, null);
        c.setDuration(800L);
        c.setRepeatCount(-1);
        c.setInterpolator(new DecelerateInterpolator());
        startAnimation(c);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    public void onDraw(Canvas canvas)
    {
label0:
        {
label1:
            {
                int k1 = 0;
                int j3 = App.am;
                super.onDraw(canvas);
                canvas.drawColor(0xff1d1d1d);
                int i3 = getWidth();
                int l2 = getHeight();
                Drawable drawable;
                int i1;
                int j1;
                int i2;
                int k2;
                int k3;
                if (r)
                {
                    j1 = Math.min((int)(g - p), i3 - l2);
                } else
                {
                    j1 = 0;
                }
                if (m)
                {
                    i1 = Math.min((int)(p - g), i3 - l2);
                } else
                {
                    i1 = 0;
                }
                if (!m && !r)
                {
                    canvas.save();
                    canvas.translate((float)(l2 - l2 / 4) + k * (float)(i3 - (l2 * 5) / 2), 0.0F);
                    do
                    {
                        if (k1 >= d.length)
                        {
                            break;
                        }
                        j.setColor(0xff343434);
                        int j2 = 255 - d[k1];
                        int l1 = j2;
                        if (k > 0.8F)
                        {
                            l1 = (int)((float)(j2 * 5) * (1.0F - k));
                        }
                        j.setAlpha(l1);
                        canvas.drawPath(o, j);
                        canvas.translate((l2 * -2) / 5, 0.0F);
                        k1++;
                    } while (j3 == 0);
                    canvas.restore();
                    j.setAlpha(255);
                }
                if (m)
                {
                    break label0;
                }
                if (e != j1)
                {
                    e = j1;
                    f.rewind();
                    f.moveTo(0.0F, 0.0F);
                    f.lineTo(l2 + j1, 0.0F);
                    f.lineTo(l2 / 4 + l2 + j1, l2 / 2);
                    f.lineTo(l2 + j1, l2);
                    f.lineTo(0.0F, l2);
                    f.lineTo(0.0F, 0.0F);
                    f.close();
                    f.setFillType(android.graphics.Path.FillType.WINDING);
                }
                if (r)
                {
                    j.setColor(0xff6cc95a);
                    drawable = s;
                    if (j3 == 0)
                    {
                        break label1;
                    }
                }
                j.setColor(0xff343434);
                drawable = h;
            }
            j.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawPath(f, j);
            k1 = drawable.getIntrinsicHeight();
            i2 = drawable.getIntrinsicWidth();
            k2 = (l2 - i2) / 2;
            k3 = (l2 - k1) / 2;
            drawable.setBounds(k2 + j1, k3, j1 + (i2 + k2), k1 + k3);
            drawable.draw(canvas);
        }
label2:
        {
label3:
            {
                if (r)
                {
                    break label2;
                }
                if (b != i1)
                {
                    i.rewind();
                    i.moveTo(i3, 0.0F);
                    i.lineTo(i3 - l2 - i1, 0.0F);
                    i.lineTo(i3 - l2 - l2 / 4 - i1, l2 / 2);
                    i.lineTo(i3 - l2 - i1, l2);
                    i.lineTo(i3, l2);
                    i.lineTo(i3, 0.0F);
                    i.close();
                    i.setFillType(android.graphics.Path.FillType.WINDING);
                    b = i1;
                }
                if (m)
                {
                    j.setColor(0xfffe3c2e);
                    drawable = a;
                    if (j3 == 0)
                    {
                        break label3;
                    }
                }
                j.setColor(0xff343434);
                drawable = n;
            }
            j.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawPath(i, j);
            j1 = drawable.getIntrinsicHeight();
            k1 = drawable.getIntrinsicWidth();
            i2 = i3 - (l2 + k1) / 2;
            k2 = (l2 - j1) / 2;
            drawable.setBounds(i2 - i1, k2, (k1 + i2) - i1, j1 + k2);
            drawable.draw(canvas);
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        i1 = getHeight();
        o.rewind();
        o.moveTo(0.0F, 0.0F);
        o.lineTo(i1 / 4, 0.0F);
        o.lineTo(i1 / 2, i1 / 2);
        o.lineTo(i1 / 4, i1);
        o.lineTo(0.0F, i1);
        o.lineTo(i1 / 4, i1 / 2);
        o.close();
        o.setFillType(android.graphics.Path.FillType.WINDING);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int j1;
        boolean flag1;
label0:
        {
            flag1 = false;
            j1 = App.am;
            if (q)
            {
                i1 = motionevent.getActionMasked();
                if (j1 == 0)
                {
                    break label0;
                }
            }
            i1 = motionevent.getAction();
        }
        i1;
        JVM INSTR tableswitch 0 6: default 72
    //                   0 96
    //                   1 119
    //                   2 110
    //                   3 133
    //                   4 72
    //                   5 96
    //                   6 119;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L2 _L3
_L1:
        boolean flag = false;
_L8:
        invalidate();
        if (flag || super.onTouchEvent(motionevent))
        {
            flag1 = true;
        }
        return flag1;
_L2:
        c(motionevent);
        b(motionevent);
        if (j1 == 0) goto _L6; else goto _L4
_L4:
        b(motionevent);
        if (j1 == 0) goto _L6; else goto _L3
_L3:
        b(motionevent);
        d(motionevent);
        if (j1 == 0) goto _L6; else goto _L5
_L5:
        b(motionevent);
        a(motionevent);
        flag = true;
        continue; /* Loop/switch isn't completed */
_L6:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void onVisibilityChanged(View view, int i1)
    {
label0:
        {
            if (getVisibility() == 0)
            {
                if (getAnimation() != null || c == null)
                {
                    break label0;
                }
                startAnimation(c);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            clearAnimation();
        }
    }

    public void setAnswerCallListener(t2 t2_1)
    {
        l = t2_1;
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        q = flag;
    }
}
