// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.gau.go.launcherex.gowidget.messagecenter.view.HtmlMsgDetailActivity;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.a.a.b.c;
import com.jiubang.b.a.a;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.messagecenter:
//            j, a, o

public class i
{

    private static i a;
    private Context b;
    private j c;

    private i(Context context)
    {
        b = context;
        c = new j(context.getContentResolver());
    }

    public static i a(Context context)
    {
        if (a == null)
        {
            a = new i(context.getApplicationContext());
        }
        return a;
    }

    private void a(Intent intent)
    {
        if (!(b instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        b.startActivity(intent);
_L1:
        return;
        intent;
        if (com.gtp.a.a.b.c.a())
        {
            intent.printStackTrace();
            return;
        }
          goto _L1
    }

    private void a(String s)
    {
        if (s != null)
        {
            if ((s = Uri.parse(s)) != null)
            {
                s = new Intent("android.intent.action.VIEW", s);
                s.setFlags(0x10000000);
                try
                {
                    b.startActivity(s);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                }
                return;
            }
        }
    }

    private ContentValues c(com.go.weatherex.messagecenter.a a1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("msg_id", Long.valueOf(a1.d()));
        contentvalues.put("title", a1.f());
        contentvalues.put("desc", a1.g());
        contentvalues.put("msg_action", Integer.valueOf(a1.k()));
        contentvalues.put("msg_type", Integer.valueOf(a1.e()));
        contentvalues.put("msg_param", a1.l());
        contentvalues.put("msg_style", a1.m());
        contentvalues.put("msg_url", a1.n());
        contentvalues.put("published_time", a1.b());
        contentvalues.put("is_read", Integer.valueOf(com.jiubang.b.a.a.a(a1.a())));
        return contentvalues;
    }

    public void a(long l)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("is_read", "1");
        c.a(4, null, WeatherContentProvider.q, contentvalues, (new StringBuilder()).append("msg_id='").append(l).append("'").toString(), null);
    }

    public void a(Context context, com.go.weatherex.messagecenter.a a1)
    {
        Intent intent = new Intent(context, com/gau/go/launcherex/gowidget/messagecenter/view/HtmlMsgDetailActivity);
        Bundle bundle = new Bundle();
        bundle.putString("extras_bundle_msg_id", (new StringBuilder()).append(a1.d()).append("").toString());
        bundle.putString("extras_bundle_msg_url", a1.n());
        bundle.putString("extras_bundle_msg_title", a1.f());
        bundle.putString("extras_bundle_msg_pubished_time", a1.b());
        intent.putExtra("weather_alerts_lists_entrance", "widget&notification");
        intent.putExtras(bundle);
        intent.setFlags(0x34000000);
        context.startActivity(intent);
    }

    public void a(com.go.weatherex.messagecenter.a a1)
    {
        a1 = ContentProviderOperation.newInsert(WeatherContentProvider.q).withValues(c(a1)).build();
        ArrayList arraylist = new ArrayList();
        arraylist.add(a1);
        c.a(3, null, "com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist);
    }

    public void a(o o)
    {
        c.a(1, o, WeatherContentProvider.q, null, null, null, "_id desc");
    }

    public void b(com.go.weatherex.messagecenter.a a1)
    {
        switch (a1.k())
        {
        case 1: // '\001'
        default:
            return;

        case 2: // '\002'
            a((new Intent()).setClassName(b, a1.l()));
            return;

        case 3: // '\003'
            a(a1.l());
            break;
        }
    }

    public void b(o o)
    {
        c.a(1, o, WeatherContentProvider.q, null, "is_read=?", new String[] {
            "0"
        }, null);
    }
}
