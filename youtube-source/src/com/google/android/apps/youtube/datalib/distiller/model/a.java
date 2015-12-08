// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.distiller.model;

import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.distiller.model:
//            TopLevelComment

public final class a
{

    String a;
    private final List b;
    private final String c;
    private final boolean d;

    public a(String s)
    {
        c = com.google.android.apps.youtube.common.fromguava.c.a(s);
        b = new ArrayList();
        d = false;
    }

    public a(String s, JSONObject jsonobject)
    {
        c = com.google.android.apps.youtube.common.fromguava.c.a(s);
        b = new ArrayList();
        com.google.android.apps.youtube.common.fromguava.c.a("plus#activityFeed".equals(jsonobject.getString("kind")));
        if (jsonobject.has("nextPageToken"))
        {
            a = jsonobject.getString("nextPageToken");
        }
        s = jsonobject.getJSONArray("items");
        for (int i = 0; i < s.length(); i++)
        {
            TopLevelComment toplevelcomment = new TopLevelComment(s.getJSONObject(i));
            if (toplevelcomment.p())
            {
                b.add(toplevelcomment);
            }
        }

        d = jsonobject.getJSONObject("statusForViewer").getBoolean("canInsert");
    }

    public final int a()
    {
        return b.size();
    }

    public final void a(a a1)
    {
        boolean flag;
        if (a1.c == c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag);
        b.addAll(a1.b);
        a = a1.a;
    }

    public final List b()
    {
        return Collections.unmodifiableList(b);
    }

    public final boolean c()
    {
        return a != null;
    }

    public final String d()
    {
        return a;
    }

    public final String e()
    {
        return c;
    }

    public final boolean f()
    {
        return d;
    }
}
