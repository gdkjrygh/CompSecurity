// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.Context;
import android.graphics.Canvas;
import com.whatsapp.MediaGalleryImageView;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class z extends MediaGalleryImageView
{

    final ImagePreview z;

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (ImagePreview.n(z))
        {
            canvas.drawColor(0x66ff0000);
        }
    }

    protected void onMeasure(int i, int j)
    {
        i = getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(i, i);
    }

    (ImagePreview imagepreview, Context context)
    {
        z = imagepreview;
        super(context);
    }
}
