// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.a:
//            o, y, h, aa, 
//            e

public class l
{

    private final int a;
    private final int b;
    private final int c;
    private final List d;
    private final AdError e;

    private l(int i, int j, int k, List list, AdError aderror)
    {
        a = i;
        b = j;
        c = k;
        d = list;
        e = aderror;
    }

    public static l a(Context context, JSONObject jsonobject)
    {
        int i = 0;
        int j = jsonobject.optInt("refresh", 0);
        int k = jsonobject.optInt("refresh_threshold", 20);
        int i1 = jsonobject.optInt("min_viewability_percentage", 10);
        Object obj = jsonobject.optJSONObject("reason");
        ArrayList arraylist;
        JSONArray jsonarray;
        int j1;
        if (obj != null)
        {
            obj = new AdError(((JSONObject) (obj)).optInt("code", 2000), ((JSONObject) (obj)).optString("message", AdError.SERVER_ERROR.getErrorMessage()));
        } else
        {
            obj = null;
        }
        j1 = jsonobject.optInt("ad_type");
        arraylist = new ArrayList();
        jsonarray = jsonobject.optJSONArray("ads");
        if (jsonarray == null || jsonarray.length() <= 0) goto _L2; else goto _L1
_L1:
        while (i < jsonarray.length()) 
        {
            jsonobject = jsonarray.optJSONObject(i);
            if (jsonobject != null)
            {
                if (j1 == o.a.a())
                {
                    jsonobject = y.a(jsonobject.optJSONObject("data"));
                } else
                if (j1 == o.b.a())
                {
                    jsonobject = aa.a(jsonobject.optJSONObject("metadata"));
                } else
                {
                    jsonobject = null;
                }
                if (jsonobject != null && !h.a(context, jsonobject))
                {
                    arraylist.add(jsonobject);
                }
            }
            i++;
        }
        if (!arraylist.isEmpty()) goto _L2; else goto _L3
_L3:
        context = AdError.NO_FILL;
_L5:
        return new l(j * 1000, k * 1000, i1, arraylist, context);
_L2:
        context = ((Context) (obj));
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public e d()
    {
        if (d == null || d.isEmpty())
        {
            return null;
        } else
        {
            return (e)d.get(0);
        }
    }

    public AdError e()
    {
        return e;
    }
}
