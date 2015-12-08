// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.csi.lib;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

// Referenced classes of package com.google.android.apps.common.csi.lib:
//            Sender, k

public final class g
    implements Sender
{

    private String a;
    private String b;

    public g()
    {
    }

    public g(String s, String s1)
    {
        Object obj = null;
        super();
        if (k.a(s))
        {
            s = null;
        } else
        {
            s = s.trim();
        }
        a = s;
        if (k.a(s1))
        {
            s = obj;
        } else
        {
            s = s1.trim();
        }
        b = s;
    }

    public final void a(String s, Map map)
    {
        String s1;
        Object obj1;
        String s2;
        s2 = k.a(s, map);
        s1 = k.a();
        if (!k.a(a) && !k.a(b))
        {
            s1 = String.format("%s %s/%s", new Object[] {
                s1, a, b
            });
        }
        k.a("SenderHttpURLConnection", (new StringBuilder("User Agent: ")).append(s1).toString());
        s = null;
        obj1 = null;
        map = (HttpURLConnection)(new URL(s2)).openConnection();
        map.setRequestProperty("User-Agent", s1);
        k.a("SenderHttpURLConnection", (new StringBuilder("to send ")).append(s2).toString());
        map.getResponseCode();
        if (map != null)
        {
            map.disconnect();
        }
        return;
        map;
        s = null;
_L4:
        k.b("SenderHttpURLConnection", (new StringBuilder("wrong url format: ")).append(s2).toString());
        throw new Sender.SenderException(map.getMessage());
        map;
_L1:
        if (s != null)
        {
            s.disconnect();
        }
        throw map;
        Object obj;
        obj;
        map = obj1;
_L2:
        s = map;
        k.b("SenderHttpURLConnection", "IO error");
        s = map;
        throw new Sender.SenderException(((IOException) (obj)).getMessage());
        map;
          goto _L1
        obj;
        s = map;
        map = ((Map) (obj));
          goto _L1
        obj;
          goto _L2
        obj;
        s = map;
        map = ((Map) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }
}
