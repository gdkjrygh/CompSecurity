// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.gau.go.a.f.e;
import java.io.FileOutputStream;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gau.go.a.e:
//            f, b, c

public class a extends f
{

    private static String b = "http://61.145.124.212:8083/GOClientData/DC";
    public boolean a;
    private c c;
    private int d;
    private Context e;
    private boolean f;
    private String g;
    private String h;

    public a(Context context, long l, long l1)
    {
        d = -1;
        f = false;
        g = "";
        h = "";
        a = false;
        a(context, "get_ctrl_info_task");
        Log.i("zhiping", "\u7EDF\u8BA1sdk\u5F00\u5173\u521D\u59CB\u5316");
        e = context;
        a(context);
        b(l1);
        a(System.currentTimeMillis() + l);
        com.gau.go.a.f.e.a("StatisticsManager", (new StringBuilder()).append("Get ctrlInfo task constructed!:").append(b()).toString());
    }

    static c a(a a1)
    {
        return a1.c;
    }

    static Map a(a a1, String s)
    {
        return a1.a(s);
    }

    private Map a(String s)
    {
        HashMap hashmap = new HashMap();
        s = (new JSONObject(s)).getJSONArray("ctrl_info");
        int j = 0;
_L7:
        if (j >= s.length()) goto _L2; else goto _L1
_L1:
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        int k;
        int l;
        int i1;
        int j1;
        long l1;
        JSONObject jsonobject = (JSONObject)s.opt(j);
        s1 = jsonobject.getString("bn");
        s3 = jsonobject.getString("country");
        s4 = jsonobject.getString("channel");
        s5 = jsonobject.getString("version_code");
        s6 = jsonobject.getString("os_version_code");
        l = jsonobject.getInt("network");
        l1 = jsonobject.getLong("valid_time");
        k = jsonobject.getInt("user_type");
        j1 = jsonobject.getInt("user_ratio");
        s7 = jsonobject.getString("stat_id");
        s8 = jsonobject.getString("upload_cycle");
        s2 = jsonobject.getString("update_time");
        i1 = jsonobject.getInt("priority");
        if (!b(j1) || !e(s3) || !d(s4) || !c(s5) || !b(s6) || !a(k)) goto _L4; else goto _L3
_L3:
        long l2 = Long.valueOf(s8).longValue();
        if (com.gau.go.a.f.e.c(s7)) goto _L4; else goto _L5
_L5:
        String as[];
        as = s7.split(",");
        j1 = as.length;
        k = 0;
_L8:
        if (k >= j1) goto _L4; else goto _L6
_L6:
        s3 = as[k];
        if (com.gau.go.a.f.e.c(s3))
        {
            break MISSING_BLOCK_LABEL_335;
        }
        try
        {
            a(((Map) (hashmap)), new com.gau.go.a.a.a(l1, l2 * 0x36ee80L, s1, s2, Integer.valueOf(s3.trim()).intValue(), System.currentTimeMillis(), l, i1));
            break MISSING_BLOCK_LABEL_335;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
_L2:
        return hashmap;
_L4:
        j++;
          goto _L7
        k++;
          goto _L8
    }

    static void a(a a1, String s, Map map)
    {
        a1.a(s, map);
    }

    private void a(String s, Map map)
    {
        String s1 = (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new Date(System.currentTimeMillis()));
        s = new StringBuffer((new StringBuilder()).append("\r\n\r\n\r\nTime:").append(s1).append("\r\n").append("Connect uri:").append(g).append("\r\n").append(s).append("\r\n").toString());
        s.append((new StringBuilder()).append("RequestInfo:").append(h).append("\r\n").toString());
        s.append((new StringBuilder()).append("UserInfo: userRatio:").append(d).append(", userContry:").append(com.gau.go.a.e.e).append("\r\n").toString());
        s.append("Newest ctrlBean In DB:");
        String s2;
        String s3;
        int j;
        int k;
        long l;
        long l1;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); s.append((new StringBuilder()).append("[ctrlBean: funid:").append(j).append(", bn:").append(s2).append(", updateTime:").append(s3).append(", priority:").append(k).append(", interval:").append(l).append(", validTime:").append(l1).append("]").toString()))
        {
            Object obj = (String)iterator.next();
            s.append("\r\n");
            obj = (com.gau.go.a.a.a)map.get(obj);
            s2 = ((com.gau.go.a.a.a) (obj)).d();
            s3 = ((com.gau.go.a.a.a) (obj)).f();
            j = ((com.gau.go.a.a.a) (obj)).e();
            k = ((com.gau.go.a.a.a) (obj)).h();
            l = ((com.gau.go.a.a.a) (obj)).c();
            l1 = ((com.gau.go.a.a.a) (obj)).b();
        }

