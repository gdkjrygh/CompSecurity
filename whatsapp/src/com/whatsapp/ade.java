// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, PhotoViewPager

class ade
    implements android.support.v4.view.ViewPager.PageTransformer
{

    final PhotoViewPager a;

    ade(PhotoViewPager photoviewpager)
    {
        a = photoviewpager;
        super();
    }

    public void transformPage(View view, float f)
    {
label0:
        {
            if (f < 0.0F || f >= 1.0F)
            {
                view.setTranslationX(0.0F);
                view.setAlpha(1.0F);
                view.setScaleX(1.0F);
                view.setScaleY(1.0F);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            view.setTranslationX(-f * (float)view.getWidth());
            view.setAlpha(Math.max(0.0F, 1.0F - f));
            f = Math.max(0.0F, 1.0F - 0.3F * f);
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }
}
