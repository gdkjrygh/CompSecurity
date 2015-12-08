// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

// Referenced classes of package android.support.v7.media:
//            j, e, MediaRouteProviderService, f, 
//            p

final class o
    implements android.os.IBinder.DeathRecipient
{

    public final Messenger a;
    public final int b;
    public e c;
    final MediaRouteProviderService d;
    private final SparseArray e = new SparseArray();

    public o(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int i)
    {
        d = mediarouteproviderservice;
        super();
        a = messenger;
        b = i;
    }

    public final boolean a()
    {
        try
        {
            a.getBinder().linkToDeath(this, 0);
        }
        catch (RemoteException remoteexception)
        {
            binderDied();
            return false;
        }
        return true;
    }

    public final boolean a(int i)
    {
        j j1 = (j)e.get(i);
        if (j1 != null)
        {
            e.remove(i);
            j1.a();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(Messenger messenger)
    {
        return a.getBinder() == messenger.getBinder();
    }

    public final boolean a(e e1)
    {
        if (c != e1 && (c == null || !c.equals(e1)))
        {
            c = e1;
            return MediaRouteProviderService.b(d);
        } else
        {
            return false;
        }
    }

    public final boolean a(String s, int i)
    {
        if (e.indexOfKey(i) < 0)
        {
            s = MediaRouteProviderService.a(d).a(s);
            if (s != null)
            {
                e.put(i, s);
                return true;
            }
        }
        return false;
    }

    public final j b(int i)
    {
        return (j)e.get(i);
    }

    public final void b()
    {
        int k = e.size();
        for (int i = 0; i < k; i++)
        {
            ((j)e.valueAt(i)).a();
        }

        e.clear();
        a.getBinder().unlinkToDeath(this, 0);
        a(((e) (null)));
    }

    public final void binderDied()
    {
        MediaRouteProviderService.c(d).obtainMessage(1, a).sendToTarget();
    }

    public final String toString()
    {
        return MediaRouteProviderService.a(a);
    }
}
