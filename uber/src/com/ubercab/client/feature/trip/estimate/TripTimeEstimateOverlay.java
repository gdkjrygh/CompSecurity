// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.estimate;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class TripTimeEstimateOverlay extends RelativeLayout
{

    public TripTimeEstimateOverlay(Context context)
    {
        this(context, null);
    }

    public TripTimeEstimateOverlay(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TripTimeEstimateOverlay(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setWillNotDraw(false);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Path path = new Path();
        path.addCircle(getWidth() / 2, getHeight() / 2, getWidth() / 4, android.graphics.Path.Direction.CW);
        path.addRect(0.0F, 0.0F, getWidth(), getHeight(), android.graphics.Path.Direction.CW);
        path.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawPath(path, paint);
    }
}
