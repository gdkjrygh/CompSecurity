// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.android.volley.ParseError;
import com.android.volley.j;
import com.android.volley.m;
import com.android.volley.o;
import com.android.volley.toolbox.e;
import com.google.a.a.a.a.vd;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.a.g;
import com.google.android.apps.youtube.datalib.a.i;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.a.r;
import com.google.android.apps.youtube.datalib.c.f;
import com.google.android.apps.youtube.datalib.config.a;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            s

public final class q extends r
{

    private final s a;
    private final Class b;
    private final o c;
    private final f d;
    private final List e;
    private final List f;
    private final a g;
    private final String h;
    private final String i;

    private q(s s1, Class class1, l l1, f f1, List list, List list1, a a1, 
            String s2, String s3)
    {
        super(1, "", new i(l1, a1));
        a = (s)com.google.android.apps.youtube.common.fromguava.c.a(s1);
        b = (Class)com.google.android.apps.youtube.common.fromguava.c.a(class1);
        c = (o)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        d = (f)com.google.android.apps.youtube.common.fromguava.c.a(f1);
        e = (List)com.google.android.apps.youtube.common.fromguava.c.a(list);
        f = (List)com.google.android.apps.youtube.common.fromguava.c.a(list1);
        g = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        h = s2;
        i = s3;
    }

    q(s s1, Class class1, l l1, f f1, List list, List list1, a a1, 
            String s2, String s3, byte byte0)
    {
        this(s1, class1, l1, f1, list, list1, a1, s2, s3);
    }

    private com.google.protobuf.nano.c a(byte abyte0[])
    {
        try
        {
            abyte0 = com.google.protobuf.nano.c.a((com.google.protobuf.nano.c)b.newInstance(), abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException("Programmer error using reflection.");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException("Programmer error using reflection.");
        }
        return abyte0;
    }

    protected final m a(j j1)
    {
        com.google.protobuf.nano.c c1;
        try
        {
            c1 = a(j1.b);
            vd vd1 = new vd();
            com.google.protobuf.nano.c.a(vd1, j1.b);
            if (vd1.b != null)
            {
                for (Iterator iterator = f.iterator(); iterator.hasNext(); ((g)iterator.next()).a(vd1.b)) { }
            }
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            L.a("Failed while attemping to deserialize network response", j1);
            return m.a(new ParseError(j1));
        }
        j1 = m.a(c1, com.android.volley.toolbox.e.a(j1));
        return j1;
    }

    protected final volatile void a(Object obj)
    {
        obj = (com.google.protobuf.nano.c)obj;
        c.a(obj);
    }

    public final List b(j j1)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList();
        arraylist.add((new StringBuilder("Response type: ")).append(b.getName()).append("\n").toString());
        arraylist.add((new StringBuilder("Status: ")).append(j1.a).append("\n").toString());
        String s1;
        for (Iterator iterator = j1.c.keySet().iterator(); iterator.hasNext(); arraylist.add((new StringBuilder("Header:")).append(s1).append(":").append((String)j1.c.get(s1)).append("\n").toString()))
        {
            s1 = (String)iterator.next();
        }

        int k = j1.a;
        if (k != 200)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        try
        {
            arraylist.add((new StringBuilder("Actual response length (as proto): ")).append(j1.b.length).toString());
            for (j1 = com.google.android.apps.youtube.common.e.m.a(com.google.android.apps.youtube.datalib.a.j.a(a(j1.b)).toString(), 2048).iterator(); j1.hasNext(); arraylist.add((String)j1.next())) { }
            break MISSING_BLOCK_LABEL_280;
        }
        // Misplaced declaration of an exception variable
        catch (j j1) { }
        finally
        {
            throw j1;
        }
        arraylist.add("Could not parse response. See earlier logcat.");
        L.a("Could not parse response", j1);
_L1:
        this;
        JVM INSTR monitorexit ;
        return arraylist;
        arraylist.add((new StringBuilder("Error response: ")).append(new String(j1.b)).toString());
          goto _L1
    }

    public final String c()
    {
        android.net.Uri.Builder builder = g.f().buildUpon().appendEncodedPath(g.c()).appendEncodedPath(a.e()).appendQueryParameter("key", h);
        if (!TextUtils.isEmpty(i))
        {
            builder.appendQueryParameter("asig", i);
        }
        java.util.Map.Entry entry;
        for (Iterator iterator = a.a().entrySet().iterator(); iterator.hasNext(); builder.appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return builder.build().toString();
    }

    public final Map h()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("Content-Type", "application/x-protobuf");
        d.a(hashmap, c(), l());
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((com.google.android.apps.youtube.datalib.a.e)iterator.next()).a(hashmap)) { }
        return hashmap;
    }

    public final byte[] l()
    {
        a.b();
        return com.google.protobuf.nano.c.a(a.f());
    }

    public final String s()
    {
        StringBuilder stringbuilder = new StringBuilder();
        try
        {
            stringbuilder.append("curl ");
            Map map = h();
            Iterator iterator = map.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                if (!s1.equals("Content-Type"))
                {
                    stringbuilder.append((new StringBuilder("-H \"")).append(s1).append(":").append((String)map.get(s1)).append("\" ").toString());
                }
            } while (true);
        }
        catch (AuthFailureError authfailureerror)
        {
            L.c("Curl command line not available", authfailureerror);
        }
        stringbuilder.append("-H \"Content-Type:application/json\" ");
        stringbuilder.append("-d '");
        stringbuilder.append(com.google.android.apps.youtube.datalib.a.j.a(a.f()).toString());
        stringbuilder.append("' ");
        stringbuilder.append(c());
        return stringbuilder.toString();
    }
}
