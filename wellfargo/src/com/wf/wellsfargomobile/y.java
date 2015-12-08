// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.app.Activity;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile:
//            MainActivity

class y extends ActionBarDrawerToggle
{

    final MainActivity a;

    y(MainActivity mainactivity, Activity activity, DrawerLayout drawerlayout, int i, int j, int k)
    {
        a = mainactivity;
        super(activity, drawerlayout, i, j, k);
    }

    public void onDrawerClosed(View view)
    {
        MainActivity.a(a, false);
    }

    public void onDrawerOpened(View view)
    {
        MainActivity.a(a, true);
    }
}
