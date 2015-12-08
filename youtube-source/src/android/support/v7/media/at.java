// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

// Referenced classes of package android.support.v7.media:
//            ay, x, e, as, 
//            k, au, ax, av

final class at
    implements android.os.IBinder.DeathRecipient
{

    final as a;
    private final Messenger b;
    private final ay c = new ay(this);
    private final Messenger d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final SparseArray i = new SparseArray();

    public at(as as1, Messenger messenger)
    {
        a = as1;
        super();
        e = 1;
        f = 1;
        b = messenger;
        d = new Messenger(c);
    }

    static void a(at at1)
    {
        for (int j = 0; j < at1.i.size(); j++)
        {
            ((x)at1.i.valueAt(j)).a(null, null);
        }

        at1.i.clear();
    }

    private boolean a(int j, int l, int i1, Object obj, Bundle bundle)
    {
        Message message;
        message = Message.obtain();
        message.what = j;
        message.arg1 = l;
        message.arg2 = i1;
        message.obj = obj;
        message.setData(bundle);
        message.replyTo = d;
        b.send(message);
        return true;
        obj;
        if (j != 2)
        {
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", ((Throwable) (obj)));
        }
_L2:
        return false;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int a(String s)
    {
        int j = f;
        f = j + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", s);
        int l = e;
        e = l + 1;
        a(3, l, j, null, bundle);
        return j;
    }

    public final void a(int j, int l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", l);
        l = e;
        e = l + 1;
        a(7, l, j, null, bundle);
    }

    public final void a(e e1)
    {
        int j = e;
        e = j + 1;
        if (e1 != null)
        {
            e1 = e1.d();
        } else
        {
            e1 = null;
        }
        a(10, j, 0, e1, null);
    }

    public final boolean a()
    {
        int j = e;
        e = j + 1;
        h = j;
        if (!a(1, h, 1, null, null))
        {
            return false;
        }
        try
        {
            b.getBinder().linkToDeath(this, 0);
        }
        catch (RemoteException remoteexception)
        {
            binderDied();
            return false;
        }
        return true;
    }

    public final boolean a(int j)
    {
        if (j == h)
        {
            h = 0;
            as.a(a, this, "Registation failed");
        }
        x x1 = (x)i.get(j);
        if (x1 != null)
        {
            i.remove(j);
            x1.a(null, null);
        }
        return true;
    }

    public final boolean a(int j, int l, Bundle bundle)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (g == 0)
        {
            flag = flag1;
            if (j == h)
            {
                flag = flag1;
                if (l > 0)
                {
                    h = 0;
                    g = l;
                    as.a(a, this, k.a(bundle));
                    as.a(a, this);
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final boolean a(int j, Intent intent, x x1)
    {
        int l = e;
        e = l + 1;
        if (a(9, l, j, intent, null))
        {
            if (x1 != null)
            {
                i.put(l, x1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(int j, Bundle bundle)
    {
        x x1 = (x)i.get(j);
        if (x1 != null)
        {
            i.remove(j);
            x1.a(bundle);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(int j, String s, Bundle bundle)
    {
        x x1 = (x)i.get(j);
        if (x1 != null)
        {
            i.remove(j);
            x1.a(s, bundle);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(Bundle bundle)
    {
        if (g != 0)
        {
            as.a(a, this, k.a(bundle));
            return true;
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        a(2, 0, 0, null, null);
        c.a();
        b.getBinder().unlinkToDeath(this, 0);
        as.a(a).post(new au(this));
    }

    public final void b(int j)
    {
        int l = e;
        e = l + 1;
        a(4, l, j, null, null);
    }

    public final void b(int j, int l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", l);
        l = e;
        e = l + 1;
        a(8, l, j, null, bundle);
    }

    public final void binderDied()
    {
        as.a(a).post(new av(this));
    }

    public final void c(int j)
    {
        int l = e;
        e = l + 1;
        a(5, l, j, null, null);
    }

    public final void d(int j)
    {
        int l = e;
        e = l + 1;
        a(6, l, j, null, null);
    }
}
