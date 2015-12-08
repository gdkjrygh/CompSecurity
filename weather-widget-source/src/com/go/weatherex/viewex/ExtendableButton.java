// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.a.a.an;

// Referenced classes of package com.go.weatherex.viewex:
//            a

public class ExtendableButton extends TextView
{

    private Drawable a;
    private Drawable b;
    private boolean c;
    private boolean d;
    private float e;
    private an f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private Rect l;

    public ExtendableButton(Context context)
    {
        super(context);
        e = 1.0F;
        l = new Rect();
        c();
    }

    public ExtendableButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = 1.0F;
        l = new Rect();
        c();
    }

    static float a(ExtendableButton extendablebutton, float f1)
    {
        extendablebutton.e = f1;
        return f1;
    }

    private void c()
    {
        Resources resources = getResources();
        a = resources.getDrawable(0x7f020496);
        b = resources.getDrawable(0x7f02020e);
        f = new an();
        f.a(new float[] {
            0.0F, 1.0F
        });
        f.c(300L);
        f.a(new a(this));
    }

    public boolean a()
    {
        if (c)
        {
            return false;
        } else
        {
            d = true;
            f.a();
            return true;
        }
    }

    public boolean b()
    {
        if (c)
        {
            return false;
        } else
        {
            d = false;
            f.a();
            return true;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        float f1;
        int i1;
        if (d)
        {
            f1 = e;
        } else
        {
            f1 = 1.0F - e;
        }
        j = (int)(255F * f1);
        k = (int)((1.0F - f1) * (float)i);
        b.setAlpha(j);
        b.setBounds(k, 0, g, h);
        b.draw(canvas);
        i1 = canvas.save();
        canvas.translate(k - i, 0.0F);
        a.setAlpha(255 - j);
        a.draw(canvas);
        canvas.restoreToCount(i1);
        getDrawingRect(l);
        i1 = canvas.saveLayerAlpha(l.left - getPaddingLeft(), l.top - getPaddingTop(), l.right + getPaddingRight(), l.bottom + getPaddingBottom(), j, 31);
        super.onDraw(canvas);
        canvas.restoreToCount(i1);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (flag)
        {
            g = k1 - i1;
            h = l1 - j1;
            j1 = a.getIntrinsicWidth();
            i1 = a.getIntrinsicHeight();
            i = g - j1;
            j1 = (h - i1) / 2;
            a.setBounds(i, j1, g, i1 + j1);
        }
    }
}
