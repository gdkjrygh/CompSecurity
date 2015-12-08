// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.compat.SupportActionBar;
import com.google.android.apps.youtube.app.compat.j;
import com.google.android.apps.youtube.app.compat.q;
import com.google.android.apps.youtube.app.fragments.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.fragments.navigation.d;
import com.google.android.apps.youtube.app.honeycomb.ui.ActionBarMenuHelper;

public abstract class PaneFragment extends Fragment
{

    protected WatchWhileActivity c;

    public PaneFragment()
    {
    }

    public static boolean I()
    {
        return true;
    }

    public static boolean J()
    {
        return false;
    }

    public static boolean K()
    {
        return false;
    }

    public static void b(SupportActionBar supportactionbar)
    {
        supportactionbar.a(false);
    }

    public PaneDescriptor E()
    {
        return d.a(this);
    }

    protected final void F()
    {
        if (c.s())
        {
            a(c.K());
        }
    }

    public final YouTubeApplication G()
    {
        return (YouTubeApplication)c.getApplication();
    }

    public final ax H()
    {
        return G().d();
    }

    public CharSequence a()
    {
        return null;
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        c = (WatchWhileActivity)activity;
    }

    public void a(SupportActionBar supportactionbar)
    {
        supportactionbar = a();
        if (TextUtils.isEmpty(supportactionbar))
        {
            c.L();
            return;
        } else
        {
            c.a(supportactionbar);
            return;
        }
    }

    public void a(j j)
    {
        j = b();
        ActionBarMenuHelper actionbarmenuhelper = c.O();
        if (j == null)
        {
            j = c.d();
        }
        actionbarmenuhelper.a(j);
    }

    public boolean a(q q)
    {
        return false;
    }

    public String b()
    {
        return null;
    }

    public void b(j j)
    {
    }

    public void r()
    {
        super.r();
        c.O().a(com.google.android.apps.youtube.app.honeycomb.ui.ActionBarMenuHelper.SearchMode.ICONIFIED);
        if (c.s())
        {
            a(c.K());
        }
        c.b();
        c.n();
    }

    public void s()
    {
        super.s();
        c.O().d();
        c.K().a(false);
    }
}
