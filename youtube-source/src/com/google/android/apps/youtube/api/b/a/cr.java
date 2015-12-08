// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.api.jar.a.cw;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.am;
import com.google.android.apps.youtube.core.player.an;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            cs

public final class cr
    implements am
{

    private final cs a;
    private cw b;

    public cr(Handler handler, cw cw1)
    {
        b = (cw)c.a(cw1, "client cannot be null");
        a = new cs(handler);
        try
        {
            cw1.a(a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            return;
        }
    }

    public final void a()
    {
        b = null;
    }

    public final void a(boolean flag)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.b(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setKeepScreenOn(boolean flag)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.a(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setListener(an an)
    {
        a.a(an);
    }
}
