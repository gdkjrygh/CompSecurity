// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import android.content.Context;
import android.util.Log;
import com.google.android.apps.ytremote.backend.model.Method;
import com.google.android.apps.ytremote.backend.model.Params;
import com.google.android.apps.ytremote.backend.model.f;
import com.google.android.apps.ytremote.fork.net.async.p;
import com.google.android.apps.ytremote.util.c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            HttpClientConnection, ChunkStream, s, j, 
//            b, u

class a
{

    private static final String d = com/google/android/apps/ytremote/backend/browserchannel/a.getCanonicalName();
    protected HttpClientConnection a;
    protected HttpClientConnection b;
    volatile String c;
    private int e;
    private final String f;
    private final String g;
    private final ChunkStream h;
    private final p i;
    private final String j;
    private final String k;
    private final String l;
    private String m;
    private int n;
    private int o;

    public a(Context context, p p1, String s1, int i1, String s2, u u, Map map, 
            Map map1, Map map2)
    {
        this(p1, s1, s2, u, map, map1, map2, new HttpClientConnection(context, p1, s1, i1), new HttpClientConnection(context, p1, s1, i1));
    }

    private a(p p1, String s1, String s2, u u, Map map, Map map1, Map map2, 
            HttpClientConnection httpclientconnection, HttpClientConnection httpclientconnection1)
    {
        n = 0;
        f = (String)com.google.android.apps.ytremote.util.c.a(s1);
        if (!s2.endsWith("/"))
        {
            throw new IllegalArgumentException(String.valueOf("channelPathPrefix must end with '/'"));
        } else
        {
            g = s2;
            k = com.google.android.apps.ytremote.a.c.a.b(map2);
            l = com.google.android.apps.ytremote.a.c.a.a(map);
            j = com.google.android.apps.ytremote.a.c.a.a(map1);
            o = 1;
            a = httpclientconnection;
            b = httpclientconnection1;
            h = new ChunkStream();
            h.a(new s(this, u));
            i = p1;
            return;
        }
    }

    private String b(Method method, Params params)
    {
        int i1 = n;
        n = i1 + 1;
        try
        {
            method = (new StringBuilder("count=1")).append("&req").append(i1).append("__sc=").append(method);
            f f1;
            for (params = params.iterator(); params.hasNext(); method.append("&req").append(i1).append("_").append(f1.a).append("=").append(URLEncoder.encode(f1.b, "UTF-8")))
            {
                f1 = (f)params.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new RuntimeException(method);
        }
        method = method.toString();
        return method;
    }

    private String b(String s1)
    {
        Object obj = (new StringBuilder()).append(s1).append("?RID=TBD");
        if (c != null)
        {
            s1 = (new StringBuilder("&SID=")).append(c).toString();
        } else
        {
            s1 = "";
        }
        obj = ((StringBuilder) (obj)).append(s1).append("&VER=8&CVER=1").toString();
        s1 = ((String) (obj));
        if (m != null)
        {
            s1 = (new StringBuilder()).append(((String) (obj))).append("&gsessionid=").append(m).toString();
        }
        return s1;
    }

    static String c()
    {
        return d;
    }

    private String c(String s1)
    {
        return (new StringBuilder("Connection: Keep-Alive\r\nContent-Length: ")).append(s1.length()).append("\r\nContent-Type: application/x-www-form-urlencoded\r\n").append("Host: ").append(f).append("\r\nUser-Agent: YouTubeRemote\r\n").append(k).append("\r\n").append(s1).toString();
    }

    private j d(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s1 = s1.replace("RID=TBD", (new StringBuilder("RID=")).append(o).toString());
        s1 = b.a(s1);
        if (s1.b() == 200)
        {
            o = o + 1;
        }
        this;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        throw s1;
    }

    public final j a(Method method, Params params)
    {
        String s1 = b((new StringBuilder()).append(g).append("bind").toString());
        method = b(method, params);
        return d((new StringBuilder("POST ")).append(s1).append(" HTTP/1.1\r\n").append(c(method)).toString());
    }

    public final void a()
    {
        Object obj = (new StringBuilder()).append(b((new StringBuilder()).append(g).append("bind").toString())).append('&').append(j).toString();
        obj = d((new StringBuilder("POST ")).append(((String) (obj))).append(" HTTP/1.1\r\n").append(c(l)).toString());
        h.a(((j) (obj)).b());
        h.a((new String(((j) (obj)).a(), "UTF-8")).toCharArray());
    }

    final void a(int i1)
    {
        e = i1;
    }

    final void a(String s1)
    {
        m = s1;
    }

    public final void a(boolean flag)
    {
        String s1;
        String s2;
        if (flag)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        s2 = (new StringBuilder()).append(g).append("bind?RID=rpc").append("&SID=").append(c).append("&AID=").append(e).append("&CI=").append(s1).append("&TYPE=xmlhttp").toString();
        s1 = s2;
        if (m != null)
        {
            s1 = (new StringBuilder()).append(s2).append("&gsessionid=").append(m).toString();
        }
        s1 = (new StringBuilder("GET ")).append(s1).append(" HTTP/1.1\r\n").append(c("")).toString();
        a.a(h);
        a.a(s1);
    }

    public final void a(boolean flag, boolean flag1)
    {
        String s2 = (new StringBuilder()).append(b((new StringBuilder()).append(g).append("bind").toString())).append("&TYPE=terminate").toString();
        String s1;
        s1 = s2;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        s1 = (new StringBuilder()).append(s2).append("&ui").toString();
        d((new StringBuilder("GET ")).append(s1).append(" HTTP/1.1\r\n").append(c("")).toString());
_L2:
        c = null;
        b.a();
        a.a();
        i.c();
        return;
        Exception exception;
        exception;
        Log.w(d, "Terminate request failed", exception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean b()
    {
        String s1 = (new StringBuilder()).append(g).append("test?VER=8").append("&TYPE=xmlhttp").toString();
        s1 = (new StringBuilder("GET ")).append(s1).append(" HTTP/1.1\r\n").append(c("")).toString();
        boolean aflag[] = new boolean[1];
        aflag[0] = true;
        b b1 = new b(this, aflag);
        b.a(b1);
        b.a(s1);
        b.a(null);
        return aflag[0];
    }

    public String toString()
    {
        return (new StringBuilder("Session id: ")).append(c).append(" GFE Session cookie: ").append(m).toString();
    }

}
