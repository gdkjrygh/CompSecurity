// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import com.gau.a.a.d.a;
import com.gau.a.a.e;
import com.gau.a.a.e.b;
import com.jiubang.commerce.ad.a.c;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.p;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            ae, ag, t

class y
    implements e
{

    final ae a;
    final Context b;
    final t c;

    y(t t, ae ae1, Context context)
    {
        c = t;
        a = ae1;
        b = context;
        super();
    }

    public void a(a a1, int i)
    {
        a.a(17);
        j.d("Ad_SDK", (new StringBuilder()).append("requestUserTags(error, reason:").append(i).append(")").toString());
    }

    public void a(a a1, b b1)
    {
        try
        {
            a1 = new JSONObject(p.d(b1.a()));
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            a1.printStackTrace();
            a1 = null;
        }
        if (a1 == null) goto _L2; else goto _L1
_L1:
        a1 = a1.optString("tags");
_L4:
        if (a1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            a.a(16);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            a1.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_140;
_L2:
        a1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        b1 = new c();
        b1.a(a1);
        com.jiubang.commerce.ad.e.ag.a(b).a(a1, System.currentTimeMillis());
        if (j.a)
        {
            j.b("Ad_SDK", (new StringBuilder()).append("\u7F51\u7EDC\u83B7\u53D6:ADSdkManager.requestUserTags[ status:Success, tags:").append(b1.a()).append("  ]").toString());
        }
        a.a(b1);
        return;
        a.a(17);
        b1 = (new StringBuilder()).append("requestUserTags(error, errorMessage:");
        if (a1 != null)
        {
            a1 = a1.getMessage();
        } else
        {
            a1 = "";
        }
        j.d("Ad_SDK", b1.append(a1).append(")").toString());
        return;
    }

    public void b(a a1)
    {
    }
}
