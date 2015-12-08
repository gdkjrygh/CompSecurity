// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.g;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.q;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            w, ac, ab, aa

public final class v
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    private final Activity a;
    private final Resources b;
    private final LayoutInflater c;
    private final View d;
    private final Dialog e;
    private final w f = new w(this);
    private ac g;
    private final int h = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    private final int i;
    private int j;
    private boolean k;
    private View l;

    public v(Activity activity)
    {
        k = true;
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        Object obj = activity.getWindowManager().getDefaultDisplay();
        i = android.view.View.MeasureSpec.makeMeasureSpec(((Display) (obj)).getHeight(), 0x80000000);
        c = activity.getLayoutInflater();
        b = activity.getResources();
        d = c.inflate(l.C, null);
        obj = (ListView)d.findViewById(j.bU);
        ((ListView) (obj)).setAdapter(f);
        ((ListView) (obj)).setOnItemClickListener(this);
        e = new Dialog(activity, q.b);
        e.setContentView(d);
        e.setCanceledOnTouchOutside(true);
        obj = e.getWindow().getAttributes();
        obj.gravity = 51;
        obj.height = -2;
        obj.width = (int)activity.getResources().getDimension(g.G);
        obj.windowAnimations = 0x1030002;
        obj.flags = 768;
        e.getWindow().setAttributes(((android.view.WindowManager.LayoutParams) (obj)));
    }

    private int a(int i1, int j1, int k1, ab ab1)
    {
        String s;
        if (j1 > 0)
        {
            s = b.getString(j1);
        } else
        {
            s = null;
        }
        return w.a(f, i1, s, -1, ab1);
    }

    static void a(v v1)
    {
        v1.d.measure(v1.h, v1.i);
        v1.j = v1.d.getMeasuredHeight();
    }

    static LayoutInflater b(v v1)
    {
        return v1.c;
    }

    public final int a()
    {
        return f.getCount();
    }

    public final int a(int i1, int j1, ab ab1)
    {
        return a(0, j1, -1, ab1);
    }

    public final int a(int i1, ab ab1)
    {
        return a(f.a(), i1, -1, ab1);
    }

    public final int a(aa aa, ab ab1)
    {
        return f.a(f.a(), aa, ab1);
    }

    public final void a(int i1)
    {
        f.b(i1);
    }

    public final void a(View view, Object obj)
    {
        view.setOnClickListener(this);
        view.setTag(obj);
    }

    public final void a(ac ac1)
    {
        g = ac1;
    }

    public final void a(boolean flag)
    {
        k = flag;
    }

    public final void b()
    {
        l = null;
        e.dismiss();
    }

    public final void b(int i1)
    {
        f.c(i1);
    }

    public final void c(int i1)
    {
        f.d(i1);
    }

    public final boolean c()
    {
        return k;
    }

    public final void onClick(View view)
    {
        if (k)
        {
            if (g != null)
            {
                g.a(this, view.getTag());
            }
            f.notifyDataSetChanged();
            Display display = a.getWindowManager().getDefaultDisplay();
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            android.view.WindowManager.LayoutParams layoutparams = e.getWindow().getAttributes();
            layoutparams.x = (rect.left + rect.width()) - layoutparams.width - 4;
            if (rect.bottom + j > display.getHeight())
            {
                layoutparams.y = rect.top - j;
            } else
            {
                layoutparams.y = rect.bottom;
            }
            e.getWindow().setAttributes(layoutparams);
            e.show();
            l = view;
        }
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = f.a(i1);
        if (adapterview != null && l != null)
        {
            adapterview.a(l.getTag());
            b();
        }
    }
}
