// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.offline;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.o;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.DeviceClassification;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class m
{

    public static final String a = (new StringBuilder()).append(com/google/android/apps/youtube/datalib/offline/m.getSimpleName()).append(".prefs").toString();
    private final SharedPreferences b;
    private final com.google.android.apps.youtube.datalib.config.c c;
    private final DeviceClassification d;

    public m(SharedPreferences sharedpreferences, com.google.android.apps.youtube.datalib.config.c c1, DeviceClassification deviceclassification)
    {
        b = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        c = (com.google.android.apps.youtube.datalib.config.c)com.google.android.apps.youtube.common.fromguava.c.a(c1);
        d = (DeviceClassification)com.google.android.apps.youtube.common.fromguava.c.a(deviceclassification);
    }

    private void a(String s, android.content.SharedPreferences.Editor editor)
    {
        Set set = g();
        set.add(s);
        editor.putString("request_type_seen_so_far", TextUtils.join(",", set));
    }

    private Set g()
    {
        String s = b.getString("request_type_seen_so_far", "");
        HashSet hashset = new HashSet();
        if (!s.isEmpty())
        {
            String as[] = s.split(",");
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                hashset.add(as[i]);
            }

        }
        return hashset;
    }

    public final void a()
    {
        b.edit().clear().apply();
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (i > b.getInt("peak_queue_size", 0))
        {
            b.edit().putInt("peak_queue_size", i).apply();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        b.edit().putLong("age_of_oldest_request_hours", l).apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s, int i)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        String s1 = String.format(Locale.US, "dropped_requests_%s", new Object[] {
            s
        });
        editor.putInt(s1, b.getInt(s1, 0) + i);
        editor.putInt("total_dropped_requests", b.getInt("total_dropped_requests", 0) + i);
        a(s, editor);
        editor.apply();
    }

    public final void a(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a(s, ((Integer)map.get(s)).intValue()))
        {
            s = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_59;
        map;
        throw map;
        this;
        JVM INSTR monitorexit ;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        int i = b.getInt("total_enqueued_requests", 0);
        b.edit().putInt("total_enqueued_requests", i + 1).apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        b.edit().putInt("current_queue_size", i).apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(String s, int i)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        String s1 = String.format(Locale.US, "sent_requests_%s", new Object[] {
            s
        });
        editor.putInt(s1, b.getInt(s1, 0) + 1);
        editor.putInt("total_sent_requests", b.getInt("total_sent_requests", 0) + 1);
        a(s, editor);
        editor.apply();
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        int i = b.getInt("total_successful_requests", 0);
        b.edit().putInt("total_successful_requests", i + 1).apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        int i = b.getInt("total_server_http_errors", 0);
        b.edit().putInt("total_server_http_errors", i + 1).apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        int i = b.getInt("total_client_http_errors", 0);
        b.edit().putInt("total_client_http_errors", i + 1).apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final Uri f()
    {
        o o1 = o.a(Uri.parse("http://www.youtube.com/gen_204"));
        d.a(o1);
        o1.a("a", "delayed_request");
        o1.a("batch_size", Integer.toString(c.c()));
        o1.a("max_queue_size", Integer.toString(c.a()));
        o1.a("max_age_hours", Long.toString(c.b()));
        o1.a("age_of_oldest_request_hours", Long.toString(b.getLong("age_of_oldest_request_hours", 0L)));
        o1.a("current_queue_size", Integer.toString(b.getInt("current_queue_size", 0)));
        o1.a("peak_queue_size", Integer.toString(b.getInt("peak_queue_size", 0)));
        o1.a("total_enqueued_requests", Integer.toString(b.getInt("total_enqueued_requests", 0)));
        o1.a("total_successful_requests", Integer.toString(b.getInt("total_successful_requests", 0)));
        o1.a("total_server_http_errors", Integer.toString(b.getInt("total_server_http_errors", 0)));
        o1.a("total_client_http_errors", Integer.toString(b.getInt("total_client_http_errors", 0)));
        o1.a("report_cap_hours", String.valueOf(c.d()));
        double d1 = b.getInt("total_sent_requests", 0);
        double d2 = b.getInt("total_dropped_requests", 0);
        if (d1 > 0.0D)
        {
            d1 = d2 / d1;
            o1.a("dropped_vs_sent_ratio", String.format(Locale.US, "%1$,.2f", new Object[] {
                Double.valueOf(d1)
            }));
        }
        Iterator iterator = g().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            String s1 = String.format(Locale.US, "sent_requests_%s", new Object[] {
                s
            });
            int i = b.getInt(s1, 0);
            if (i > 0)
            {
                o1.a(s1, Integer.toString(i));
            }
            s = String.format(Locale.US, "dropped_requests_%s", new Object[] {
                s
            });
            i = b.getInt(s, 0);
            if (i > 0)
            {
                o1.a(s, Integer.toString(i));
            }
        } while (true);
        return o1.a();
    }

}
