// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.i;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.Time;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;

// Referenced classes of package com.go.weatherex.i:
//            b

public class d
{

    private static String a(Resources resources, int i, float f)
    {
        if (i == 1)
        {
            return String.format(resources.getString(0x7f080211), new Object[] {
                Float.valueOf(q.c(f, 1))
            });
        }
        if (i == 4)
        {
            return String.format(resources.getString(0x7f080214), new Object[] {
                Float.valueOf(q.e(f, 1))
            });
        }
        if (i == 3)
        {
            return String.format(resources.getString(0x7f080213), new Object[] {
                Float.valueOf(q.d(f, 1))
            });
        }
        if (i == 5)
        {
            return String.format(resources.getString(0x7f080215), new Object[] {
                Integer.valueOf(q.a(f))
            });
        }
        if (i == 6)
        {
            return String.format(resources.getString(0x7f080216), new Object[] {
                Float.valueOf(q.f(f, 1))
            });
        } else
        {
            return String.format(resources.getString(0x7f080212), new Object[] {
                Float.valueOf(f)
            });
        }
    }

    public static void a(RemoteViews remoteviews, int i)
    {
        if (remoteviews == null || i < 1)
        {
            return;
        } else
        {
            remoteviews.setTextViewText(i, " \u3009");
            return;
        }
    }

    public static void a(RemoteViews remoteviews, int i, int j)
    {
        if (j != 8 && j != 0 && j != 4)
        {
            throw new IllegalArgumentException("invalid visibility");
        }
        if (remoteviews == null || i < 1)
        {
            return;
        } else
        {
            remoteviews.setViewVisibility(i, j);
            return;
        }
    }

    public static void a(RemoteViews remoteviews, int i, int j, int k, boolean flag)
    {
        if (remoteviews == null || i < 1 || j < 0 || k < 0)
        {
            return;
        }
        if (k == j)
        {
            remoteviews.setImageViewResource(i, j);
            return;
        }
        if (flag)
        {
            remoteviews.setImageViewResource(i, j);
            return;
        } else
        {
            remoteviews.setImageViewResource(i, k);
            return;
        }
    }

    public static void a(RemoteViews remoteviews, int i, int j, boolean flag)
    {
        if (remoteviews != null)
        {
            if (i > 0)
            {
                if (flag)
                {
                    remoteviews.setViewVisibility(i, 4);
                } else
                {
                    remoteviews.setViewVisibility(i, 0);
                }
            }
            if (j > 0)
            {
                if (flag)
                {
                    remoteviews.setViewVisibility(j, 0);
                    return;
                } else
                {
                    remoteviews.setViewVisibility(j, 4);
                    return;
                }
            }
        }
    }

    public static void a(RemoteViews remoteviews, int i, PendingIntent pendingintent)
    {
        if (remoteviews == null || i < 1 || pendingintent == null)
        {
            return;
        } else
        {
            remoteviews.setOnClickPendingIntent(i, pendingintent);
            return;
        }
    }

    public static void a(RemoteViews remoteviews, int i, Drawable drawable)
    {
        if (remoteviews == null || i < 1 || drawable == null)
        {
            return;
        }
        try
        {
            remoteviews.setImageViewBitmap(i, ((BitmapDrawable)drawable).getBitmap());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RemoteViews remoteviews)
        {
            return;
        }
    }

    public static void a(RemoteViews remoteviews, int i, boolean flag)
    {
        if (remoteviews == null || i < 1)
        {
            return;
        }
        if (flag)
        {
            remoteviews.setViewVisibility(i, 0);
            return;
        } else
        {
            remoteviews.setViewVisibility(i, 8);
            return;
        }
    }

    public static void a(RemoteViews remoteviews, Context context, Resources resources, WeatherBean weatherbean, int i)
    {
        if (remoteviews == null || i < 1)
        {
            return;
        }
        String s1 = "-10000";
        String s = s1;
        if (weatherbean != null)
        {
            s = s1;
            if (weatherbean.l != null)
            {
                s = r.a(context, weatherbean.l.f());
            }
        }
        context = s;
        if (s.equals("-10000"))
        {
            context = (new StringBuilder()).append(resources.getString(0x7f08029a)).append(" : ").append("--").toString();
        }
        remoteviews.setTextViewText(i, context);
    }

