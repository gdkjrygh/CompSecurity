// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.d;

import android.content.Context;
import android.content.Intent;
import android.sax.Element;
import android.sax.RootElement;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.xml.sax.ContentHandler;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.d:
//            a, e, d, h, 
//            i, j, k, l, 
//            o, m, r, n

public class g
{

    private Context a;
    private String b;
    private String c;
    private String d;
    private o e;
    private String f;
    private String g;

    g(Context context, String s)
    {
        b = "";
        a = context;
        b = s;
        context = null;
        s = b.getBytes("utf-8");
        context = s;
_L2:
        f = com.gau.go.launcherex.gowidget.weather.d.a.a(context, 0).replace("\n", "").replace("=", "");
        c = (new StringBuilder()).append("/data/data/").append(a.getPackageName()).append("/files").toString();
        com.gau.go.launcherex.gowidget.weather.d.e.a(c);
        d = (new StringBuilder()).append(c).append("/").append(f).toString();
        c();
        return;
        s;
        s.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    static o a(g g1)
    {
        return g1.e;
    }

    private String a(String s, int i1)
    {
        s = (new StringBuilder()).append(s).append(b).append(i1).toString();
        try
        {
            s = com.gau.go.launcherex.gowidget.weather.d.d.a(s.getBytes("utf-8"));
            String s1 = com.gau.go.launcherex.gowidget.weather.d.d.a((new StringBuilder()).append(i1).append("").toString(), s);
            s = (new StringBuilder()).append(s).append(s1).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    private ContentHandler a(o o1)
    {
        RootElement rootelement = new RootElement("root");
        rootelement.getChild("installDate").setEndTextElementListener(new h(this, o1));
        rootelement.getChild("currentDate").setEndTextElementListener(new i(this, o1));
        rootelement.getChild("serialRamdonKey").setEndTextElementListener(new j(this, o1));
        rootelement.getChild("serialCode").setEndTextElementListener(new k(this, o1));
        rootelement.getChild("paid").setEndTextElementListener(new l(this, o1));
        return rootelement.getContentHandler();
    }

    static void a(g g1, o o1)
    {
        g1.b(o1);
    }

    private int b()
    {
        return (new SecureRandom()).nextInt(9000) + 1000;
    }

    static void b(g g1)
    {
        g1.e();
    }

    private void b(o o1)
    {
        FileOutputStream fileoutputstream;
        o1 = o1.f();
        byte abyte0[];
        try
        {
            abyte0 = com.gau.go.launcherex.gowidget.weather.d.d.c(o1.getBytes("utf-8"));
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            Log.e("RegisterUtil", o1.getMessage());
            return;
        }
        if (!com.gau.go.launcherex.gowidget.weather.d.e.a(c))
        {
            break MISSING_BLOCK_LABEL_62;
        }
        fileoutputstream = new FileOutputStream(d, false);
        o1 = fileoutputstream;
        fileoutputstream.write(abyte0, 0, abyte0.length);
        o1 = fileoutputstream;
        fileoutputstream.flush();
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        fileoutputstream.close();
_L2:
        return;
        o1;
        o1.printStackTrace();
        return;
        Exception exception1;
        exception1;
        fileoutputstream = null;
_L5:
        o1 = fileoutputstream;
        Log.e("RegisterUtil", exception1.getMessage());
        if (fileoutputstream == null) goto _L2; else goto _L1
_L1:
        try
        {
            fileoutputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            o1.printStackTrace();
        }
        return;
        Exception exception;
        exception;
        o1 = null;
_L4:
        if (o1 != null)
        {
            try
            {
                o1.close();
            }
            // Misplaced declaration of an exception variable
            catch (o o1)
            {
                o1.printStackTrace();
            }
        }
        throw exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
        exception1;
          goto _L5
    }

    private void c()
    {
        byte abyte0[] = com.gau.go.launcherex.gowidget.weather.d.e.b(d);
        e = new o();
        if (abyte0 == null)
        {
            d();
            return;
        }
        try
        {
            ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(com.gau.go.launcherex.gowidget.weather.d.d.d(abyte0));
            ContentHandler contenthandler = a(e);
            Xml.parse(bytearrayinputstream, android.util.Xml.Encoding.UTF_8, contenthandler);
            bytearrayinputstream.close();
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            d();
            return;
        }
        catch (Error error)
        {
            error.printStackTrace();
        }
        d();
    }

    private void d()
    {
        String s = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date());
        e.a(s);
        e.b(s);
        e.a(false);
        if (TextUtils.isEmpty(g))
        {
            g = f();
        }
        int i1 = b();
        e.a(i1);
        e.c(a(g, i1));
        (new m(this)).start();
    }

    private void e()
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PAYINFO_SAVE_FINISH");
        a.sendBroadcast(intent);
    }

    private String f()
    {
        String s;
        try
        {
            s = r.a(a);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return "";
        }
        return s;
    }

    public boolean a()
    {
        boolean flag = false;
        if (e.e())
        {
            flag = true;
        }
        return flag;
    }

    public boolean a(boolean flag)
    {
        try
        {
            if (TextUtils.isEmpty(g))
            {
                g = f();
            }
            int i1 = b();
            e.a(i1);
            String s = a(g, i1);
            e.c(s);
            e.a(flag);
            (new n(this)).start();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
        return true;
    }
}
