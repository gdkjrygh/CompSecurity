// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.refresh;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;

// Referenced classes of package com.go.weatherex.home.refresh:
//            a

public class l extends a
{

    private int g[] = {
        0x7f0202e5, 0x7f0202e6, 0x7f0202e7, 0x7f0202e8, 0x7f0202e9, 0x7f0202ea, 0x7f0202eb, 0x7f0202ec, 0x7f0202ed, 0x7f0202ee, 
        0x7f0202ef, 0x7f0202f0, 0x7f0202f1, 0x7f0202f2
    };
    private Drawable h[];
    private Drawable i;
    private Paint j;

    public l(View view)
    {
        super(view);
        h = new Drawable[g.length];
        d();
        e();
        i = h[0];
    }

    private void a(Canvas canvas, float f, float f1, int k)
    {
        i = h[k];
        k = (int)(f - (float)(i.getIntrinsicWidth() / 2));
        int i1 = i.getIntrinsicWidth();
        int j1 = i.getIntrinsicHeight();
        i.setBounds(k, 0, i1 + k, j1 + 0);
        i.draw(canvas);
    }

    private void a(Canvas canvas, float f, float f1, String s)
    {
        if (!TextUtils.isEmpty(this.f))
        {
            canvas.drawText(s, f, f1, j);
        }
    }

    private void c(float f)
    {
        if (f != j.getTextSize())
        {
            j.setTextSize(f);
        }
    }

    private void d()
    {
        j = new Paint(1);
        j.setTextAlign(android.graphics.Paint.Align.CENTER);
        b(15F);
        j.setColor(-1);
        Typeface typeface = Typeface.createFromAsset(a.getResources().getAssets(), "fonts/Roboto-Light.ttf");
        j.setTypeface(typeface);
    }

    private void e()
    {
        Resources resources = a.getResources();
        for (int k = 0; k < g.length; k++)
        {
            h[k] = resources.getDrawable(g[k]);
        }

    }

    public void a(int k, float f)
    {
        Object obj = a.getContext();
        if (obj == null)
        {
            obj = Resources.getSystem();
        } else
        {
            obj = ((Context) (obj)).getResources();
        }
        c(TypedValue.applyDimension(k, f, ((Resources) (obj)).getDisplayMetrics()));
    }

    void a(Canvas canvas)
    {
        int k;
        int i1;
        int j1;
        k = a.getWidth();
        i1 = c();
        k /= 2;
        i1 /= 2;
        int k1 = k - i.getIntrinsicWidth() / 2;
        int j2 = i.getIntrinsicWidth();
        j1 = i.getIntrinsicHeight() + 0;
        i.setBounds(k1, 0, j2 + k1, j1);
        if (!e && d <= 0L) goto _L2; else goto _L1
_L1:
        float f;
        long l2;
        l2 = AnimationUtils.currentAnimationTimeMillis();
        f = (float)((l2 - c) % 1000L) / 10F;
        if (e) goto _L4; else goto _L3
_L3:
        if ((float)(l2 - d) / 1000F < 1.0F) goto _L6; else goto _L5
_L5:
        d = 0L;
_L9:
        return;
_L6:
        a(canvas, k, i1, 13);
        a(canvas, k, (float)j1 + j.getFontSpacing(), this.f);
_L7:
        ViewCompat.postInvalidateOnAnimation(a);
        return;
_L4:
        int l1 = (int)((9F * f) / 100F);
        a(canvas, k, i1, l1 + 5);
        a(canvas, k, (float)j1 + j.getFontSpacing(), this.f);
        if (true) goto _L7; else goto _L2
_L2:
        if (b > 0.0F && (double)b <= 1.0D)
        {
            int i2 = (int)(b * 5F);
            a(canvas, k, i1, i2);
            a(canvas, k, (float)j1 + j.getFontSpacing(), this.f);
            return;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void b(float f)
    {
        a(2, f);
    }
}
