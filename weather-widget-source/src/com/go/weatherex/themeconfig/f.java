// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themeconfig;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// Referenced classes of package com.go.weatherex.themeconfig:
//            e

class f extends FragmentPagerAdapter
{

    final e a;

    public f(e e1, FragmentManager fragmentmanager)
    {
        a = e1;
        super(fragmentmanager);
    }

    public int getCount()
    {
        return e.a(a).length;
    }

    public Fragment getItem(int i)
    {
        switch (e.a(a)[i])
        {
        default:
            return e.b(a);

        case 1: // '\001'
            return e.b(a);

        case 2: // '\002'
            return e.c(a);
        }
    }
}
