// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.view.View;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            l

class m
    implements android.view.View.OnClickListener
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public void onClick(View view)
    {
        l.a(a, view.getContext());
    }
}