    public static void a(RemoteViews remoteviews, Resources resources, ForecastBean forecastbean, u u1, int i, int ai[])
    {
        int j = 1;
        if (remoteviews == null || i < 1)
        {
            return;
        }
        if (u1 != null)
        {
            j = u1.g;
        }
        int k;
        if (forecastbean != null)
        {
            int l = q.a(forecastbean.a(j));
            k = q.a(forecastbean.b(j));
            resources = resources.getString(ai[r.b(forecastbean.e(), forecastbean.f(), forecastbean.g())]);
            j = l;
        } else
        {
            resources = "--";
            k = -10000;
            j = -10000;
        }
        if (k != -10000 && j != -10000)
        {
            resources = (new StringBuilder()).append(resources).append(" ").append(k).append("\260/").append(j).append("\260").toString();
        } else
        {
            resources = (new StringBuilder()).append(resources).append(" ").append("-").append("\260/").append("-").append("\260").toString();
        }
        remoteviews.setTextViewText(i, resources);
    }

    public static void a(RemoteViews remoteviews, Resources resources, WeatherBean weatherbean, int i)
    {
label0:
        {
            if (remoteviews == null || i < 1)
            {
                return;
            }
            String s1 = "--";
            String s = s1;
            if (weatherbean != null)
            {
                s = s1;
                if (weatherbean.l != null)
                {
                    s = weatherbean.l.e();
                }
            }
            if (!TextUtils.isEmpty(s))
            {
                weatherbean = s;
                if (!"--".equals(s))
                {
                    break label0;
                }
            }
            weatherbean = resources.getString(0x7f0801e2);
        }
        remoteviews.setTextViewText(i, weatherbean);
    }

    public static void a(RemoteViews remoteviews, Resources resources, WeatherBean weatherbean, int i, boolean flag, boolean flag1)
    {
        if (remoteviews == null || i < 1)
        {
            return;
        }
        if (weatherbean != null)
        {
            remoteviews.setTextViewText(i, weatherbean.d());
            return;
        }
        if (!flag)
        {
            remoteviews.setTextViewText(i, resources.getString(0x7f080516));
            return;
        }
        if (flag1)
        {
            remoteviews.setTextViewText(i, resources.getString(0x7f080517));
            return;
        } else
        {
            remoteviews.setTextViewText(i, resources.getString(0x7f080514));
            return;
        }
    }

    public static void a(RemoteViews remoteviews, Resources resources, WeatherBean weatherbean, u u1, int i)
    {
        int j = 1;
        if (remoteviews == null || i < 1)
        {
            return;
        }
        if (weatherbean == null && u1 == null)
        {
            remoteviews.setTextViewText(i, "--");
            return;
        }
        if (u1 != null)
        {
            j = u1.g;
        }
        int k;
        if (weatherbean != null && weatherbean.l != null)
        {
            weatherbean = weatherbean.l;
            k = q.a(weatherbean.b(j));
            j = q.a(weatherbean.c(j));
            u1 = weatherbean.e();
            weatherbean = weatherbean.b();
        } else
        {
            weatherbean = "--";
            k = -10000;
            u1 = "--";
            j = -10000;
        }
        if (k != -10000 && j != -10000)
        {
            if (!TextUtils.isEmpty(u1) && !"--".equals(u1))
            {
                resources = (new StringBuilder()).append(u1).append(",").append(k).append("\260/").append(j).append("\260 ,").append(weatherbean).toString();
            } else
            {
                resources = (new StringBuilder()).append(k).append("\260/").append(j).append("\260 ,").append(weatherbean).toString();
            }
        } else
        if (!TextUtils.isEmpty(weatherbean) && !"--".equals(weatherbean) && !TextUtils.isEmpty(u1) && !"--".equals(u1))
        {
            resources = (new StringBuilder()).append(u1).append(",").append("--").append("\260/").append("--").append("\260 ,").append(weatherbean).toString();
        } else
        {
            resources = resources.getString(0x7f0801e2);
        }
        remoteviews.setTextViewText(i, resources);
    }

