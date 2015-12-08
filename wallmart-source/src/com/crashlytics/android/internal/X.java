// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.internal:
//            V, W

final class X
{

    X()
    {
    }

    private static JSONObject a(Map map)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); jsonobject.put((String)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return jsonobject;
    }

    public final byte[] a(V v)
        throws IOException
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("appBundleId", v.a);
            jsonobject.put("executionId", v.b);
            jsonobject.put("installationId", v.c);
            jsonobject.put("androidId", v.d);
            jsonobject.put("osVersion", v.e);
            jsonobject.put("deviceModel", v.f);
            jsonobject.put("appVersionCode", v.g);
            jsonobject.put("appVersionName", v.h);
            jsonobject.put("timestamp", v.i);
            jsonobject.put("type", v.j.toString());
            jsonobject.put("details", a(v.k));
            v = jsonobject.toString().getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (V v)
        {
            throw new IOException(v.getMessage());
        }
        return v;
    }
}
