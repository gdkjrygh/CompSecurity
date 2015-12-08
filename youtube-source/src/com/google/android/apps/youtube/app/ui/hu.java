// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Dialog;
import com.google.android.apps.youtube.core.Analytics;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ib, ht, hr, hj

final class hu extends ib
{

    final ht a;

    hu(ht ht1)
    {
        a = ht1;
        super(ht1.b.a, (byte)0);
    }

    public final void a()
    {
        hj.f(a.b.a).b("CreatePlaylist");
        hr.d(a.b).show();
    }
}
