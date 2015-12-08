// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import java.util.TimerTask;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            k

final class q extends TimerTask
{

    final k a;

    q(k k1)
    {
        a = k1;
        super();
    }

    public final void run()
    {
        a.a(k.p(a));
    }
}
