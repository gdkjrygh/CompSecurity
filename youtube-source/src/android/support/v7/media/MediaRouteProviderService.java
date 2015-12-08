// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            r, p, q, k, 
//            o, f, j, n, 
//            e, s, t, i

public abstract class MediaRouteProviderService extends Service
{

    private static final boolean a = Log.isLoggable("MediaRouteProviderSrv", 3);
    private final ArrayList b = new ArrayList();
    private final r c = new r(this);
    private final Messenger d;
    private final p e = new p(this, (byte)0);
    private final q f = new q(this, (byte)0);
    private f g;
    private e h;

    public MediaRouteProviderService()
    {
        d = new Messenger(c);
    }

    static int a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger)
    {
        return mediarouteproviderservice.c(messenger);
    }

    static f a(MediaRouteProviderService mediarouteproviderservice)
    {
        return mediarouteproviderservice.g;
    }

    static String a(Messenger messenger)
    {
        return d(messenger);
    }

    static void a(Messenger messenger, int l)
    {
        if (l != 0)
        {
            b(messenger, 0, l, 0, null, null);
        }
    }

    static void a(Messenger messenger, int l, int i1, int j1, Object obj, Bundle bundle)
    {
        b(messenger, l, i1, 0, obj, bundle);
    }

    static void a(MediaRouteProviderService mediarouteproviderservice, k k1)
    {
        Bundle bundle;
        int i1;
        if (k1 != null)
        {
            bundle = k1.c();
        } else
        {
            bundle = null;
        }
        i1 = mediarouteproviderservice.b.size();
        for (int l = 0; l < i1; l++)
        {
            o o1 = (o)mediarouteproviderservice.b.get(l);
            b(o1.a, 5, 0, 0, bundle, null);
            if (a)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(o1).append(": Sent descriptor change event, descriptor=").append(k1).toString());
            }
        }

    }

    private boolean a(Messenger messenger, int l, int i1)
    {
        if (i1 > 0 && c(messenger) < 0)
        {
            o o1 = new o(this, messenger, i1);
            if (o1.a())
            {
                b.add(o1);
                if (a)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(o1).append(": Registered, version=").append(i1).toString());
                }
                if (l != 0)
                {
                    Object obj = g.e();
                    if (obj != null)
                    {
                        obj = ((k) (obj)).c();
                    } else
                    {
                        obj = null;
                    }
                    b(messenger, 2, l, 1, obj, null);
                }
                return true;
            }
        }
        return false;
    }

    static boolean a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int l)
    {
        int i1 = mediarouteproviderservice.c(messenger);
        if (i1 >= 0)
        {
            mediarouteproviderservice = (o)mediarouteproviderservice.b.remove(i1);
            if (a)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(mediarouteproviderservice).append(": Unregistered").toString());
            }
            mediarouteproviderservice.b();
            b(messenger, l);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int l, int i1)
    {
        return mediarouteproviderservice.a(messenger, l, i1);
    }

    static boolean a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int l, int i1, int j1)
    {
        mediarouteproviderservice = mediarouteproviderservice.b(messenger);
        if (mediarouteproviderservice != null)
        {
            j j2 = mediarouteproviderservice.b(i1);
            if (j2 != null)
            {
                j2.a(j1);
                if (a)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(mediarouteproviderservice).append(": Route volume changed, controllerId=").append(i1).append(", volume=").append(j1).toString());
                }
                b(messenger, l);
                return true;
            }
        }
        return false;
    }

    static boolean a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int l, int i1, Intent intent)
    {
        o o1 = mediarouteproviderservice.b(messenger);
        if (o1 != null)
        {
            j j1 = o1.b(i1);
            if (j1 != null)
            {
                n n1 = null;
                if (l != 0)
                {
                    n1 = new n(mediarouteproviderservice, o1, i1, intent, messenger, l);
                }
                if (j1.a(intent, n1))
                {
                    if (a)
                    {
                        Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(o1).append(": Route control request delivered, controllerId=").append(i1).append(", intent=").append(intent).toString());
                    }
                    return true;
                }
            }
        }
        return false;
    }

    static boolean a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int l, int i1, String s1)
    {
        mediarouteproviderservice = mediarouteproviderservice.b(messenger);
        if (mediarouteproviderservice != null && mediarouteproviderservice.a(s1, i1))
        {
            if (a)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(mediarouteproviderservice).append(": Route controller created, controllerId=").append(i1).append(", routeId=").append(s1).toString());
            }
            b(messenger, l);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int l, e e1)
    {
        o o1 = mediarouteproviderservice.b(messenger);
        if (o1 != null)
        {
            boolean flag = o1.a(e1);
            if (a)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(o1).append(": Set discovery request, request=").append(e1).append(", actuallyChanged=").append(flag).append(", compositeDiscoveryRequest=").append(mediarouteproviderservice.h).toString());
            }
            b(messenger, l);
            return true;
        } else
        {
            return false;
        }
    }

    private o b(Messenger messenger)
    {
        int l = c(messenger);
        if (l >= 0)
        {
            return (o)b.get(l);
        } else
        {
            return null;
        }
    }

    private static void b(Messenger messenger, int l)
    {
        if (l != 0)
        {
            b(messenger, 1, l, 0, null, null);
        }
    }

    private static void b(Messenger messenger, int l, int i1, int j1, Object obj, Bundle bundle)
    {
        Message message = Message.obtain();
        message.what = l;
        message.arg1 = i1;
        message.arg2 = j1;
        message.obj = obj;
        message.setData(bundle);
        try
        {
            messenger.send(message);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MediaRouteProviderSrv", (new StringBuilder("Could not send message to ")).append(d(messenger)).toString(), ((Throwable) (obj)));
        }
    }

    static void b(MediaRouteProviderService mediarouteproviderservice, Messenger messenger)
    {
        int l = mediarouteproviderservice.c(messenger);
        if (l >= 0)
        {
            mediarouteproviderservice = (o)mediarouteproviderservice.b.remove(l);
            if (a)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(mediarouteproviderservice).append(": Binder died").toString());
            }
            mediarouteproviderservice.b();
        }
    }

    static boolean b()
    {
        return a;
    }

    static boolean b(MediaRouteProviderService mediarouteproviderservice)
    {
        Object obj1 = null;
        int i1 = mediarouteproviderservice.b.size();
        int l = 0;
        boolean flag = false;
        Object obj = null;
        while (l < i1) 
        {
            Object obj2 = ((o)mediarouteproviderservice.b.get(l)).c;
            if (obj2 != null && (!((e) (obj2)).a().b() || ((e) (obj2)).b()))
            {
                flag = ((e) (obj2)).b() | flag;
                if (obj == null)
                {
                    obj = obj1;
                    obj1 = obj2;
                } else
                {
                    if (obj1 == null)
                    {
                        obj1 = new t(((e) (obj)).a());
                    }
                    ((t) (obj1)).a(((e) (obj2)).a());
                    obj2 = obj;
                    obj = obj1;
                    obj1 = obj2;
                }
            } else
            {
                Object obj3 = obj;
                obj = obj1;
                obj1 = obj3;
            }
            l++;
            obj2 = obj1;
            obj1 = obj;
            obj = obj2;
        }
        if (obj1 != null)
        {
            obj = new e(((t) (obj1)).a(), flag);
        }
        if (mediarouteproviderservice.h != obj && (mediarouteproviderservice.h == null || !mediarouteproviderservice.h.equals(obj)))
        {
            mediarouteproviderservice.h = ((e) (obj));
            mediarouteproviderservice.g.a(((e) (obj)));
            return true;
        } else
        {
            return false;
        }
    }

    static boolean b(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int l, int i1)
    {
        mediarouteproviderservice = mediarouteproviderservice.b(messenger);
        if (mediarouteproviderservice != null && mediarouteproviderservice.a(i1))
        {
            if (a)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(mediarouteproviderservice).append(": Route controller released, controllerId=").append(i1).toString());
            }
            b(messenger, l);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean b(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int l, int i1, int j1)
    {
        mediarouteproviderservice = mediarouteproviderservice.b(messenger);
        if (mediarouteproviderservice != null)
        {
            j j2 = mediarouteproviderservice.b(i1);
            if (j2 != null)
            {
                j2.b(j1);
                if (a)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(mediarouteproviderservice).append(": Route volume updated, controllerId=").append(i1).append(", delta=").append(j1).toString());
                }
                b(messenger, l);
                return true;
            }
        }
        return false;
    }

    private int c(Messenger messenger)
    {
        int i1 = b.size();
        for (int l = 0; l < i1; l++)
        {
            if (((o)b.get(l)).a(messenger))
            {
                return l;
            }
        }

        return -1;
    }

    static p c(MediaRouteProviderService mediarouteproviderservice)
    {
        return mediarouteproviderservice.e;
    }

    static boolean c(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int l, int i1)
    {
        mediarouteproviderservice = mediarouteproviderservice.b(messenger);
        if (mediarouteproviderservice != null)
        {
            j j1 = mediarouteproviderservice.b(i1);
            if (j1 != null)
            {
                j1.b();
                if (a)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(mediarouteproviderservice).append(": Route selected, controllerId=").append(i1).toString());
                }
                b(messenger, l);
                return true;
            }
        }
        return false;
    }

    private static String d(Messenger messenger)
    {
        return (new StringBuilder("Client connection ")).append(messenger.getBinder().toString()).toString();
    }

    static boolean d(MediaRouteProviderService mediarouteproviderservice, Messenger messenger, int l, int i1)
    {
        mediarouteproviderservice = mediarouteproviderservice.b(messenger);
        if (mediarouteproviderservice != null)
        {
            j j1 = mediarouteproviderservice.b(i1);
            if (j1 != null)
            {
                j1.c();
                if (a)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(mediarouteproviderservice).append(": Route unselected, controllerId=").append(i1).toString());
                }
                b(messenger, l);
                return true;
            }
        }
        return false;
    }

    public abstract f a();

    public IBinder onBind(Intent intent)
    {
        if (intent.getAction().equals("android.media.MediaRouteProviderService"))
        {
            if (g == null)
            {
                intent = a();
                if (intent != null)
                {
                    String s1 = intent.c().a();
                    if (!s1.equals(getPackageName()))
                    {
                        throw new IllegalStateException((new StringBuilder("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: ")).append(s1).append(".  Service package name: ").append(getPackageName()).append(".").toString());
                    }
                    g = intent;
                    g.a(f);
                }
            }
            if (g != null)
            {
                return d.getBinder();
            }
        }
        return null;
    }

}
