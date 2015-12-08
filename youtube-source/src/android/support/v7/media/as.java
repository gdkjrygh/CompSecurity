// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            f, i, ax, aw, 
//            at, k, c, m, 
//            j, e

final class as extends f
    implements ServiceConnection
{

    private static final boolean a = Log.isLoggable("MediaRouteProviderProxy", 3);
    private final ComponentName b;
    private final ax c = new ax(this, (byte)0);
    private final ArrayList d = new ArrayList();
    private boolean e;
    private boolean f;
    private at g;
    private boolean h;

    public as(Context context, ComponentName componentname)
    {
        super(context, new i(componentname));
        b = componentname;
    }

    static ax a(as as1)
    {
        return as1.c;
    }

    static void a(as as1, at at1)
    {
        if (as1.g == at1)
        {
            as1.h = true;
            int j1 = as1.d.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((aw)as1.d.get(i1)).a(as1.g);
            }

            at1 = as1.d();
            if (at1 != null)
            {
                as1.g.a(at1);
            }
        }
    }

    static void a(as as1, at at1, k k1)
    {
        if (as1.g == at1)
        {
            if (a)
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(as1).append(": Descriptor changed, descriptor=").append(k1).toString());
            }
            as1.a(k1);
        }
    }

    static void a(as as1, at at1, String s)
    {
        if (as1.g == at1)
        {
            if (a)
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(as1).append(": Service connection error - ").append(s).toString());
            }
            as1.m();
        }
    }

    static void a(as as1, aw aw1)
    {
        as1.d.remove(aw1);
        aw1.d();
        as1.j();
    }

    static void b(as as1, at at1)
    {
        if (as1.g == at1)
        {
            if (a)
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(as1).append(": Service connection died").toString());
            }
            as1.n();
        }
    }

    static boolean i()
    {
        return a;
    }

    private void j()
    {
        if (k())
        {
            l();
            return;
        } else
        {
            m();
            return;
        }
    }

    private boolean k()
    {
        while (e && (d() != null || !d.isEmpty())) 
        {
            return true;
        }
        return false;
    }

    private void l()
    {
        Intent intent;
        if (f)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        if (a)
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Binding").toString());
        }
        intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(b);
        f = a().bindService(intent, this, 1);
        if (!f && a)
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Bind failed").toString());
        }
_L1:
        return;
        SecurityException securityexception;
        securityexception;
        if (a)
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Bind failed").toString(), securityexception);
            return;
        }
          goto _L1
    }

    private void m()
    {
        if (f)
        {
            if (a)
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Unbinding").toString());
            }
            f = false;
            n();
            a().unbindService(this);
        }
    }

    private void n()
    {
        if (g != null)
        {
            a(((k) (null)));
            h = false;
            int j1 = d.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((aw)d.get(i1)).d();
            }

            g.b();
            g = null;
        }
    }

    public final j a(String s)
    {
        Object obj = e();
        if (obj != null)
        {
            obj = ((k) (obj)).a();
            int j1 = ((List) (obj)).size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                if (((c)((List) (obj)).get(i1)).a().equals(s))
                {
                    s = new aw(this, s);
                    d.add(s);
                    if (h)
                    {
                        s.a(g);
                    }
                    j();
                    return s;
                }
            }

        }
        return null;
    }

    public final boolean a(String s, String s1)
    {
        return b.getPackageName().equals(s) && b.getClassName().equals(s1);
    }

    public final void b(e e1)
    {
        if (h)
        {
            g.a(e1);
        }
        j();
    }

    public final void f()
    {
        if (!e)
        {
            if (a)
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Starting").toString());
            }
            e = true;
            j();
        }
    }

    public final void g()
    {
        if (e)
        {
            if (a)
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Stopping").toString());
            }
            e = false;
            j();
        }
    }

    public final void h()
    {
        if (g == null && k())
        {
            m();
            l();
        }
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        if (a)
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Connected").toString());
        }
        if (!f) goto _L2; else goto _L1
_L1:
        n();
        if (ibinder != null)
        {
            componentname = new Messenger(ibinder);
        } else
        {
            componentname = null;
        }
        if (!android.support.v7.media.m.a(componentname))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        componentname = new at(this, componentname);
        if (!componentname.a()) goto _L4; else goto _L3
_L3:
        g = componentname;
_L2:
        return;
_L4:
        if (!a) goto _L2; else goto _L5
_L5:
        Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Registration failed").toString());
        return;
        Log.e("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Service returned invalid messenger binder").toString());
        return;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        if (a)
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Service disconnected").toString());
        }
        n();
    }

    public final String toString()
    {
        return (new StringBuilder("Service connection ")).append(b.flattenToShortString()).toString();
    }

}
