// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.compat.SupportActionBar;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.Channel;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ChannelFragment

final class r
    implements b
{

    final ChannelFragment a;

    private r(ChannelFragment channelfragment)
    {
        a = channelfragment;
        super();
    }

    r(ChannelFragment channelfragment, byte byte0)
    {
        this(channelfragment);
    }

    public final volatile void a(Object obj, Exception exception)
    {
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Channel)obj1;
        ChannelFragment.a(a, ((Channel) (obj)));
        a.c.K().a(ChannelFragment.o(a).title);
    }
}
