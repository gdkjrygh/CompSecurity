// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b.a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class k
    implements Serializable
{

    private int a;
    private String b;

    public k()
    {
    }

    public static List a(JSONArray jsonarray)
    {
        if (jsonarray == null || jsonarray.length() < 1)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        int i = 0;
        while (i < jsonarray.length()) 
        {
            k k1 = new k();
            try
            {
                k1.a(jsonarray.getJSONObject(i));
                arraylist.add(k1);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            i++;
        }
        return arraylist;
    }

    public void a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return;
        } else
        {
            a = jsonobject.optInt("tagId", 0);
            b = jsonobject.optString("tagName", "");
            return;
        }
    }
}
