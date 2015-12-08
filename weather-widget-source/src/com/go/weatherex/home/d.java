// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.view.View;
import com.go.weatherex.sidebar.b;

// Referenced classes of package com.go.weatherex.home:
//            c, SidebarIcon

class d
    implements android.view.View.OnClickListener
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public void onClick(View view)
    {
        c.a(a, "c000_wpcoin");
        a.a(com/go/weatherex/sidebar/b, null);
        c.a(a).e();
    }
}