    public static void a(RemoteViews remoteviews, Time time, Resources resources, int i, int ai[])
    {
        while (remoteviews == null || time == null || resources == null || ai == null || i < 1 || ai.length < 7) 
        {
            return;
        }
        remoteviews.setTextViewText(i, resources.getString(ai[time.weekDay]));
    }

    public static void a(RemoteViews remoteviews, Time time, g g1, int i)
    {
        if (remoteviews == null || time == null || g1 == null || i < 1)
        {
            return;
        }
        time = g1.c(time);
        if (TextUtils.isEmpty(time))
        {
            remoteviews.setViewVisibility(i, 8);
            return;
        } else
        {
            remoteviews.setTextViewText(i, time);
            remoteviews.setViewVisibility(i, 0);
            return;
        }
    }

    public static void a(RemoteViews remoteviews, Time time, g g1, u u1, int i, boolean flag)
    {
        if (remoteviews == null || time == null || i < 1)
        {
            return;
        } else
        {
            remoteviews.setTextViewText(i, com.go.weatherex.i.b.a(time, g1, u1, flag));
            return;
        }
    }

    public static void a(RemoteViews remoteviews, Time time, g g1, u u1, Resources resources, int i, int ai[], String s, 
            boolean flag)
    {
        int j;
        if (remoteviews == null || time == null || i < 1)
        {
            return;
        }
        j = 1;
        if (u1 != null)
        {
            j = u1.k;
        }
        g1 = resources.getString(ai[time.month]);
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        j;
        JVM INSTR tableswitch 3 3: default 76
    //                   3 121;
           goto _L5 _L6
_L5:
        time = String.format(resources.getString(0x7f080589), new Object[] {
            s, g1, Integer.valueOf(time.monthDay)
        });
_L7:
        remoteviews.setTextViewText(i, Html.fromHtml(time));
        return;
_L6:
        time = String.format(resources.getString(0x7f08058a), new Object[] {
            s, g1, Integer.valueOf(time.monthDay)
        });
        if (true) goto _L7; else goto _L4
_L4:
        switch (j)
        {
        default:
            time = String.format(resources.getString(0x7f080586), new Object[] {
                s, Integer.valueOf(time.year), g1, Integer.valueOf(time.monthDay)
            });
            break;

        case 2: // '\002'
            time = String.format(resources.getString(0x7f080587), new Object[] {
                s, Integer.valueOf(time.year), g1, Integer.valueOf(time.monthDay)
            });
            break;

        case 3: // '\003'
            time = String.format(resources.getString(0x7f080588), new Object[] {
                s, Integer.valueOf(time.year), g1, Integer.valueOf(time.monthDay)
            });
            break;
        }
          goto _L8
_L2:
        if (!flag) goto _L10; else goto _L9
_L9:
        j;
        JVM INSTR tableswitch 3 3: default 352
    //                   3 387;
           goto _L11 _L12
_L11:
        time = (new StringBuilder()).append(g1).append(" ").append(time.monthDay).toString();
_L13:
        remoteviews.setTextViewText(i, time);
        return;
_L12:
        time = (new StringBuilder()).append(time.monthDay).append(" ").append(g1).toString();
        if (true) goto _L13; else goto _L10
_L10:
        switch (j)
        {
        default:
            time = (new StringBuilder()).append(time.year).append(" ").append(g1).append(" ").append(time.monthDay).toString();
            break;

        case 2: // '\002'
            time = (new StringBuilder()).append(g1).append(" ").append(time.monthDay).append(" ").append(time.year).toString();
            break;

        case 3: // '\003'
            time = (new StringBuilder()).append(time.monthDay).append(" ").append(g1).append(" ").append(time.year).toString();
            break;
        }
        if (true) goto _L13; else goto _L14
_L14:
_L8:
        if (true) goto _L7; else goto _L15
_L15:
    }

    public static void a(RemoteViews remoteviews, Time time, g g1, u u1, Resources resources, int i, int ai[], boolean flag)
    {
        while (remoteviews == null || time == null || resources == null || ai == null || i < 1 || ai.length < 7) 
        {
            return;
        }
        int j = ai[time.weekDay];
        time = com.go.weatherex.i.b.a(time, g1, u1, flag);
        remoteviews.setTextViewText(i, (new StringBuilder()).append(time).append(" ").append(resources.getString(j)).toString());
    }

