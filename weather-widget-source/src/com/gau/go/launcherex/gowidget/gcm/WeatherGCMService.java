// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.gcm;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.c;
import com.gau.go.launcherex.gowidget.weather.util.f;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.gau.go.launcherex.gowidget.gcm:
//            b

public class WeatherGCMService extends IntentService
{

    private static android.os.PowerManager.WakeLock a;
    private static final Object b = com/gau/go/launcherex/gowidget/gcm/WeatherGCMService;

    public WeatherGCMService()
    {
        super(com/gau/go/launcherex/gowidget/gcm/WeatherGCMService.getName());
    }

    static void a(Context context, Intent intent)
    {
        intent.setClassName(context, com/gau/go/launcherex/gowidget/gcm/WeatherGCMService.getName());
        context.startService(intent);
    }

    private void a(Intent intent)
    {
        String s = intent.getStringExtra("registration_id");
        Object obj = intent.getStringExtra("error");
        Object obj1 = intent.getStringExtra("unregistered");
        intent = getApplicationContext();
        if (s != null)
        {
            System.out.println("\u6CE8\u518C\u6210\u529F");
            Object obj2 = intent.getSharedPreferences("goweatherex_info", 0);
            String s1 = ((SharedPreferences) (obj2)).getString("gcm_cur_reg_id", null);
            if (s1 != null && s1.length() > 0)
            {
                obj2 = ((SharedPreferences) (obj2)).edit();
                ((android.content.SharedPreferences.Editor) (obj2)).putString("gcm_cur_reg_id", s);
                ((android.content.SharedPreferences.Editor) (obj2)).commit();
                com.gau.go.launcherex.gowidget.gcm.b.a(intent).a(s, s1, true);
                obj2 = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GCM_UPDATE_REG_ID");
                ((Intent) (obj2)).putExtra("extra_cur_reg_id", s);
                ((Intent) (obj2)).putExtra("extra_old_reg_id", s1);
                intent.sendBroadcast(((Intent) (obj2)));
            } else
            {
                Intent intent1 = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GCM_OPERATION");
                intent1.putExtra("extra_gcm_id", s);
                intent1.putExtra("extra_gcm_op", 1);
                intent.sendBroadcast(intent1);
            }
        }
        if (obj1 != null)
        {
            System.out.println("\u53CD\u6CE8\u518C\u6210\u529F");
            s = intent.getSharedPreferences("goweatherex_info", 0).getString("gcm_cur_reg_id", s);
            obj1 = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GCM_OPERATION");
            ((Intent) (obj1)).putExtra("extra_gcm_id", s);
            ((Intent) (obj1)).putExtra("extra_gcm_op", 0);
            intent.sendBroadcast(((Intent) (obj1)));
        }
        if (obj != null)
        {
            obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GCM_OPERATION");
            ((Intent) (obj)).putExtra("extra_gcm_id", "");
            intent.sendBroadcast(((Intent) (obj)));
        }
    }

