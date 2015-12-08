// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.f;

import android.content.Context;
import com.jiubang.playsdk.a.u;
import com.jiubang.playsdk.main.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.playsdk.f:
//            k, d, g, h, 
//            m, l, c

public class f
{

    private static final String a = com/jiubang/playsdk/f/f.getSimpleName();
    private static final String b;
    private final List c = new ArrayList();
    private k d;
    private volatile boolean e;

    public f(Context context)
    {
        e = false;
        d = new k(context, "manage_good");
        c();
        a(context);
    }

    private void a(Context context)
    {
        if (e)
        {
            return;
        }
        if (d == null)
        {
            com.jiubang.playsdk.f.d.a(a, "\u8BF7\u5148\u521D\u59CB\u5316");
            return;
        }
        e = true;
        long l1 = d.b("manage_good_last", 0L);
        if (System.currentTimeMillis() - l1 >= 0x1b77400L)
        {
            (new Thread(new g(this, context), "managergood_network")).start();
            return;
        } else
        {
            (new Thread(new h(this, context), "managergood_local")).start();
            return;
        }
    }

    static boolean a(f f1)
    {
        return f1.b();
    }

    static boolean a(f f1, Context context)
    {
        return f1.b(context);
    }

    static boolean a(f f1, boolean flag)
    {
        f1.e = flag;
        return flag;
    }

    private byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[1024];
_L1:
        int i = inputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L1
        Object obj;
        obj;
        com.jiubang.playsdk.f.d.a(a, (new StringBuilder()).append(((Exception) (obj)).getMessage()).append("").toString(), ((Throwable) (obj)));
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        inputstream.close();
        byte abyte1[];
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                com.jiubang.playsdk.f.d.a(a, (new StringBuilder()).append(inputstream.getMessage()).append(" ").toString(), inputstream);
            }
        }
        inputstream = null;
        return inputstream;
        bytearrayoutputstream.flush();
        abyte1 = bytearrayoutputstream.toByteArray();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                com.jiubang.playsdk.f.d.a(a, (new StringBuilder()).append(inputstream.getMessage()).append(" ").toString(), inputstream);
                return abyte1;
            }
        }
        inputstream = abyte1;
        if (bytearrayoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        bytearrayoutputstream.close();
        return abyte1;
        abyte1;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        inputstream.close();
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                com.jiubang.playsdk.f.d.a(a, (new StringBuilder()).append(inputstream.getMessage()).append(" ").toString(), inputstream);
            }
        }
        throw abyte1;
    }

    private boolean b()
    {
        File file = new File(b);
        if (!file.exists())
        {
            return false;
        }
        String s;
        try
        {
            s = new String(a(new FileInputStream(file)));
        }
        catch (Exception exception)
        {
            com.jiubang.playsdk.f.d.a(a, (new StringBuilder()).append(exception.getMessage()).append(" ").toString(), exception);
            file.delete();
            return false;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        c(s);
        return true;
    }

    private boolean b(Context context)
    {
        DefaultHttpClient defaulthttpclient;
        defaulthttpclient = new DefaultHttpClient();
        context = new HttpGet(m.d(context));
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpProtocolParams.setContentCharset(basichttpparams, "utf-8");
        ConnManagerParams.setTimeout(basichttpparams, 3000L);
        context.setParams(basichttpparams);
        context = defaulthttpclient.execute(context);
        if (context.getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        context = context.getEntity();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        try
        {
            context = l.a(a(context.getContent()));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.jiubang.playsdk.f.d.a("ManageGood", (new StringBuilder()).append(context.getMessage()).append("").toString(), context);
            return false;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        c(context);
        com.jiubang.playsdk.f.c.a(context.getBytes(), b);
        d.a("manage_good_last", System.currentTimeMillis());
        return true;
    }

    private void c()
    {
        if (!d("com.gau.go.weatherex.appbilling.dynamicsbg.mount"))
        {
            u u1 = new u();
            u1.a("com.gau.go.weatherex.appbilling.dynamicsbg.mount");
            u1.b("02c80bb90000000000000006");
            c.add(u1);
        }
        if (!d("com.gau.go.weatherex.appbilling.systemwidgetskin.mountskin"))
        {
            u u2 = new u();
            u2.a("com.gau.go.weatherex.appbilling.systemwidgetskin.mountskin");
            u2.b("02c80bb90000000000000007");
            c.add(u2);
        }
        if (!d("com.gau.go.weatherex.appbilling.systemwidgetskin.locusskin"))
        {
            u u3 = new u();
            u3.a("com.gau.go.weatherex.appbilling.systemwidgetskin.locusskin");
            u3.b("02c80bb90000000000000008");
            c.add(u3);
        }
    }

    private void c(String s)
    {
        int i;
        a();
        s = new JSONArray(s);
        i = s.length();
_L2:
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i--;
        JSONObject jsonobject = s.getJSONObject(i);
        u u1 = new u();
        u1.b(jsonobject.getString("offerid"));
        u1.a(jsonobject.getString("pkgname"));
        c.add(u1);
        if (true) goto _L2; else goto _L1
        s;
        com.jiubang.playsdk.f.d.a(a, (new StringBuilder()).append(s.getMessage()).append("").toString(), s);
_L1:
        c();
        return;
    }

    private boolean d(String s)
    {
        if (c.isEmpty())
        {
            return false;
        }
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            if (s.equals(((u)iterator.next()).a()))
            {
                return true;
            }
        }

        return false;
    }

    public void a()
    {
        if (c != null)
        {
            c.clear();
        }
    }

    public boolean a(String s)
    {
        if (s == null)
        {
            return false;
        }
        if (c == null || c.isEmpty())
        {
            return false;
        }
        for (int i = c.size(); i > 0;)
        {
            Object obj = c;
            i--;
            obj = (u)((List) (obj)).get(i);
            if (s != null && ((u) (obj)).a() != null && ((u) (obj)).a().equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public String b(String s)
    {
        if (s == null)
        {
            return null;
        }
        if (c == null || c.isEmpty())
        {
            return null;
        }
        for (int i = c.size(); i > 0;)
        {
            Object obj = c;
            i--;
            obj = (u)((List) (obj)).get(i);
            if (s != null && ((u) (obj)).a() != null && ((u) (obj)).a().equals(s))
            {
                return ((u) (obj)).b();
            }
        }

        return null;
    }

    static 
    {
        b = (new StringBuilder()).append(b.c).append("/mg").toString();
    }
}
