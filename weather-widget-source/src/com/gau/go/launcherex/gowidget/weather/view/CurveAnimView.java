// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CurveAnimView extends ImageView
{

    private Drawable a;
    private Drawable b;
    private float c;
    private Rect d;
    private float e;

    public CurveAnimView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0.0F;
        e = 0.0F;
        d = new Rect();
        a(context);
    }

    static float a(CurveAnimView curveanimview)
    {
        return curveanimview.c;
    }

    static float a(CurveAnimView curveanimview, float f)
    {
        curveanimview.c = f;
        return f;
    }

    private void a(float f)
    {
        if (0.0F <= f && f < 0.15F)
        {
            e = 0.0F;
            return;
        }
        if (f < 0.3F)
        {
            e = 0.15F;
            return;
        }
        if ((double)f < 0.5D)
        {
            e = 0.3F;
            return;
        }
        if ((double)f < 0.75D)
        {
            e = 0.5F;
            return;
        }
        if (f < 1.0F)
        {
            e = 0.75F;
            return;
        } else
        {
            e = 1.0F;
            return;
        }
    }

    private void a(Context context)
    {
        context = context.getResources();
        a = context.getDrawable(0x7f020025);
        b = context.getDrawable(0x7f020026);
    }

    static void b(CurveAnimView curveanimview, float f)
    {
        curveanimview.a(f);
    }

    public void a()
    {
        c = 0.0F;
        e = 0.0F;
        clearAnimation();
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        getDrawingRect(d);
        a.setBounds(d);
        b.setBounds(d);
        if (c != 1.0F)
        {
            int i = (int)((float)d.width() * c);
            canvas.save();
            canvas.clipRect(0, d.top, i, d.bottom);
            a.draw(canvas);
            canvas.restore();
            i = (int)((float)d.width() * e);
            canvas.save();
            canvas.clipRect(0, d.top, i, d.bottom);
            b.draw(canvas);
            canvas.restore();
            return;
        } else
        {
            a.draw(canvas);
            b.draw(canvas);
            return;
        }
    }
}
