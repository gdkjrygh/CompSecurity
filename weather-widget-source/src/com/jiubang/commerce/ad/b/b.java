// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b;

import android.content.Context;
import com.gau.a.a.e;
import com.jiubang.commerce.ad.a.c;
import com.jiubang.commerce.ad.e.ae;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.b:
//            c, a

final class b
    implements ae
{

    final JSONObject a;
    final Context b;
    final int c;
    final e d;

    b(JSONObject jsonobject, Context context, int i, e e)
    {
        a = jsonobject;
        b = context;
        c = i;
        d = e;
        super();
    }

    public void a(int i)
    {
        com.jiubang.commerce.ad.b.a.a(b, c, com.jiubang.commerce.ad.b.c.a("13"), a, true, d);
    }

    public void a(c c1)
    {
        try
        {
            a.put("tags", c1.b());
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            c1.printStackTrace();
        }
        com.jiubang.commerce.ad.b.a.a(b, c, com.jiubang.commerce.ad.b.c.a("13"), a, true, d);
    }
}
