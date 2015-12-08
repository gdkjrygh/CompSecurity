// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.ui.ci;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            OfflineFragment

final class aw
    implements ci
{

    final OfflineFragment a;

    aw(OfflineFragment offlinefragment)
    {
        a = offlinefragment;
        super();
    }

    public final void a(int i)
    {
        if (OfflineFragment.a(a) == -1)
        {
            OfflineFragment.a(a, i);
            OfflineFragment.b(a);
        }
    }
}
