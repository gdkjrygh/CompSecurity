// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.ui.SubscribeHelper;
import com.google.android.apps.youtube.app.ui.g;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.UserProfile;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ChannelFragment, r

final class s
    implements b
{

    final ChannelFragment a;

    private s(ChannelFragment channelfragment)
    {
        a = channelfragment;
        super();
    }

    s(ChannelFragment channelfragment, byte byte0)
    {
        this(channelfragment);
    }

    public final volatile void a(Object obj, Exception exception)
    {
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        com.google.android.apps.youtube.app.fragments.ChannelFragment.a(a, ((UserProfile) (obj)));
        ChannelFragment.d(a).a(ChannelFragment.c(a));
        if (ChannelFragment.e(a) != null)
        {
            ChannelFragment.f(a);
        }
        if (com.google.android.apps.youtube.app.fragments.ChannelFragment.g(a) != null)
        {
            ChannelFragment.h(a);
        }
        if (ChannelFragment.i(a) != null)
        {
            ChannelFragment.j(a);
        }
        if (ChannelFragment.k(a) != null)
        {
            ChannelFragment.l(a).a(ChannelFragment.c(a));
        }
        ChannelFragment.n(a).b(ChannelFragment.c(a).username, com.google.android.apps.youtube.common.a.a.a(a.c, ChannelFragment.m(a)));
        ChannelFragment.n(a).i(ChannelFragment.c(a).channelId, com.google.android.apps.youtube.common.a.a.a(a.c, new r(a, (byte)0)));
    }
}
