// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.Branding;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ChannelFragment

final class q
    implements b
{

    final ChannelFragment a;

    private q(ChannelFragment channelfragment)
    {
        a = channelfragment;
        super();
    }

    q(ChannelFragment channelfragment, byte byte0)
    {
        this(channelfragment);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error retrieving user branding", exception);
        ChannelFragment.a(a, null);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (Branding)obj1;
        ChannelFragment.a(a, ((Branding) (obj)));
    }
}
