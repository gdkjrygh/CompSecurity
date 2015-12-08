// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.frontia;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.text.TextUtils;
import io.wecloud.message.d.a;
import io.wecloud.message.d.k;
import io.wecloud.message.h.d;
import io.wecloud.message.h.g;
import java.io.File;
import java.util.HashMap;

// Referenced classes of package io.wecloud.message.frontia:
//            b, d, e, a

public class c
{

    protected static final String a = (new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()))).append("/.wecloud/").toString();
    private static io.wecloud.message.frontia.a b;
    private static HashMap c = new HashMap();

    public static void a(Context context, b b1, String s)
    {
        Object obj;
        if (context == null || b1 == null)
        {
            return;
        }
        obj = b1.o();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            b(context, b1, s, 0);
            return;
        }
        if (((String) (obj)).contains("http://") || ((String) (obj)).contains("https://"))
        {
            if (d.a() && g.a(context))
            {
                d.a(a);
                obj = new a(((String) (obj)), (new StringBuilder(String.valueOf(a))).append(b1.d()).append(".png").toString(), 1);
                ((a) (obj)).a(new io.wecloud.message.frontia.d(context, b1, s));
                k.a("notification").a(((Runnable) (obj)));
                return;
            } else
            {
                b(context, b1, s, 0);
                return;
            }
        }
        int i = io.wecloud.message.h.a.a(context, context.getPackageName(), (new StringBuilder("raw/")).append(((String) (obj))).toString());
        if (i < 0)
        {
            try
            {
                b(context, b1, s, 0);
                return;
            }
            catch (Throwable throwable)
            {
                b(context, b1, s, 0);
            }
            return;
        }
        b(context, b1, s, i);
        return;
    }

    static void a(Context context, b b1, String s, int i)
    {
        b(context, b1, s, i);
    }

    static void a(Context context, b b1, String s, int i, io.wecloud.message.frontia.a a1)
    {
        b(context, b1, s, i, a1);
    }

    private static void a(Context context, b b1, String s, io.wecloud.message.frontia.a a1)
    {
        Object obj;
        obj = b1.o();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            b(context, b1, s, 0, a1);
            return;
        }
        if (((String) (obj)).contains("http://") || ((String) (obj)).contains("https://"))
        {
            if (d.a() && g.a(context))
            {
                d.a(a);
                obj = new a(((String) (obj)), (new StringBuilder(String.valueOf(a))).append(b1.d()).append(".png").toString(), 1);
                ((a) (obj)).a(new e(context, b1, s, a1));
                k.a("notification").a(((Runnable) (obj)));
                return;
            } else
            {
                b(context, b1, s, 0, a1);
                return;
            }
        }
        int i = io.wecloud.message.h.a.a(context, context.getPackageName(), (new StringBuilder("raw/")).append(((String) (obj))).toString());
        if (i < 0)
        {
            try
            {
                b(context, b1, s, 0, a1);
                return;
            }
            catch (Throwable throwable)
            {
                b(context, b1, s, 0, a1);
            }
            return;
        }
        b(context, b1, s, i, a1);
        return;
    }

    public static void a(Context context, String s, b b1, String s1)
    {
        if (context == null || b1 == null)
        {
            return;
        }
        Object obj = null;
        io.wecloud.message.frontia.a a1 = obj;
        if (!TextUtils.isEmpty(s))
        {
            a1 = obj;
            if (c.get(s) != null)
            {
                a1 = (io.wecloud.message.frontia.a)c.get(s);
            }
        }
        if (a1 == null)
        {
            a(context, b1, s1);
            return;
        } else
        {
            a(context, b1, s1, a1);
            return;
        }
    }

    public static void a(String s, io.wecloud.message.frontia.a a1)
    {
        if (!TextUtils.isEmpty(s) && a1 != null && !c.containsKey(s))
        {
            c.put(s, a1);
        }
    }

    private static void b(Context context, b b1, String s, int i)
    {
        Object obj;
        if (context == null || b1 == null)
        {
            return;
        }
        if (b == null)
        {
            b = new io.wecloud.message.frontia.a(context);
        }
        b.c(b1.f());
        b.a(b1.f());
        b.b(b1.g());
        b.b(b1.h());
        b.c(b1.i());
        b.d(b1.j());
        if (!b.b())
        {
            b.a(io.wecloud.message.h.a.d(context));
        }
        NotificationManager notificationmanager;
        if (i == -101)
        {
            String s1 = (new StringBuilder(String.valueOf(a))).append(b1.d()).append(".png").toString();
            b.a(i, s1);
        } else
        {
            b.a(i, null);
        }
        obj = new Intent(io.wecloud.message.h.a.a(context.getPackageName()));
        ((Intent) (obj)).putExtra("action", "io.wecloud.message.action.METHOD");
        ((Intent) (obj)).setPackage(context.getPackageName());
        ((Intent) (obj)).putExtra("bean", b1.c());
        b1.e();
        JVM INSTR tableswitch 1 3: default 232
    //                   1 413
    //                   2 232
    //                   3 399;
           goto _L1 _L2 _L1 _L3
_L1:
        ((Intent) (obj)).putExtra("method_key", 1019);
_L4:
        s = PendingIntent.getService(context, (int)b1.d(), ((Intent) (obj)), 0);
        b.a(s);
        obj = new Intent("io.wecloud.message.action.METHOD");
        ((Intent) (obj)).putExtra("method_key", 1014);
        ((Intent) (obj)).putExtra("mypkg", context.getPackageName());
        ((Intent) (obj)).putExtra("bean", b1.c());
        obj = PendingIntent.getBroadcast(context, (int)b1.d(), ((Intent) (obj)), 0);
        b.b(((PendingIntent) (obj)));
        obj = b.a();
        notificationmanager = (NotificationManager)context.getSystemService("notification");
        if (((Notification) (obj)).contentView == null)
        {
            ((Notification) (obj)).setLatestEventInfo(context, b1.f(), b1.g(), s);
        }
        notificationmanager.notify((int)b1.d(), ((Notification) (obj)));
        return;
_L3:
        ((Intent) (obj)).putExtra("method_key", 1025);
        if (true) goto _L4; else goto _L2
_L2:
        switch (b1.k())
        {
        default:
            ((Intent) (obj)).putExtra("method_key", 1019);
            break;

        case 1: // '\001'
            ((Intent) (obj)).putExtra("method_key", 1019);
            break;

        case 2: // '\002'
            ((Intent) (obj)).putExtra("method_key", 1020);
            ((Intent) (obj)).putExtra("param", b1.l());
            break;

        case 3: // '\003'
            ((Intent) (obj)).putExtra("method_key", 1021);
            ((Intent) (obj)).putExtra("param", b1.l());
            ((Intent) (obj)).putExtra("msginfo", s);
            break;

        case 4: // '\004'
            ((Intent) (obj)).putExtra("method_key", 1022);
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private static void b(Context context, b b1, String s, int i, io.wecloud.message.frontia.a a1)
    {
        Object obj;
        a1.c(b1.f());
        a1.a(b1.f());
        a1.b(b1.g());
        a1.b(b1.h());
        a1.c(b1.i());
        a1.d(b1.j());
        if (!a1.b())
        {
            a1.a(io.wecloud.message.h.a.d(context));
        }
        if (i == -101)
        {
            a1.a(i, (new StringBuilder(String.valueOf(a))).append(b1.d()).append(".png").toString());
        } else
        {
            a1.a(i, null);
        }
        obj = new Intent(io.wecloud.message.h.a.a(context.getPackageName()));
        ((Intent) (obj)).putExtra("action", "io.wecloud.message.action.METHOD");
        ((Intent) (obj)).setPackage(context.getPackageName());
        ((Intent) (obj)).putExtra("bean", b1.c());
        b1.e();
        JVM INSTR tableswitch 1 3: default 192
    //                   1 365
    //                   2 192
    //                   3 351;
           goto _L1 _L2 _L1 _L3
_L1:
        ((Intent) (obj)).putExtra("method_key", 1019);
_L5:
        s = PendingIntent.getService(context, (int)b1.d(), ((Intent) (obj)), 0);
        a1.a(s);
        obj = new Intent("io.wecloud.message.action.METHOD");
        ((Intent) (obj)).putExtra("method_key", 1014);
        ((Intent) (obj)).putExtra("mypkg", context.getPackageName());
        ((Intent) (obj)).putExtra("bean", b1.c());
        a1.b(PendingIntent.getBroadcast(context, (int)b1.d(), ((Intent) (obj)), 0));
        a1 = a1.a();
        obj = (NotificationManager)context.getSystemService("notification");
        if (((Notification) (a1)).contentView == null)
        {
            a1.setLatestEventInfo(context, b1.f(), b1.g(), s);
        }
        ((NotificationManager) (obj)).notify((int)b1.d(), a1);
        return;
_L3:
        ((Intent) (obj)).putExtra("method_key", 1025);
        continue; /* Loop/switch isn't completed */
_L2:
        if (a1.e() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Intent) (obj)).putExtra("method_key", 1024);
        ((Intent) (obj)).putExtra("intent_uri", a1.e().toUri(1).toString());
        ((Intent) (obj)).putExtra("intent_type", a1.f());
        if (true) goto _L5; else goto _L4
_L4:
        switch (b1.k())
        {
        default:
            ((Intent) (obj)).putExtra("method_key", 1019);
            break;

        case 1: // '\001'
            ((Intent) (obj)).putExtra("method_key", 1019);
            break;

        case 2: // '\002'
            ((Intent) (obj)).putExtra("method_key", 1020);
            ((Intent) (obj)).putExtra("param", b1.l());
            break;

        case 3: // '\003'
            ((Intent) (obj)).putExtra("method_key", 1021);
            ((Intent) (obj)).putExtra("param", b1.l());
            ((Intent) (obj)).putExtra("msginfo", s);
            break;

        case 4: // '\004'
            ((Intent) (obj)).putExtra("method_key", 1022);
            break;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

}
