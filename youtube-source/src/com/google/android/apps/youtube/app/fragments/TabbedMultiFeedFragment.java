// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.ui.TabbedView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.core.ui.PagedListView;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.youtube.f;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            PaneFragment, bt

public abstract class TabbedMultiFeedFragment extends PaneFragment
    implements android.view.animation.Animation.AnimationListener
{

    private Animation Y;
    private long Z;
    protected boolean a;
    private int aa[];
    private FrameLayout b;
    private TabbedView d;
    private a e[];
    private PagedListView f[];
    private View g;
    private View h;
    private boolean i;

    public TabbedMultiFeedFragment()
    {
    }

    static void a(TabbedMultiFeedFragment tabbedmultifeedfragment, int k)
    {
        tabbedmultifeedfragment.d(k);
    }

    private void d(int k)
    {
        int i1 = k - 1;
        while (i1 <= k + 1) 
        {
            if (i1 >= 0 && i1 < j_())
            {
                Object obj = e[i1];
                if (obj == null)
                {
                    obj = f[i1];
                    if (obj != null)
                    {
                        e[i1] = a(((PagedListView) (obj)), i1);
                    }
                } else
                {
                    ((a) (obj)).notifyDataSetChanged();
                }
            }
            i1++;
        }
    }

    protected final ViewGroup L()
    {
        return b;
    }

    protected final void M()
    {
        i = true;
        g.setVisibility(0);
        h.setVisibility(0);
        d.setVisibility(8);
    }

    protected final void N()
    {
        if (i)
        {
            i = false;
            g.setVisibility(0);
            h.setVisibility(4);
            Y.reset();
            Y.setDuration(Z);
            g.setAnimation(Y);
            d.setVisibility(0);
            b(d.b());
        }
    }

    protected final int O()
    {
        return d.b();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int j1 = j_();
        e = new a[j1];
        f = new PagedListView[j1];
        b = (FrameLayout)layoutinflater.inflate(l.bn, viewgroup, false);
        d = (TabbedView)b.findViewById(j.ft);
        d.setOnTabSelectedListener(new bt(this));
        layoutinflater = c.getResources();
        for (int k = 0; k < j1; k++)
        {
            viewgroup = new PagedListView(c, layoutinflater.getColor(f.m), l.ah, layoutinflater.getString(p.cV));
            viewgroup.setListViewId(aa[k]);
            d.a(c(k), viewgroup);
            f[k] = viewgroup;
        }

        g = b.findViewById(j.co);
        h = g.findViewById(j.cp);
        g.bringToFront();
        g.setVisibility(8);
        i = false;
        int i1;
        boolean flag;
        if (bundle != null)
        {
            i1 = bundle.getInt("selected_feed_index", 0);
        } else
        {
            i1 = 0;
        }
        if (i1 >= 0 && i1 < j_())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "Feed index out of range.");
        d(i1);
        j1 = d.b();
        d.a(i1);
        if (j1 != i1 && !i)
        {
            b(i1);
        }
        Y = AnimationUtils.loadAnimation(c, 0x10a0001);
        Y.setAnimationListener(this);
        Z = c.getResources().getInteger(0x10e0001);
        return b;
    }

    protected abstract a a(PagedListView pagedlistview, int k);

    public void a(Bundle bundle)
    {
        int i1;
        super.a(bundle);
        i1 = j_();
        aa = new int[i1];
        if (bundle == null) goto _L2; else goto _L1
_L1:
        bundle = bundle.getIntArray("paged_list_ids");
        if (bundle == null) goto _L2; else goto _L3
_L3:
        int k;
        k = Math.min(bundle.length, aa.length);
        System.arraycopy(bundle, 0, aa, 0, k);
_L5:
        for (; k < i1; k++)
        {
            aa[k] = ah.a();
        }

        return;
_L2:
        k = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void b(int k)
    {
    }

    protected abstract String c(int k);

    public void d()
    {
        super.d();
        a = true;
        if (!i)
        {
            int k = d.b();
            if (k >= 0 && k < e.length)
            {
                a a1 = e[k];
                if (a1 != null)
                {
                    a1.notifyDataSetChanged();
                }
            }
        }
    }

    public final void e()
    {
        super.e();
        a = false;
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("selected_feed_index", d.b());
        bundle.putIntArray("paged_list_ids", aa);
    }

    protected abstract int j_();

    public void onAnimationEnd(Animation animation)
    {
        if (!i)
        {
            g.setVisibility(8);
            d.invalidate();
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
