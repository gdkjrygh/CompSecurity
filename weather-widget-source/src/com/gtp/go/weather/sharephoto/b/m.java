// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class m
{

    public int a;
    public int b;

    public m()
    {
    }

    private static m a(JSONObject jsonobject)
    {
        m m1 = new m();
        m1.a = jsonobject.getInt("type");
        m1.b = jsonobject.getInt("size");
        return m1;
    }

    public static List a(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (jsonarray != null)
        {
            int j = jsonarray.length();
            for (int i = 0; i < j; i++)
            {
                arraylist.add(a(jsonarray.getJSONObject(i)));
            }

        }
        return arraylist;
    }
}
