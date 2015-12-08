// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            cq, cy, dj, do, 
//            cg, da, cv, ce, 
//            aa, cu, dn, ct, 
//            cz, ad

public final class cs extends cq
{

    private static final Object a = new Object();
    private static cs b;
    private final Context c;
    private final ad d;

    private cs(Context context, ad ad)
    {
        c = context;
        d = ad;
    }

    public static cg a(Context context, String s, String s1)
    {
        HttpURLConnection httpurlconnection;
        cy cy1;
        Map map;
        int i;
        int j;
        try
        {
            cy1 = new cy();
            s1 = new URL(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.internal.do.d((new StringBuilder("Error while connecting to ad server: ")).append(context.getMessage()).toString());
            return new cg(2);
        }
        i = 0;
        httpurlconnection = (HttpURLConnection)s1.openConnection();
        dj.a(context, s, false, httpurlconnection);
        j = httpurlconnection.getResponseCode();
        map = httpurlconnection.getHeaderFields();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        context = s1.toString();
        s = dj.a(new InputStreamReader(httpurlconnection.getInputStream()));
        a(((String) (context)), map, s, j);
        cy1.a(context, map, s);
        context = cy1.a();
        httpurlconnection.disconnect();
        return context;
        a(s1.toString(), map, null, j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        s1 = httpurlconnection.getHeaderField("Location");
        if (!TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_176;
        }
        com.google.android.gms.internal.do.d("No location header to follow redirect.");
        context = new cg(0);
        httpurlconnection.disconnect();
        return context;
        s1 = new URL(s1);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        com.google.android.gms.internal.do.d("Too many redirects.");
        context = new cg(0);
        httpurlconnection.disconnect();
        return context;
        com.google.android.gms.internal.do.d((new StringBuilder("Received error HTTP response code: ")).append(j).toString());
        context = new cg(0);
        httpurlconnection.disconnect();
        return context;
        cy1.a(map);
        httpurlconnection.disconnect();
        break MISSING_BLOCK_LABEL_21;
        context;
        httpurlconnection.disconnect();
        throw context;
    }

    public static cs a(Context context, ad ad)
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new cs(context.getApplicationContext(), ad);
            }
            context = b;
        }
        return context;
    }

    private static void a(String s, Map map, String s1, int i)
    {
        if (com.google.android.gms.internal.do.a(2))
        {
            com.google.android.gms.internal.do.c((new StringBuilder("Http Response: {\n  URL:\n    ")).append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s = map.keySet().iterator(); s.hasNext();)
                {
                    Object obj = (String)s.next();
                    com.google.android.gms.internal.do.c((new StringBuilder("    ")).append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        com.google.android.gms.internal.do.c((new StringBuilder("      ")).append(s2).toString());
                    }
                }

            }
            com.google.android.gms.internal.do.c("  Body:");
            if (s1 != null)
            {
                for (int j = 0; j < Math.min(s1.length(), 0x186a0); j += 1000)
                {
                    com.google.android.gms.internal.do.c(s1.substring(j, Math.min(s1.length(), j + 1000)));
                }

            } else
            {
                com.google.android.gms.internal.do.c("    null");
            }
            com.google.android.gms.internal.do.c((new StringBuilder("  Response Code:\n    ")).append(i).append("\n}").toString());
        }
    }

    public final cg a(ce ce1)
    {
        Context context = c;
        Object obj = d;
        com.google.android.gms.internal.do.a("Starting ad request from service.");
        Object obj1 = new da(context);
        if (((da) (obj1)).l == -1)
        {
            com.google.android.gms.internal.do.a("Device is offline.");
            return new cg(2);
        }
        obj = new cv(ce1.applicationInfo.packageName);
        if (ce1.hu.extras != null)
        {
            String s = ce1.hu.extras.getString("_ad");
            if (s != null)
            {
                return cu.a(context, ce1, s);
            }
        }
        obj1 = cu.a(ce1, ((da) (obj1)));
        if (obj1 == null)
        {
            return new cg(0);
        }
        dn.a.post(new ct(context, ce1, ((cv) (obj)), ((String) (obj1))));
        obj1 = ((cv) (obj)).b();
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            return new cg(((cv) (obj)).a());
        } else
        {
            return a(context, ce1.en.iM, ((String) (obj1)));
        }
    }

}
