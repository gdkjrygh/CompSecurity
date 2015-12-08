// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// Referenced classes of package com.go.weatherex.themestore:
//            w, l

class aa extends FragmentPagerAdapter
{

    final w a;

    public aa(w w1, FragmentManager fragmentmanager)
    {
        a = w1;
        super(fragmentmanager);
    }

    public int getCount()
    {
        return w.c(a).length;
    }

    public Fragment getItem(int i)
    {
        i = w.c(a)[i];
        return l.a(a.getActivity(), w.d(a), i);
    }
}
