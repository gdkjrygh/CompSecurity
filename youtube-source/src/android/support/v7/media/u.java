// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            y, w, s, t, 
//            f, v, ad

public final class u
{

    static y a;
    private static final boolean d = Log.isLoggable("MediaRouter", 3);
    final Context b;
    final ArrayList c = new ArrayList();

    u(Context context)
    {
        b = context;
    }

    public static u a(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        d();
        if (a == null)
        {
            y y1 = new y(context.getApplicationContext());
            a = y1;
            y1.a();
        }
        return a.a(context);
    }

    public static List a()
    {
        d();
        return a.b();
    }

    public static void a(f f)
    {
        if (f == null)
        {
            throw new IllegalArgumentException("providerInstance must not be null");
        }
        d();
        if (d)
        {
            Log.d("MediaRouter", (new StringBuilder("addProvider: ")).append(f).toString());
        }
        a.a(f);
    }

    public static void a(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("remoteControlClient must not be null");
        }
        d();
        if (d)
        {
            Log.d("MediaRouter", (new StringBuilder("addRemoteControlClient: ")).append(obj).toString());
        }
        a.a(obj);
    }

    public static boolean a(s s1, int i)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            d();
            return a.a(s1, i);
        }
    }

    static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj1 != null && obj.equals(obj1);
    }

    private int b(v v)
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            if (((w)c.get(i)).b == v)
            {
                return i;
            }
        }

        return -1;
    }

    public static ad b()
    {
        d();
        return a.c();
    }

    public static void b(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("remoteControlClient must not be null");
        }
        if (d)
        {
            Log.d("MediaRouter", (new StringBuilder("removeRemoteControlClient: ")).append(obj).toString());
        }
        a.b(obj);
    }

    public static ad c()
    {
        d();
        return a.d();
    }

    static void d()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        } else
        {
            return;
        }
    }

    static boolean e()
    {
        return d;
    }

    public final void a(s s1, v v)
    {
        a(s1, v, 0);
    }

    public final void a(s s1, v v, int i)
    {
        boolean flag = true;
        if (s1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (v == null)
        {
            throw new IllegalArgumentException("callback must not be null");
        }
        d();
        if (d)
        {
            Log.d("MediaRouter", (new StringBuilder("addCallback: selector=")).append(s1).append(", callback=").append(v).append(", flags=").append(Integer.toHexString(i)).toString());
        }
        int j = b(v);
        if (j < 0)
        {
            v = new w(this, v);
            c.add(v);
        } else
        {
            v = (w)c.get(j);
        }
        j = 0;
        if ((~((w) (v)).d & i) != 0)
        {
            v.d = ((w) (v)).d | i;
            j = 1;
        }
        if (!((w) (v)).c.a(s1))
        {
            v.c = (new t(((w) (v)).c)).a(s1).a();
            i = ((flag) ? 1 : 0);
        } else
        {
            i = j;
        }
        if (i != 0)
        {
            a.e();
        }
    }

    public final void a(v v)
    {
        if (v == null)
        {
            throw new IllegalArgumentException("callback must not be null");
        }
        d();
        if (d)
        {
            Log.d("MediaRouter", (new StringBuilder("removeCallback: callback=")).append(v).toString());
        }
        int i = b(v);
        if (i >= 0)
        {
            c.remove(i);
            a.e();
        }
    }

}
