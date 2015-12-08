// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.c.f;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b;
import com.gau.go.launcherex.gowidget.weather.model.ThemeDataBean;
import com.gau.go.launcherex.gowidget.weather.model.x;
import com.gau.go.launcherex.gowidget.weather.model.y;
import com.jiubang.core.b.a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            e

public class c
{

    private static c d;
    private Context a;
    private String b;
    private SharedPreferences c;
    private boolean e;
    private boolean f;

    private c(Context context)
    {
        b = null;
        e = false;
        f = false;
        a = context;
        b = com.gau.go.launcherex.gowidget.language.e.a(a).d();
        if (TextUtils.isEmpty(b))
        {
            b = "en";
        }
        c = GoWidgetApplication.c(context.getApplicationContext()).a();
    }

    static long a(c c1)
    {
        return c1.b();
    }

    static Bitmap a(c c1, String s)
    {
        return c1.a(s);
    }

    private Bitmap a(String s)
    {
        Object obj;
        Object obj2;
        Object obj6;
        Object obj7;
        obj7 = null;
        obj = null;
        obj6 = null;
        obj2 = new ArrayList();
        a(((List) (obj2)), s);
        Object obj1;
        DefaultHttpClient defaulthttpclient;
        obj1 = new HttpPost("http://gostore.3g.cn/gostore/entrance");
        ((HttpEntityEnclosingRequestBase) (obj1)).setEntity(new UrlEncodedFormEntity(((List) (obj2)), "UTF-8"));
        defaulthttpclient = new DefaultHttpClient();
        obj2 = defaulthttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj1)));
        if (((HttpResponse) (obj2)).getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_715;
        }
        obj1 = new DataInputStream(((HttpResponse) (obj2)).getEntity().getContent());
        int i;
        ((DataInputStream) (obj1)).readInt();
        ((DataInputStream) (obj1)).readInt();
        i = ((DataInputStream) (obj1)).readInt();
        if (i != 0) goto _L2; else goto _L1
