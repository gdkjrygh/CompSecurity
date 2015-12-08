// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.service.AppWidgetService;

public class k
{

    public static PendingIntent a(Context context, int i)
    {
        if (context == null)
        {
            return null;
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("extra_action_id", 1);
            intent.putExtra("extra_widget_id", i);
            return PendingIntent.getService(context, 0x80000, a(context, intent), 0x8000000);
        }
    }

    public static PendingIntent a(Context context, int i, int j)
    {
        if (context == null)
        {
            return null;
        }
        int l = 0x50000;
        if (j == 32)
        {
            l = 22;
        }
        Intent intent = new Intent();
        intent.putExtra("extra_action_id", 4);
        intent.putExtra("extra_widget_id", i);
        intent.putExtra("extra_theme_entrance", j);
        return PendingIntent.getService(context, l + i, a(context, intent), 0x8000000);
    }

    public static PendingIntent a(Context context, int i, int j, String s)
    {
        if (context == null)
        {
            return null;
        }
        Intent intent = new Intent();
        intent.putExtra("extra_action_id", 7);
        intent.putExtra("extra_widget_id", i);
        intent.putExtra("extra_widget_type", j);
        if (!TextUtils.isEmpty(s))
        {
            intent.putExtra("extra_city_id", s);
        }
        return PendingIntent.getService(context, i, a(context, intent), 0x8000000);
    }

    private static Intent a(Context context, Intent intent)
    {
        return AppWidgetService.b(context, 28, intent);
    }

    public static PendingIntent b(Context context, int i)
    {
        if (context == null)
        {
            return null;
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("extra_action_id", 2);
            intent.putExtra("extra_widget_id", i);
            return PendingIntent.getService(context, 0x70000, a(context, intent), 0x8000000);
        }
    }

    public static PendingIntent b(Context context, int i, int j)
    {
        if (context == null)
        {
            return null;
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("extra_action_id", 9);
            intent.putExtra("extra_widget_id", i);
            intent.putExtra("extra_clock_id", j);
            return PendingIntent.getService(context, i * j + 0x30000, a(context, intent), 0x8000000);
        }
    }

    public static PendingIntent b(Context context, int i, int j, String s)
    {
        if (context == null)
        {
            return null;
        }
        Intent intent = new Intent();
        intent.putExtra("extra_action_id", 8);
        intent.putExtra("extra_widget_id", i);
        intent.putExtra("extra_widget_type", j);
        if (!TextUtils.isEmpty(s))
        {
            intent.putExtra("extra_city_id", s);
        }
        return PendingIntent.getService(context, i, a(context, intent), 0x8000000);
    }

    public static PendingIntent c(Context context, int i)
    {
        if (context == null)
        {
            return null;
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("extra_action_id", 3);
            intent.putExtra("extra_widget_id", i);
            return PendingIntent.getService(context, 0x40000 + i, a(context, intent), 0x8000000);
        }
    }

    public static PendingIntent c(Context context, int i, int j)
    {
        if (context == null)
        {
            return null;
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("extra_action_id", 10);
            intent.putExtra("extra_widget_id", i);
            intent.putExtra("extra_widget_type", j);
            return PendingIntent.getService(context, 0x100000 + i, a(context, intent), 0x8000000);
        }
    }

    public static PendingIntent d(Context context, int i)
    {
        if (context == null)
        {
            return null;
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("extra_action_id", 5);
            intent.putExtra("extra_widget_id", i);
            return PendingIntent.getService(context, 0x30000 + i, a(context, intent), 0x8000000);
        }
    }

    public static PendingIntent e(Context context, int i)
    {
        if (context == null)
        {
            return null;
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("extra_action_id", 6);
            intent.putExtra("extra_widget_id", i);
            return PendingIntent.getService(context, 0x20000, a(context, intent), 0x8000000);
        }
    }
}
