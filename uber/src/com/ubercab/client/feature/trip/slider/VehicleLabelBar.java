// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import gds;
import gdw;
import gee;
import geg;
import hoq;
import java.util.ArrayList;
import java.util.List;

public class VehicleLabelBar extends View
{

    private final Paint a;
    private final Paint b;
    private final Rect c;
    private final Drawable d;
    private final int e;
    private gdw f;
    private List g;

    public VehicleLabelBar(Context context)
    {
        this(context, null);
    }

    public VehicleLabelBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public VehicleLabelBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = getResources().getDrawable(0x7f0201ec);
        d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
        e = getResources().getDimensionPixelSize(0x7f080256);
        i = getResources().getColor(0x7f0d0071);
        int j = getResources().getColor(0x7f0d0070);
        c = new Rect();
        a = new TextPaint(1);
        a.setTextSize(e);
        a.setColor(i);
        a.getTextBounds("W", 0, 1, c);
        context = hoq.a(context, 0x7f07069a);
        a.setTypeface(context);
        b = new Paint(a);
        b.setColor(j);
    }

    private gee a(geg geg1, Canvas canvas, int i, float f1)
    {
        boolean flag1 = geg1.d();
        String s = geg1.b();
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        float f2;
        float f3;
        float f4;
        float f5;
        Paint paint;
        int j;
        int k;
        if (geg1.e())
        {
            paint = a;
        } else
        {
            paint = b;
        }
        j = d.getIntrinsicWidth();
        k = d.getIntrinsicHeight();
        f2 = 0.0F;
        f3 = f1;
        if (flag1)
        {
            f3 = f1 - (float)j;
            f2 = 0.0F + (float)j;
        }
        paint.setTextSize(e);
        do
        {
            f1 = paint.measureText(s);
            f4 = f1 + f2;
            f5 = (float)i - f4 / 2.0F;
            boolean flag;
            if (f5 < 0.0F || f5 > (float)getWidth() - f4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (f1 <= f3 && !flag)
            {
                break;
            }
            f1 = paint.getTextSize() - 0.5F;
            if (f1 <= 0.0F)
            {
                return null;
            }
            paint.setTextSize(f1);
        } while (true);
        f3 = getPaddingTop();
        float f6 = getPaddingBottom();
        f6 = (float)getHeight() - (f6 + f3);
        if (flag1)
        {
            canvas.save();
            float f7 = f6 / 2.0F;
            float f8 = (float)k / 2.0F;
            canvas.translate(Math.round((float)i - f4 / 2.0F), Math.round((f7 + f3) - f8));
            d.draw(canvas);
            canvas.restore();
        }
        i = (int)(f3 + f6 / 2.0F + (float)c.height() / 2.0F);
        canvas.drawText(s, f5 + f2, i, paint);
        return a(geg1.a(), s, paint, (int)(f2 + f5), i, (int)f1, (int)f6 + 1);
    }

    private gee a(String s, String s1, Paint paint, int i, int j, int k, int l)
    {
        Bitmap bitmap = Bitmap.createBitmap(k, l, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        paint = new TextPaint(paint);
        paint.setColor(-1);
        canvas.drawText(s1, 0.0F, l, paint);
        paint = new int[2];
        getLocationOnScreen(paint);
        return new gee(bitmap, s1, s, paint[0] + i, (paint[1] + j) - l);
    }

    final void a(List list)
    {
        g = list;
        int i = gds.a(getContext(), list.size());
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (!isInEditMode())
        {
            ArrayList arraylist = new ArrayList();
            float f1 = getPaddingLeft();
            float f2 = getWidth() - getPaddingLeft() - getPaddingRight();
            int k = g.size();
            float f3 = f2 / (float)k;
            for (int i = 0; i < k; i++)
            {
                Object obj = (geg)g.get(i);
                int j = (int)((f2 / ((float)k - 1.0F)) * (float)i + f1);
                if (k == 1)
                {
                    j = (int)(f2 / 2.0F + f1);
                }
                obj = a(((geg) (obj)), canvas, j, f3);
                if (obj != null)
                {
                    arraylist.add(obj);
                }
            }

            if (f != null)
            {
                f.a(arraylist);
                return;
            }
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = getPaddingLeft();
        int i1 = getPaddingRight();
        int j1 = c.height();
        int k1 = getPaddingTop();
        int l1 = getPaddingBottom();
        setMeasuredDimension(resolveSize(k + l + i1, i), resolveSize(j1 + k1 + l1, j));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (f != null)
        {
            f.a(motionevent);
        }
        return super.onTouchEvent(motionevent);
    }
}