        try
        {
            map = e.openFileOutput("CtrlInfoLog.txt", 32768);
            map.write(s.toString().getBytes());
            map.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.gau.go.a.f.e.a(s.toString());
        }
    }

    private void a(Map map, com.gau.go.a.a.a a1)
    {
        com.gau.go.a.a.a a2 = (com.gau.go.a.a.a)map.get(String.valueOf(a1.e()));
        if (a2 != null && a2.h() >= a1.h())
        {
            return;
        } else
        {
            map.put(String.valueOf(a1.e()), a1);
            com.gau.go.a.f.e.a((new StringBuilder()).append("ctrlBeanfunId:").append(a1.e()).append(", validtime:").append(a1.b()).append(", ").append("intervaltime:").append(a1.c()).toString());
            return;
        }
    }

    private boolean a(int j)
    {
        if (j == 0)
        {
            return true;
        } else
        {
            return com.gau.go.a.e.l;
        }
    }

    static boolean a(a a1, boolean flag)
    {
        a1.f = flag;
        return flag;
    }

    private boolean a(String s, String s1)
    {
        if (!com.gau.go.a.f.e.c(s1) && !com.gau.go.a.f.e.c(s)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        s1 = s1.split(",");
        int k = s1.length;
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= k)
                {
                    break label1;
                }
                String s2 = s1[j];
                com.gau.go.a.f.e.a((new StringBuilder()).append("serverInfo:").append(s2).append(", localInfo:").append(s).toString());
                if (s2.trim().equalsIgnoreCase(s))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    static String b(a a1)
    {
        return a1.h();
    }

    private boolean b(int j)
    {
        if (d == -1)
        {
            a(e);
        }
        return d < j;
    }

    private boolean b(String s)
    {
        return a(String.valueOf(com.gau.go.a.e.g), s);
    }

    static boolean c(a a1)
    {
        return a1.f;
    }

    private boolean c(String s)
    {
        return a(String.valueOf(com.gau.go.a.e.f), s);
    }

    private boolean d(String s)
    {
        return a(com.gau.go.a.e.h, s);
    }

    private boolean e(String s)
    {
        return a(com.gau.go.a.e.e, s);
    }

    private String h()
    {
label0:
        {
            Object obj;
            if (com.gau.go.a.e.a)
            {
                obj = new HttpPost(b);
            } else
            {
                obj = new HttpPost("http://goupdate.3g.cn/GOClientData/DC");
            }
            try
            {
                h = i();
                Log.i("zhiping", (new StringBuilder()).append("\u7EDF\u8BA1sdk\u5F00\u5173\u53C2\u6570\u5982\u4E0B:").append(h).toString());
                com.gau.go.a.f.e.a((new StringBuilder()).append("Client info to Server:").append(h).append(" where:").append(((HttpPost) (obj)).getURI()).toString());
                g = ((HttpPost) (obj)).getURI().toString();
                ((HttpPost) (obj)).setEntity(new StringEntity(h));
                obj = (new DefaultHttpClient()).execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
                if (((HttpResponse) (obj)).getStatusLine().getStatusCode() != 200)
                {
                    break label0;
                }
                obj = EntityUtils.toString(((HttpResponse) (obj)).getEntity());
                Log.i("zhiping", (new StringBuilder()).append("\u7EDF\u8BA1sdk\u5F00\u5173\u83B7\u53D6\u6210\u529F,\u7ED3\u679C\u662F:").append(((String) (obj))).toString());
            }
            catch (Exception exception)
            {
                com.gau.go.a.f.e.a(exception);
                return null;
            }
            return ((String) (obj));
        }
        return null;
    }

    private String i()
    {
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("prd_id", "2");
            jsonobject.put("android_id", com.gau.go.a.e.d);
            jsonobject.put("version", "20140925");
            jsonarray.put(jsonobject);
        }
        catch (Exception exception) { }
        return jsonarray.toString();
    }

    public int a(Context context)
    {
        Object obj = context.getSharedPreferences("ctrl_sp", 0);
        if (((SharedPreferences) (obj)).contains("user_ratio")) goto _L2; else goto _L1
_L1:
        context = context.getSharedPreferences((new StringBuilder()).append("ctrl_sp_").append(context.getPackageName()).toString(), 0);
        obj = context.edit();
        d = context.getInt("user_ratio", -1);
        if (d == -1)
        {
            d = (new Random()).nextInt(100);
            ((android.content.SharedPreferences.Editor) (obj)).putInt("user_ratio", d);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
_L4:
        return d;
_L2:
        d = ((SharedPreferences) (obj)).getInt("user_ratio", -1);
        context = context.getSharedPreferences((new StringBuilder()).append("ctrl_sp_").append(context.getPackageName()).toString(), 0);
        if (d != -1)
        {
            context = context.edit();
            context.putInt("user_ratio", d);
            context.commit();
            ((SharedPreferences) (obj)).edit().remove("user_ratio").commit();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a()
    {
        Log.i("zhiping", "\u7EDF\u8BA1sdk\u5F00\u5173\u5F00\u59CB\u83B7\u53D6");
        com.gau.go.a.f.e.a("StatisticsManager", "Execute getCtrlInfoTask!");
        (new b(this, "get_ctrlinfo_thread")).start();
    }

    public void a(c c1)
    {
        c = c1;
    }

}