    public static void a(RemoteViews remoteviews, Time time, boolean flag, int i)
    {
        if (remoteviews == null || time == null || i < 1)
        {
            return;
        }
        int k = time.hour;
        int j = k;
        if (!flag)
        {
            k %= 12;
            j = k;
            if (k == 0)
            {
                j = 12;
            }
        }
        k = time.minute;
        remoteviews.setTextViewText(i, (new StringBuilder()).append(r.e(j)).append(":").append(r.e(k)).toString());
    }

    public static void a(RemoteViews remoteviews, Time time, boolean flag, int i, int j)
    {
        if (remoteviews != null && time != null)
        {
            int l = time.hour;
            int k = l;
            if (!flag)
            {
                l %= 12;
                k = l;
                if (l == 0)
                {
                    k = 12;
                }
            }
            l = time.minute;
            if (i > 0)
            {
                remoteviews.setTextViewText(i, r.e(k));
            }
            if (j > 0)
            {
                remoteviews.setTextViewText(j, r.e(l));
                return;
            }
        }
    }

    public static void a(RemoteViews remoteviews, Time time, boolean flag, int i, int j, int k, int l)
    {
        if (remoteviews != null && time != null && i >= 1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (flag)
        {
            if (l > 0)
            {
                remoteviews.setViewVisibility(i, 0);
                remoteviews.setImageViewResource(i, l);
                return;
            } else
            {
                remoteviews.setViewVisibility(i, 8);
                return;
            }
        }
        if (!com.go.weatherex.i.b.a(time))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j <= 0) goto _L1; else goto _L3
_L3:
        remoteviews.setViewVisibility(i, 0);
        remoteviews.setImageViewResource(i, j);
        return;
        if (k <= 0) goto _L1; else goto _L4
_L4:
        remoteviews.setViewVisibility(i, 0);
        remoteviews.setImageViewResource(i, k);
        return;
    }

    public static void a(RemoteViews remoteviews, Time time, boolean flag, int i, int j, int k, int l, int ai[], 
            int ai1[])
    {
        if (remoteviews != null && time != null && (ai != null || ai1 != null))
        {
            int i1;
            int j1;
            if (ai == null)
            {
                ai = ai1;
            } else
            {
                ai1 = ai;
            }
            j1 = time.hour;
            i1 = j1;
            if (!flag)
            {
                j1 %= 12;
                i1 = j1;
                if (j1 == 0)
                {
                    i1 = 12;
                }
            }
            j1 = time.minute;
            if (i > 0 && ai.length >= 10)
            {
                remoteviews.setImageViewResource(i, r.a(i1 / 10, ai));
            }
            if (j > 0 && ai.length >= 10)
            {
                remoteviews.setImageViewResource(j, r.a(i1 % 10, ai));
            }
            if (k > 0 && ai1.length >= 10)
            {
                remoteviews.setImageViewResource(k, r.a(j1 / 10, ai1));
            }
            if (l > 0 && ai1.length >= 10)
            {
                remoteviews.setImageViewResource(l, r.a(j1 % 10, ai1));
                return;
            }
        }
    }

    public static void a(RemoteViews remoteviews, ForecastBean forecastbean, int i, int ai[])
    {
        int j = 0;
        if (remoteviews == null || i < 0 || ai == null || ai[0] == 0)
        {
            return;
        }
        if (forecastbean != null)
        {
            j = forecastbean.i();
        }
        remoteviews.setImageViewResource(i, r.a(ai, j, true));
    }

    public static void a(RemoteViews remoteviews, ForecastBean forecastbean, Resources resources, int i, int ai[])
    {
        while (remoteviews == null || resources == null || ai == null || i < 1 || ai.length < 7) 
        {
            return;
        }
        String s = "--";
        if (forecastbean != null)
        {
            s = resources.getString(ai[r.b(forecastbean.e(), forecastbean.f(), forecastbean.g())]);
        }
        remoteviews.setTextViewText(i, s);
    }

