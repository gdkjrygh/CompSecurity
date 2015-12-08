// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.os.AsyncTask;
import android.util.Log;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.facebook.ads.a:
//            ag, p, b, c, 
//            a

public class ad extends AsyncTask
{

    private static final String a = com/facebook/ads/a/ad.getSimpleName();
    private Map b;

    public ad()
    {
        b = null;
    }

    public ad(Map map)
    {
        b = map;
    }

    private String a(String s, String s1, String s2)
    {
        if (ag.a(s) || ag.a(s1) || ag.a(s2))
        {
            return s;
        }
        String s3;
        if (s.contains("?"))
        {
            s3 = "&";
        } else
        {
            s3 = "?";
        }
        return (new StringBuilder()).append(s).append(s3).append(s1).append("=").append(URLEncoder.encode(s2)).toString();
    }

    private boolean a(String s)
    {
        boolean flag = false;
        HttpClient httpclient = p.b();
        HttpGet httpget = new HttpGet(s);
        int i;
        try
        {
            i = httpclient.execute(httpget).getStatusLine().getStatusCode();
        }
        catch (Exception exception)
        {
            Log.e(a, (new StringBuilder()).append("Error opening url: ").append(s).toString(), exception);
            c.a(com.facebook.ads.a.b.a(exception));
            return false;
        }
        if (i == 200)
        {
            flag = true;
        }
        return flag;
    }

    private String b(String s)
    {
        String s1;
        try
        {
            s1 = a(s, "analog", p.a(com.facebook.ads.a.a.a()));
        }
        catch (Exception exception)
        {
            c.a(com.facebook.ads.a.b.a(exception));
            return s;
        }
        return s1;
    }

    protected transient Void a(String as[])
    {
        as = as[0];
        if (!ag.a(as) && !as.equals("#"))
        {
            as = b(as);
            Object obj;
            if (b != null)
            {
                Iterator iterator = b.keySet().iterator();
                do
                {
                    obj = as;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    obj = (String)iterator.next();
                    as = a(((String) (as)), ((String) (obj)), (String)b.get(obj));
                } while (true);
            } else
            {
                obj = as;
            }
            int i = 1;
            while (i <= 2 && !a(((String) (obj)))) 
            {
                i++;
            }
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

}
