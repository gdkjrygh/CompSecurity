// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.a;
import com.gau.go.launcherex.gowidget.weather.util.d;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gau.go.launcherex.gowidget.weather.view.AppListActivity;
import java.util.ArrayList;
import java.util.Iterator;

public class m extends Handler
{

    private Context a;
    private a b;

    public m(Context context)
    {
        b = null;
        a = context;
    }

    public void a()
    {
        Cursor cursor;
        cursor = a.getContentResolver().query(WeatherContentProvider.g, new String[] {
            "setting_key", "setting_value"
        }, "setting_key=?", new String[] {
            "widgt_calendar"
        }, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        int i;
        cursor.moveToFirst();
        i = cursor.getColumnIndex("setting_value");
        if (i == -1) goto _L2; else goto _L3
_L3:
        String s = cursor.getString(i);
_L4:
        try
        {
            cursor.close();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
_L5:
        a(s);
        return;
_L2:
        s = "";
          goto _L4
        s = "";
          goto _L5
    }

    public void a(String s)
    {
        removeMessages(1);
        Message message = obtainMessage();
        message.what = 1;
        message.obj = s;
        sendMessage(message);
    }

    public void b()
    {
        Cursor cursor;
        cursor = a.getContentResolver().query(WeatherContentProvider.g, new String[] {
            "setting_key", "setting_value"
        }, "setting_key=?", new String[] {
            "widgt_clock"
        }, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        int i;
        cursor.moveToFirst();
        i = cursor.getColumnIndex("setting_value");
        if (i == -1) goto _L2; else goto _L3
_L3:
        String s = cursor.getString(i);
_L4:
        try
        {
            cursor.close();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
_L5:
        b(s);
        return;
_L2:
        s = "";
          goto _L4
        s = "";
          goto _L5
    }

    public void b(String s)
    {
        removeMessages(2);
        Message message = obtainMessage();
        message.what = 2;
        message.obj = s;
        sendMessage(message);
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 29
    //                   2 180;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        message = (String)message.obj;
        if (!TextUtils.isEmpty(message))
        {
            message = message.split("#");
            message = r.a(a, message[0], message[1]);
            Intent intent;
            ActivityNotFoundException activitynotfoundexception;
            if (message != null)
            {
                try
                {
                    a.startActivity(message);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    message.printStackTrace();
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    message.printStackTrace();
                }
            }
        }
        for (message = d.a.iterator(); message.hasNext();)
        {
            intent = (Intent)message.next();
            try
            {
                a.startActivity(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                activitynotfoundexception.printStackTrace();
            }
            catch (SecurityException securityexception)
            {
                securityexception.printStackTrace();
            }
        }

        message = new Intent(a, com/gau/go/launcherex/gowidget/weather/view/AppListActivity);
        message.putExtra("calendar_clock_binding_app", 1);
        message.addFlags(0x10000000);
        a.startActivity(message);
        return;
_L3:
        boolean flag;
        message = (String)message.obj;
        if (!TextUtils.isEmpty(message))
        {
            message = message.split("#");
            message = r.a(a, message[0], message[1]);
            a a1;
            Intent intent1;
            if (message != null)
            {
                try
                {
                    a.startActivity(message);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    message.printStackTrace();
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    message.printStackTrace();
                }
            }
        }
        if (b == null)
        {
            b = new a();
        }
        message = b.a.iterator();
_L6:
        if (!message.hasNext()) goto _L5; else goto _L4
_L4:
        a1 = (a)message.next();
        intent1 = new Intent("android.intent.action.MAIN");
        intent1.setClassName(a1.a(), a1.c());
        if (a1.b())
        {
            intent1.addCategory("android.intent.category.LAUNCHER");
        }
        intent1.setFlags(0x10000000);
        a.startActivity(intent1);
        flag = true;
_L7:
        if (!flag)
        {
            message = new Intent(a, com/gau/go/launcherex/gowidget/weather/view/AppListActivity);
            message.putExtra("calendar_clock_binding_app", 2);
            message.addFlags(0x10000000);
            a.startActivity(message);
            return;
        }
          goto _L1
        Object obj;
        obj;
        ((ActivityNotFoundException) (obj)).printStackTrace();
          goto _L6
        obj;
        ((SecurityException) (obj)).printStackTrace();
          goto _L6
_L5:
        flag = false;
          goto _L7
    }
}
