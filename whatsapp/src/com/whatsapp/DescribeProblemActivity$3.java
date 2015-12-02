// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;

// Referenced classes of package com.whatsapp:
//            ThumbnailButton, DescribeProblemActivity

class k extends ThumbnailButton
{

    final DescribeProblemActivity k;

    public void onDraw(Canvas canvas)
    {
        if (!isSelected() && !isPressed())
        {
            canvas.drawColor(getResources().getColor(0x7f090026));
        }
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        setMeasuredDimension(getMeasuredWidth(), (getMeasuredWidth() * 4) / 3);
    }

    (DescribeProblemActivity describeproblemactivity, Context context)
    {
        k = describeproblemactivity;
        super(context);
    }
}
