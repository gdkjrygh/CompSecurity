// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.whatsapp.DialogToastActivity;

// Referenced classes of package com.whatsapp.qrcode:
//            a, QrCodeActivity

public class QrEducationView extends View
{

    private a a;
    private final float b;
    private long c;
    private Drawable d;
    private final float e;
    private float f;
    private final float g;
    private final float h;
    private final float i;
    private Drawable j;
    private Paint k;
    private Drawable l;
    private final float m;
    private final float n;
    private Drawable o;
    private Drawable p;
    private Drawable q;
    private final float r;
    private int s;

    public QrEducationView(Context context)
    {
        super(context);
        e = 0.14F;
        n = 0.2F;
        m = 0.3F;
        r = 0.35F;
        g = 0.5F;
        h = 0.55F;
        b = 0.6F;
        i = 0.9F;
        k = new Paint();
        a(context);
    }

    public QrEducationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = 0.14F;
        n = 0.2F;
        m = 0.3F;
        r = 0.35F;
        g = 0.5F;
        h = 0.55F;
        b = 0.6F;
        i = 0.9F;
        k = new Paint();
        a(context);
    }

    public QrEducationView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = 0.14F;
        n = 0.2F;
        m = 0.3F;
        r = 0.35F;
        g = 0.5F;
        h = 0.55F;
        b = 0.6F;
        i = 0.9F;
        k = new Paint();
        a(context);
    }

    private static float a(float f1, float f2, float f3)
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

    private static float a(float f1, float f2, float f3, float f4, float f5)
    {
        return (f5 - f4) * a(f1, f2, f3) + f4;
    }

    static float a(QrEducationView qreducationview, float f1)
    {
        qreducationview.f = f1;
        return f1;
    }

    private void a(Context context)
    {
        context = context.getResources();
        o = context.getDrawable(0x7f020083);
        d = context.getDrawable(0x7f020082);
        p = context.getDrawable(0x7f020080);
        l = context.getDrawable(0x7f020081);
        q = context.getDrawable(0x7f02007f);
        j = context.getDrawable(0x7f02007e);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a = new a(this, null);
        a.setDuration(8000L);
        a.setRepeatCount(-1);
        a.setInterpolator(new LinearInterpolator());
        startAnimation(a);
        s = 0;
        c = 0L;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    public void onDraw(Canvas canvas)
    {
        float f2;
        float f3;
        int k3;
        int l3;
        int i4;
        k3 = QrCodeActivity.m;
        l3 = getWidth();
        i4 = getHeight();
        int i1 = Math.min(l3, i4);
        int k1 = (l3 - i1) / 2;
        int i3 = (i4 - i1) / 2;
        canvas.clipRect(k1, i3, k1 + i1, i1 + i3);
        canvas.translate(l3 / 2, i4 / 2);
        if (l.getIntrinsicHeight() + l.getIntrinsicWidth() / 3 > i4)
        {
            float f1 = (float)i4 / (float)(l.getIntrinsicHeight() + l.getIntrinsicWidth() / 3);
            canvas.scale(f1, f1);
        }
        f3 = f;
        f2 = f3;
        if (f3 >= 0.14F) goto _L2; else goto _L1
_L1:
        f2 = (f3 * f3) / 0.14F;
        f3 = f2;
        if (k3 == 0) goto _L3; else goto _L2
_L2:
        f3 = f2;
        if (f2 < 0.2F) goto _L3; else goto _L4
_L4:
        f3 = f2;
        if (f2 >= 0.3F) goto _L3; else goto _L5
_L5:
        float f4 = (float)(Math.sqrt(f2 - 0.2F) * Math.sqrt(0.10000000894069672D)) + 0.2F;
_L21:
        int j1;
        j1 = 255;
        f2 = 1.0F;
        if (f4 >= 0.14F) goto _L7; else goto _L6
_L6:
        int l1;
        l1 = (int)((255F * f4) / 0.14F);
        f2 = 0.86F + f4;
        f3 = f2;
        j1 = l1;
        if (k3 == 0) goto _L9; else goto _L8
_L8:
        j1 = l1;
_L7:
        f3 = f2;
        if (f4 < 0.2F) goto _L9; else goto _L10
_L10:
        j1 = (int)a(0.2F, 0.3F, f4, 255F, 150F);
_L19:
        int i2 = j1;
        if (f4 > 0.9F)
        {
            i2 = (int)a(0.9F, 1.0F, f4, j1, 0.0F);
        }
        f3 = a(0.2F, 0.3F, f4, 0.0F, p.getIntrinsicWidth() / 8);
        p.setAlpha(i2);
        float f5 = ((float)p.getIntrinsicWidth() * f2) / 2.0F;
        f2 = (f2 * (float)p.getIntrinsicHeight()) / 2.0F;
        p.setBounds(-(int)(f5 + f3), -(int)f2, (int)(f5 - f3), (int)f2);
        p.draw(canvas);
        if (f4 < 0.2F) goto _L12; else goto _L11
_L11:
        float f10;
        int j3;
        float f11;
label0:
        {
            float f12;
            float f13;
            float f14;
label1:
            {
                f10 = l.getIntrinsicWidth() / 2;
                float f6 = l.getIntrinsicHeight() / 2;
                f11 = -f10 - a(0.2F, 0.3F, f4, l3 / 2, -f10 / 4F);
                f2 = 0.0F;
                f3 = f2;
                if (f4 > 0.35F)
                {
                    f3 = f2;
                    if (f4 < 0.5F)
                    {
                        f2 = a(0.35F, 0.5F, f4, 0.0F, 3.141593F);
                        double d1 = 0.0F;
                        f3 = (float)((Math.sin(f2) * (double)f10) / 3D + d1);
                    }
                }
                l.setBounds(-(int)f10 - (int)f11, -(int)f6 + (int)f3, (int)f10 - (int)f11, (int)f6 + (int)f3);
                j3 = (int)a(0.9F, 1.0F, f4, 255F, 0.0F);
                l.setAlpha(j3);
                l.draw(canvas);
                j1 = l.getBounds().left;
                int j2 = l.getBounds().right;
                int j4 = (j2 - j1) / 7;
                canvas.clipRect(j1 + j4, l.getBounds().top, j2 - j4, l.getBounds().bottom);
                if (f4 <= 0.2F)
                {
                    break label0;
                }
                f12 = o.getIntrinsicWidth() / 2;
                f13 = o.getIntrinsicHeight() / 2;
                f14 = (-f10 + f10 / 4F) - a(0.2F, 0.3F, f, f10 / 8F, 0.0F);
                f6 = -f10 / 3F;
                f2 = f6;
                if (f4 > 0.35F)
                {
                    f2 = f6;
                    if (f4 < 0.5F)
                    {
                        float f7 = ((float)Math.sin(-a(0.35F, 0.5F, f4, 1.570796F, 3.141593F)) * f10) / 3F;
                        f2 = f7;
                        if (k3 == 0)
                        {
                            break label1;
                        }
                        f2 = f7;
                    }
                }
                if (f4 >= 0.5F)
                {
                    f2 = 0.0F;
                }
            }
            int k2;
label2:
            {
label3:
                {
label4:
                    {
                        o.setBounds(-(int)f12 - (int)f14, -(int)f13 + (int)f2, (int)f12 - (int)f14, (int)f13 + (int)f2);
                        Drawable drawable = d;
                        j1 = -(int)f12;
                        k2 = (int)f14;
                        int k4 = -(int)f13;
                        int i5 = (int)f2;
                        int k5 = (int)f12;
                        int i6 = (int)f14;
                        int k6 = (int)f13;
                        drawable.setBounds(j1 - k2, k4 + i5, k5 - i6, (int)f2 + k6);
                        if (f4 > 0.9F)
                        {
                            j1 = 0;
                            k2 = Math.min(150, j3);
                            if (k3 == 0)
                            {
                                break label2;
                            }
                        }
                        if (f4 > 0.55F)
                        {
                            j1 = 0;
                            k2 = (int)a(0.55F, 0.6F, f4, 255F, 150F);
                            if (k3 == 0)
                            {
                                break label2;
                            }
                        }
                        if (f4 <= 0.2F)
                        {
                            break label3;
                        }
                        if (f4 < 0.35F)
                        {
                            k2 = 0;
                            j1 = (int)a(0.2F, 0.35F, f4, 0.0F, 255F);
                            if (k3 == 0)
                            {
                                break label4;
                            }
                        }
                        k2 = (int)a(0.35F, 0.5F, f4, 0.0F, 255F);
                        j1 = (int)a(0.35F, 0.5F, f4, 255F, 0.0F);
                    }
                    if (k3 == 0)
                    {
                        break label2;
                    }
                }
                j1 = 0;
                k2 = 0;
            }
            o.setAlpha(k2);
            d.setAlpha(j1);
            o.draw(canvas);
            d.draw(canvas);
        }
        f2 = q.getIntrinsicWidth() / 2;
        float f8 = q.getIntrinsicHeight() / 2;
        Drawable drawable1 = q;
        j1 = -(int)f2;
        int l2 = (int)f11;
        int l4 = -(int)f8;
        int j5 = (int)f3;
        int l5 = (int)f2;
        int j6 = (int)f11;
        int l6 = (int)f8;
        drawable1.setBounds(j1 - l2, l4 + j5, l5 - j6, (int)f3 + l6);
        q.setAlpha(j3);
        q.draw(canvas);
        if (f4 <= 0.55F) goto _L12; else goto _L13
_L13:
        float f9;
        f3 = j.getIntrinsicWidth() / 2;
        f9 = j.getIntrinsicHeight() / 2;
        f10 = -f10 + f10 / 4F;
        j1 = 255;
        if (f4 <= 0.9F) goto _L15; else goto _L14
_L14:
        if (k3 == 0) goto _L17; else goto _L16
_L16:
        j1 = j3;
_L15:
        f2 = a(0.55F, 0.6F, f4, 0.0F, 1.0F);
        f2 = 1.0F - (1.0F - f2) * (1.0F - f2);
_L18:
        j.setAlpha(j1);
        j.setBounds(-(int)(f3 * f2) - (int)f10, -(int)(f9 * f2) + (int)0.0F, (int)(f3 * f2) - (int)f10, (int)(f2 * f9) + (int)0.0F);
        j.draw(canvas);
_L12:
        canvas.translate(-l3 / 2, -i4 / 2);
        if (DialogToastActivity.g != 0)
        {
            QrCodeActivity.m = k3 + 1;
        }
        return;
_L17:
        f2 = 1.0F;
        j1 = j3;
        if (true) goto _L18; else goto _L9
_L9:
        f2 = f3;
        if (true) goto _L19; else goto _L3
_L3:
        f4 = f3;
        if (true) goto _L21; else goto _L20
_L20:
    }

    protected void onMeasure(int i1, int j1)
    {
        i1 = Math.min(getDefaultSize(getSuggestedMinimumWidth(), i1), getDefaultSize(getSuggestedMinimumHeight(), j1));
        setMeasuredDimension(i1, i1);
    }

    protected void onVisibilityChanged(View view, int i1)
    {
label0:
        {
            if (getVisibility() == 0)
            {
                if (getAnimation() != null || a == null)
                {
                    break label0;
                }
                startAnimation(a);
                if (QrCodeActivity.m == 0)
                {
                    break label0;
                }
            }
            clearAnimation();
        }
    }
}
