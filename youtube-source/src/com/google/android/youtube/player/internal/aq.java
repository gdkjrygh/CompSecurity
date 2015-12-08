// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.internal.b.d;

// Referenced classes of package com.google.android.youtube.player.internal:
//            c, g, RuntimeRemoteException

public final class aq
    implements YouTubePlayer
{

    private c a;
    private g b;

    public aq(c c1, g g1)
    {
        a = (c)com.google.android.youtube.player.internal.b.d.a(c1, "connectionClient cannot be null");
        b = (g)com.google.android.youtube.player.internal.b.d.a(g1, "embeddedPlayer cannot be null");
    }

    public final View a()
    {
        View view;
        try
        {
            view = (View)com.google.android.youtube.player.internal.dynamic.d.a(b.j());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return view;
    }

    public final void a(Configuration configuration)
    {
        try
        {
            b.a(configuration);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Configuration configuration)
        {
            throw new RuntimeRemoteException(configuration);
        }
    }

    public final void a(boolean flag)
    {
        try
        {
            b.c(flag);
            a.a(flag);
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        a.d();
    }

    public final boolean a(int i, KeyEvent keyevent)
    {
        boolean flag;
        try
        {
            flag = b.a(i, keyevent);
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            throw new RuntimeRemoteException(keyevent);
        }
        return flag;
    }

    public final boolean a(Bundle bundle)
    {
        boolean flag;
        try
        {
            flag = b.a(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeRemoteException(bundle);
        }
        return flag;
    }

    public final void b()
    {
        try
        {
            b.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void b(boolean flag)
    {
        try
        {
            b.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final boolean b(int i, KeyEvent keyevent)
    {
        boolean flag;
        try
        {
            flag = b.b(i, keyevent);
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            throw new RuntimeRemoteException(keyevent);
        }
        return flag;
    }

    public final void c()
    {
        try
        {
            b.f();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void d()
    {
        try
        {
            b.g();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void e()
    {
        try
        {
            b.h();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void f()
    {
        try
        {
            b.i();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void g()
    {
        try
        {
            b.v();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final Bundle h()
    {
        Bundle bundle;
        try
        {
            bundle = b.w();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return bundle;
    }
}
