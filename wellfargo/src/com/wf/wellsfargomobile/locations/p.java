// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            LocationTabListFragment

class p
    implements android.widget.TabHost.TabContentFactory
{

    final LocationTabListFragment a;
    private final Context b;

    public p(LocationTabListFragment locationtablistfragment, Context context)
    {
        a = locationtablistfragment;
        super();
        b = context;
    }

    public View createTabContent(String s)
    {
        s = new View(b);
        s.setMinimumWidth(0);
        s.setMinimumHeight(0);
        return s;
    }
}
