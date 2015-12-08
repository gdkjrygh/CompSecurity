// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

public class WatchInfoPanelFragment extends Fragment
{

    private WatchWhileActivity a;
    private View b;
    private View c;

    public WatchInfoPanelFragment()
    {
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        b = layoutinflater.inflate(l.bJ, viewgroup, false);
        c = b.findViewById(j.aB);
        a.getApplication();
        return b;
    }

    public final void a()
    {
        if (c != null)
        {
            c.setVisibility(0);
        }
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        a = (WatchWhileActivity)activity;
    }

    public final void b()
    {
        if (c != null)
        {
            c.setVisibility(8);
        }
    }
}
