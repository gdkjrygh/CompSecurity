// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b.a;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.b.a:
//            g, b

public class c
    implements Serializable
{

    private int a;
    private String b;
    private String c;
    private g d;
    private b e;

    public c()
    {
    }

    public static c a(Context context, JSONObject jsonobject, int i, int j, int k, int l)
    {
        c c1;
        Object obj;
label0:
        {
            boolean flag = true;
            if (jsonobject == null)
            {
                return null;
            }
            c1 = new c();
            c1.a = jsonobject.optInt("type", 0);
            c1.b = jsonobject.optString("banner", "");
            c1.c = jsonobject.optString("superscriptUrl", "");
            obj = c1;
            if (!jsonobject.has("contentInfo"))
            {
                break MISSING_BLOCK_LABEL_181;
            }
            try
            {
                if (c1.a != 1 && c1.a != 2)
                {
                    break label0;
                }
                c1.d = g.a(context, jsonobject.getJSONObject("contentInfo"), i);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                obj = c1;
                break MISSING_BLOCK_LABEL_181;
            }
            context = c1;
            break MISSING_BLOCK_LABEL_178;
        }
        if (6 != c1.a)
        {
            flag = false;
        }
        c1.e = com.jiubang.commerce.ad.b.a.b.a(context, jsonobject.getJSONObject("contentInfo"), i, j, k, l, flag);
        context = c1.e;
        if (context == null)
        {
            context = null;
        } else
        {
            context = c1;
        }
        break MISSING_BLOCK_LABEL_178;
        obj = context;
        return ((c) (obj));
    }

    public static List a(Context context, JSONArray jsonarray, int i, int j, int k, int l)
    {
        ArrayList arraylist;
        int i1;
        if (jsonarray == null || jsonarray.length() < 1)
        {
            return null;
        }
        arraylist = new ArrayList();
        i1 = 0;
_L3:
        if (i1 >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        c c1 = a(context, jsonarray.getJSONObject(i1), i, j, k, l);
        if (c1 != null)
        {
            try
            {
                arraylist.add(c1);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        i1++;
          goto _L3
_L2:
        return arraylist;
    }

    public b a()
    {
        return e;
    }
}
