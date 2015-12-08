// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.viewex.d;
import com.go.weatherex.viewex.e;
import com.gtp.a.a.b.c;

// Referenced classes of package com.go.weatherex.sidebar:
//            a, SidebarDrawerLayout, b

public class i extends a
    implements com.go.weatherex.sidebar.a
{

    private SidebarDrawerLayout a;
    private d b;
    private e c;
    private d d;
    private e e;
    private boolean f;

    public i()
    {
        f = false;
    }

    public static Bundle a(String s, int j)
    {
        Bundle bundle = new Bundle();
        bundle.putString("cityId", s);
        bundle.putInt("detail_goto", j);
        return bundle;
    }

    private void a(String s)
    {
        s = new com.gau.go.launcherex.gowidget.statistics.a.a(93, s);
        s.e("1");
        q.a(getActivity().getApplicationContext()).a(s);
    }

    private void d(boolean flag)
    {
        if (flag)
        {
            View view = c(0x7f09037f).findViewById(0x7f090228);
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            a.a(rect);
            return;
        } else
        {
            a.a(null);
            return;
        }
    }

    public void a(float f1)
    {
        com.gtp.a.a.b.c.a("SidebarDrawerFragment", (new StringBuilder()).append("onSidebarSliding:").append(f1).toString());
        float f2 = f1;
        if (f)
        {
            f2 = f1 * f1;
        }
        a(3, Float.valueOf(f2));
        c.a(f2);
        e.a(1.0F - f2);
    }

    public void a(d d1)
    {
        b = d1;
        d1 = AnimationUtils.loadAnimation(getActivity(), 0x7f040013);
        c = new e(b, d1);
    }

    public void a(boolean flag)
    {
        com.gtp.a.a.b.c.a("SidebarDrawerFragment", "onSidebarIdle");
        a(6, Boolean.valueOf(flag));
        a(13, Boolean.valueOf(flag));
        f = false;
        c.a(false);
        e.a(false);
        a.b(false);
        if (flag)
        {
            d.setVisibility(4);
        } else
        {
            b.setVisibility(4);
        }
        d(flag);
    }

    protected void b(int j, Object obj)
    {
        super.b(j, obj);
        j;
        JVM INSTR lookupswitch 3: default 40
    //                   7: 53
    //                   8: 41
    //                   15: 65;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L3:
        b(((Boolean)obj).booleanValue());
        return;
_L2:
        c(((Boolean)obj).booleanValue());
        return;
_L4:
        if (((Boolean)obj).booleanValue())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != a.b(3))
        {
            a.b(j, 3);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void b(d d1)
    {
        d = d1;
        e = new e(d, AnimationUtils.loadAnimation(getActivity(), 0x7f040010));
    }

    public void b(boolean flag)
    {
        f = true;
        a.f(3);
    }

    public void c(boolean flag)
    {
        a.g(3);
    }

    public void d_()
    {
        com.gtp.a.a.b.c.a("SidebarDrawerFragment", "onSidebarStartOpen");
        a(1, null);
        a.b(true);
        c.a(true);
        c.a(0.0F);
        e.a(true);
        e.a(1.0F);
        d.setVisibility(0);
        b.setVisibility(0);
    }

    public void e_()
    {
        com.gtp.a.a.b.c.a("SidebarDrawerFragment", "onSidebarStartClose");
        a(2, null);
        a.b(true);
        c.a(true);
        c.a(1.0F);
        e.a(true);
        e.a(0.0F);
        d.setVisibility(0);
        b.setVisibility(0);
        d(false);
    }

    public void f_()
    {
        com.gtp.a.a.b.c.a("SidebarDrawerFragment", "onSidebarOpened");
        a(4, null);
        w.a("key_home_open_sidebar", getActivity());
        a("ent_wp");
    }

    public void g_()
    {
        com.gtp.a.a.b.c.a("SidebarDrawerFragment", "onSidebarClosed");
        a(5, null);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = getArguments();
        a(com/go/weatherex/home/c, com.go.weatherex.home.c.a(bundle.getString("cityId"), bundle.getInt("detail_goto", -1)));
        a(com/go/weatherex/sidebar/b, null);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new int[] {
            8, 7, 15
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030091, viewgroup, false);
    }

    public void onHiddenChanged(boolean flag)
    {
        super.onHiddenChanged(flag);
        a(16, Boolean.valueOf(flag));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a = (SidebarDrawerLayout)c(0x7f09038a);
        a.i(0);
        a.a(0);
        a.a(0x7f020654, 3);
        a.a(0x7f020654, 5);
        a.a(this);
        a.setFocusableInTouchMode(false);
    }
}
