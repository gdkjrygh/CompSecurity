// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.g;

import android.content.Context;
import android.text.TextUtils;
import io.wecloud.message.bean.d;
import io.wecloud.message.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.wecloud.message.g:
//            a

public class b
{

    public static io.wecloud.message.g.a a(long l)
    {
        io.wecloud.message.g.a a1 = new io.wecloud.message.g.a((byte)103);
        a1.a((new StringBuilder("{\"msgid\":")).append(l).append("}").toString().getBytes());
        return a1;
    }

    public static io.wecloud.message.g.a a(Context context)
    {
        int i = 1;
        io.wecloud.message.g.a a1 = new io.wecloud.message.g.a((byte)1);
        StringBuilder stringbuilder = (new StringBuilder("{\"goid\":\"")).append(io.wecloud.message.c.a.d(context)).append("\", \"appkey\":\"").append(io.wecloud.message.h.a.f(context, "APPKEY")).append("\", \"ischannel\":");
        if (!io.wecloud.message.h.a.b(context, context.getPackageName()))
        {
            i = 0;
        }
        a1.a(stringbuilder.append(i).append("}").toString().getBytes());
        return a1;
    }

    public static io.wecloud.message.g.a a(String s)
    {
        io.wecloud.message.g.a a1 = new io.wecloud.message.g.a((byte)2);
        if (TextUtils.isEmpty(s))
        {
            s = new byte[0];
        } else
        {
            s = s.getBytes();
        }
        a1.a(s);
        return a1;
    }

    public static io.wecloud.message.g.a a(ArrayList arraylist)
    {
        io.wecloud.message.g.a a1;
        JSONArray jsonarray;
        a1 = new io.wecloud.message.g.a((byte)4);
        jsonarray = new JSONArray();
        arraylist = arraylist.iterator();
_L3:
        Object obj;
        if (!arraylist.hasNext())
        {
            a1.a(jsonarray.toString().getBytes());
            return a1;
        }
        obj = (d)arraylist.next();
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("type", ((d) (obj)).b);
        jsonobject.put("code", ((d) (obj)).c);
        jsonobject.put("value", ((d) (obj)).d);
        if (((d) (obj)).c != 15)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        if (TextUtils.isEmpty(((d) (obj)).e)) goto _L2; else goto _L1
_L1:
        jsonobject.put("info", io.wecloud.message.h.b.a(((d) (obj)).e, "com.sungy.fwjc"));
_L4:
        jsonarray.put(jsonobject);
          goto _L3
        obj;
        ((JSONException) (obj)).printStackTrace();
          goto _L3
_L2:
        jsonobject.put("info", ((d) (obj)).e);
          goto _L4
        jsonobject.put("info", ((d) (obj)).e);
          goto _L4
    }
}
