// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.graphics.Paint;
import com.a.a.an;
import com.a.a.au;

// Referenced classes of package com.go.weatherex.home:
//            SidebarIcon

class ad
    implements au
{

    final SidebarIcon a;

    ad(SidebarIcon sidebaricon)
    {
        a = sidebaricon;
        super();
    }

    public void a(an an1)
    {
        SidebarIcon.d(a).setAlpha(((Integer)an1.l()).intValue());
        a.invalidate();
    }
}
