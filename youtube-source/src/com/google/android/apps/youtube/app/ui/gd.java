// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.Channel;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            SubscribeHelper

final class gd
    implements b
{

    final SubscribeHelper a;

    private gd(SubscribeHelper subscribehelper)
    {
        a = subscribehelper;
        super();
    }

    gd(SubscribeHelper subscribehelper, byte byte0)
    {
        this(subscribehelper);
    }

    public final void a(Object obj, Exception exception)
    {
        com.google.android.apps.youtube.app.ui.SubscribeHelper.b(a, SubscribeHelper.SubscriptionStatus.ERROR);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Channel)obj1;
        SubscribeHelper.a(a, ((Channel) (obj)));
        SubscribeHelper.d(a);
    }
}
