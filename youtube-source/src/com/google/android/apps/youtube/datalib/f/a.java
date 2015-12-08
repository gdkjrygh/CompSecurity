// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.f;

import android.content.SharedPreferences;
import com.google.a.a.a.a.py;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.a.e;
import com.google.android.apps.youtube.datalib.a.g;
import com.google.android.apps.youtube.datalib.a.p;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpUriRequest;

public final class a
    implements e, g, p
{

    private final SharedPreferences b;

    public a(SharedPreferences sharedpreferences)
    {
        b = (SharedPreferences)c.a(sharedpreferences);
    }

    public final void a(py py1)
    {
        if (b.getBoolean("dev_retention_enabled", true) && py1.b != null)
        {
            String s = b.getString("visitor_id", null);
            if (!py1.b.equals(s))
            {
                b.edit().putString("visitor_id", py1.b).apply();
                return;
            }
        }
    }

    public final void a(Map map)
    {
        String s;
        if (b.getBoolean("dev_retention_enabled", true))
        {
            if ((s = b.getString("visitor_id", null)) != null)
            {
                map.put("X-Goog-Visitor-Id", s);
                return;
            }
        }
    }

    public final void a(HttpUriRequest httpurirequest)
    {
        HashMap hashmap = new HashMap();
        a(((Map) (hashmap)));
        if (hashmap.containsKey("X-Goog-Visitor-Id"))
        {
            httpurirequest.addHeader("X-Goog-Visitor-Id", (String)hashmap.get("X-Goog-Visitor-Id"));
        }
    }
}