    public static void a(RemoteViews remoteviews, ForecastBean forecastbean, u u1, int i)
    {
        if (remoteviews == null || i < 1)
        {
            return;
        }
        int j;
        int k;
        if (u1 != null)
        {
            j = u1.g;
        } else
        {
            j = 1;
        }
        if (forecastbean != null)
        {
            int l = q.a(forecastbean.a(j));
            k = q.a(forecastbean.b(j));
            j = l;
        } else
        {
            j = -10000;
            k = -10000;
        }
        if (k != -10000 && j != -10000)
        {
            forecastbean = (new StringBuilder()).append(k).append("\260/").append(j).append("\260").toString();
        } else
        {
            forecastbean = "-\260/-\260";
        }
        remoteviews.setTextViewText(i, forecastbean);
    }

    public static void a(RemoteViews remoteviews, WeatherBean weatherbean, int i, int j)
    {
        if (remoteviews == null || i < 1)
        {
            return;
        }
        if (weatherbean == null || j < 1)
        {
            a(remoteviews, i, false);
            return;
        }
        if (weatherbean.e() != 1)
        {
            a(remoteviews, i, true);
            b(remoteviews, i, j);
            return;
        } else
        {
            a(remoteviews, i, false);
            return;
        }
    }

    public static void a(RemoteViews remoteviews, WeatherBean weatherbean, u u1, int i)
    {
        int j = 1;
        if (remoteviews == null || i < 1)
        {
            return;
        }
        if (weatherbean == null && u1 == null)
        {
            remoteviews.setTextViewText(i, "--\260/--\260 ");
            return;
        }
        if (u1 != null)
        {
            j = u1.g;
        }
        int k;
        if (weatherbean != null && weatherbean.l != null)
        {
            weatherbean = weatherbean.l;
            k = q.a(weatherbean.b(j));
            j = q.a(weatherbean.c(j));
        } else
        {
            j = -10000;
            k = -10000;
        }
        if (k != -10000 && j != -10000)
        {
            remoteviews.setTextViewText(i, (new StringBuilder()).append(k).append("\260/").append(j).append("\260 ").toString());
            return;
        } else
        {
            remoteviews.setTextViewText(i, "--\260/--\260 ");
            return;
        }
    }

    public static void a(RemoteViews remoteviews, WeatherBean weatherbean, u u1, int i, int j)
    {
        if (remoteviews == null || i < 1 || j < 1)
        {
            return;
        } else
        {
            remoteviews.setImageViewResource(i, j);
            return;
        }
    }

