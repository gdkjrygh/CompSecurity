// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b;

import com.gtp.a.a.b.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class n
{

    private int a;
    private List b;

    public n()
    {
        b = new ArrayList();
    }

    public JSONObject a()
    {
        JSONObject jsonobject;
        Object obj;
        JSONArray jsonarray;
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("type", a);
            obj = new JSONObject();
            if (a != 1)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            jsonarray = new JSONArray();
            for (Iterator iterator = b.iterator(); iterator.hasNext(); jsonarray.put((String)iterator.next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (c.a())
            {
                ((JSONException) (obj)).printStackTrace();
            }
            return jsonobject;
        }
        ((JSONObject) (obj)).put("packageNames", jsonarray);
        jsonobject.put("usedDetail", obj);
        return jsonobject;
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(List list)
    {
        b = list;
    }
}
