// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.a1g;

// Referenced classes of package com.whatsapp.util:
//            Log

class h extends Drawable
{

    Paint a;
    Path b;
    String c;

    public h(String s)
    {
        b = new Path();
        c = s;
        a = new Paint();
        a.setColor(0xff000000);
        a.setAntiAlias(true);
        a.setFakeBoldText(true);
        a.setStyle(android.graphics.Paint.Style.FILL);
        a.setTextAlign(android.graphics.Paint.Align.CENTER);
    }

    public void draw(Canvas canvas)
    {
        boolean flag = Log.f;
        Rect rect = getBounds();
        float f = (3F * (float)rect.height()) / 5F;
        a.setTextSize(f);
        a.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawText(c, (rect.left + rect.right) / 2, (float)rect.top + f, a);
        a.setStyle(android.graphics.Paint.Style.STROKE);
        f += f / 6F;
        b.reset();
        b.moveTo(rect.left + 1, rect.bottom - 1);
        b.lineTo(rect.left + 1, rect.top + 1);
        b.lineTo(rect.right, rect.top + 1);
        b.lineTo(rect.right, (float)rect.top + f);
        b.lineTo(rect.left + 1, (float)rect.top + f);
        b.setFillType(android.graphics.Path.FillType.WINDING);
        canvas.drawPath(b, a);
        if (flag)
        {
            DialogToastActivity.g++;
        }
    }

    public int getIntrinsicHeight()
    {
        return (int)(a1g.a().g * 32F);
    }

    public int getIntrinsicWidth()
    {
        return (int)(a1g.a().g * 32F);
    }

    public int getOpacity()
    {
        return -3;
    }

    public void setAlpha(int i)
    {
        a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
    }
}
