// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp:
//            mx, o, App, as1

public class RangeSeekBar extends ImageView
{

    private static final String C[];
    public static final int s;
    public static final int y;
    private Bitmap A;
    private final double B;
    private final double a;
    private int b;
    private float c;
    private float d;
    private RectF e;
    private boolean f;
    private int g;
    private Bitmap h;
    private final Number i;
    private final Paint j = new Paint(1);
    private Number k;
    private float l;
    private final mx m;
    private double n;
    private boolean o;
    private Bitmap p;
    private float q;
    private final Number r;
    private float t;
    private o u;
    private int v;
    private Bitmap w;
    private as1 x;
    private double z;

    public RangeSeekBar(Number number, Number number1, Number number2, Context context)
    {
        super(context);
        z = 0.0D;
        n = 1.0D;
        u = null;
        o = false;
        g = 255;
        e = new RectF();
        r = number;
        i = number1;
        k = number2;
        B = number.doubleValue();
        a = number1.doubleValue();
        m = mx.fromNumber(number);
        setThumbResources(0x7f020633, 0x7f020633, 0x7f020630, 0x7f020630);
        setFocusable(true);
        setFocusableInTouchMode(true);
        d();
    }

    private double a(float f1)
    {
        int i1 = getWidth();
        if ((float)i1 <= l * 2.0F)
        {
            return 0.0D;
        } else
        {
            return Math.min(1.0D, Math.max(0.0D, (f1 - l) / ((float)i1 - l * 2.0F)));
        }
    }

    private double a(Number number)
    {
        if (0.0D == a - B)
        {
            return 0.0D;
        } else
        {
            return (number.doubleValue() - B) / (a - B);
        }
    }

    private void a(float f1, boolean flag, Canvas canvas)
    {
        if (b > 0)
        {
            j.setColor(y);
            j.setStrokeWidth(t / 2.0F);
            canvas.drawLine(f1, 0.0F, f1, (float)b + 0.5F * ((float)(getHeight() - b) - t), j);
        }
        Bitmap bitmap;
        if (flag)
        {
            bitmap = A;
        } else
        {
            bitmap = w;
        }
        canvas.drawBitmap(bitmap, f1 - (float)(w.getWidth() / 2), b, j);
    }

    private final void a(MotionEvent motionevent)
    {
        int i1 = (motionevent.getAction() & 0xff00) >> 8;
        if (motionevent.getPointerId(i1) == g)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            d = motionevent.getX(i1);
            g = motionevent.getPointerId(i1);
        }
    }

    private boolean a(float f1, double d1)
    {
        return Math.abs(f1 - b(d1)) <= (float)(w.getWidth() / 2);
    }

    private float b(double d1)
    {
        return (float)((double)l + (double)((float)getWidth() - 2.0F * l) * d1);
    }

    private o b(float f1)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        obj = null;
        flag = a(f1, z);
        flag1 = b(f1, n);
        if (!flag || !flag1) goto _L2; else goto _L1
_L1:
        if (f1 / (float)getWidth() <= 0.5F) goto _L4; else goto _L3
_L3:
        o o1 = o.MIN;
_L6:
        return o1;
_L4:
        return o.MAX;
