// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.ytremote.backend.logic.c;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.PairingCode;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            ae

final class af
    implements Runnable
{

    final PairingCode a;
    final CloudScreen b;
    final ae c;

    af(ae ae1, PairingCode pairingcode, CloudScreen cloudscreen)
    {
        c = ae1;
        a = pairingcode;
        b = cloudscreen;
        super();
    }

    public final void run()
    {
        ae.a(c).a(a, b.getScreenId(), b.getName());
        ae.a(c, a, null);
    }
}
