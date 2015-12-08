// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.os.AsyncTask;
import android.os.Build;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package RLSDK:
//            p, o, c

public final class RLSDK.b
{
    private static final class a extends AsyncTask
    {

        public ArrayList a;

        private transient Void a(ArrayList aarraylist[])
        {
            a = aarraylist[0];
            aarraylist = new JSONObject();
            Object obj;
            aarraylist.put("platform", "android");
            obj = p.a();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_40;
            }
            aarraylist.put("udid", obj);
            aarraylist.put("dv", Build.MODEL);
            aarraylist.put("sdkv", o.a);
            aarraylist.put("osv", android.os.Build.VERSION.RELEASE);
            aarraylist.put("appid", c.e);
            Iterator iterator;
            JSONObject jsonobject;
            try
            {
                if (c.d != null)
                {
                    aarraylist.put("appver", c.d);
                }
            }
            catch (Exception exception) { }
            obj = new JSONArray();
            iterator = a.iterator();
_L1:
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_281;
            }
            b b1 = (b)iterator.next();
            String s = String.format("%.2f", new Object[] {
                Double.valueOf((double)b1.b / 1000D)
            });
            jsonobject = new JSONObject();
            jsonobject.put("e", b1.a);
            jsonobject.put("ts", s);
            if (b1.c != null)
            {
                String s1;
                for (Iterator iterator1 = b1.c.keySet().iterator(); iterator1.hasNext(); jsonobject.put(s1, (String)b1.c.get(s1)))
                {
                    s1 = (String)iterator1.next();
                }

            }
            break MISSING_BLOCK_LABEL_271;
            try
            {
                aarraylist.put("events", obj);
                aarraylist = URLEncoder.encode(aarraylist.toString(), "UTF-8");
                aarraylist = (new StringBuilder("data=")).append(aarraylist).toString();
                obj = new HttpPost("https://data.redlaser.com/b/");
                ((HttpPost) (obj)).setEntity(new StringEntity(aarraylist, "UTF8"));
                ((HttpPost) (obj)).setHeader("Content-Type", "application/x-www-form-urlencoded");
                (new DefaultHttpClient()).execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (ArrayList aarraylist[])
            {
                aarraylist.printStackTrace();
            }
            return null;
            ((JSONArray) (obj)).put(jsonobject);
              goto _L1
        }

        protected final Object doInBackground(Object aobj[])
        {
            return a((ArrayList[])aobj);
        }

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }

    static final class b
    {

        String a;
        long b;
        Map c;

        public b(String s, Map map)
        {
            a = s;
            b = System.currentTimeMillis();
            c = map;
        }
    }


    private static ArrayList a = new ArrayList();

    public static void a(String s, Map map)
    {
        s = new b(s, map);
        a.add(s);
        s = new a((byte)0);
        map = (ArrayList)a.clone();
        a.clear();
        s.execute(new ArrayList[] {
            map
        });
    }

}
