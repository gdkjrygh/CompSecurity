// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, afn

class aku
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    final afn a;

    aku(afn afn1)
    {
        a = afn1;
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
label0:
        {
            if (App.aR())
            {
                afn.c(i);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            afn.c(afn.f(a).length - 1 - i);
        }
        afn.a(a, afn.a());
    }
}
