// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp:
//            v4, np, App

public class ThumbnailButton extends ImageView
{

    private static int d;
    int a;
    boolean b;
    int c;
    final RectF e;
    Paint f;
    float g;
    float h;
    float i;
    final Rect j;

    public ThumbnailButton(Context context)
    {
        super(context);
        i = 0.0F;
        c = d;
        e = new RectF();
        j = new Rect();
        a(context, null);
    }

    public ThumbnailButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = 0.0F;
        c = d;
        e = new RectF();
        j = new Rect();
        a(context, attributeset);
    }

    public ThumbnailButton(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        i = 0.0F;
        c = d;
        e = new RectF();
        j = new Rect();
        a(context, attributeset);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        setBackgroundDrawable(new v4(null));
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, np.ThumbnailButton);
            i = context.getDimension(1, i);
            h = context.getFloat(4, h);
            c = context.getInteger(0, c);
            g = context.getDimension(2, g);
            a = context.getInteger(3, a);
            b = context.getBoolean(5, b);
            context.recycle();
        }
        f = new Paint();
        f.setAntiAlias(true);
        f.setDither(true);
        f.setFilterBitmap(true);
        f.setColor(-1);
    }

    protected void a(Canvas canvas)
    {
        int i1 = App.am;
        if (getDrawable() == null) goto _L2; else goto _L1
_L1:
        Bitmap bitmap;
label0:
        {
            bitmap = ((BitmapDrawable)getDrawable()).getBitmap();
            int k = bitmap.getWidth();
            int j1 = bitmap.getHeight();
            if (getScaleType() == android.widget.ImageView.ScaleType.FIT_CENTER)
            {
                j.set(0, 0, k, j1);
                if ((float)(k / j1) > e.width() / e.height())
                {
                    float f1 = (e.width() * (float)j1) / (float)k;
                    float f3 = (e.top + e.bottom) / 2.0F;
                    e.top = f3 - f1 / 2.0F;
                    e.bottom = f1 + e.top;
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                float f2 = (e.height() * (float)k) / (float)j1;
                float f4 = (e.left + e.right) / 2.0F;
                e.left = f4 - f2 / 2.0F;
                e.right = f2 + e.left;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            int k1 = (k - j1) / 2;
            if (k1 > 0)
            {
                j.set(k1, 0, k - k1, j1);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            j.set(0, -k1, k, j1 + k1);
        }
        if (i == 0.0F) goto _L4; else goto _L3
_L3:
        int l;
label1:
        {
            l = canvas.saveLayer(e, null, 31);
            f.setColor(-1);
            f.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawARGB(0, 0, 0, 0);
            if (i >= 0.0F)
            {
                canvas.drawRoundRect(e, i, i, f);
                if (i1 == 0)
                {
                    break label1;
                }
            }
            canvas.drawArc(e, 0.0F, 360F, true, f);
        }
        f.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
_L6:
        canvas.drawBitmap(bitmap, j, e, f);
        if (i != 0.0F)
        {
            f.setXfermode(null);
            canvas.restoreToCount(l);
        }
_L2:
        return;
_L4:
        l = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void b(Canvas canvas)
    {
label0:
        {
            if (g <= 0.0F || a == 0)
            {
                break label0;
            }
            f.setColor(a);
            f.setStrokeWidth(g);
            f.setStyle(android.graphics.Paint.Style.STROKE);
            if (i >= 0.0F)
            {
                canvas.drawRoundRect(e, i, i, f);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            canvas.drawArc(e, 0.0F, 360F, true, f);
        }
    }

    protected void c(Canvas canvas)
    {
label0:
        {
            if (!isEnabled() || !isSelected() && !isPressed())
            {
                break label0;
            }
            f.setStyle(android.graphics.Paint.Style.FILL);
            f.setColor(c);
            if (i >= 0.0F)
            {
                canvas.drawRoundRect(e, i, i, f);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            canvas.drawArc(e, 0.0F, 360F, true, f);
        }
    }

    public void onDraw(Canvas canvas)
    {
label0:
        {
            e.left = getPaddingLeft();
            e.right = getWidth() - getPaddingLeft();
            e.top = getPaddingTop();
            e.bottom = getHeight() - getPaddingBottom();
            if (b || !(getDrawable() instanceof BitmapDrawable))
            {
                super.onDraw(canvas);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a(canvas);
        }
        b(canvas);
        c(canvas);
    }

    protected void onMeasure(int k, int l)
    {
label0:
        {
            if (h == 1.0F)
            {
                int i1 = getDefaultSize(getSuggestedMinimumWidth(), k);
                setMeasuredDimension(i1, i1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            super.onMeasure(k, l);
        }
    }

    public void setBorderColor(int k)
    {
        a = k;
    }

    public void setBorderSize(float f1)
    {
        g = f1;
    }

    public void setRadius(float f1)
    {
        i = f1;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 19) goto _L2; else goto _L1
_L1:
        char ac[];
        int l;
        int i1;
        ac = "b\036gE7\177\030".toCharArray();
        i1 = ac.length;
        l = 0;
_L10:
        if (i1 > l) goto _L4; else goto _L3
_L3:
        if (!(new String(ac)).intern().equalsIgnoreCase(Build.MANUFACTURER))
        {
            break MISSING_BLOCK_LABEL_134;
        }
_L2:
        int k = 0x660099ff;
_L12:
        d = k;
        return;
_L4:
        char c1 = ac[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 92
    //                   0 110
    //                   1 116
    //                   2 122
    //                   3 128;
           goto _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_128;
_L5:
        k = 66;
_L11:
        ac[l] = (char)(k ^ c1);
        l++;
          goto _L10
_L6:
        k = 17;
          goto _L11
_L7:
        k = 127;
          goto _L11
_L8:
        k = 10;
          goto _L11
        k = 54;
          goto _L11
        k = 0x19000000;
          goto _L12
    }
}
