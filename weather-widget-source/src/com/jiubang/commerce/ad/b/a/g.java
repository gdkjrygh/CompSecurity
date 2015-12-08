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

public class g
    implements Serializable
{

    private int a;
    private int b;
    private int c;
    private String d;
    private String e;
    private String f;
    private String g;
    private int h;
    private int i;
    private String j;

    public g()
    {
    }

    public static g a(Context context, JSONObject jsonobject, int k)
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            context = new g();
            context.a = k;
            context.b = jsonobject.optInt("moduleId", 0);
            context.c = jsonobject.optInt("advpositionid", 0);
            context.d = jsonobject.optString("moduleName", "");
            context.e = jsonobject.optString("bgColor", "");
            context.f = jsonobject.optString("banner", "");
            context.g = jsonobject.optString("icon", "");
            context.h = jsonobject.optInt("ptype", 0);
            context.i = jsonobject.optInt("firstScreen", 0);
            context.j = jsonobject.optString("serialNum", "");
            return context;
        }
    }

    public static List a(Context context, JSONArray jsonarray, int k)
    {
        ArrayList arraylist;
        int l;
        if (jsonarray == null || jsonarray.length() < 1)
        {
            return null;
        }
        arraylist = new ArrayList();
        l = 0;
_L3:
        if (l >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        g g1 = a(context, jsonarray.getJSONObject(l), k);
        if (g1 != null)
        {
            try
            {
                arraylist.add(g1);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        l++;
          goto _L3
_L2:
        return arraylist;
    }

    public int a()
    {
        return b;
    }
}
