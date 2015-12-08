// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.d;

import android.content.Context;
import android.text.TextUtils;
import io.wecloud.message.c.a;
import io.wecloud.message.e.c;
import io.wecloud.message.h.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.wecloud.message.d:
//            i, j, f, h

public class g extends Thread
{

    private Context a;
    private h b;
    private int c;
    private boolean d;

    public g(Context context, h h1, int k)
    {
        a = context;
        b = h1;
        c = k;
    }

    public void a()
    {
        d = true;
    }

    public void a(Context context)
    {
        if (context == null) goto _L2; else goto _L1
_L1:
        c;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 672
    //                   2 682
    //                   3 682;
           goto _L3 _L4 _L5 _L5
_L3:
        Object obj = e.a("http://goload.wecloud.io/goload", 1);
_L20:
        InputStream inputstream;
        InputStream inputstream1;
        InputStream inputstream2;
        InputStream inputstream3;
        InputStream inputstream4;
        InputStream inputstream5;
        InputStream inputstream6;
        InputStream inputstream7;
        String s;
        JSONObject jsonobject;
        f f1;
        String s1;
        Object obj2;
        HttpPost httppost;
        io.wecloud.message.e.c.b("CSH", (new StringBuilder("url --- ")).append(((String) (obj))).toString());
        httppost = new HttpPost(((String) (obj)));
        inputstream = null;
        s = null;
        jsonobject = null;
        f1 = null;
        s1 = null;
        obj2 = null;
        obj = null;
        inputstream1 = ((InputStream) (obj));
        inputstream2 = inputstream;
        inputstream3 = s;
        inputstream4 = jsonobject;
        inputstream5 = f1;
        inputstream6 = s1;
        inputstream7 = obj2;
        httppost.setEntity(io.wecloud.message.d.i.a(a));
        inputstream1 = ((InputStream) (obj));
        inputstream2 = inputstream;
        inputstream3 = s;
        inputstream4 = jsonobject;
        inputstream5 = f1;
        inputstream6 = s1;
        inputstream7 = obj2;
        BasicHttpParams basichttpparams = new BasicHttpParams();
        inputstream1 = ((InputStream) (obj));
        inputstream2 = inputstream;
        inputstream3 = s;
        inputstream4 = jsonobject;
        inputstream5 = f1;
        inputstream6 = s1;
        inputstream7 = obj2;
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 60000);
        inputstream1 = ((InputStream) (obj));
        inputstream2 = inputstream;
        inputstream3 = s;
        inputstream4 = jsonobject;
        inputstream5 = f1;
        inputstream6 = s1;
        inputstream7 = obj2;
        HttpConnectionParams.setSoTimeout(basichttpparams, 60000);
        inputstream1 = ((InputStream) (obj));
        inputstream2 = inputstream;
        inputstream3 = s;
        inputstream4 = jsonobject;
        inputstream5 = f1;
        inputstream6 = s1;
        inputstream7 = obj2;
        inputstream = (new DefaultHttpClient(basichttpparams)).execute(httppost).getEntity().getContent();
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        s = (new BufferedReader(new InputStreamReader(new GZIPInputStream(inputstream)))).readLine();
        if (s == null) goto _L7; else goto _L6
_L6:
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        jsonobject = new JSONObject(s);
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        f1 = io.wecloud.message.d.j.a(io.wecloud.message.d.j.a(s));
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        if (!f1.a()) goto _L9; else goto _L8
_L8:
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        s1 = jsonobject.getString("host");
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_528;
        }
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        io.wecloud.message.c.a.a(context, s1);
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        if (jsonobject.getInt("isexist") != 0) goto _L11; else goto _L10
_L10:
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        if (d)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        f1.c = "The appkey is not match its package name";
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        b.a(f1.c);
        if (httppost == null);
        if (inputstream == null) goto _L2; else goto _L12
_L12:
        inputstream.close();
_L2:
        return;
_L4:
        obj = e.a("http://218.213.248.178/goload/", 1);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = e.a("http://218.213.248.137/goload", 1);
        continue; /* Loop/switch isn't completed */
        context;
        context.printStackTrace();
        return;
