// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.a;

import com.android.a.m;
import com.android.a.t;
import com.jiubang.playsdk.d.d;
import com.jiubang.playsdk.d.f;
import com.jiubang.playsdk.d.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.jiubang.playsdk.a:
//            p, w, d, t, 
//            s

class i
    implements p
{

    final com.jiubang.playsdk.a.d a;
    private String b;
    private h c;

    i(com.jiubang.playsdk.a.d d1, String s1, h h1)
    {
        a = d1;
        super();
        b = s1;
        c = h1;
    }

    public t a(m m1)
    {
        Object obj;
        byte abyte0[] = m1.b;
        obj = null;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        try
        {
            obj = (Map)d.a(a).b(abyte0, true, c.a(), c.b(), c.c(), c.d());
        }
        // Misplaced declaration of an exception variable
        catch (m m1)
        {
            m1.printStackTrace();
            return t.a(m1);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        if (((Map) (obj)).get(b) != null || c.c() != 0)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        d.b(a).a(b, true);
        throw new w((new StringBuilder()).append("\u8BE5\u8BF7\u6C42\u65E0\u5185\u5BB9,mCacheKey=").append(b).append(",resultObject = ").append(obj).toString());
        obj = ((Map) (obj)).entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        d d1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_235;
            }
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            d1 = (d)entry.getValue();
        } while (d1 == null);
        if (!d1.b()) goto _L2; else goto _L1
_L1:
        d.b(a).a((String)entry.getKey(), entry.getValue());
          goto _L2
        obj = d.b(a).c(b);
        return t.a(obj, com.android.a.a.i.a(m1));
    }

    public Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("handle", "0");
        hashmap.put("data", f.a(c));
        hashmap.put("shandle", "1");
        return hashmap;
    }
}
