// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import com.whatsapp.a1g;

// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker

class u extends ShapeDrawable
{

    final GalleryPicker a;

    u(GalleryPicker gallerypicker)
    {
        a = gallerypicker;
        super();
    }

    public void draw(Canvas canvas)
    {
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
        return 0;
    }
}
