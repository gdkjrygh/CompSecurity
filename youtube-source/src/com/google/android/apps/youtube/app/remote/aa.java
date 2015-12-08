// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.backend.a.l;
import com.google.android.apps.ytremote.model.PairingCode;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            t

final class aa
    implements Runnable
{

    final PairingCode a;
    final b b;
    final t c;

    aa(t t1, PairingCode pairingcode, b b1)
    {
        c = t1;
        a = pairingcode;
        b = b1;
        super();
    }

    public final void run()
    {
        com.google.android.apps.ytremote.model.CloudScreen cloudscreen = t.a(c).a(a);
        if (cloudscreen == null)
        {
            b.a(a, new Exception());
            return;
        } else
        {
            b.a(a, cloudscreen);
            return;
        }
    }
}
