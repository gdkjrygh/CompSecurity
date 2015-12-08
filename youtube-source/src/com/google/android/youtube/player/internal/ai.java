// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.youtube.player.internal.b.d;

// Referenced classes of package com.google.android.youtube.player.internal:
//            aj, c, ae, af, 
//            v, as, at, ao

public final class ai extends aj
    implements c
{

    private final String b;
    private final String c;
    private final String d;
    private boolean e;

    public ai(Context context, String s, String s1, String s2, as as, at at)
    {
        super(context, as, at);
        b = (String)com.google.android.youtube.player.internal.b.d.a(s);
        c = com.google.android.youtube.player.internal.b.d.a(s1, "callingPackage cannot be null or empty");
        d = com.google.android.youtube.player.internal.b.d.a(s2, "callingAppVersion cannot be null or empty");
    }

    public final IBinder a()
    {
        i();
        if (e)
        {
            throw new IllegalStateException("Connection client has been released");
        }
        IBinder ibinder;
        try
        {
            ibinder = ((ae)j()).a();
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return ibinder;
    }

    protected final volatile IInterface a(IBinder ibinder)
    {
        return af.a(ibinder);
    }

    protected final void a(v v1, ao ao)
    {
        v1.a(ao, 1200, c, d, b, null);
    }

    public final void a(boolean flag)
    {
        if (f())
        {
            try
            {
                ((ae)j()).a(flag);
            }
            catch (RemoteException remoteexception) { }
            e = true;
        }
    }

    protected final String b()
    {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }

    protected final String c()
    {
        return "com.google.android.youtube.api.service.START";
    }

    public final void d()
    {
        if (!e)
        {
            a(true);
        }
        super.d();
    }
}
