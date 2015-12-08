// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.a;

import com.android.a.a.i;
import com.android.a.m;
import com.android.a.t;
import com.jiubang.playsdk.f.e;
import com.jiubang.playsdk.f.k;
import com.jiubang.playsdk.main.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.playsdk.a:
//            p, d, y

class j
    implements p
{

    final d a;

    public j(d d1)
    {
        a = d1;
        super();
    }

    public t a(m m1)
    {
        Object obj;
        boolean flag;
        flag = true;
        obj = new String(m1.b);
        long l;
        long l1;
        l = (new JSONObject(((String) (obj)))).optLong("themeNewMark", 0L);
        obj = new k(com.jiubang.playsdk.a.d.c(a), "request_info");
        l1 = ((k) (obj)).b("theme_refresh_id", 0L);
          goto _L1
_L2:
        ((k) (obj)).a("theme_refresh_id", l);
        ((k) (obj)).a();
_L3:
        return t.a(Boolean.valueOf(flag), i.a(m1));
_L1:
        if (l1 != 0L && l <= l1)
        {
            flag = false;
        }
          goto _L2
        JSONException jsonexception;
        jsonexception;
        flag = false;
_L4:
        jsonexception.printStackTrace();
          goto _L3
        jsonexception;
          goto _L4
    }

    public Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("key", "themeNewMark");
        hashmap.put("clientid", (new StringBuilder()).append(y.a().b().l()).append("").toString());
        hashmap.put("channel", e.f(y.a().d()));
        hashmap.put("local", e.e(y.a().d()));
        return hashmap;
    }
}
