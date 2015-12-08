// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            do, ai, ar

public final class aj
{

    public final List a;
    public final long b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final long g;

    public aj(String s)
    {
        s = new JSONObject(s);
        if (com.google.android.gms.internal.do.a(2))
        {
            com.google.android.gms.internal.do.c((new StringBuilder("Mediation Response JSON: ")).append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(new ai(jsonarray.getJSONObject(i)));
        }

        a = Collections.unmodifiableList(arraylist);
        f = s.getString("qdata");
        s = s.optJSONObject("settings");
        if (s != null)
        {
            b = s.optLong("ad_network_timeout_millis", -1L);
            c = ar.a(s, "click_urls");
            d = ar.a(s, "imp_urls");
            e = ar.a(s, "nofill_urls");
            long l = s.optLong("refresh", -1L);
            if (l > 0L)
            {
                l = 1000L * l;
            } else
            {
                l = -1L;
            }
            g = l;
            return;
        } else
        {
            b = -1L;
            c = null;
            d = null;
            e = null;
            g = -1L;
            return;
        }
    }
}
