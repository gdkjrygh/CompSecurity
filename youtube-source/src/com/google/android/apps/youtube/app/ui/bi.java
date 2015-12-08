// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.p;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            bk, bj

public final class bi
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemSelectedListener
{

    private static final com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed h[];
    private static final int i[];
    private static final com.google.android.apps.youtube.core.async.GDataRequestFactory.LiveFeed j[];
    private static final int k[];
    protected final Activity a;
    private final bk b;
    private Button c;
    private Dialog d;
    private Spinner e;
    private final List f;
    private int g;

    private bi(Activity activity, bk bk1, List list, int l)
    {
        boolean flag;
        if (l >= 0 && l < list.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag);
        b = (bk)com.google.android.apps.youtube.common.fromguava.c.a(bk1);
        f = (List)com.google.android.apps.youtube.common.fromguava.c.a(list);
        a = activity;
        g = l;
    }

    private bi(Activity activity, bk bk1, List list, int l, Spinner spinner)
    {
        this(activity, bk1, list, l);
        e = (Spinner)com.google.android.apps.youtube.common.fromguava.c.a(spinner);
        e.setAdapter(new bj(activity.getLayoutInflater(), list));
        e.setOnItemSelectedListener(this);
        e.setSelection(l);
    }

    public static bi a(Activity activity, bk bk1, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter timefilter, Spinner spinner, int l)
    {
        com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter atimefilter[] = com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.values();
        ArrayList arraylist = new ArrayList(atimefilter.length);
        int i1 = atimefilter.length;
        for (l = 0; l < i1; l++)
        {
            com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter timefilter1 = atimefilter[l];
            arraylist.add(Pair.create(timefilter1, activity.getString(timefilter1.stringId)));
        }

        return new bi(activity, bk1, arraylist, timefilter.ordinal(), spinner);
    }

    public final Enum a()
    {
        return (Enum)((Pair)f.get(g)).first;
    }

    public final void onClick(View view)
    {
        d.show();
    }

    public final void onItemSelected(AdapterView adapterview, View view, int l, long l1)
    {
        if (l == g) goto _L2; else goto _L1
_L1:
        g = l;
        if (c == null) goto _L4; else goto _L3
_L3:
        c.setText((CharSequence)((Pair)f.get(l)).second);
_L6:
        b.a((Enum)((Pair)f.get(l)).first);
_L2:
        return;
_L4:
        if (e != null && e.getSelectedItemPosition() != l)
        {
            e.setSelection(l);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    static 
    {
        h = (new com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed[] {
            com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.TOP_RATED, com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.TOP_FAVORITES, com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.MOST_VIEWED, com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.MOST_DISCUSSED
        });
        i = (new int[] {
            p.gj, p.gi, p.cK, p.cH
        });
        j = (new com.google.android.apps.youtube.core.async.GDataRequestFactory.LiveFeed[] {
            com.google.android.apps.youtube.core.async.GDataRequestFactory.LiveFeed.FEATURED, com.google.android.apps.youtube.core.async.GDataRequestFactory.LiveFeed.LIVE_NOW, com.google.android.apps.youtube.core.async.GDataRequestFactory.LiveFeed.UPCOMING, com.google.android.apps.youtube.core.async.GDataRequestFactory.LiveFeed.RECENTLY_BROADCASTED
        });
        k = (new int[] {
            p.bN, p.cq, p.gp, p.eR
        });
    }
}
