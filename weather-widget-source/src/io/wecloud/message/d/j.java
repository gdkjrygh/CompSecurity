// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.d;

import org.json.JSONObject;

// Referenced classes of package io.wecloud.message.d:
//            f

public class j
{

    public static f a(JSONObject jsonobject)
    {
        f f1 = new f();
        f1.a = jsonobject.getInt("status");
        if (!f1.a())
        {
            f1.b = jsonobject.getInt("errorcode");
            f1.c = jsonobject.getString("msg");
        }
        return f1;
    }

    public static JSONObject a(String s)
    {
        return (new JSONObject(s)).getJSONObject("result");
    }
}
