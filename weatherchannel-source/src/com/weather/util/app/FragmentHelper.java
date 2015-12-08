// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import com.google.common.base.Preconditions;

public final class FragmentHelper
{

    private FragmentHelper()
    {
    }

    public static void switchToNewFragment(FragmentManager fragmentmanager, Fragment fragment)
    {
        Preconditions.checkNotNull(fragment);
        Preconditions.checkNotNull(fragmentmanager);
        fragmentmanager.beginTransaction().replace(0x1020002, fragment).addToBackStack(fragment.getClass().getName()).commit();
    }
}
