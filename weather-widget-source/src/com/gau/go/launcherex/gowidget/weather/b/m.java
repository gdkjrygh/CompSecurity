// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.gau.go.launcherex.gowidget.c.f;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b;
import com.gau.go.launcherex.gowidget.weather.model.PluginCameraBean;
import com.gau.go.launcherex.gowidget.weather.model.y;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
//            q, o

public class m
{

    private o a;
    private Context b;
    private y c;
    private ArrayList d;
    private q e;

    public m(Context context)
    {
        e = null;
        b = context;
        c = new y();
        c.a(0L);
        d = new ArrayList();
        e = new q(this, context.getContentResolver(), context);
    }

    static o a(m m1, o o)
    {
        m1.a = o;
        return o;
    }

    static ArrayList a(m m1)
    {
        return m1.d;
    }

    static void a(m m1, List list)
    {
        m1.a(list);
    }

    private void a(List list)
    {
        b(list);
        list.add(new BasicNameValuePair("funid", "27"));
        list.add(new BasicNameValuePair("timestamp", (new StringBuilder()).append(c.b()).append("").toString()));
        list.add(new BasicNameValuePair("ty", "6"));
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

    static void b(m m1)
    {
        m1.e();
    }

    private void b(List list)
    {
        list.add(new BasicNameValuePair("vps", com.gau.go.launcherex.gowidget.weather.globaltheme.b.a(b)));
        list.add(new BasicNameValuePair("channel", w.f(b)));
        list.add(new BasicNameValuePair("lang", w.j(b)));
        String s;
        if (w.t(b))
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
        if (w.h(b))
        {
            s = "1";
        } else
        {
            s = "0";
        }
        list.add(new BasicNameValuePair("offical", s));
    }

    static boolean b(m m1, List list)
    {
        return m1.c(list);
    }

    private boolean c()
    {
        return b.getContentResolver().delete(WeatherContentProvider.h, "theme_type=?", new String[] {
            "6"
        }) > 0;
    }

    static boolean c(m m1)
    {
        return m1.c();
    }

    private boolean c(List list)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = false;
        flag = false;
        obj = null;
        Object obj1;
        HttpPost httppost;
        httppost = new HttpPost("http://gostore.3g.cn/gostore/entrance");
        httppost.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
        obj1 = new DefaultHttpClient();
        Object obj3 = ((DefaultHttpClient) (obj1)).execute(httppost);
        if (((HttpResponse) (obj3)).getStatusLine().getStatusCode() != 200) goto _L2; else goto _L1
_L1:
        obj = new DataInputStream(((HttpResponse) (obj3)).getEntity().getContent());
        int i;
        ((DataInputStream) (obj)).readInt();
        c.a(((DataInputStream) (obj)).readInt());
        c.b(((DataInputStream) (obj)).readInt());
        i = c.a();
        if (i != 0) goto _L4; else goto _L3
_L3:
        Object obj2;
        int k;
        int j;
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
        if (obj3 != null)
        {
            try
            {
                ((HttpResponse) (obj3)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
        }
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        list = ((DefaultHttpClient) (obj1)).getConnectionManager();
_L18:
        list.shutdown();
        flag1 = flag;
_L6:
        return flag1;
_L4:
        c.a(((DataInputStream) (obj)).readLong());
        c.c(((DataInputStream) (obj)).readInt());
        c.d(((DataInputStream) (obj)).readInt());
        c.e(((DataInputStream) (obj)).readInt());
        c.f(((DataInputStream) (obj)).readInt());
        j = c.c();
_L19:
        if (j <= 0) goto _L8; else goto _L7
_L7:
        list = new PluginCameraBean();
        list.a(((DataInputStream) (obj)).readInt());
        list.b(((DataInputStream) (obj)).readInt());
        list.c(((DataInputStream) (obj)).readInt());
        list.a(((DataInputStream) (obj)).readUTF());
        list.b(((DataInputStream) (obj)).readUTF());
        list.c(((DataInputStream) (obj)).readUTF());
        list.d(((DataInputStream) (obj)).readUTF());
        list.d(((DataInputStream) (obj)).readInt());
        list.e(((DataInputStream) (obj)).readUTF());
        list.e(((DataInputStream) (obj)).readInt());
        list.f(((DataInputStream) (obj)).readUTF());
        list.g(((DataInputStream) (obj)).readUTF());
        list.h(((DataInputStream) (obj)).readUTF());
        list.i(((DataInputStream) (obj)).readUTF());
        k = ((DataInputStream) (obj)).readInt();
_L24:
        if (k <= 0) goto _L10; else goto _L9
_L9:
        ((DataInputStream) (obj)).readInt();
        JVM INSTR tableswitch 1 5: default 787
    //                   1 416
    //                   2 474
    //                   3 530
    //                   4 541
    //                   5 552;
           goto _L11 _L12 _L13 _L14 _L15 _L16
_L11:
        break MISSING_BLOCK_LABEL_787;
_L12:
        list.j(((DataInputStream) (obj)).readUTF());
        break MISSING_BLOCK_LABEL_787;
        obj2;
        list = ((List) (obj1));
        obj1 = obj3;
_L22:
        ((Exception) (obj2)).printStackTrace();
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
        if (list == null) goto _L6; else goto _L17
_L17:
        list = list.getConnectionManager();
          goto _L18
_L13:
        list.k(((DataInputStream) (obj)).readUTF());
        break MISSING_BLOCK_LABEL_787;
        list;
        obj2 = obj3;
_L21:
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
        if (obj1 != null)
        {
            ((DefaultHttpClient) (obj1)).getConnectionManager().shutdown();
        }
        throw list;
_L14:
        list.l(((DataInputStream) (obj)).readUTF());
        break MISSING_BLOCK_LABEL_787;
_L15:
        list.m(((DataInputStream) (obj)).readUTF());
        break MISSING_BLOCK_LABEL_787;
_L16:
        list.n(((DataInputStream) (obj)).readUTF());
        break MISSING_BLOCK_LABEL_787;
_L10:
        d.add(list);
        j--;
          goto _L19
_L8:
        flag = true;
_L23:
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
        if (obj3 != null)
        {
            try
            {
                ((HttpResponse) (obj3)).getEntity().consumeContent();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
        }
        flag1 = flag;
        if (obj1 == null) goto _L6; else goto _L20
_L20:
        list = ((DefaultHttpClient) (obj1)).getConnectionManager();
          goto _L18
        list;
        obj2 = null;
        obj1 = null;
        obj = null;
          goto _L21
        list;
        obj2 = null;
        obj = null;
          goto _L21
        list;
        obj = null;
        obj2 = obj3;
          goto _L21
        obj2;
        obj3 = list;
        list = ((List) (obj2));
        obj2 = obj1;
        obj1 = obj3;
          goto _L21
        obj2;
        obj1 = null;
        obj3 = null;
        list = ((List) (obj));
        obj = obj3;
          goto _L22
        obj2;
        obj3 = null;
        obj = null;
        list = ((List) (obj1));
        obj1 = obj3;
          goto _L22
        obj2;
        obj = null;
        list = ((List) (obj1));
        obj1 = obj3;
          goto _L22
_L2:
        obj = null;
        flag = flag2;
          goto _L23
        k--;
          goto _L24
    }

    private boolean d()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = d.iterator();
        while (iterator.hasNext()) 
        {
            PluginCameraBean plugincamerabean = (PluginCameraBean)iterator.next();
            ContentValues contentvalues = new ContentValues();
            String s;
            if (plugincamerabean.p() == null)
            {
                s = "";
            } else
            {
                s = plugincamerabean.p();
            }
            contentvalues.put("app_market_url", s);
            contentvalues.put("download", plugincamerabean.n());
            if (plugincamerabean.o() == null)
            {
                s = "";
            } else
            {
                s = plugincamerabean.o();
            }
            contentvalues.put("ftp_url", s);
            if (plugincamerabean.q() == null)
            {
                s = "";
            } else
            {
                s = plugincamerabean.q();
            }
            contentvalues.put("go_boutique_url", s);
            if (plugincamerabean.s() == null)
            {
                s = "";
            } else
            {
                s = plugincamerabean.s();
            }
            contentvalues.put("web_market_url", s);
            contentvalues.put("is_all", Integer.valueOf(plugincamerabean.b()));
            contentvalues.put("is_sale", Integer.valueOf(plugincamerabean.c()));
            contentvalues.put("name", plugincamerabean.d());
            if (plugincamerabean.r() == null)
            {
                s = "";
            } else
            {
                s = plugincamerabean.r();
            }
            contentvalues.put("other_url", s);
            contentvalues.put("package_name", plugincamerabean.i());
            contentvalues.put("preview_id", plugincamerabean.e());
            contentvalues.put("price", plugincamerabean.k());
            contentvalues.put("fee_type", Integer.valueOf(plugincamerabean.j()));
            contentvalues.put("size", plugincamerabean.l());
            contentvalues.put("summary", plugincamerabean.f());
            contentvalues.put("theme_id", Integer.valueOf(plugincamerabean.a()));
            contentvalues.put("update_time", plugincamerabean.m());
            contentvalues.put("version", plugincamerabean.g());
            contentvalues.put("version_num", Integer.valueOf(plugincamerabean.h()));
            contentvalues.put("theme_type", Integer.valueOf(6));
            arraylist.add(ContentProviderOperation.newInsert(WeatherContentProvider.h).withValues(contentvalues).build());
        }
        iterator = null;
        android.content.ContentProviderResult acontentproviderresult[] = iterator;
        if (arraylist.size() > 0)
        {
            try
            {
                acontentproviderresult = b.getContentResolver().applyBatch("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist);
            }
            catch (RemoteException remoteexception)
            {
                remoteexception.printStackTrace();
                remoteexception = iterator;
            }
            catch (OperationApplicationException operationapplicationexception)
            {
                operationapplicationexception.printStackTrace();
                operationapplicationexception = iterator;
            }
        }
        return arraylist.size() > 0 && acontentproviderresult != null && acontentproviderresult.length > 0;
    }

    static boolean d(m m1)
    {
        return m1.d();
    }

    static Context e(m m1)
    {
        return m1.b;
    }

    private void e()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("setting_value", (new StringBuilder()).append(c.b()).append("").toString());
        e.a(2, null, WeatherContentProvider.g, contentvalues, "setting_key=?", new String[] {
            "plugin_camera_data_timestamp"
        });
    }

    static y f(m m1)
    {
        return m1.c;
    }

    static o g(m m1)
    {
        return m1.a;
    }

    public void a()
    {
        e.a(1, null, WeatherContentProvider.g, new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "plugin_camera_data_timestamp"
        }, null);
    }

    public void b()
    {
        a = null;
    }
}
