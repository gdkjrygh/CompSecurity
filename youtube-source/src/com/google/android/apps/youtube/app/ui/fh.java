// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.apps.youtube.datalib.innertube.model.ac;
import com.google.android.youtube.h;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            SliderLayout, fj, fl, v, 
//            fi, fk

public final class fh
{

    private final Resources a;
    private final View b;
    private final SliderLayout c;
    private final LinearLayout d;
    private final ImageView e;
    private PagedListView f;
    private fk g;
    private boolean h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final ImageView l;

    public fh(View view, Resources resources)
    {
        h = false;
        a = (Resources)com.google.android.apps.youtube.common.fromguava.c.a(resources);
        b = (View)com.google.android.apps.youtube.common.fromguava.c.a(view.findViewById(j.ey), "parentView must contain the set_bar");
        d = (LinearLayout)com.google.android.apps.youtube.common.fromguava.c.a(view.findViewById(j.eA), "parentView must contain the set_content");
        c = (SliderLayout)com.google.android.apps.youtube.common.fromguava.c.a(view.findViewById(j.eB), "parentView must contain the set_content_slider");
        c.a(1, false);
        c.setListener(new fj(this, (byte)0));
        c.setEnabled(false);
        e = (ImageView)view.findViewById(j.ez);
        e.setOnClickListener(new fl(this, (byte)0));
        b.setOnClickListener(new fl(this, (byte)0));
        i = (TextView)b.findViewById(j.eH);
        j = (TextView)b.findViewById(j.eG);
        k = (TextView)b.findViewById(j.eD);
        l = (ImageView)b.findViewById(j.aE);
        j.setVisibility(8);
    }

    static SliderLayout a(fh fh1)
    {
        return fh1.c;
    }

    static boolean a(fh fh1, boolean flag)
    {
        fh1.h = flag;
        return flag;
    }

    static fk b(fh fh1)
    {
        return fh1.g;
    }

    static boolean c(fh fh1)
    {
        return fh1.h;
    }

    static ImageView d(fh fh1)
    {
        return fh1.e;
    }

    public final void a()
    {
        e.setImageDrawable(a.getDrawable(h.t));
    }

    public final void a(fk fk)
    {
        g = fk;
    }

    public final void a(v v1, ac ac)
    {
        v1.a(l, ac);
    }

    public final void a(PagedListView pagedlistview)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(pagedlistview);
        if (!pagedlistview.equals(f))
        {
            if (f != null)
            {
                d.removeView(f);
            }
            f = pagedlistview;
            d.addView(pagedlistview, new android.widget.LinearLayout.LayoutParams(-1, -1));
        }
    }

    public final void a(CharSequence charsequence)
    {
        i.setText(charsequence);
    }

    public final void a(boolean flag)
    {
        View view;
        boolean flag1;
        int i1;
        if (b.getVisibility() != 0 && flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        view = b;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        if (!flag)
        {
            c.a(1, false);
            h = false;
        }
        if (flag1)
        {
            c.a(0, false);
            c.postDelayed(new fi(this), 1500L);
        }
    }

    public final void b()
    {
        e.setImageDrawable(a.getDrawable(h.s));
    }

    public final void b(CharSequence charsequence)
    {
        j.setText(charsequence);
        if (TextUtils.isEmpty(charsequence))
        {
            j.setVisibility(8);
            return;
        } else
        {
            j.setVisibility(0);
            return;
        }
    }

    public final void b(boolean flag)
    {
        l.setClickable(flag);
        l.setEnabled(flag);
        ImageView imageview = l;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        imageview.setVisibility(i1);
    }

    public final void c()
    {
        i.setText(null);
        j.setText(null);
        j.setVisibility(8);
        k.setText(null);
        e.setImageDrawable(null);
        b(false);
    }

    public final void c(CharSequence charsequence)
    {
        k.setText(charsequence);
    }
}
