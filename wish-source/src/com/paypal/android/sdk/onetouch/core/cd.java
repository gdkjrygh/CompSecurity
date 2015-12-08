// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.util.Log;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.http.Header;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.json.JSONException;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            ca, au, bh, bl, 
//            cl, bf, cm, bg, 
//            c, b, cg, ce, 
//            cj, bi, cf

public class cd extends ca
{

    private static final String b = com/paypal/android/sdk/onetouch/core/cd.getSimpleName();
    private final b a;
    private String c;
    private cm d;
    private bl e;
    private bl f;
    private c g;

    public cd(b b1, String s, c c1, cm cm1, int i, String s1, String s2, 
            boolean flag)
    {
        a = b1;
        c = s;
        g = c1;
        d = cm1;
        b1 = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        if (!au.d(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = bh.a(0x15f90, false, flag, s1);
        e.a(b1);
        f = bh.a(0x15f90, false, false, s2);
        f.a(b1);
    }

    static cm a(cd cd1)
    {
        return cd1.d;
    }

    static String a()
    {
        return b;
    }

    private static String a(String s, String s1)
    {
        String s2 = s;
        if (s1 != null)
        {
            s2 = s;
            if (!s.endsWith("/"))
            {
                s2 = (new StringBuilder()).append(s).append("/").toString();
            }
            s2 = (new StringBuilder()).append(s2).append(s1).toString();
        }
        return s2;
    }

    static void a(cd cd1, cl cl1, IOException ioexception)
    {
        (new StringBuilder()).append(cl1.n()).append(" failure.");
        if (ioexception instanceof HttpResponseException)
        {
            int i = ((HttpResponseException)ioexception).getStatusCode();
            Log.e("paypal.sdk", (new StringBuilder("request failure with http statusCode:")).append(i).append(",exception:").append(ioexception.toString()).toString());
            try
            {
                (new StringBuilder("parsing error response:\n")).append(cl1.h());
                cl1.d();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                Log.e("paypal.sdk", "Exception parsing server response", ioexception);
                cl1.a(bf.a.toString(), (new StringBuilder()).append(i).append(" http response received.  Response not parsable: ").append(ioexception.getMessage()).toString(), null);
            }
            if (cl1.p())
            {
                cl1.a(bf.a.toString(), (new StringBuilder()).append(i).append(" http response received.  Response not parsable.").toString(), null);
            }
        } else
        {
            cl1.a(new bg(bf.b, ioexception));
        }
        Log.e("paypal.sdk", (new StringBuilder("request failed with server response:")).append(cl1.h()).toString());
        cd1.d.a(cl1);
    }

    private Header[] a(cl cl1, String s)
    {
        ArrayList arraylist = new ArrayList();
        java.util.Map.Entry entry;
        for (Iterator iterator = cl1.j().entrySet().iterator(); iterator.hasNext(); arraylist.add(new BasicHeader((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        int i;
        int j;
        if (s != null)
        {
            try
            {
                arraylist.add(com.paypal.android.sdk.onetouch.core.c.a(g.d(), arraylist, s));
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        s = (Header[])arraylist.toArray(new Header[0]);
        j = s.length;
        i = 0;
        while (i < j) 
        {
            Header header = s[i];
            if (cl1.a())
            {
                (new StringBuilder()).append(cl1.n()).append(" header: ").append(header.getName()).append("=").append(header.getValue());
            } else
            {
                (new StringBuilder()).append(cl1.n()).append(" header: ").append(header.getName()).append("=").append(header.getValue());
            }
            i++;
        }
        return s;
    }

    static String b(cd cd1)
    {
        return cd1.c;
    }

    static c c(cd cd1)
    {
        return cd1.g;
    }

    static bl d(cd cd1)
    {
        return cd1.e;
    }

    static bl e(cd cd1)
    {
        return cd1.f;
    }

    public final boolean b(cl cl1)
    {
        Object obj;
        Object obj1;
        String s;
        if (!a.a())
        {
            cl1.a(new bg(bf.b.toString()));
            return false;
        }
        cl.k();
        s = cl1.a(cl1.i());
        if (cl1.a())
        {
            (new StringBuilder()).append(cl1.n()).append(" endpoint: ").append(s);
            (new StringBuilder()).append(cl1.n()).append(" request: ").append(cl1.g());
        } else
        {
            (new StringBuilder()).append(cl1.n()).append(" endpoint: ").append(s);
            (new StringBuilder()).append(cl1.n()).append(" request: ").append(cl1.g());
        }
        if (!cl1.a()) goto _L2; else goto _L1
_L1:
        obj = f;
_L12:
        if (!cl1.a()) goto _L4; else goto _L3
_L3:
        obj1 = new cg(this, cl1, (byte)0);
_L9:
        ce.a[cl1.i().b().ordinal()];
        JVM INSTR tableswitch 1 3: default 435
    //                   1 309
    //                   2 340
    //                   3 393;
           goto _L5 _L6 _L7 _L8
_L5:
        throw new RuntimeException((new StringBuilder()).append(cl1.i().b()).append(" not supported.").toString());
_L2:
        try
        {
            obj = e;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            cl1.a(new bg(bf.d, ((Exception) (obj))));
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj1 = new cf(this, cl1, (byte)0);
          goto _L9
_L6:
        ((bl) (obj)).a(a.e(), a(s, cl1.g()), a(cl1, null), null, ((bq) (obj1)));
          goto _L10
_L7:
        String s1 = cl1.g();
        StringEntity stringentity = new StringEntity(s1, Charset.forName("UTF-8").name());
        ((bl) (obj)).a(a.e(), s, a(cl1, s1), stringentity, null, ((bq) (obj1)));
          goto _L10
_L8:
        e.a(a.e(), a(s, cl1.g()), a(cl1, null), new cf(this, cl1, (byte)0));
_L10:
        return true;
        if (true) goto _L12; else goto _L11
_L11:
    }

}
