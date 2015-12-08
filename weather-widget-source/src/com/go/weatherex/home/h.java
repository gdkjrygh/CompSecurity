// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.view.View;
import com.go.weatherex.viewex.k;

// Referenced classes of package com.go.weatherex.home:
//            c

class h
    implements android.widget.ViewSwitcher.ViewFactory
{

    final c a;

    h(c c1)
    {
        a = c1;
        super();
    }

    public View makeView()
    {
        k k1 = new k(a.getActivity());
        a.a(k1.c, 4, 0);
        return k1;
    }
}
