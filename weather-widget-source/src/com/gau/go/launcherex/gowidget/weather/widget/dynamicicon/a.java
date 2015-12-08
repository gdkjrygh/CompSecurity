// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon;

import android.content.Context;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.scriptengine.parser.z;
import com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a.b;
import com.jiubang.core.a.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon:
//            d, c

public class a
{

    private Context a;
    private String b;
    private int c;
    private int d;
    private HashMap e;
    private HashMap f;
    private HashMap g;
    private ArrayList h;

    static Context a(a a1)
    {
        return a1.a;
    }

    private i a(String s)
    {
        s = (WeakReference)e.get(s);
        if (s != null)
        {
            return (i)s.get();
        } else
        {
            return null;
        }
    }

    private void a(z z1, String s)
    {
        if (z1 != null && !TextUtils.isEmpty(s))
        {
            f.put(s, new WeakReference(z1));
        }
    }

    static void a(a a1, z z1, String s)
    {
        a1.a(z1, s);
    }

    static int b(a a1)
    {
        return a1.c;
    }

    private z b(String s)
    {
        s = (WeakReference)f.get(s);
        if (s != null)
        {
            return (z)s.get();
        } else
        {
            return null;
        }
    }

    private String b(int j, boolean flag, boolean flag1)
    {
        if (flag)
        {
            switch (j)
            {
            default:
                if (flag1)
                {
                    return "gowidget/weather_dynamic_icon_na_day.xml";
                } else
                {
                    return "gowidget/weather_dynamic_icon_na_night.xml";
                }

            case 3: // '\003'
                if (flag1)
                {
                    return "gowidget/weather_dynamic_icon_cloudy_day.xml";
                } else
                {
                    return "gowidget/weather_dynamic_icon_cloudy_night.xml";
                }

            case 6: // '\006'
                if (flag1)
                {
                    return "gowidget/weather_dynamic_icon_foggy_day.xml";
                } else
                {
                    return "gowidget/weather_dynamic_icon_foggy_night.xml";
                }

            case 4: // '\004'
                if (flag1)
                {
                    return "gowidget/weather_dynamic_icon_overcast_day.xml";
                } else
                {
                    return "gowidget/weather_dynamic_icon_overcast_night.xml";
                }

            case 7: // '\007'
                if (flag1)
                {
                    return "gowidget/weather_dynamic_icon_rainy_day.xml";
                } else
                {
                    return "gowidget/weather_dynamic_icon_rainy_night.xml";
                }

            case 5: // '\005'
                if (flag1)
                {
                    return "gowidget/weather_dynamic_icon_snowy_day.xml";
                } else
                {
                    return "gowidget/weather_dynamic_icon_snowy_night.xml";
                }

            case 2: // '\002'
                if (flag1)
                {
                    return "gowidget/weather_dynamic_icon_sunny_day.xml";
                } else
                {
                    return "gowidget/weather_dynamic_icon_sunny_night.xml";
                }

            case 8: // '\b'
                break;
            }
            if (flag1)
            {
                return "gowidget/weather_dynamic_icon_thunderstorm_day.xml";
            } else
            {
                return "gowidget/weather_dynamic_icon_thunderstorm_night.xml";
            }
        }
        switch (j)
        {
        default:
            if (flag1)
            {
                return "gowidget/weather_icon_na_day.xml";
            } else
            {
                return "gowidget/weather_icon_na_night.xml";
            }

        case 3: // '\003'
            if (flag1)
            {
                return "gowidget/weather_icon_cloudy_day.xml";
            } else
            {
                return "gowidget/weather_icon_cloudy_night.xml";
            }

        case 6: // '\006'
            if (flag1)
            {
                return "gowidget/weather_icon_foggy_day.xml";
            } else
            {
                return "gowidget/weather_icon_foggy_night.xml";
            }

        case 4: // '\004'
            if (flag1)
            {
                return "gowidget/weather_icon_overcast_day.xml";
            } else
            {
                return "gowidget/weather_icon_overcast_night.xml";
            }

        case 7: // '\007'
            if (flag1)
            {
                return "gowidget/weather_icon_rainy_day.xml";
            } else
            {
                return "gowidget/weather_icon_rainy_night.xml";
            }

        case 5: // '\005'
            if (flag1)
            {
                return "gowidget/weather_icon_snowy_day.xml";
            } else
            {
                return "gowidget/weather_icon_snowy_night.xml";
            }

        case 2: // '\002'
            if (flag1)
            {
                return "gowidget/weather_icon_sunny_day.xml";
            } else
            {
                return "gowidget/weather_icon_sunny_night.xml";
            }

        case 8: // '\b'
            break;
        }
        if (flag1)
        {
            return "gowidget/weather_icon_thunderstorm_day.xml";
        } else
        {
            return "gowidget/weather_icon_thunderstorm_night.xml";
        }
    }

    static int c(a a1)
    {
        return a1.d;
    }

    static HashMap d(a a1)
    {
        return a1.g;
    }

    static ArrayList e(a a1)
    {
        return a1.h;
    }

    public i a(int j, boolean flag, boolean flag1)
    {
        return a(b(j, flag1, flag));
    }

    public void a(int j, boolean flag, boolean flag1, b b1)
    {
        String s = b(j, flag1, flag);
        d d1 = new d(this, null);
        d1.h = b1;
        d1.d = j;
        d1.e = flag;
        d1.f = flag1;
        d1.c = s;
        d1.g = b;
        d1.b = b(s);
        if (g.get(d1.c) == null)
        {
            g.put(d1.c, d1.c);
            (new c(this, null)).execute(new d[] {
                d1
            });
            return;
        } else
        {
            h.add(d1);
            return;
        }
    }
}
