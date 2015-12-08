// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.youtube.app.ui.presenter.am;
import com.google.android.apps.youtube.uilib.innertube.o;
import com.google.android.apps.youtube.uilib.innertube.p;
import com.google.android.youtube.player.internal.b.d;
import java.util.Collections;
import java.util.Set;

public final class z extends BaseAdapter
    implements p
{

    private am a;
    private o b;

    public z(am am1)
    {
        a = (am)d.a(am1);
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final void a(o o)
    {
        if (b == o)
        {
            return;
        } else
        {
            b = o;
            notifyDataSetChanged();
            return;
        }
    }

    public final int getCount()
    {
        return b != null ? 1 : 0;
    }

    public final Object getItem(int i)
    {
        return b;
    }

    public final long getItemId(int i)
    {
        return 1L;
    }

    public final int getItemViewType(int i)
    {
        return -1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        return a.a(null, b);
    }

    public final int getViewTypeCount()
    {
        return 1;
    }
}
