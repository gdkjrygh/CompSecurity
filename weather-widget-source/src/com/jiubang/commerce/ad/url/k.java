// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.url;

import android.text.TextUtils;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.ad.b.a.l;
import com.jiubang.commerce.utils.j;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jiubang.commerce.ad.url:
//            j, d

class k
    implements Runnable
{

    final com.jiubang.commerce.ad.url.j a;

    k(com.jiubang.commerce.ad.url.j j1)
    {
        a = j1;
        super();
    }

    public void run()
    {
        while (com.jiubang.commerce.ad.url.j.a(a) != null && com.jiubang.commerce.ad.url.j.a(a).size() > 0) 
        {
            com.jiubang.commerce.ad.url.j.a(a, (String)com.jiubang.commerce.ad.url.j.a(a).remove(0));
            if (TextUtils.isEmpty(a.b(j.b(a))))
            {
                a a1;
                Object obj;
                String s;
                String s1;
                String s2;
                android.content.Context context;
                if (j.c(a) != null)
                {
                    a1 = (a)j.c(a).get(j.b(a));
                } else
                {
                    a1 = null;
                }
                if (a1 != null)
                {
                    obj = new l();
                    ((l) (obj)).a(a1.a());
                } else
                {
                    obj = null;
                }
                context = j.d(a);
                if (a1 != null)
                {
                    s = String.valueOf(a1.c());
                } else
                {
                    s = "-1";
                }
                if (a1 != null)
                {
                    s1 = String.valueOf(a1.e());
                } else
                {
                    s1 = "-1";
                }
                if (a1 != null)
                {
                    s2 = String.valueOf(a1.d());
                } else
                {
                    s2 = "-1";
                }
                obj = com.jiubang.commerce.ad.url.d.a(context, ((l) (obj)), s, s1, s2, com.jiubang.commerce.ad.url.d.a(j.b(a)));
                j.d("Ad_SDK", (new StringBuilder()).append("getHttpRedirectUrl(").append(com.jiubang.commerce.ad.url.j.a(a).size()).append(", ").append(com.jiubang.commerce.ad.url.d.a(j.b(a))).append("------------------->>").append(((String) (obj))).append(")").toString());
                a.a(a1.f(), j.b(a), ((String) (obj)));
            }
            com.jiubang.commerce.ad.url.j.a(a, "");
        }
    }
}
