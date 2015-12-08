// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.core.aw;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            az, PlayerFragment

final class bb
    implements Runnable
{

    final az a;

    bb(az az1)
    {
        a = az1;
        super();
    }

    public final void run()
    {
        PlayerFragment.d(a.a).a(p.bA);
    }
}
