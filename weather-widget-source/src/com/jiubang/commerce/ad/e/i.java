// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import com.gau.a.a.d.a;
import com.gau.a.a.e;
import com.gau.a.a.e.b;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.p;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            a

class i
    implements e
{

    final int a;
    final Context b;
    final f c;
    final int d;
    final boolean e;
    final List f;
    final List g;
    final int h;
    final com.jiubang.commerce.ad.e.a i;

    i(com.jiubang.commerce.ad.e.a a1, int k, Context context, f f1, int l, boolean flag, List list, 
            List list1, int i1)
    {
        i = a1;
        a = k;
        b = context;
        c = f1;
        d = l;
        e = flag;
        f = list;
        g = list1;
        h = i1;
        super();
    }

    public void a(a a1, int k)
    {
        j.d("Ad_SDK", (new StringBuilder()).append("loadOnlineAdInfo(error, virtualModuleId:").append(h).append(", reason:").append(k).append(")").toString());
    }

    public void a(a a1, b b1)
    {
        int k;
        try
        {
            b1 = new JSONObject(p.d(b1.a()));
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            a1.printStackTrace();
            b1 = (new StringBuilder()).append("loadOnlineAdInfo(error, virtualModuleId:").append(h).append(", errorMessage:");
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
        if (b1 == null) goto _L2; else goto _L1
_L1:
        a1 = b1.optJSONObject("resourceMap");
_L16:
        if (a1 == null) goto _L4; else goto _L3
_L3:
        if (a1.length() >= 1) goto _L5; else goto _L4
_L4:
        if (b1 == null) goto _L7; else goto _L6
_L6:
        if (j.a)
        {
            j.d("Ad_SDK", (new StringBuilder()).append("loadOnlineAdInfo(error, ").append(a).append(", \u9519\u8BEF\u4EE3\u7801::->").append(b1.optInt("errorCode", -1)).append(", \u9519\u8BEF\u4FE1\u606F::->").append(b1.optString("msg", "")).append(")").toString());
            return;
        }
          goto _L7
_L5:
        com.jiubang.commerce.ad.b.a.i.a(a, a1);
        b1 = com.jiubang.commerce.ad.b.a.i.a(b, c, a, d, e, f, a1);
        if (b1 == null) goto _L9; else goto _L8
_L8:
        a1 = b1.f();
_L14:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        if (!a1.isEmpty())
        {
            g.add(b1);
        }
        if (!j.a) goto _L7; else goto _L10
_L10:
        b1 = (new StringBuilder()).append("loadOnlineAdInfo(success, online ad size:");
        if (a1 == null) goto _L12; else goto _L11
_L11:
        k = a1.size();
_L13:
        j.a("Ad_SDK", b1.append(k).append(")").toString());
        return;
_L9:
        a1 = null;
        continue; /* Loop/switch isn't completed */
_L12:
        k = -1;
          goto _L13
_L7:
        return;
        if (true) goto _L14; else goto _L2
_L2:
        a1 = null;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public void b(a a1)
    {
    }
}