_L2:
        if (flag)
        {
            return o.MIN;
        }
        if (flag1)
        {
            return o.MAX;
        }
        o1 = obj;
        if (f1 > b(z))
        {
            o1 = obj;
            if (f1 < b(n))
            {
                return o.MID;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void b(float f1, boolean flag, Canvas canvas)
    {
        if (b > 0)
        {
            j.setColor(y);
            j.setStrokeWidth(t / 2.0F);
            canvas.drawLine(f1, 0.0F, f1, (float)b + 0.5F * ((float)(getHeight() - b) - t), j);
        }
        Bitmap bitmap;
        if (flag)
        {
            bitmap = h;
        } else
        {
            bitmap = p;
        }
        canvas.drawBitmap(bitmap, f1 - (float)(p.getWidth() / 2), b, j);
    }

    private final void b(MotionEvent motionevent)
    {
        int i1;
label0:
        {
label1:
            {
                byte byte0 = 4;
                int j1 = App.am;
                i1 = motionevent.findPointerIndex(g);
                float f1 = motionevent.getX(i1);
                float f2 = motionevent.getY(i1);
                if (!o.MIN.equals(u))
                {
                    break label0;
                }
                if (f2 > c)
                {
                    double d1 = a(q);
                    double d2 = a(f1);
                    float f3;
                    float f4;
                    if (f2 > c * 2.0F)
                    {
                        i1 = 4;
                    } else
                    {
                        i1 = 2;
                    }
                    d1 = (d1 - d2) / (double)i1;
                    setNormalizedMinValue(z - d1);
                    if (j1 == 0)
                    {
                        break label1;
                    }
                }
                setNormalizedMinValue(a(f1));
            }
            if (a(k) <= 0.0D || n - z <= a(k))
            {
                break MISSING_BLOCK_LABEL_416;
            }
            setNormalizedMaxValue(z + a(k));
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_416;
            }
        }
label2:
        {
label3:
            {
                if (!o.MAX.equals(u))
                {
                    break label2;
                }
                if (f2 > c)
                {
                    d1 = a(q);
                    d2 = a(f1);
                    if (f2 > c * 2.0F)
                    {
                        i1 = byte0;
                    } else
                    {
                        i1 = 2;
                    }
                    d1 = (d1 - d2) / (double)i1;
                    setNormalizedMaxValue(n - d1);
                    if (j1 == 0)
                    {
                        break label3;
                    }
                }
                setNormalizedMaxValue(a(f1));
            }
            if (a(k) <= 0.0D || n - z <= a(k))
            {
                break MISSING_BLOCK_LABEL_416;
            }
            setNormalizedMinValue(n - a(k));
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_416;
            }
        }
        if (o.MID.equals(u))
        {
            f2 = b(z);
            f3 = b(n);
            f4 = q - f1;
            d1 = a(f2 - f4);
            d2 = a(f3 - f4);
            if (a(d1) && d(d2))
            {
                setNormalizedMinValue(d1);
                setNormalizedMaxValue(d2);
            }
        }
        q = f1;
        return;
    }

    private boolean b(float f1, double d1)
    {
        return Math.abs(f1 - b(d1)) <= (float)(p.getWidth() / 2);
    }

    private Number c(double d1)
    {
        return m.toNumber(B + (a - B) * d1);
    }

    private final void d()
    {
        v = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private void e()
    {
        if (getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    public Number a()
    {
        return c(n);
    }

    public boolean a(double d1)
    {
        return z != Math.max(0.0D, Math.min(1.0D, Math.min(d1, n)));
    }

    void b()
    {
        f = false;
    }

    void c()
    {
        f = true;
    }

    public boolean d(double d1)
    {
        return n != Math.max(0.0D, Math.min(1.0D, Math.max(d1, z)));
    }

    public Number f()
    {
        return c(z);
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        super.onDraw(canvas);
        j.setStyle(android.graphics.Paint.Style.FILL);
        j.setColor(s);
        e.set(l, 0.0F, b(z), getHeight());
        canvas.drawRect(e, j);
        e.set(b(n), 0.0F, (float)getWidth() - l, (float)b + ((float)(getHeight() - b) + t) * 0.5F);
        canvas.drawRect(e, j);
        e.set(l, (float)b + ((float)(getHeight() - b) - t) * 0.5F, (float)getWidth() - l, (float)b + ((float)(getHeight() - b) + t) * 0.5F);
        j.setColor(0xff888888);
        j.setAntiAlias(true);
        canvas.drawRect(e, j);
        e.left = b(z);
        e.right = b(n);
        j.setColor(y);
        canvas.drawRect(e, j);
        a(b(z), o.MIN.equals(u), canvas);
        b(b(n), o.MAX.equals(u), canvas);
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        throw canvas;
    }

    protected void onMeasure(int i1, int j1)
    {
        this;
        JVM INSTR monitorenter ;
        if (android.view.View.MeasureSpec.getMode(i1) == 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        i1 = android.view.View.MeasureSpec.getSize(i1);
_L1:
        int l1 = Math.max(w.getHeight(), p.getHeight()) + b;
        int k1 = l1;
        if (android.view.View.MeasureSpec.getMode(j1) != 0)
        {
            k1 = Math.min(l1, android.view.View.MeasureSpec.getSize(j1));
        }
        setMeasuredDimension(i1, k1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
        i1 = 200;
          goto _L1
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (Bundle)parcelable;
        super.onRestoreInstanceState(parcelable.getParcelable(C[3]));
        z = parcelable.getDouble(C[4]);
        n = parcelable.getDouble(C[5]);
    }

    protected Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C[2], super.onSaveInstanceState());
        bundle.putDouble(C[0], z);
        bundle.putDouble(C[1], n);
        return bundle;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        i1 = App.am;
        if (!isEnabled())
        {
            return false;
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 64
    //                   0 66
    //                   1 266
    //                   2 155
    //                   3 389
    //                   4 64
    //                   5 343
    //                   6 376;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return true;
_L2:
        g = motionevent.getPointerId(motionevent.getPointerCount() - 1);
        d = motionevent.getX(motionevent.findPointerIndex(g));
        q = d;
        u = b(d);
        if (u == null)
        {
            return super.onTouchEvent(motionevent);
        }
        setPressed(true);
        invalidate();
        c();
        b(motionevent);
        e();
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        if (u == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!f) goto _L9; else goto _L8
_L8:
        b(motionevent);
        if (i1 == 0) goto _L10; else goto _L9
_L9:
        if (Math.abs(motionevent.getX(motionevent.findPointerIndex(g)) - d) > (float)v)
        {
            setPressed(true);
            invalidate();
            c();
            b(motionevent);
            e();
        }
_L10:
        if (!o || x == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        x.a(this, f(), a(), true);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (!f) goto _L12; else goto _L11
_L11:
        b(motionevent);
        b();
        setPressed(false);
        if (i1 == 0) goto _L13; else goto _L12
_L12:
        c();
        b(motionevent);
        b();
_L13:
        u = null;
        invalidate();
        if (x == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        x.a(this, f(), a(), false);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        int j1 = motionevent.getPointerCount() - 1;
        d = motionevent.getX(j1);
        g = motionevent.getPointerId(j1);
        invalidate();
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L7:
        a(motionevent);
        invalidate();
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        if (f)
        {
            b();
            setPressed(false);
        }
        invalidate();
        if (true) goto _L1; else goto _L14
_L14:
    }

    public void setNormalizedMaxValue(double d1)
    {
        n = Math.max(0.0D, Math.min(1.0D, Math.max(d1, z)));
        invalidate();
    }

    public void setNormalizedMinValue(double d1)
    {
        z = Math.max(0.0D, Math.min(1.0D, Math.min(d1, n)));
        invalidate();
    }

    public void setNotifyWhileDragging(boolean flag)
    {
        o = flag;
    }

    public void setOnRangeSeekBarChangeListener(as1 as1_1)
    {
        x = as1_1;
    }

    public void setSelectedMaxValue(Number number)
    {
label0:
        {
            if (0.0D == a - B)
            {
                setNormalizedMaxValue(1.0D);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            setNormalizedMaxValue(a(number));
        }
    }

    public void setSlowScrubStep(float f1)
    {
        c = f1;
    }

    public void setThumbResources(int i1, int j1, int k1, int l1)
    {
        w = BitmapFactory.decodeResource(getResources(), i1);
        A = BitmapFactory.decodeResource(getResources(), j1);
        p = BitmapFactory.decodeResource(getResources(), k1);
        h = BitmapFactory.decodeResource(getResources(), l1);
        t = 0.15F * (float)w.getHeight();
        l = 0.5F * (float)w.getWidth();
    }

    public void setTopExtension(int i1)
    {
        b = i1;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[6];
        obj = "p>m";
        byte0 = -1;
        i1 = 0;
_L2:
        String as2[];
        int j1;
        int k1;
        as2 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as2[i1] = ((String) (obj));
                obj = "p6{";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as2[i1] = ((String) (obj));
                obj = "n\"s+S";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as2[i1] = ((String) (obj));
                obj = "n\"s+S";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as2[i1] = ((String) (obj));
                obj = "p>m";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as2[i1] = ((String) (obj));
                i1 = 5;
                obj = "p6{";
                byte0 = 4;
                break;

            case 4: // '\004'
                as2[i1] = ((String) (obj));
                C = as;
                y = Color.argb(255, 51, 181, 229);
                s = Color.argb(102, 0, 0, 0);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 244
    //                   0 266
    //                   1 273
    //                   2 280
    //                   3 287;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_287;
_L3:
        byte byte1 = 1;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 61;
          goto _L9
_L5:
        byte1 = 119;
          goto _L9
_L6:
        byte1 = 35;
          goto _L9
        byte1 = 110;
          goto _L9
    }
}
