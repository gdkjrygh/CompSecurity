// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;


// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class a1
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    final ImagePreview a;

    a1(ImagePreview imagepreview)
    {
        a = imagepreview;
        super();
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        ImagePreview.a(a, i);
    }
}
