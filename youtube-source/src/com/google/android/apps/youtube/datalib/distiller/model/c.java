// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.distiller.model;

import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.apps.youtube.core.utils.Util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class c
{

    private static final SimpleDateFormat a = Util.a();
    private final String b;
    private final String c;
    private final Date d;
    private final String e;
    private final Uri f;
    private final Uri g;
    private final boolean h;
    private int i;

    public c(JSONObject jsonobject)
    {
        Object obj = null;
        super();
        JSONObject jsonobject2 = jsonobject.getJSONObject("actor");
        b = com.google.android.apps.youtube.common.fromguava.c.a(jsonobject2.getString("displayName"));
        g = Uri.parse(com.google.android.apps.youtube.common.fromguava.c.a(jsonobject2.getString("url")));
        f = Uri.parse(com.google.android.apps.youtube.common.fromguava.c.a(jsonobject2.getJSONObject("image").getString("url")));
        JSONObject jsonobject1 = jsonobject.getJSONObject("object");
        String s;
        boolean flag;
        if (jsonobject.has("type"))
        {
            s = jsonobject.getString("type");
        } else
        {
            s = null;
        }
        if (!TextUtils.isEmpty(s) && s.equals("youTubeLegacyComment"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        s = obj;
        if (!h)
        {
            s = com.google.android.apps.youtube.common.fromguava.c.a(jsonobject2.getString("id"));
        }
        c = s;
        e = jsonobject1.getString("content");
        i = Math.min(e.length(), 500);
        try
        {
            jsonobject = a.parse(com.google.android.apps.youtube.common.fromguava.c.a(jsonobject.getString("published")));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder("Couldn't parse comment timestamp: ")).append(jsonobject).toString());
        }
        d = jsonobject;
    }

    public final Uri a(int k)
    {
        return Uri.parse(f.toString().replace("sz=50", (new StringBuilder("sz=")).append(k).toString()));
    }

    public final String c()
    {
        return b;
    }

    public final String d()
    {
        return c;
    }

    public final Date e()
    {
        return d;
    }

    public final Spanned f()
    {
        String s;
        if (h())
        {
            s = (new StringBuilder()).append(e.substring(0, i)).append("\u2026").toString();
        } else
        {
            s = e;
        }
        return Html.fromHtml(s);
    }

    public final void g()
    {
        i = Math.min(e.length(), i + 2000);
    }

    public final boolean h()
    {
        return i < e.length();
    }

    public final Uri i()
    {
        return g;
    }

    public final Uri j()
    {
        return f;
    }

}
