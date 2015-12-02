// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.network.uspout.UspoutClient;
import com.ubercab.network.uspout.model.Message;
import java.util.HashMap;
import java.util.Map;

public final class dco
    implements iji
{

    private final gju a = new gju();
    private final dak b;
    private final UspoutClient c;
    private final dcp d;
    private final ThreadLocal e = new ThreadLocal();

    public dco(UspoutClient uspoutclient, dak dak1, dcp dcp1)
    {
        b = dak1;
        c = uspoutclient;
        d = dcp1;
    }

    private String a()
    {
        String s = (String)e.get();
        if (s != null)
        {
            e.remove();
        }
        return s;
    }

    private void a(int i, String s, String s1)
    {
        Object obj = null;
        if (!d.a(i, s))
        {
            return;
        }
        HashMap hashmap = new HashMap();
        hashmap.put("MESSAGE_CONTENT", s1);
        hashmap.put("MESSAGE_TAG", s);
        hashmap.put("MESSAGE_PRIORITY", Integer.valueOf(i));
        if (b.c() == null)
        {
            s = Message.create(hashmap, gju.a());
        } else
        {
            s1 = b.c().getUberLatLng();
            if (s1 == null)
            {
                s = null;
            } else
            {
                s = Double.valueOf(s1.a());
            }
            if (s1 == null)
            {
                s1 = obj;
            } else
            {
                s1 = Double.valueOf(s1.b());
            }
            s = Message.create(hashmap, gju.a(), s, s1);
        }
        c.a(new Message[] {
            s
        });
    }

    private void a(int i, String s, Throwable throwable)
    {
        if (s != null && s.length() != 0) goto _L2; else goto _L1
_L1:
        String s1;
        if (throwable == null)
        {
            return;
        }
        s1 = Log.getStackTraceString(throwable);
_L4:
        a(i, b(), s1);
        return;
_L2:
        s1 = s;
        if (throwable != null)
        {
            s1 = (new StringBuilder()).append(s).append("\n").append(Log.getStackTraceString(throwable)).toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private String b()
    {
        String s = a();
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
    }

    private static transient String e(String s, Object aobj[])
    {
        if (aobj.length == 0)
        {
            return s;
        } else
        {
            return String.format(s, aobj);
        }
    }

    public final void a(String s)
    {
        e.set(s);
    }

    public final transient void a(String s, Object aobj[])
    {
        a(4, e(s, aobj), ((Throwable) (null)));
    }

    public final transient void a(Throwable throwable, String s, Object aobj[])
    {
        a(4, e(s, aobj), throwable);
    }

    public final transient void b(String s, Object aobj[])
    {
        a(6, e(s, aobj), ((Throwable) (null)));
    }

    public final transient void b(Throwable throwable, String s, Object aobj[])
    {
        a(6, e(s, aobj), throwable);
    }

    public final transient void c(String s, Object aobj[])
    {
        a(3, e(s, aobj), ((Throwable) (null)));
    }

    public final transient void c(Throwable throwable, String s, Object aobj[])
    {
        a(3, e(s, aobj), throwable);
    }

    public final transient void d(String s, Object aobj[])
    {
        a(5, e(s, aobj), ((Throwable) (null)));
    }

    public final transient void d(Throwable throwable, String s, Object aobj[])
    {
        a(5, e(s, aobj), throwable);
    }
}
