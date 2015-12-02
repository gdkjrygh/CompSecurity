// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            MediaView

class a_0
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    final MediaView.MediaViewPager a;
    final MediaView b;

    a_0(MediaView.MediaViewPager mediaviewpager, MediaView mediaview)
    {
        a = mediaviewpager;
        b = mediaview;
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
        MediaView.h(a.g, i);
    }
}
