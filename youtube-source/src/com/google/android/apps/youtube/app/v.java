// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.PeriodicSync;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugOfflineResyncActivity

final class v extends BaseAdapter
{

    final DebugOfflineResyncActivity a;
    private final List b = new ArrayList();

    public v(DebugOfflineResyncActivity debugofflineresyncactivity)
    {
        a = debugofflineresyncactivity;
        super();
    }

    public final void a()
    {
        b.clear();
        notifyDataSetChanged();
    }

    public final void a(List list)
    {
        b.addAll(list);
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return b.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (PeriodicSync)b.get(i);
        viewgroup = new TextView(a);
        viewgroup.setText(view.toString());
        return viewgroup;
    }
}
