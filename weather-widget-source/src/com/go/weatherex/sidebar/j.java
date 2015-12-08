// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.view.View;
import com.gtp.a.a.b.c;

// Referenced classes of package com.go.weatherex.sidebar:
//            l, SidebarDrawerLayout, a

class j
    implements l
{

    final SidebarDrawerLayout a;

    j(SidebarDrawerLayout sidebardrawerlayout)
    {
        a = sidebardrawerlayout;
        super();
    }

    public void a(int i)
    {
        c.a("SidebarDrawerLayout", (new StringBuilder()).append("onDrawerStateChanged:").append(i).toString());
        i;
        JVM INSTR tableswitch 0 2: default 52
    //                   0 109
    //                   1 53
    //                   2 53;
           goto _L1 _L2 _L3 _L3
_L1:
        return;
_L3:
        if (!com.go.weatherex.sidebar.SidebarDrawerLayout.c(a))
        {
            SidebarDrawerLayout.a(a, true);
            if (a.h(3))
            {
                SidebarDrawerLayout.b(a).e_();
                return;
            } else
            {
                SidebarDrawerLayout.b(a).d_();
                return;
            }
        }
          goto _L1
_L2:
        SidebarDrawerLayout.a(a, false);
        SidebarDrawerLayout.b(a).a(a.h(3));
        return;
    }

    public void a(View view)
    {
        SidebarDrawerLayout.b(a).f_();
    }

    public void a(View view, float f)
    {
        SidebarDrawerLayout.b(a).a(f);
    }

    public void b(View view)
    {
        SidebarDrawerLayout.b(a).g_();
    }
}
