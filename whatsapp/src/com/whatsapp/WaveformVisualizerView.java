// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            App

public class WaveformVisualizerView extends View
{

    private Rect a;
    private Paint b;
    private float c[];
    private byte d[];

    public WaveformVisualizerView(Context context)
    {
        super(context);
        a = new Rect();
        b = new Paint();
        a();
    }

    private void a()
    {
        d = null;
        b.setStrokeWidth(2.0F);
        b.setStyle(android.graphics.Paint.Style.STROKE);
        b.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        b.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        b.setAntiAlias(true);
        b.setColor(Color.rgb(0, 128, 255));
    }

    public void a(byte abyte0[])
    {
        d = abyte0;
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        int i = 0;
        int j = App.am;
        super.onDraw(canvas);
        if (d == null)
        {
            return;
        }
        if (c == null || c.length < d.length * 4)
        {
            c = new float[d.length * 4];
        }
        a.set(0, 0, getWidth(), getHeight());
        Object obj = a;
        obj.top = ((Rect) (obj)).top + getPaddingTop();
        obj = a;
        obj.bottom = ((Rect) (obj)).bottom - getPaddingBottom();
        obj = a;
        obj.left = ((Rect) (obj)).left + getPaddingLeft();
        obj = a;
        obj.right = ((Rect) (obj)).right - getPaddingRight();
        obj = new Path();
        ((Path) (obj)).moveTo(a.left, a.top + a.height() / 2 + ((byte)(d[0] + 128) * (a.height() / 2)) / 128);
        do
        {
            if (i >= d.length - 1)
            {
                break;
            }
            ((Path) (obj)).lineTo(a.left + (a.width() * i) / (d.length - 1), a.top + a.height() / 2 + ((byte)(d[i] + 128) * (a.height() / 2)) / 128);
            i++;
        } while (j == 0);
        canvas.drawPath(((Path) (obj)), b);
    }
}
