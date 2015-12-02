// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;

// Referenced classes of package com.whatsapp:
//            ContactPicker

class alj
    implements com.actionbarsherlock.app.ActionBar.TabListener
{

    private int a;
    final ContactPicker b;

    public alj(ContactPicker contactpicker, int i)
    {
        b = contactpicker;
        super();
        a = i;
    }

    public void onTabReselected(com.actionbarsherlock.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
    }

    public void onTabSelected(com.actionbarsherlock.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
        if (ContactPicker.f(b) != null)
        {
            ContactPicker.f(b).setCurrentItem(a);
        }
    }

    public void onTabUnselected(com.actionbarsherlock.app.ActionBar.Tab tab, FragmentTransaction fragmenttransaction)
    {
    }
}
