// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;

public class MiniCircleImageView extends ImageView
{

    private int mCanvasHeight;
    private int mCanvasWidth;
    private Paint mWhitePaint;

    public MiniCircleImageView(Context context)
    {
        super(context);
        init();
    }

    public MiniCircleImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public MiniCircleImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        mWhitePaint = new Paint(1);
        mWhitePaint.setColor(getResources().getColor(0x106000b));
        mWhitePaint.setStyle(android.graphics.Paint.Style.STROKE);
        float f = TypedValue.applyDimension(1, 2.0F, getResources().getDisplayMetrics());
        mWhitePaint.setStrokeWidth(f);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f = mCanvasWidth / 2;
        float f1 = mCanvasHeight / 2;
        canvas.drawCircle(f, f1, 0.7F * Math.min(f, f1), mWhitePaint);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        mCanvasWidth = i;
        mCanvasHeight = j;
    }
}
