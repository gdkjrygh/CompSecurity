// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import com.gau.a.a.d.a;
import com.gau.a.a.e;
import com.gau.a.a.e.b;
import com.jiubang.commerce.utils.p;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            l, a

class j
    implements e
{

    final int a;
    final Context b;
    final l c;
    final com.jiubang.commerce.ad.e.a d;

    j(com.jiubang.commerce.ad.e.a a1, int i, Context context, l l1)
    {
        d = a1;
        a = i;
        b = context;
        c = l1;
        super();
    }

    public void a(a a1, int i)
    {
        if (com.jiubang.commerce.utils.j.a)
        {
            com.jiubang.commerce.utils.j.c("Ad_SDK", (new StringBuilder()).append("[adPos:").append(a).append("]loadIntelligentAdInfo(onException, reason:").append(i).append(")").toString());
        }
        c.a(null);
    }

    public void a(a a1, b b1)
    {
        b b2;
        String s;
        Object obj;
        obj = null;
        s = null;
        b2 = s;
        a1 = obj;
        b1 = new JSONObject(p.d(b1.a()));
        b2 = s;
        a1 = obj;
        b1 = com.jiubang.commerce.ad.b.a.e.a(b, a, b1);
        if (b1 == null) goto _L2; else goto _L1
_L1:
        b2 = b1;
        a1 = b1;
        if (b1.a() == 1) goto _L3; else goto _L2
_L2:
        b2 = b1;
        a1 = b1;
        if (!com.jiubang.commerce.utils.j.a) goto _L3; else goto _L4
_L4:
        if (b1 == null) goto _L6; else goto _L5
_L5:
        b2 = b1;
        a1 = b1;
        s = b1.c();
_L8:
        b2 = b1;
        a1 = b1;
        com.jiubang.commerce.utils.j.d("Ad_SDK", (new StringBuilder()).append("[adPos:").append(a).append("]loadIntelligentAdInfo(serverError,message:").append(s).append(")").toString());
_L3:
        c.a(b1);
        return;
_L6:
        s = "null";
        if (true) goto _L8; else goto _L7
_L7:
        b1;
        a1 = b2;
        com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("loadIntelligentAdInfo--error, adPos:").append(a).toString(), b1);
        c.a(b2);
        return;
        b1;
        c.a(a1);
        throw b1;
    }

    public void b(a a1)
    {
        com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[adPos:").append(a).append("]loadIntelligentAdInfo(start)").toString());
    }
}