_L1:
        Object obj3;
        String s1;
        DefaultHttpClient defaulthttpclient1;
        HttpResponse httpresponse;
        int j;
        int k;
        if (obj1 != null)
        {
            try
            {
                ((DataInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (obj2 != null)
        {
            try
            {
                ((HttpResponse) (obj2)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        obj = obj7;
        if (defaulthttpclient == null) goto _L4; else goto _L3
_L3:
        obj = defaulthttpclient.getConnectionManager();
        s = obj6;
_L12:
        ((ClientConnectionManager) (obj)).shutdown();
        obj = s;
_L4:
        return ((Bitmap) (obj));
_L2:
        ((DataInputStream) (obj1)).readLong();
        j = ((DataInputStream) (obj1)).readInt();
_L14:
        if (j <= 0) goto _L6; else goto _L5
_L5:
        if (!((DataInputStream) (obj1)).readUTF().equals(s)) goto _L8; else goto _L7
_L7:
        j = ((DataInputStream) (obj1)).readInt();
        s = new ByteArrayOutputStream();
        httpresponse = ((HttpResponse) (obj2));
        defaulthttpclient1 = defaulthttpclient;
        s1 = s;
        obj3 = obj1;
        obj = new byte[1024];
_L10:
        httpresponse = ((HttpResponse) (obj2));
        defaulthttpclient1 = defaulthttpclient;
        s1 = s;
        obj3 = obj1;
        k = ((DataInputStream) (obj1)).read(((byte []) (obj)));
        if (k == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        httpresponse = ((HttpResponse) (obj2));
        defaulthttpclient1 = defaulthttpclient;
        s1 = s;
        obj3 = obj1;
        s.write(((byte []) (obj)), 0, k);
        if (true) goto _L10; else goto _L9
        obj;
_L18:
        httpresponse = ((HttpResponse) (obj2));
        defaulthttpclient1 = defaulthttpclient;
        s1 = s;
        obj3 = obj1;
        ((Exception) (obj)).printStackTrace();
        if (obj1 != null)
        {
            try
            {
                ((DataInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (obj2 != null)
        {
            try
            {
                ((HttpResponse) (obj2)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        obj = obj7;
        if (defaulthttpclient == null) goto _L4; else goto _L11
_L11:
        obj = defaulthttpclient.getConnectionManager();
        s = obj6;
          goto _L12
_L9:
        httpresponse = ((HttpResponse) (obj2));
        defaulthttpclient1 = defaulthttpclient;
        s1 = s;
        obj3 = obj1;
        obj = BitmapFactory.decodeByteArray(s.toByteArray(), 0, j);
        obj3 = obj;
        obj = s;
        s = ((String) (obj3));
_L19:
        if (obj1 != null)
        {
            try
            {
                ((DataInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        if (obj != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        if (obj2 != null)
        {
            try
            {
                ((HttpResponse) (obj2)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        obj = s;
        if (defaulthttpclient == null) goto _L4; else goto _L13
_L13:
        obj = defaulthttpclient.getConnectionManager();
          goto _L12
_L8:
        j--;
          goto _L14
_L16:
        if (defaulthttpclient != null)
        {
            defaulthttpclient.getConnectionManager().shutdown();
        }
        throw s;
        s;
        obj2 = null;
        defaulthttpclient = null;
        obj = null;
        obj1 = null;
_L17:
        if (obj1 != null)
        {
            try
            {
                ((DataInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        if (obj != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        if (obj2 != null)
        {
            try
            {
                ((HttpResponse) (obj2)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        if (true) goto _L16; else goto _L15
_L15:
        s;
        obj2 = null;
        obj = null;
        obj1 = null;
          goto _L17
        s;
        obj = null;
        obj1 = null;
          goto _L17
        s;
        obj = null;
          goto _L17
        s;
        obj2 = httpresponse;
        defaulthttpclient = defaulthttpclient1;
        obj = s1;
        obj1 = obj3;
          goto _L17
        obj;
        obj2 = null;
        defaulthttpclient = null;
        s = null;
        obj1 = null;
          goto _L18
        obj;
        obj2 = null;
        s = null;
        obj1 = null;
          goto _L18
        obj;
        s = null;
        obj1 = null;
          goto _L18
        obj;
        s = null;
          goto _L18
_L6:
        Object obj4 = null;
        s = ((String) (obj));
        obj = obj4;
          goto _L19
        Object obj5 = null;
        obj1 = null;
        s = ((String) (obj));
        obj = obj5;
          goto _L19
    }

    public static c a(Context context)
    {
        if (d == null)
        {
            d = new c(context);
        }
        return d;
    }

    private ArrayList a(List list)
    {
        Object obj;
        Object obj2;
        Object obj6;
        obj2 = null;
        obj = null;
        obj6 = null;
        Object obj1;
        DefaultHttpClient defaulthttpclient;
        obj1 = new HttpPost("http://gostore.3g.cn/gostore/entrance");
        ((HttpEntityEnclosingRequestBase) (obj1)).setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
        defaulthttpclient = new DefaultHttpClient();
        obj1 = defaulthttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj1)));
        if (((HttpResponse) (obj1)).getStatusLine().getStatusCode() != 200) goto _L2; else goto _L1
_L1:
        obj = new DataInputStream(((HttpResponse) (obj1)).getEntity().getContent());
        Object obj4;
        DefaultHttpClient defaulthttpclient1;
        Object obj5;
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        y y1 = new y();
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((DataInputStream) (obj)).readInt();
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        y1.a(((DataInputStream) (obj)).readInt());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        y1.b(((DataInputStream) (obj)).readInt());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        if (y1.a() != 0) goto _L4; else goto _L3
_L3:
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        f = true;
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
        }
        if (obj1 != null)
        {
            try
            {
                ((HttpResponse) (obj1)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
        }
        obj = obj6;
        if (defaulthttpclient != null)
        {
            defaulthttpclient.getConnectionManager().shutdown();
            obj = obj6;
        }
_L15:
        return ((ArrayList) (obj));
_L4:
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        y1.a(((DataInputStream) (obj)).readLong());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        y1.c(((DataInputStream) (obj)).readInt());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        y1.d(((DataInputStream) (obj)).readInt());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        y1.e(((DataInputStream) (obj)).readInt());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        y1.f(((DataInputStream) (obj)).readInt());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        list = new ArrayList();
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        int i = y1.c();
_L16:
        if (i <= 0) goto _L6; else goto _L5
_L5:
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        obj2 = new ThemeDataBean();
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).a(((DataInputStream) (obj)).readInt());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).b(((DataInputStream) (obj)).readInt());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).c(((DataInputStream) (obj)).readInt());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).a(((DataInputStream) (obj)).readUTF());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).b(((DataInputStream) (obj)).readUTF());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).c(((DataInputStream) (obj)).readUTF());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).d(((DataInputStream) (obj)).readUTF());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).d(((DataInputStream) (obj)).readInt());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).e(((DataInputStream) (obj)).readUTF());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).e(((DataInputStream) (obj)).readInt());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).f(((DataInputStream) (obj)).readUTF());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).g(((DataInputStream) (obj)).readUTF());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).h(((DataInputStream) (obj)).readUTF());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).i(((DataInputStream) (obj)).readUTF());
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        int j = ((DataInputStream) (obj)).readInt();
_L20:
        if (j <= 0) goto _L8; else goto _L7
_L7:
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((DataInputStream) (obj)).readInt();
        JVM INSTR tableswitch 1 5: default 1148
    //                   1 740
    //                   2 828
    //                   3 901
    //                   4 923
    //                   5 945;
           goto _L9 _L10 _L11 _L12 _L13 _L14
_L9:
        break MISSING_BLOCK_LABEL_1148;
_L10:
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        try
        {
            ((ThemeDataBean) (obj2)).j(((DataInputStream) (obj)).readUTF());
            break MISSING_BLOCK_LABEL_1148;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj4)
        {
            obj2 = list;
            list = ((List) (obj4));
        }
        finally
        {
            obj = obj5;
            defaulthttpclient = defaulthttpclient1;
            obj1 = obj4;
        }
_L19:
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        list.printStackTrace();
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
        }
        if (obj1 != null)
        {
            try
            {
                ((HttpResponse) (obj1)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
        }
        obj = obj2;
        if (defaulthttpclient != null)
        {
            defaulthttpclient.getConnectionManager().shutdown();
            return ((ArrayList) (obj2));
        }
          goto _L15
_L11:
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).k(((DataInputStream) (obj)).readUTF());
        break MISSING_BLOCK_LABEL_1148;
_L18:
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        if (obj1 != null)
        {
            try
            {
                ((HttpResponse) (obj1)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        if (defaulthttpclient != null)
        {
            defaulthttpclient.getConnectionManager().shutdown();
        }
        throw list;
_L12:
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).l(((DataInputStream) (obj)).readUTF());
        break MISSING_BLOCK_LABEL_1148;
_L13:
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).m(((DataInputStream) (obj)).readUTF());
        break MISSING_BLOCK_LABEL_1148;
_L14:
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        ((ThemeDataBean) (obj2)).n(((DataInputStream) (obj)).readUTF());
        break MISSING_BLOCK_LABEL_1148;
_L8:
        obj4 = obj1;
        defaulthttpclient1 = defaulthttpclient;
        obj5 = obj;
        list.add(obj2);
        i--;
          goto _L16
_L6:
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        if (obj1 != null)
        {
            try
            {
                ((HttpResponse) (obj1)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        obj = list;
        if (defaulthttpclient == null) goto _L15; else goto _L17
_L17:
        defaulthttpclient.getConnectionManager().shutdown();
        return list;
        list;
        obj1 = null;
        defaulthttpclient = null;
        obj = null;
          goto _L18
        list;
        obj1 = null;
        obj = null;
          goto _L18
        list;
        obj = null;
          goto _L18
        list;
        obj1 = null;
        defaulthttpclient = null;
        obj = null;
          goto _L19
        list;
        obj1 = null;
        obj = null;
          goto _L19
        list;
        obj = null;
          goto _L19
        list;
          goto _L19
_L2:
        Object obj3 = null;
        list = ((List) (obj));
        obj = obj3;
          goto _L6
        j--;
          goto _L20
    }

    static void a(c c1, List list)
    {
        c1.d(list);
    }

    static void a(c c1, List list, ThemeDataBean themedatabean)
    {
        c1.a(list, themedatabean);
    }

    static void a(c c1, List list, String s)
    {
        c1.a(list, s);
    }

    private void a(List list, ThemeDataBean themedatabean)
    {
        c(list);
        list.add(new BasicNameValuePair("funid", "5"));
        list.add(new BasicNameValuePair("id", (new StringBuilder()).append(themedatabean.a()).append("").toString()));
        list.add(new BasicNameValuePair("pkgname", themedatabean.c()));
    }

    private void a(List list, String s)
    {
        c(list);
        list.add(new BasicNameValuePair("funid", "6"));
        list.add(new BasicNameValuePair("imgids", s));
    }

    static boolean a(c c1, boolean flag)
    {
        c1.f = flag;
        return flag;
    }

    private long b()
    {
        return c.getLong("key_synchronou_launch_image_timestamp", 0L);
    }

    private x b(List list)
    {
        Object obj1;
        Object obj3;
        DataInputStream datainputstream;
        datainputstream = null;
        obj3 = null;
        obj1 = null;
        Object obj;
        DefaultHttpClient defaulthttpclient;
        obj = new HttpPost("http://gostore.3g.cn/gostore/entrance");
        ((HttpEntityEnclosingRequestBase) (obj)).setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
        defaulthttpclient = new DefaultHttpClient();
        obj = defaulthttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_941;
        }
        datainputstream = new DataInputStream(((HttpResponse) (obj)).getEntity().getContent());
        Object obj4;
        DefaultHttpClient defaulthttpclient1;
        Object obj5;
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list = new y();
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        datainputstream.readInt();
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.a(datainputstream.readInt());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.b(datainputstream.readInt());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        int i = list.a();
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (datainputstream != null)
        {
            try
            {
                datainputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
        }
        if (obj != null)
        {
            try
            {
                ((HttpResponse) (obj)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
        }
        obj = obj1;
        if (defaulthttpclient != null)
        {
            defaulthttpclient.getConnectionManager().shutdown();
            obj = obj1;
        }
_L4:
        return ((x) (obj));
_L2:
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.a(datainputstream.readLong());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list = new x();
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.a(datainputstream.readInt());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.a(datainputstream.readByte());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.b(datainputstream.readByte());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.a(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.b(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.c(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.d(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.e(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.b(datainputstream.readInt());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.f(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.g(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.h(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.i(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.j(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.k(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.l(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.m(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.n(datainputstream.readUTF());
        obj5 = obj;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = datainputstream;
        list.o(datainputstream.readUTF());
_L9:
        if (datainputstream != null)
        {
            try
            {
                datainputstream.close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        if (obj != null)
        {
            try
            {
                ((HttpResponse) (obj)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        obj = list;
        if (defaulthttpclient == null) goto _L4; else goto _L3
_L3:
        defaulthttpclient.getConnectionManager().shutdown();
        return list;
        list;
        ioexception = null;
        defaulthttpclient = null;
        obj = null;
_L8:
        obj5 = ioexception;
        defaulthttpclient1 = defaulthttpclient;
        obj4 = obj;
        list.printStackTrace();
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
        }
        if (ioexception != null)
        {
            try
            {
                ioexception.getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
        }
        obj = obj3;
        if (defaulthttpclient == null) goto _L4; else goto _L5
_L5:
        defaulthttpclient.getConnectionManager().shutdown();
        return ((x) (obj3));
        list;
        obj = null;
        defaulthttpclient = null;
        ioexception = null;
_L7:
        if (ioexception != null)
        {
            try
            {
                ioexception.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        if (obj != null)
        {
            try
            {
                ((HttpResponse) (obj)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        if (defaulthttpclient != null)
        {
            defaulthttpclient.getConnectionManager().shutdown();
        }
        throw list;
        list;
        obj = null;
        ioexception = null;
        continue; /* Loop/switch isn't completed */
        list;
        ioexception = null;
        continue; /* Loop/switch isn't completed */
        list;
        obj = obj5;
        defaulthttpclient = defaulthttpclient1;
        ioexception = ((IOException) (obj4));
        if (true) goto _L7; else goto _L6
_L6:
        list;
        ioexception = null;
        obj = null;
          goto _L8
        list;
        datainputstream = null;
        ioexception = ((IOException) (obj));
        obj = datainputstream;
          goto _L8
        list;
        ioexception = ((IOException) (obj));
        obj = datainputstream;
          goto _L8
        Exception exception;
        exception;
        obj3 = list;
        list = exception;
        exception = ((Exception) (obj));
        obj = datainputstream;
          goto _L8
        Object obj2 = null;
        list = datainputstream;
        datainputstream = obj2;
          goto _L9
    }

    static ArrayList b(c c1, List list)
    {
        return c1.a(list);
    }

    public static void b(Context context)
    {
        context = GoWidgetApplication.c(context).a().edit();
        context.putLong("key_synchronou_launch_image_timestamp", 0L);
        context.commit();
    }

    static boolean b(c c1)
    {
        return c1.f;
    }

    static boolean b(c c1, boolean flag)
    {
        c1.e = flag;
        return flag;
    }

    static Context c(c c1)
    {
        return c1.a;
    }

    static x c(c c1, List list)
    {
        return c1.b(list);
    }

    private void c()
    {
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putLong("key_synchronou_launch_image_timestamp", System.currentTimeMillis());
        editor.commit();
    }

    private void c(List list)
    {
        list.add(new BasicNameValuePair("vps", com.gau.go.launcherex.gowidget.weather.globaltheme.b.a(a)));
        list.add(new BasicNameValuePair("channel", w.f(a)));
        list.add(new BasicNameValuePair("lang", w.j(a)));
        String s;
        if (w.t(a))
        {
            s = "1";
        } else
        {
            s = "0";
        }
        list.add(new BasicNameValuePair("isfee", s));
        list.add(new BasicNameValuePair("pversion", "18"));
        list.add(new BasicNameValuePair("ps", "30"));
        list.add(new BasicNameValuePair("isgmail", "-1"));
        list.add(new BasicNameValuePair("appuid", "7"));
        if (w.h(a))
        {
            s = "1";
        } else
        {
            s = "0";
        }
        list.add(new BasicNameValuePair("offical", s));
    }

    static void d(c c1)
    {
        c1.c();
    }

    private void d(List list)
    {
        c(list);
        list.add(new BasicNameValuePair("funid", "27"));
        list.add(new BasicNameValuePair("timestamp", "0"));
        list.add(new BasicNameValuePair("ty", "5"));
        try
        {
            list.add(new BasicNameValuePair("owns", com.gau.go.launcherex.gowidget.c.f.a("", "ISO-8859-1")));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            list.printStackTrace();
        }
    }

    static String e(c c1)
    {
        return c1.b;
    }

    static c f(c c1)
    {
        d = c1;
        return c1;
    }

    public void a()
    {
        com.gtp.a.a.b.c.a("LJL", "startSyncLaunchImage--------------------");
        if (!e)
        {
            e = true;
            (new com.gau.go.launcherex.gowidget.weather.b.e(this, null)).execute(new Void[0]);
        }
    }
}
