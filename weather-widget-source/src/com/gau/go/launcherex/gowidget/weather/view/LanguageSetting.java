// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.download.b;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a;
import com.gau.go.launcherex.gowidget.weather.model.RecommendedAppsBean;
import com.gau.go.launcherex.gowidget.weather.model.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            u, x, z, w, 
//            v

public class LanguageSetting extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    private View a;
    private ArrayList b;
    private ListView c;
    private x d;
    private String e;
    private volatile boolean f;
    private volatile boolean g;
    private View h;
    private String i;
    private boolean j;
    private BroadcastReceiver k;
    private h l;

    public LanguageSetting()
    {
        f = false;
        g = false;
        i = null;
        j = true;
        k = new u(this);
    }

    static int a(LanguageSetting languagesetting, List list, ArrayList arraylist)
    {
        return languagesetting.a(list, arraylist);
    }

    private int a(InputStream inputstream, ArrayList arraylist)
    {
        inputstream = new DataInputStream(inputstream);
        inputstream.readInt();
        inputstream.readInt();
        if (inputstream.readInt() <= 0) goto _L2; else goto _L1
_L1:
        int i1;
        inputstream.readLong();
        inputstream.readInt();
        inputstream.readInt();
        inputstream.readInt();
        i1 = inputstream.readInt();
_L13:
        if (i1 <= 0) goto _L4; else goto _L3
_L3:
        RecommendedAppsBean recommendedappsbean;
        int j1;
        recommendedappsbean = new RecommendedAppsBean();
        recommendedappsbean.a(inputstream.readInt());
        recommendedappsbean.o(inputstream.readUTF());
        recommendedappsbean.f(inputstream.readInt());
        recommendedappsbean.b(inputstream.readInt());
        recommendedappsbean.c(inputstream.readInt());
        recommendedappsbean.a(inputstream.readUTF());
        recommendedappsbean.b(inputstream.readUTF());
        recommendedappsbean.c(inputstream.readUTF());
        recommendedappsbean.d(inputstream.readUTF());
        recommendedappsbean.d(inputstream.readInt());
        recommendedappsbean.e(inputstream.readUTF());
        recommendedappsbean.e(inputstream.readInt());
        recommendedappsbean.f(inputstream.readUTF());
        recommendedappsbean.g(inputstream.readUTF());
        recommendedappsbean.h(inputstream.readUTF());
        recommendedappsbean.i(inputstream.readUTF());
        j1 = inputstream.readInt();
_L14:
        if (j1 <= 0) goto _L6; else goto _L5
_L5:
        inputstream.readInt();
        JVM INSTR tableswitch 1 5: default 323
    //                   1 244
    //                   2 262
    //                   3 273
    //                   4 284
    //                   5 295;
           goto _L7 _L8 _L9 _L10 _L11 _L12
_L7:
        break MISSING_BLOCK_LABEL_323;
_L8:
        recommendedappsbean.j(inputstream.readUTF());
        break MISSING_BLOCK_LABEL_323;
_L2:
        return 0;
_L9:
        try
        {
            recommendedappsbean.k(inputstream.readUTF());
            break MISSING_BLOCK_LABEL_323;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        if (true) goto _L2; else goto _L10
_L10:
        recommendedappsbean.l(inputstream.readUTF());
        break MISSING_BLOCK_LABEL_323;
_L11:
        recommendedappsbean.m(inputstream.readUTF());
        break MISSING_BLOCK_LABEL_323;
_L12:
        recommendedappsbean.n(inputstream.readUTF());
        break MISSING_BLOCK_LABEL_323;
_L6:
        arraylist.add(recommendedappsbean);
        i1--;
          goto _L13
_L4:
        return 1;
        j1--;
          goto _L14
    }

    private int a(List list, ArrayList arraylist)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag = false;
        Object obj;
        int i1;
        try
        {
            obj = new HttpPost("http://gostore.3g.cn/gostore/entrance");
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            illegalargumentexception.printStackTrace();
            illegalargumentexception = null;
        }
        i1 = ((flag2) ? 1 : 0);
        if (obj != null)
        {
            try
            {
                list = new UrlEncodedFormEntity(list, "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
                list = null;
            }
            i1 = ((flag2) ? 1 : 0);
            if (list != null)
            {
                ((HttpEntityEnclosingRequestBase) (obj)).setEntity(list);
                list = new BasicHttpParams();
                HttpConnectionParams.setConnectionTimeout(list, 25000);
                HttpConnectionParams.setSoTimeout(list, 25000);
                DefaultHttpClient defaulthttpclient = new DefaultHttpClient(list);
                try
                {
                    list = defaulthttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list.printStackTrace();
                    list = null;
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list.printStackTrace();
                    list = null;
                }
                i1 = ((flag1) ? 1 : 0);
                if (list != null)
                {
                    i1 = ((flag1) ? 1 : 0);
                    if (list.getStatusLine().getStatusCode() == 200)
                    {
                        obj = list.getEntity();
                        i1 = ((flag1) ? 1 : 0);
                        if (obj != null)
                        {
                            try
                            {
                                list = ((HttpEntity) (obj)).getContent();
                            }
                            // Misplaced declaration of an exception variable
                            catch (List list)
                            {
                                list.printStackTrace();
                                list = null;
                            }
                            // Misplaced declaration of an exception variable
                            catch (List list)
                            {
                                list.printStackTrace();
                                list = null;
                            }
                            i1 = ((flag) ? 1 : 0);
                            if (list != null)
                            {
                                i1 = a(((InputStream) (list)), arraylist);
                            }
                            try
                            {
                                ((HttpEntity) (obj)).consumeContent();
                            }
                            // Misplaced declaration of an exception variable
                            catch (List list)
                            {
                                list.printStackTrace();
                            }
                        }
                    }
                }
                defaulthttpclient.getConnectionManager().shutdown();
            }
        }
        return i1;
    }

    static ArrayList a(LanguageSetting languagesetting)
    {
        return languagesetting.b;
    }

    private void a(int i1)
    {
        if (!f && !g)
        {
            Toast.makeText(this, i1, 1).show();
        }
    }

    static void a(LanguageSetting languagesetting, int i1)
    {
        languagesetting.a(i1);
    }

    static void a(LanguageSetting languagesetting, String s, String s1)
    {
        languagesetting.a(s, s1);
    }

    private void a(String s)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        try
        {
            startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Toast.makeText(getApplicationContext(), 0x7f0801e0, 0).show();
        }
    }

    private void a(String s, String s1)
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SETTING_USER_LANGUAGE");
        intent.putExtra("extra_language_code", s);
        intent.putExtra("extra_language_package", s1);
        sendBroadcast(intent);
    }

    static boolean a(LanguageSetting languagesetting, boolean flag)
    {
        languagesetting.g = flag;
        return flag;
    }

    static x b(LanguageSetting languagesetting)
    {
        return languagesetting.d;
    }

    private void b(int i1)
    {
        l l1 = (l)b.get(i1);
        if (!com.gau.go.launcherex.gowidget.c.g.a(this))
        {
            Toast.makeText(this, 0x7f0804c4, 0).show();
            return;
        }
        if (!TextUtils.isEmpty(l1.e()))
        {
            String s;
            if (TextUtils.isEmpty(l1.i()))
            {
                s = (new StringBuilder()).append(getText(0x7f0804c2).toString()).append(l1.a()).toString();
            } else
            {
                s = l1.i();
            }
            com.gau.go.launcherex.gowidget.download.b.a(this, (new StringBuilder()).append(s).append(".apk").toString(), l1.e(), l1.a(), l1.d());
            return;
        }
        if (!TextUtils.isEmpty(l1.f()) && w.s(this))
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(l1.f().trim()));
            try
            {
                intent.setPackage("com.android.vending");
                intent.setFlags(0x10000000);
                startActivity(intent);
                return;
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            return;
        }
        if (!TextUtils.isEmpty(l1.h()))
        {
            com.gau.go.launcherex.gowidget.weather.globaltheme.a.d(this, l1.h());
            return;
        }
        if (!TextUtils.isEmpty(l1.g()))
        {
            com.gau.go.launcherex.gowidget.weather.globaltheme.a.d(this, l1.g());
            return;
        } else
        {
            Toast.makeText(this, 0x7f0804c5, 1).show();
            return;
        }
    }

    static void b(LanguageSetting languagesetting, int i1)
    {
        languagesetting.b(i1);
    }

    static boolean b(LanguageSetting languagesetting, boolean flag)
    {
        languagesetting.f = flag;
        return flag;
    }

    static String c(LanguageSetting languagesetting)
    {
        return languagesetting.e;
    }

    static boolean d(LanguageSetting languagesetting)
    {
        return languagesetting.f;
    }

    static boolean e(LanguageSetting languagesetting)
    {
        return languagesetting.g;
    }

    protected void c()
    {
        ((TextView)findViewById(0x7f090419)).setText(0x7f080126);
        e = com.gau.go.launcherex.gowidget.language.e.a(this).c();
        d.notifyDataSetChanged();
    }

    protected void d()
    {
    }

    public void onClick(View view)
    {
        if (!l.a(hashCode()))
        {
            if (view.equals(a))
            {
                finish();
                return;
            }
            if (view.equals(h))
            {
                a("http://crowdin.net/project/goweather/invite");
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        l = new h();
        i = getIntent().getStringExtra("weather_alerts_lists_entrance");
        if (i != null && i.equals("widget&notification"))
        {
            j = false;
        }
        setContentView(0x7f0300f7);
        getWindow().clearFlags(0x8000000);
        c = (ListView)findViewById(0x7f090332);
        e = com.gau.go.launcherex.gowidget.language.e.a(this).c();
        b = com.gau.go.launcherex.gowidget.language.e.a(this).g();
        a = findViewById(0x7f090060);
        a.setOnClickListener(this);
        ((TextView)findViewById(0x7f090419)).setText(0x7f080126);
        d = new x(this);
        c.setAdapter(d);
        c.setOnItemClickListener(this);
        h = findViewById(0x7f090331);
        h.setOnClickListener(this);
        bundle = new IntentFilter();
        bundle.addAction("android.intent.action.PACKAGE_ADDED");
        bundle.addAction("android.intent.action.PACKAGE_REMOVED");
        bundle.addAction("android.intent.action.PACKAGE_REPLACED");
        bundle.addDataScheme("package");
        registerReceiver(k, bundle);
    }

    protected void onDestroy()
    {
        if (k != null)
        {
            unregisterReceiver(k);
            k = null;
        }
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (((z)view.getTag()).c.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        if (!com.gau.go.launcherex.gowidget.c.g.a(this)) goto _L4; else goto _L3
_L3:
        a(0x7f0803fa);
        (new com.gau.go.launcherex.gowidget.weather.view.w(this, i1)).execute(new Void[0]);
_L6:
        return;
_L4:
        a(0x7f080458);
        return;
_L2:
        adapterview = (l)b.get(i1);
        if (!adapterview.b().equals(e))
        {
            view = new com.gau.go.launcherex.gowidget.weather.globalview.b(this);
            view.setTitle(0x7f080126);
            view.a(Color.parseColor("#FFFFFFFF"));
            view.b(e().getString(0x7f0803f9, new Object[] {
                adapterview.i()
            }));
            view.d(0x7f0803f7);
            view.e(0x7f0803f8);
            view.a(new v(this, adapterview));
            view.a();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            finish();
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onStop()
    {
        super.onStop();
        if (j)
        {
            finish();
        }
    }
}
