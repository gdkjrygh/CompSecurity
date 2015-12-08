// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.a;

import com.android.a.a.i;
import com.android.a.t;
import com.jiubang.playsdk.d.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.playsdk.a:
//            p, w, d, t

class m
    implements p
{

    final d a;
    private String b;
    private int c;
    private int d;

    m(d d1, String s, int j, int k)
    {
        a = d1;
        super();
        b = s;
        c = j;
        d = k;
    }

    public t a(com.android.a.m m1)
    {
        com.jiubang.playsdk.a.a.c c1;
        byte abyte0[];
        abyte0 = m1.b;
        c1 = null;
        com.jiubang.playsdk.a.a.c c2 = com.jiubang.playsdk.a.d.a(a).a(abyte0, true);
        c1 = c2;
_L2:
        return t.a(c1, i.a(m1));
        w w1;
        w1;
        w1.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("handle", "0");
        hashmap.put("data", f.a(b, c, d).toString());
        hashmap.put("shandle", "1");
        return hashmap;
    }
}
