// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.whatsapp:
//            al8, HomeActivity

class yd
    implements com.actionbarsherlock.view.MenuItem.OnActionExpandListener
{

    final View a;
    final HomeActivity b;

    yd(HomeActivity homeactivity, View view)
    {
        b = homeactivity;
        a = view;
        super();
    }

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        al8.a(a, "", true);
        b.supportInvalidateOptionsMenu();
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        HomeActivity.a(b).setGroupVisible(1, false);
        HomeActivity.a(b).setGroupVisible(2, false);
        HomeActivity.a(b).setGroupVisible(3, false);
        HomeActivity.a(b).setGroupVisible(4, false);
        return true;
    }
}