    private void b(Intent intent)
    {
        f f1;
        Object obj1;
        char c2;
        c2 = '\uD8F0';
        System.out.println("\u6536\u5230\u63A8\u9001\u6D88\u606F");
        f1 = f.a(getApplicationContext());
        obj1 = intent.getStringExtra("alert_id");
        if (TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L2; else goto _L1
_L1:
        Object obj;
        String s;
        s = intent.getStringExtra("city_id");
        obj = intent.getStringExtra("exp_time");
        if (!f1.f(s)) goto _L2; else goto _L3
_L3:
        int i;
        try
        {
            i = Integer.parseInt(((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((Exception) (obj1)).printStackTrace();
            i = 0;
        }
        obj1 = f1.a(s);
        if (((WeatherBean) (obj1)).c(i))
        {
            break MISSING_BLOCK_LABEL_289;
        }
        obj1 = new c();
        ((c) (obj1)).c(i);
        ((c) (obj1)).g(s);
        ((c) (obj1)).a(intent.getStringExtra("publish_time"));
        ((c) (obj1)).b(((String) (obj)));
        ((c) (obj1)).c(intent.getStringExtra("type"));
        obj = intent.getStringExtra("description");
        s = URLDecoder.decode(((String) (obj)), "UTF-8");
        obj = s;
_L4:
        ((c) (obj1)).d(((String) (obj)));
        ((c) (obj1)).e(intent.getStringExtra("phenomena"));
        obj = intent.getStringExtra("level");
        UnsupportedEncodingException unsupportedencodingexception;
        try
        {
            ((c) (obj1)).b(Integer.parseInt(((String) (obj))));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            ((c) (obj1)).b(0);
        }
        obj = intent.getStringExtra("message");
        s = URLDecoder.decode(((String) (obj)), "UTF-8");
        obj = s;
_L5:
        ((c) (obj1)).f(((String) (obj)));
        UnsupportedEncodingException unsupportedencodingexception1;
        try
        {
            i = Integer.parseInt(intent.getStringExtra("tz_offset"));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent.printStackTrace();
            i = -10000;
        }
        ((c) (obj1)).a(i);
        f1.a(((c) (obj1)));
_L2:
        return;
        unsupportedencodingexception;
        unsupportedencodingexception.printStackTrace();
          goto _L4
        unsupportedencodingexception1;
        unsupportedencodingexception1.printStackTrace();
          goto _L5
        c c1;
        c1 = ((WeatherBean) (obj1)).d(i);
        c1.a(intent.getStringExtra("publish_time"));
        c1.b(((String) (obj)));
        c1.c(intent.getStringExtra("type"));
        obj = intent.getStringExtra("description");
        unsupportedencodingexception1 = URLDecoder.decode(((String) (obj)), "UTF-8");
        obj = unsupportedencodingexception1;
_L6:
        c1.d(((String) (obj)));
        c1.e(intent.getStringExtra("phenomena"));
        obj = intent.getStringExtra("level");
        String s1;
        UnsupportedEncodingException unsupportedencodingexception2;
        int j;
        try
        {
            c1.b(Integer.parseInt(((String) (obj))));
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            c1.b(0);
        }
        try
        {
            j = Integer.parseInt(intent.getStringExtra("tz_offset"));
        }
        catch (Exception exception1)
        {
            exception1.printStackTrace();
            j = c2;
        }
        c1.a(j);
        obj = intent.getStringExtra("message");
        s1 = URLDecoder.decode(((String) (obj)), "UTF-8");
        obj = s1;
_L7:
        c1.f(((String) (obj)));
        c1.b(intent.getBooleanExtra("isNotify", false));
        f1.a(((WeatherBean) (obj1)).c(), c1);
        return;
        unsupportedencodingexception2;
        unsupportedencodingexception2.printStackTrace();
          goto _L6
        UnsupportedEncodingException unsupportedencodingexception3;
        unsupportedencodingexception3;
        unsupportedencodingexception3.printStackTrace();
          goto _L7
    }

    public final void onHandleIntent(Intent intent)
    {
        String s = intent.getAction();
        if (!s.equals("com.google.android.c2dm.intent.REGISTRATION")) goto _L2; else goto _L1
_L1:
        a(intent);
_L4:
        synchronized (b)
        {
            a.release();
        }
        return;
_L2:
        if (!s.equals("com.google.android.c2dm.intent.RECEIVE")) goto _L4; else goto _L3
_L3:
        b(intent);
          goto _L4
        Exception exception;
        exception;
        synchronized (b)
        {
            a.release();
        }
        throw exception;
        exception1;
        intent;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        intent;
        JVM INSTR monitorexit ;
        throw exception2;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        synchronized (b)
        {
            if (a == null)
            {
                a = ((PowerManager)getApplicationContext().getSystemService("power")).newWakeLock(1, "my_wakelock");
            }
        }
        a.acquire();
        return super.onStartCommand(intent, i, j);
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
    }

}
