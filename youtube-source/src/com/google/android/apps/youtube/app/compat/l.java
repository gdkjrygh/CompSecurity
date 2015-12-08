// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.google.android.youtube.j;
import com.google.android.youtube.q;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            m, n, j, q

public final class l extends Dialog
{

    private final Activity a;
    private final List b = new LinkedList();
    private final LinearLayout c;
    private final ListView d;
    private final n e;

    private l(Activity activity)
    {
        super(activity, q.i);
        a = activity;
        c = (LinearLayout)LayoutInflater.from(activity).inflate(com.google.android.youtube.l.bj, null);
        d = (ListView)c.findViewById(j.cX);
        d.setOnItemClickListener(new m(this));
        e = new n(activity, b);
        d.setAdapter(e);
        setContentView(c);
    }

    public static l a(Activity activity)
    {
        return new l(activity);
    }

    static List a(l l1)
    {
        return l1.b;
    }

    static Activity b(l l1)
    {
        return l1.a;
    }

    private void b()
    {
        Window window = getWindow();
        Activity activity = a;
        WindowManager windowmanager = (WindowManager)activity.getSystemService("window");
        windowmanager.getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
        int i;
        if (activity.getResources().getConfiguration().orientation == 1)
        {
            i = displaymetrics.widthPixels;
        } else
        {
            i = displaymetrics.heightPixels;
        }
        window.setLayout((int)((double)i * 0.80000000000000004D), -2);
        if (a.getResources().getConfiguration().orientation == 1)
        {
            getWindow().setGravity(80);
            ((android.widget.LinearLayout.LayoutParams)d.getLayoutParams()).leftMargin = 0;
            return;
        } else
        {
            getWindow().setGravity(83);
            ((android.widget.LinearLayout.LayoutParams)d.getLayoutParams()).leftMargin = com.google.android.apps.youtube.core.utils.l.a(a.getResources().getDisplayMetrics(), 10);
            return;
        }
    }

    public final void a()
    {
        b();
    }

    public final void a(com.google.android.apps.youtube.app.compat.j j1)
    {
        boolean flag = false;
        b();
        b.clear();
        List list = b;
        Context context = getContext();
        LinkedList linkedlist = new LinkedList();
        int i;
        byte byte0;
        int i1;
        int k1;
        int l1;
        if (context.getResources().getConfiguration().orientation == 2)
        {
            byte0 = 5;
        } else
        {
            byte0 = 3;
        }
        i1 = 0;
        i = 0;
        do
        {
            k1 = ((flag) ? 1 : 0);
            l1 = i;
            if (i1 >= j1.d())
            {
                break;
            }
            com.google.android.apps.youtube.app.compat.q q1 = j1.d(i1);
            k1 = i;
            if (q1.h())
            {
                k1 = i;
                if ((q1.i() & 2) != 0)
                {
                    k1 = i + 1;
                }
            }
            i1++;
            i = k1;
        } while (true);
        while (k1 < j1.d()) 
        {
            com.google.android.apps.youtube.app.compat.q q2 = j1.d(k1);
            int k = l1;
            if (q2.h())
            {
                if ((q2.i() & 2) != 0 || (q2.i() & 1) != 0 && l1 < byte0)
                {
                    k = l1 + 1;
                } else
                {
                    linkedlist.add(q2);
                    k = l1;
                }
            }
            k1++;
            l1 = k;
        }
        list.addAll(linkedlist);
        e.notifyDataSetChanged();
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 82 && keyevent.getRepeatCount() == 0 && keyevent.getAction() == 0)
        {
            dismiss();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }
}
