// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            cm, bg, c, cj, 
//            be

public abstract class cl
{

    private static final String a = com/paypal/android/sdk/onetouch/core/cl.getSimpleName();
    private static long j = 1L;
    private String b;
    private String c;
    private Map d;
    private final cm e;
    private final c f;
    private cj g;
    private String h;
    private be i;
    private long k;

    public cl(cj cj, cm cm1, c c1, String s)
    {
        long l1 = j;
        j = 1L + l1;
        k = l1;
        g = cj;
        h = s;
        e = cm1;
        f = c1;
        d = new LinkedHashMap();
    }

    public static JSONObject c(String s)
    {
        Object obj = (new JSONTokener(s)).nextValue();
        if (!(obj instanceof JSONObject))
        {
            throw new JSONException((new StringBuilder("could not parse:")).append(s).append("\nnextValue:").append(obj).toString());
        } else
        {
            return (JSONObject)obj;
        }
    }

    public static void k()
    {
    }

    public static void l()
    {
    }

    public String a(cj cj)
    {
        String s = e.a(cj);
        if (s != null)
        {
            cj = s;
            if (h != null)
            {
                cj = (new StringBuilder()).append(s).append(h).toString();
            }
            return cj;
        } else
        {
            throw new RuntimeException((new StringBuilder("API ")).append(cj.toString()).append(" has no record for server ").append(e.a()).toString());
        }
    }

    public final void a(be be)
    {
        if (i != null)
        {
            IllegalStateException illegalstateexception = new IllegalStateException("Multiple exceptions reported");
            Log.e(a, (new StringBuilder("first error=")).append(i).toString());
            Log.e(a, (new StringBuilder("second error=")).append(be).toString());
            Log.e(a, "", illegalstateexception);
            throw illegalstateexception;
        } else
        {
            i = be;
            return;
        }
    }

    public final void a(String s)
    {
        b = s;
    }

    protected final void a(String s, String s1)
    {
        d.put(s, s1);
    }

    public final void a(String s, String s1, String s2)
    {
        a(((be) (new bg(s, s1, null))));
    }

    public boolean a()
    {
        return false;
    }

    public abstract String b();

    public final void b(String s)
    {
        c = s;
    }

    public abstract void c();

    public abstract void d();

    public abstract String e();

    public final c f()
    {
        return f;
    }

    public final String g()
    {
        return b;
    }

    public final String h()
    {
        return c;
    }

    public final cj i()
    {
        return g;
    }

    public final Map j()
    {
        return d;
    }

    protected final JSONObject m()
    {
        return c(c);
    }

    public final String n()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" SN:").append(k).toString();
    }

    public final long o()
    {
        return k;
    }

    public final boolean p()
    {
        return i == null;
    }

    public final cm q()
    {
        return e;
    }

}
