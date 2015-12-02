// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class p
    implements Runnable
{

    final ImagePreview a;

    p(ImagePreview imagepreview)
    {
        a = imagepreview;
        super();
    }

    public void run()
    {
        ImagePreview.c(a).setBackgroundColor(0x75000000);
        if (!ImagePreview.n(a))
        {
            ImagePreview.m(a).setTextColor(0xb2ffffff);
            ImagePreview.a(a).setAlpha(178);
        }
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(300L);
        ImagePreview.c(a).startAnimation(alphaanimation);
    }
}
