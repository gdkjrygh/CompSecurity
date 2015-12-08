// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import com.google.android.apps.youtube.app.ui.ad;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae, x

public final class y
    implements ae
{

    final x a;
    private final View b;

    public y(x x1, View view)
    {
        a = x1;
        super();
        b = view.findViewById(j.aE);
    }

    public final View a(int i, Object obj)
    {
        ad.a(x.a(a), b, obj);
        return b;
    }
}
