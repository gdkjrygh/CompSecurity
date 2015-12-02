// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;

// Referenced classes of package com.whatsapp:
//            a1g, MediaView

class jh extends ShapeDrawable
{

    final MediaView a;

    jh(MediaView mediaview)
    {
        a = mediaview;
        super();
    }

    public void draw(Canvas canvas)
    {
    }

    public int getIntrinsicHeight()
    {
        return (int)(a1g.a().g * 16F);
    }

    public int getIntrinsicWidth()
    {
        return (int)(a1g.a().g * 16F);
    }

    public int getOpacity()
    {
        return 0;
    }
}
