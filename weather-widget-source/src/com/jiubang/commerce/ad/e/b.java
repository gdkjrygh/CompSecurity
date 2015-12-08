// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import com.gau.a.a.e;
import com.jiubang.commerce.ad.b.a;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.database.b.c;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            k, a

class b
    implements e
{

    final int a;
    final Context b;
    final k c;
    final com.jiubang.commerce.ad.e.a d;

    b(com.jiubang.commerce.ad.e.a a1, int i, Context context, k k1)
    {
        d = a1;
        a = i;
        b = context;
        c = k1;
        super();
    }

    public void a(com.gau.a.a.d.a a1, int i)
    {
        c.a(18, null, null);
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a).append("]getAdControlInfoFromNetwork(onException, reason:").append(i).append(", virtualModuleId:").append(a).append(")").toString());
        }
    }

    public void a(com.gau.a.a.d.a a1, com.gau.a.a.e.b b1)
    {
        boolean flag = false;
        b1 = new JSONObject(p.d(b1.a()));
        if (!b1.has("result")) goto _L2; else goto _L1
_L1:
        a1 = b1.getJSONObject("result");
_L19:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_693;
        }
        int i = a1.getInt("status");
_L20:
        if (!j.a) goto _L4; else goto _L3
_L3:
        a1 = (new StringBuilder()).append("[vmId:").append(a).append("]getAdControlInfoFromNetwork(onFinish, status:").append(i).append("[");
        f f1;
        Object obj;
        boolean flag1;
        if (1 == i)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j.a("Ad_SDK", a1.append(flag1).append("], virtualModuleId:").append(a).append(")").toString());
_L4:
        if (1 != i) goto _L6; else goto _L5
_L5:
        a1 = b1.optJSONObject("mflag");
        if (!com.jiubang.commerce.ad.b.a.a(b, a, a1))
        {
            if (j.a)
            {
                j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a).append("]ad module(").append(a).append(")removed-getAdControlInfoFromNetwork").toString());
            }
            c.a(19, null, null);
            return;
        }
        obj = com.jiubang.commerce.ad.b.a.j.a(a, b1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a).append("]virtualModuleId=").append(a).append(" user=").append(((com.jiubang.commerce.ad.b.a.j) (obj)).b()).append(" buychanneltype=").append(((com.jiubang.commerce.ad.b.a.j) (obj)).a()).toString());
        }
        ((com.jiubang.commerce.ad.b.a.j) (obj)).a(a);
        a1 = b1.getJSONObject("datas");
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a).append("]getAdControlInfoFromNetwork(").append(a).append(", ").append(a1).append(")").toString());
        }
        f.a(a, a1);
        f1 = f.a(b, a, a1);
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_683;
        }
        b1 = f1.s();
        if (b1 == null) goto _L8; else goto _L7
_L7:
        if (!b1.isEmpty()) goto _L9; else goto _L8
_L8:
        a1 = b1;
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_441;
        }
        a1 = new ArrayList();
        a1.add(f1);
        i = ((flag) ? 1 : 0);
_L10:
        if (i >= a1.size())
        {
            break MISSING_BLOCK_LABEL_489;
        }
        ((f)a1.get(i)).a(((com.jiubang.commerce.ad.b.a.j) (obj)));
        i++;
          goto _L10
        obj = a1.iterator();
_L12:
        b1 = a1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_544;
        }
        b1 = (f)((Iterator) (obj)).next();
        if (b1 == null) goto _L12; else goto _L11
_L11:
        if (b1.o() != 1) goto _L12; else goto _L13
_L13:
        com.jiubang.commerce.database.b.c.a(b).a();
        b1 = a1;
_L16:
        if (b1 == null) goto _L15; else goto _L14
_L14:
        if (!b1.isEmpty())
        {
            c.a(16, f1, b1);
            return;
        }
          goto _L15
_L17:
        c.a(18, null, null);
        return;
        b1;
        b1.printStackTrace();
        b1 = a1;
          goto _L16
_L15:
        try
        {
            c.a(20, f1, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.gau.a.a.d.a a1)
        {
            a1.printStackTrace();
        }
          goto _L17
_L6:
        if (!j.a) goto _L17; else goto _L18
_L18:
        j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a).append("]getAdControlInfoFromNetwork(onFinish--fail, status:").append(i).append(", responseJson:").append(b1).append(")").toString());
          goto _L17
_L9:
        a1 = b1;
        i = ((flag) ? 1 : 0);
          goto _L10
        b1 = null;
          goto _L16
_L2:
        a1 = null;
          goto _L19
        i = -1;
          goto _L20
    }

    public void b(com.gau.a.a.d.a a1)
    {
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a).append("]getAdControlInfoFromNetwork(onStart, virtualModuleId:").append(a).append(")").toString());
        }
    }
}
