// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.theme;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c.c;
import com.gau.go.launcherex.gowidget.weather.globaltheme.d;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import java.util.ArrayList;
import java.util.List;

public class MyThemeReceiver extends BroadcastReceiver
{

    public MyThemeReceiver()
    {
    }

    private int a(int i)
    {
        switch (i)
        {
        case 2: // '\002'
        case 5: // '\005'
        default:
            return i;

        case 0: // '\0'
            return 1;

        case 1: // '\001'
            return 2;

        case 3: // '\003'
            return 3;

        case 4: // '\004'
            return 5;

        case 6: // '\006'
            return 4;
        }
    }

    private b a(Context context, String s)
    {
        s = com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(s, context, context.getResources());
        if (s != null)
        {
            s.t(true);
            s.q(true);
            if (s.p() == -1)
            {
                if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(s.x(), context))
                {
                    s.b(1);
                } else
                {
                    s.b(2);
                }
            }
            com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(context, s);
            s.a(1);
        }
        return s;
    }

    private void a(Context context, b b1)
    {
        Cursor cursor = context.getContentResolver().query(WeatherContentProvider.l, null, null, null, null);
        ArrayList arraylist = new ArrayList();
        if (cursor != null)
        {
            do
            {
                if (!cursor.moveToNext())
                {
                    break;
                }
                if (a(a(cursor.getInt(cursor.getColumnIndex("go_widget_type"))), b1))
                {
                    arraylist.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("go_widget_id"))));
                }
            } while (true);
            cursor.close();
        }
        for (int i = 0; i < arraylist.size(); i++)
        {
            (new d(context)).c(((Integer)arraylist.get(i)).intValue(), b1);
        }

    }

    private boolean a(int i, b b1)
    {
        switch (i)
        {
        default:
            return false;

        case 1: // '\001'
            return b1.k();

        case 2: // '\002'
            return b1.l();

        case 3: // '\003'
            return b1.m();

        case 4: // '\004'
            return b1.o();

        case 5: // '\005'
            return b1.n();

        case 6: // '\006'
            return b1.s();
        }
    }

    private void b(Context context, b b1)
    {
        Cursor cursor = context.getContentResolver().query(WeatherContentProvider.u, null, null, null, null);
        ArrayList arraylist = new ArrayList();
        if (cursor != null)
        {
            do
            {
                if (!cursor.moveToNext())
                {
                    break;
                }
                if (a(cursor.getInt(cursor.getColumnIndex("widget_type")), b1))
                {
                    arraylist.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("widget_id"))));
                }
            } while (true);
            cursor.close();
        }
        for (int i = 0; i < arraylist.size(); i++)
        {
            (new d(context)).b(((Integer)arraylist.get(i)).intValue(), b1);
        }

    }

    private boolean c(Context context, b b1)
    {
_L2:
        return false;
        if (b1 == null || !b1.B() && !com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.b(context, b1.x())) goto _L2; else goto _L1
_L1:
        f f1;
        f1 = com.gau.go.launcherex.gowidget.weather.c.c.a(context.getApplicationContext()).e();
        if (f1.c())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b1.p() == 2 && !f1.b()) goto _L2; else goto _L3
_L3:
        if (b1.p() != 3 || b1.h())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!g.a(context) || b1.b()) goto _L2; else goto _L4
_L4:
        context = com.gau.go.launcherex.gowidget.weather.globaltheme.a.c(context, b1.x(), "theme_pay_type");
        com.gtp.a.a.b.c.a("theme_pay", (new StringBuilder()).append("themePayType = ").append(context).toString());
        if (context.equals("0") || context.equals("2") || !context.equals("1")) goto _L2; else goto _L5
_L5:
        return false;
        if (!com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(context, b1)) goto _L2; else goto _L6
_L6:
        b1.m(true);
        return true;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            String s = intent.getAction();
            Log.i("lky", (new StringBuilder()).append("action-->").append(s).toString());
            intent = intent.getStringExtra("theme_pkgname");
            if (s.equals("com.gau.go.launcherex.gowidget.weather.mythemeaction") && !TextUtils.isEmpty(intent))
            {
                intent = a(context, intent);
                if (c(context, intent))
                {
                    b(context, intent);
                    a(context, intent);
                    return;
                }
            }
        }
    }
}
