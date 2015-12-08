// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import com.gau.a.a.e;
import com.gau.a.a.e.b;
import com.jiubang.commerce.ad.b.a;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.h.d;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            a

class c
    implements e
{

    final List a;
    final Context b;
    final com.jiubang.commerce.ad.e.a c;

    c(com.jiubang.commerce.ad.e.a a1, List list, Context context)
    {
        c = a1;
        a = list;
        b = context;
        super();
    }

    public void a(com.gau.a.a.d.a a1, int i)
    {
        j.a("Ad_SDK", (new StringBuilder()).append("saveBatchAdControlInfoFromNetwork(onException, reason:").append(i).toString());
    }

    public void a(com.gau.a.a.d.a a1, b b1)
    {
        JSONObject jsonobject = new JSONObject(p.d(b1.a()));
        if (!jsonobject.has("result")) goto _L2; else goto _L1
_L1:
        a1 = jsonobject.getJSONObject("result");
_L12:
        if (a1 == null) goto _L4; else goto _L3
_L3:
        int i = a1.getInt("status");
_L13:
        a1 = (new StringBuilder()).append("saveBatchAdControlInfoFromNetwork(onFinish, status:").append(i).append("[");
        Iterator iterator;
        boolean flag;
        if (1 == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a("Ad_SDK", a1.append(flag).append("])").toString());
        if (1 != i) goto _L6; else goto _L5
_L5:
        iterator = a.iterator();
_L11:
        if (!iterator.hasNext()) goto _L8; else goto _L7
_L7:
        i = ((d)iterator.next()).a().intValue();
        a1 = jsonobject.optJSONObject("mflag");
        if (com.jiubang.commerce.ad.b.a.a(b, i, a1)) goto _L10; else goto _L9
_L9:
        j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i).append("]ad module(").append(i).append(")removed-saveBatchAdControlInfoFromNetwork").toString());
          goto _L11
_L8:
        return;
_L2:
        a1 = null;
          goto _L12
_L4:
        i = -1;
          goto _L13
_L10:
        com.jiubang.commerce.ad.b.a.j j1 = com.jiubang.commerce.ad.b.a.j.a(i, jsonobject);
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i).append("]virtualModuleId=").append(i).append(" user=").append(j1.b()).append(" buychanneltype=").append(j1.a()).toString());
        j1.a(i);
        f f1;
        a1 = jsonobject.getJSONObject("datas");
        j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i).append("]saveBatchAdControlInfoFromNetwork(").append(i).append(", ").append(a1).append(")").toString());
        f.a(i, a1);
        f1 = f.a(b, i, a1);
        if (f1 == null) goto _L11; else goto _L14
_L14:
        b1 = f1.s();
        if (b1 == null) goto _L16; else goto _L15
_L15:
        if (!b1.isEmpty()) goto _L17; else goto _L16
_L16:
        a1 = b1;
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        a1 = new ArrayList();
        a1.add(f1);
        break MISSING_BLOCK_LABEL_571;
_L18:
        if (i >= a1.size())
        {
            break MISSING_BLOCK_LABEL_470;
        }
        ((f)a1.get(i)).a(j1);
        i++;
          goto _L18
        a1 = a1.iterator();
_L21:
        if (!a1.hasNext()) goto _L11; else goto _L19
_L19:
        b1 = (f)a1.next();
        if (b1 == null) goto _L21; else goto _L20
_L20:
        if (b1.o() != 1) goto _L21; else goto _L22
_L22:
        com.jiubang.commerce.database.b.c.a(b).a();
          goto _L11
        a1;
        a1.printStackTrace();
          goto _L11
_L6:
        try
        {
            j.a("Ad_SDK", (new StringBuilder()).append("saveBatchAdControlInfoFromNetwork(onFinish--fail, status:").append(i).append(", responseJson:").append(jsonobject).append(")").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.gau.a.a.d.a a1)
        {
            a1.printStackTrace();
        }
          goto _L8
_L17:
        a1 = b1;
        i = 0;
          goto _L18
    }

    public void b(com.gau.a.a.d.a a1)
    {
        j.a("Ad_SDK", "saveBatchAdControlInfoFromNetwork(onStart)");
    }
}
