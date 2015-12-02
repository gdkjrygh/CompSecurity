// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class a extends ImageView
{

    final ImagePreview a;

    public void onDraw(Canvas canvas)
    {
        if (!isSelected() && !isPressed())
        {
            canvas.drawColor(0xff111111);
        }
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        i = getDefaultSize(getSuggestedMinimumHeight(), j);
        setMeasuredDimension(i, i);
    }

    (ImagePreview imagepreview, Context context)
    {
        a = imagepreview;
        super(context);
    }
}