    public static void a(RemoteViews remoteviews, WeatherBean weatherbean, u u1, int i, int j, int k, int l, int i1, 
            int ai[], int j1, int k1, int l1, int i2)
    {
        if (remoteviews != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j2;
        j2 = 1;
        char c1 = '\uD8F0';
        if (u1 != null)
        {
            j2 = u1.g;
        }
        int k2 = c1;
        if (weatherbean != null)
        {
            k2 = c1;
            if (weatherbean.l != null)
            {
                k2 = q.a(weatherbean.l.a(j2));
            }
        }
        if (k2 == -10000)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 != 0)
        {
            if (k2 < 0)
            {
                remoteviews.setViewVisibility(i1, 0);
                if (j1 != 0)
                {
                    remoteviews.setImageViewResource(i1, j1);
                }
            } else
            {
                remoteviews.setViewVisibility(i1, 8);
            }
        }
        i1 = Math.abs(k2);
        j1 = i1 / 100;
        if (i != 0 && ai != null && ai[0] != 0)
        {
            if (j1 == 0)
            {
                remoteviews.setViewVisibility(i, 8);
            } else
            {
                remoteviews.setImageViewResource(i, r.a(j1, ai));
                remoteviews.setViewVisibility(i, 0);
            }
        }
        i = (i1 - j1 * 100) / 10;
        if (j != 0 && ai != null && ai[0] != 0)
        {
            if (i == 0 && j1 == 0)
            {
                remoteviews.setViewVisibility(j, 8);
            } else
            {
                remoteviews.setImageViewResource(j, r.a(i, ai));
                remoteviews.setViewVisibility(j, 0);
            }
        }
        if (k != 0 && ai != null && ai[0] != 0)
        {
            remoteviews.setImageViewResource(k, r.a(i1 % 10, ai));
            remoteviews.setViewVisibility(k, 0);
        }
        if (l != 0)
        {
            if (k1 != 0 && l1 != 0)
            {
                if (j2 == 1)
                {
                    remoteviews.setImageViewResource(l, k1);
                    return;
                } else
                {
                    remoteviews.setImageViewResource(l, l1);
                    return;
                }
            }
            if (i2 != 0)
            {
                remoteviews.setImageViewResource(l, i2);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (i1 == 0 || i == 0 || j == 0 || k == 0 || j1 == 0) goto _L1; else goto _L3
_L3:
        remoteviews.setViewVisibility(i1, 8);
        remoteviews.setViewVisibility(i, 8);
        remoteviews.setImageViewResource(j, j1);
        remoteviews.setViewVisibility(j, 0);
        remoteviews.setImageViewResource(k, j1);
        remoteviews.setViewVisibility(k, 0);
        if (l != 0)
        {
            if (k1 != 0 && l1 != 0)
            {
                if (j2 == 1)
                {
                    remoteviews.setImageViewResource(l, k1);
                    return;
                } else
                {
                    remoteviews.setImageViewResource(l, l1);
                    return;
                }
            }
            if (i2 != 0)
            {
                remoteviews.setImageViewResource(l, i2);
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static void a(RemoteViews remoteviews, WeatherBean weatherbean, boolean flag, int i, int ai[])
    {
        boolean flag1 = false;
        if (remoteviews == null || i < 0 || ai == null || ai[0] == 0)
        {
            return;
        }
        int j = ((flag1) ? 1 : 0);
        if (weatherbean != null)
        {
            if (weatherbean.l == null)
            {
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = weatherbean.l.d();
            }
        }
        remoteviews.setImageViewResource(i, r.a(ai, j, flag));
    }

    public static void b(RemoteViews remoteviews, int i)
    {
        if (remoteviews == null || i < 1)
        {
            return;
        } else
        {
            remoteviews.setViewVisibility(i, 0);
            return;
        }
    }

    public static void b(RemoteViews remoteviews, int i, int j)
    {
        if (remoteviews == null || i < 1 || j < 1)
        {
            return;
        } else
        {
            remoteviews.setImageViewResource(i, j);
            return;
        }
    }

    public static void b(RemoteViews remoteviews, Resources resources, WeatherBean weatherbean, int i)
    {
        if (remoteviews == null || i < 1)
        {
            return;
        }
        String s1 = "--";
        String s = s1;
        if (weatherbean != null)
        {
            s = s1;
            if (weatherbean.l != null)
            {
                s = weatherbean.l.b();
            }
        }
        remoteviews.setTextViewText(i, (new StringBuilder()).append(resources.getString(0x7f080515)).append(s).toString());
    }

    public static void b(RemoteViews remoteviews, Resources resources, WeatherBean weatherbean, u u1, int i)
    {
        int j = 1;
        if (remoteviews == null || i < 1)
        {
            return;
        }
        if (weatherbean == null && u1 == null)
        {
            remoteviews.setTextViewText(i, "--");
            return;
        }
        if (u1 != null)
        {
            j = u1.g;
        }
        int k;
        if (weatherbean != null && weatherbean.l != null)
        {
            weatherbean = weatherbean.l;
            k = q.a(weatherbean.b(j));
            j = q.a(weatherbean.c(j));
            weatherbean = weatherbean.e();
        } else
        {
            weatherbean = "--";
            k = -10000;
            j = -10000;
        }
        u1 = new StringBuffer();
        if (k != -10000 && j != -10000)
        {
            u1.append((new StringBuilder()).append(k).append("\260/").append(j).append("\260").toString());
        } else
        {
            u1.append("--\260/--\260");
        }
        u1.append(", ");
        if (!TextUtils.isEmpty(weatherbean) && !"--".equals(weatherbean))
        {
            u1.append(weatherbean);
        } else
        {
            u1.append(resources.getString(0x7f0801e2));
        }
        remoteviews.setTextViewText(i, u1.toString());
    }

    public static void b(RemoteViews remoteviews, Time time, g g1, int i)
    {
        if (remoteviews == null || time == null || g1 == null || i < 1)
        {
            return;
        }
        time = g1.b(time);
        if (TextUtils.isEmpty(time))
        {
            remoteviews.setViewVisibility(i, 8);
            return;
        } else
        {
            remoteviews.setTextViewText(i, time);
            remoteviews.setViewVisibility(i, 0);
            return;
        }
    }

    public static void b(RemoteViews remoteviews, Time time, boolean flag, int i)
    {
        if (remoteviews == null || time == null || i < 1)
        {
            return;
        }
        if (flag)
        {
            remoteviews.setViewVisibility(i, 8);
            return;
        }
        if (com.go.weatherex.i.b.a(time))
        {
            remoteviews.setViewVisibility(i, 0);
            remoteviews.setTextViewText(i, "AM");
            return;
        } else
        {
            remoteviews.setViewVisibility(i, 0);
            remoteviews.setTextViewText(i, "PM");
            return;
        }
    }

    public static void b(RemoteViews remoteviews, ForecastBean forecastbean, u u1, int i)
    {
        int j = 1;
        if (remoteviews == null || i < 1)
        {
            return;
        }
        if (u1 != null)
        {
            j = u1.g;
        }
        if (forecastbean != null)
        {
            j = q.a(forecastbean.a(j));
        } else
        {
            j = -10000;
        }
        if (j != -10000)
        {
            forecastbean = (new StringBuilder()).append(j).append("\260").toString();
        } else
        {
            forecastbean = "-\260";
        }
        remoteviews.setTextViewText(i, forecastbean);
    }

    public static void b(RemoteViews remoteviews, WeatherBean weatherbean, u u1, int i)
    {
        int j = 1;
        if (remoteviews == null || i < 1)
        {
            return;
        }
        if (weatherbean == null && u1 == null)
        {
            remoteviews.setTextViewText(i, "--\260 ");
            return;
        }
        if (u1 != null)
        {
            j = u1.g;
        }
        if (weatherbean != null && weatherbean.l != null)
        {
            j = q.a(weatherbean.l.b(j));
        } else
        {
            j = -10000;
        }
        if (j != -10000)
        {
            remoteviews.setTextViewText(i, (new StringBuilder()).append(j).append("\260 ").toString());
            return;
        } else
        {
            remoteviews.setTextViewText(i, "--\260 ");
            return;
        }
    }

    public static void c(RemoteViews remoteviews, int i, int j)
    {
        if (remoteviews == null || i < 1 || j < 1)
        {
            return;
        } else
        {
            remoteviews.setImageViewResource(i, j);
            return;
        }
    }

    public static void c(RemoteViews remoteviews, Resources resources, WeatherBean weatherbean, u u1, int i)
    {
        if (remoteviews == null || i < 1)
        {
            return;
        }
        if (weatherbean == null && u1 == null)
        {
            remoteviews.setTextViewText(i, "--");
            return;
        }
        String s1 = "--";
        float f1 = -10000F;
        int j = 2;
        float f = f1;
        String s = s1;
        if (weatherbean != null)
        {
            f = f1;
            s = s1;
            if (weatherbean.l != null)
            {
                weatherbean = weatherbean.l;
                s = weatherbean.b();
                f = weatherbean.a();
            }
        }
        if (u1 != null)
        {
            j = u1.q;
        }
        if (!r.a(s))
        {
            remoteviews.setTextViewText(i, resources.getText(0x7f0801e2).toString());
            return;
        }
        if (!r.b(f))
        {
            remoteviews.setTextViewText(i, (new StringBuilder()).append(resources.getString(0x7f080291)).append(" : ").append(s).toString());
            return;
        }
        weatherbean = a(resources, j, f);
        if (j == 5)
        {
            remoteviews.setTextViewText(i, (new StringBuilder()).append(resources.getString(0x7f080291)).append(" : ").append(s).append(" ,  ").append(weatherbean).toString());
            return;
        } else
        {
            remoteviews.setTextViewText(i, (new StringBuilder()).append(resources.getString(0x7f080291)).append(" : ").append(weatherbean).append(" , ").append(s).toString());
            return;
        }
    }

    public static void c(RemoteViews remoteviews, Time time, boolean flag, int i)
    {
        if (remoteviews == null || time == null || i < 1)
        {
            return;
        }
        int k = time.hour;
        int j = k;
        if (!flag)
        {
            k %= 12;
            j = k;
            if (k == 0)
            {
                j = 12;
            }
        }
        k = time.minute;
        if (flag)
        {
            remoteviews.setTextViewText(i, (new StringBuilder()).append(r.e(j)).append(":").append(r.e(k)).toString());
            return;
        }
        if (com.go.weatherex.i.b.a(time))
        {
            remoteviews.setTextViewText(i, (new StringBuilder()).append(r.e(j)).append(":").append(r.e(k)).append(" ").append("AM").toString());
            return;
        } else
        {
            remoteviews.setTextViewText(i, (new StringBuilder()).append(r.e(j)).append(":").append(r.e(k)).append(" ").append("PM").toString());
            return;
        }
    }

    public static void c(RemoteViews remoteviews, ForecastBean forecastbean, u u1, int i)
    {
        int j = 1;
        if (remoteviews == null || i < 1)
        {
            return;
        }
        if (u1 != null)
        {
            j = u1.g;
        }
        if (forecastbean != null)
        {
            j = q.a(forecastbean.b(j));
        } else
        {
            j = -10000;
        }
        if (j != -10000)
        {
            forecastbean = (new StringBuilder()).append(j).append("\260").toString();
        } else
        {
            forecastbean = "-\260";
        }
        remoteviews.setTextViewText(i, forecastbean);
    }

    public static void c(RemoteViews remoteviews, WeatherBean weatherbean, u u1, int i)
    {
        int j = 1;
        if (remoteviews == null || i < 1)
        {
            return;
        }
        if (weatherbean == null && u1 == null)
        {
            remoteviews.setTextViewText(i, "--\260 ");
            return;
        }
        if (u1 != null)
        {
            j = u1.g;
        }
        if (weatherbean != null && weatherbean.l != null)
        {
            j = q.a(weatherbean.l.c(j));
        } else
        {
            j = -10000;
        }
        if (j != -10000)
        {
            remoteviews.setTextViewText(i, (new StringBuilder()).append(j).append("\260 ").toString());
            return;
        } else
        {
            remoteviews.setTextViewText(i, "--\260 ");
            return;
        }
    }

    public static void d(RemoteViews remoteviews, int i, int j)
    {
        if (remoteviews == null || i < 1 || j < 1)
        {
            return;
        } else
        {
            remoteviews.setImageViewResource(i, j);
            return;
        }
    }

    public static void d(RemoteViews remoteviews, WeatherBean weatherbean, u u1, int i)
    {
        if (remoteviews == null || i < 1)
        {
            return;
        }
        int j;
        int k;
        if (u1 != null)
        {
            j = u1.g;
        } else
        {
            j = 1;
        }
        if (weatherbean != null && weatherbean.l != null)
        {
            k = q.a(weatherbean.l.a(j));
        } else
        {
            k = -10000;
        }
        if (k != -10000)
        {
            remoteviews.setViewVisibility(i, 0);
            if (j == 1)
            {
                remoteviews.setTextViewText(i, (new StringBuilder()).append(String.valueOf(k)).append("\260C").toString());
                return;
            } else
            {
                remoteviews.setTextViewText(i, (new StringBuilder()).append(String.valueOf(k)).append("\260F").toString());
                return;
            }
        }
        remoteviews.setViewVisibility(i, 0);
        if (j == 1)
        {
            remoteviews.setTextViewText(i, "--\260C");
            return;
        } else
        {
            remoteviews.setTextViewText(i, "--\260F");
            return;
        }
    }

    public static void e(RemoteViews remoteviews, int i, int j)
    {
        if (remoteviews == null || i < 1 || j < 1)
        {
            return;
        } else
        {
            remoteviews.setImageViewResource(i, j);
            return;
        }
    }
}