_L11:
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        int k = jsonobject.getInt("heartbeat");
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        int l = jsonobject.getInt("maxconn");
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_803;
        }
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        io.wecloud.message.c.a.a(a, k * 1000);
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_844;
        }
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        io.wecloud.message.c.a.b(a, l * 1000);
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        if (!jsonobject.has("debug"))
        {
            break MISSING_BLOCK_LABEL_975;
        }
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        k = jsonobject.getInt("debug");
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        context = a;
        boolean flag;
        if (k == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        io.wecloud.message.c.a.f(context, flag);
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        io.wecloud.message.e.c.b("LoginHttpTask", (new StringBuilder("json info = ")).append(s).toString());
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        if (d) goto _L7; else goto _L13
_L13:
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        b.a();
_L7:
        if (httppost == null);
        if (inputstream == null) goto _L2; else goto _L14
_L14:
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return;
_L9:
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        if (d) goto _L7; else goto _L15
_L15:
        inputstream1 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        inputstream4 = inputstream;
        inputstream5 = inputstream;
        inputstream6 = inputstream;
        inputstream7 = inputstream;
        obj = inputstream;
        b.a(f1.c);
          goto _L7
        Object obj1;
        obj1;
        obj = inputstream1;
        ((UnsupportedEncodingException) (obj1)).printStackTrace();
        context = inputstream1;
        obj = ((UnsupportedEncodingException) (obj1)).getMessage();
        if (httppost == null);
        if (!d)
        {
            b.a(((String) (obj)));
        }
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
            return;
        }
          goto _L2
        obj1;
        obj = inputstream2;
        ((IllegalStateException) (obj1)).printStackTrace();
        context = inputstream2;
        obj = ((IllegalStateException) (obj1)).getMessage();
        if (httppost == null);
        if (!d)
        {
            b.a(((String) (obj)));
        }
        if (inputstream2 != null)
        {
            try
            {
                inputstream2.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
            return;
        }
          goto _L2
        obj1;
        obj = inputstream3;
        ((IOException) (obj1)).printStackTrace();
        context = inputstream3;
        obj = ((IOException) (obj1)).getMessage();
        if (httppost == null);
        if (!d)
        {
            b.a(((String) (obj)));
        }
        if (inputstream3 != null)
        {
            try
            {
                inputstream3.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
            return;
        }
          goto _L2
        obj1;
        obj = inputstream4;
        ((OutOfMemoryError) (obj1)).printStackTrace();
        context = inputstream4;
        obj = ((OutOfMemoryError) (obj1)).getMessage();
        if (httppost == null);
        if (!d)
        {
            b.a(((String) (obj)));
        }
        if (inputstream4 != null)
        {
            try
            {
                inputstream4.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
            return;
        }
          goto _L2
        obj1;
        obj = inputstream5;
        ((JSONException) (obj1)).printStackTrace();
        context = inputstream5;
        obj = ((JSONException) (obj1)).getMessage();
        if (httppost == null);
        if (!d)
        {
            b.a(((String) (obj)));
        }
        if (inputstream5 != null)
        {
            try
            {
                inputstream5.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
            return;
        }
          goto _L2
        obj1;
        obj = inputstream6;
        ((IllegalArgumentException) (obj1)).printStackTrace();
        context = inputstream6;
        obj = ((IllegalArgumentException) (obj1)).getMessage();
        if (httppost == null);
        if (!d)
        {
            b.a(((String) (obj)));
        }
        if (inputstream6 != null)
        {
            try
            {
                inputstream6.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
            return;
        }
          goto _L2
        obj1;
        obj = inputstream7;
        ((Throwable) (obj1)).printStackTrace();
        context = inputstream7;
        obj = ((Throwable) (obj1)).getMessage();
        if (httppost == null);
        if (!d)
        {
            b.a(((String) (obj)));
        }
        if (inputstream7 == null) goto _L2; else goto _L16
_L16:
        try
        {
            inputstream7.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return;
        context;
        obj = null;
        k = 0;
_L18:
        if (httppost == null);
        if (k && !d)
        {
            b.a("");
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw context;
        context;
        k = 0;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj = context;
        k = 1;
        context = ((Context) (obj1));
        if (true) goto _L18; else goto _L17
_L17:
        if (true) goto _L20; else goto _L19
_L19:
    }

    public void run()
    {
        a(a);
    }
}
