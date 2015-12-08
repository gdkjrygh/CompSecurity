// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.core.ui.i;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ChannelFragment

final class m
    implements i
{

    final ChannelFragment a;

    m(ChannelFragment channelfragment)
    {
        a = channelfragment;
        super();
    }

    public final void a(com.google.android.apps.youtube.core.ui.PagedView.State state)
    {
        if (a.O() == 1)
        {
            ChannelFragment.a(a, state);
        }
    }
}
