// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.actionbarsherlock.app.ActionBar;

// Referenced classes of package com.whatsapp:
//            ContactPicker

class abx
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    final ContactPicker a;

    abx(ContactPicker contactpicker)
    {
        a = contactpicker;
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
        a.getSupportActionBar().setSelectedNavigationItem(i);
    }
}
