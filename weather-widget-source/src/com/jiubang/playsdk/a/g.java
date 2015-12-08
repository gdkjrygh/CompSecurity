// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.a;

import android.text.TextUtils;
import com.android.a.a.i;
import com.android.a.m;
import com.android.a.t;
import com.jiubang.playsdk.d.a;
import com.jiubang.playsdk.d.e;
import com.jiubang.playsdk.d.j;
import com.jiubang.playsdk.f.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.playsdk.a:
//            p, y, d

class g
    implements p
{

    final d a;
    private long b;

    public g(d d, long l1)
    {
        a = d;
        super();
        b = l1;
    }

    public t a(m m1)
    {
        e e1;
        Object obj;
        obj = l.a(m1.b);
        e1 = new e();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_116;
        }
        JSONObject jsonobject;
        jsonobject = new JSONObject(((String) (obj)));
        obj = jsonobject.optJSONObject("result");
        jsonobject = jsonobject.optJSONObject("appinfo");
        if (obj != null && jsonobject != null)
        {
            try
            {
                j j1 = new j();
                j1.a(((JSONObject) (obj)).toString());
                if (j1.a() == 1)
                {
                    a a1 = new a();
                    a1.a(jsonobject.toString());
                    e1.a(a1.d());
                    e1.a(a1);
                }
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
        }
        return t.a(e1, i.a(m1));
    }

    public Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("handle", "0");
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("appid", b);
            jsonobject.put("pkgname", "");
            jsonobject.put("must", 1);
            jsonobject.put("phead", com.jiubang.playsdk.d.i.a(com.jiubang.playsdk.a.y.a().d(), "6.3", com.jiubang.playsdk.a.y.a().e(), 0, com.jiubang.playsdk.a.y.a().b(com.jiubang.playsdk.a.y.a().d())));
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        hashmap.put("data", jsonobject.toString());
        hashmap.put("shandle", "1");
        return hashmap;
    }
}
