// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.notification.l;

// Referenced classes of package com.whatsapp:
//            HomeActivity

class a83 extends android.support.v4.view.ViewPager.SimpleOnPageChangeListener
{

    final HomeActivity a;

    a83(HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }

    public void onPageSelected(int i)
    {
        super.onPageSelected(i);
        if (HomeActivity.a(a) != null)
        {
            MenuItem menuitem = HomeActivity.a(a).findItem(0x7f0b0019);
            if (menuitem != null && menuitem.isActionViewExpanded())
            {
                menuitem.collapseActionView();
            }
        }
        HomeActivity.a(a, i);
        HomeActivity.b(a);
        a.supportInvalidateOptionsMenu();
        if (HomeActivity.c(a) == 0)
        {
            l.d().c();
        }
    }
}
