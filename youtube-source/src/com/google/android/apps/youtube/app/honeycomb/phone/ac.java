// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            ad, ScreenManagementActivity

final class ac extends ArrayAdapter
{

    final ScreenManagementActivity a;
    private final android.view.View.OnClickListener b;

    private ac(ScreenManagementActivity screenmanagementactivity, Context context, int i, int k, android.view.View.OnClickListener onclicklistener)
    {
        a = screenmanagementactivity;
        super(context, i, k);
        b = onclicklistener;
    }

    ac(ScreenManagementActivity screenmanagementactivity, Context context, int i, int k, android.view.View.OnClickListener onclicklistener, byte byte0)
    {
        this(screenmanagementactivity, context, i, k, onclicklistener);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        viewgroup = view.findViewById(j.ef);
        ad ad1 = (ad)getItem(i);
        viewgroup.setTag(ad1.a);
        if (ad1.a.hasDevice())
        {
            viewgroup.setVisibility(4);
            return view;
        } else
        {
            viewgroup.setVisibility(0);
            viewgroup.setOnClickListener(b);
            return view;
        }
    }
}
