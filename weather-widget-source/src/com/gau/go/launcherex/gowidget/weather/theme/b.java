// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.theme;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.theme:
//            a

public class b
{

    private boolean a;

    public b()
    {
    }

    private int a(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s.substring(s.length() - 1));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return 0;
        }
        return i;
    }

    public static int a(String s, int i)
    {
        int j;
        try
        {
            j = Color.parseColor(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return i;
        }
        return j;
    }

    public static Drawable a(Resources resources, String s, String s1)
    {
        Object obj = null;
        Drawable drawable = obj;
        if (s != null)
        {
            int i = resources.getIdentifier(s, "drawable", s1);
            drawable = obj;
            if (i != 0)
            {
                try
                {
                    drawable = resources.getDrawable(i);
                }
                // Misplaced declaration of an exception variable
                catch (Resources resources)
                {
                    return null;
                }
                // Misplaced declaration of an exception variable
                catch (Resources resources)
                {
                    return null;
                }
            }
        }
        return drawable;
    }

    private void a(XmlPullParser xmlpullparser, String as[], int i)
    {
        xmlpullparser = xmlpullparser.getAttributeValue(null, "src");
        if (xmlpullparser != null)
        {
            as[i] = xmlpullparser;
        }
    }

    public static ColorStateList b(Resources resources, String s, String s1)
    {
        if (s != null)
        {
            int i = resources.getIdentifier(s, "color", s1);
            if (i != 0)
            {
                return resources.getColorStateList(i);
            }
        }
        return null;
    }

    public void a(XmlPullParser xmlpullparser, a a1)
    {
        if (xmlpullparser != null && a1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (xmlpullparser.next() == 1) goto _L1; else goto _L3
_L3:
        if (xmlpullparser.getName() == null) goto _L2; else goto _L4
_L4:
        String s;
        int i;
        s = xmlpullparser.getName();
        i = xmlpullparser.getEventType();
        if (s == null) goto _L2; else goto _L5
_L5:
        if (!s.equals("widget") || i != 2) goto _L7; else goto _L6
_L6:
        String s1;
        String s2;
        int j;
        int k;
        int l;
        try
        {
            s2 = xmlpullparser.getAttributeValue(null, "style_id");
            s1 = xmlpullparser.getAttributeValue(null, "theme_id");
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            xmlpullparser.printStackTrace();
            return;
        }
        if (s2 == null) goto _L9; else goto _L8
_L8:
        i = Integer.parseInt(s2);
_L23:
        if (s1 == null) goto _L11; else goto _L10
_L10:
        j = Integer.parseInt(s1);
_L24:
        s1 = a1.a("widget_style");
        if (s1 == null) goto _L13; else goto _L12
_L12:
        k = Integer.parseInt(a1.a("widget_style"));
_L25:
        s1 = a1.a("widget_theme_type");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_746;
        }
        l = Integer.parseInt(a1.a("widget_theme_type"));
_L26:
        if (i != k || i == -100 || l != j || l == -100)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        a = true;
_L18:
        if (!a || !s.equals("gw_weather_41_temp_minus") && !s.equals("gw_weather_41_temp_unit") && !s.equals("gw_weather_41_temp_unit_celsius") && !s.equals("gw_weather_41_temp_unit_fahrenheit") && !s.equals("gw_weather_41_time_divider") && !s.equals("gw_weather_41_time_am") && !s.equals("gw_weather_41_time_pm") && !s.equals("gw_weather_41_bg") && !s.equals("gw_weather_41_txt_selector") && !s.equals("gw_weather_41_txt_shadow_color") && !s.equals("gw_weather_41_txt_shadow_dx") && !s.equals("gw_weather_41_txt_shadow_dy") && !s.equals("gw_weather_41_txt_shadow_radius") && !s.equals("gw_weather_41_theme_setting_selector") && !s.equals("gw_weather_41_refresh_selector") && !s.equals("refresh_progress_41") && !s.equals("gw_weather_41_early_warning")) goto _L15; else goto _L14
_L14:
        s1 = xmlpullparser.getAttributeValue(null, "src");
        if (s1 == null) goto _L2; else goto _L16
_L16:
        a1.a(s, s1);
          goto _L2
        NumberFormatException numberformatexception1;
        numberformatexception1;
        numberformatexception1.printStackTrace();
          goto _L9
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception.printStackTrace();
          goto _L11
        numberformatexception;
        numberformatexception.printStackTrace();
          goto _L13
        numberformatexception;
        numberformatexception.printStackTrace();
        break MISSING_BLOCK_LABEL_746;
_L7:
        if (!s.equals("widget") || i != 3) goto _L18; else goto _L17
_L17:
        if (!a) goto _L18; else goto _L19
_L19:
        a = false;
        return;
_L15:
label0:
        {
            if (!s.startsWith("gw_weather_41_time_num"))
            {
                break label0;
            }
            a(xmlpullparser, a1.b(), a(s));
        }
          goto _L2
label1:
        {
            if (!s.startsWith("gw_weather_41_temp_num"))
            {
                break label1;
            }
            a(xmlpullparser, a1.c(), a(s));
        }
          goto _L2
label2:
        {
            if (!s.equals("gw_weather_41_pending"))
            {
                break label2;
            }
            a(xmlpullparser, a1.a(), 0);
        }
          goto _L2
label3:
        {
            if (!s.equals("gw_weather_41_sun"))
            {
                break label3;
            }
            a(xmlpullparser, a1.a(), 1);
        }
          goto _L2
label4:
        {
            if (!s.equals("gw_weather_41_sun_night"))
            {
                break label4;
            }
            a(xmlpullparser, a1.a(), 2);
        }
          goto _L2
label5:
        {
            if (!s.equals("gw_weather_41_cloudy"))
            {
                break label5;
            }
            a(xmlpullparser, a1.a(), 3);
        }
          goto _L2
label6:
        {
            if (!s.equals("gw_weather_41_cloudy_night"))
            {
                break label6;
            }
            a(xmlpullparser, a1.a(), 4);
        }
          goto _L2
label7:
        {
            if (!s.equals("gw_weather_41_darkcloudy"))
            {
                break label7;
            }
            a(xmlpullparser, a1.a(), 5);
        }
          goto _L2
label8:
        {
            if (!s.equals("gw_weather_41_snow"))
            {
                break label8;
            }
            a(xmlpullparser, a1.a(), 6);
        }
          goto _L2
label9:
        {
            if (!s.equals("gw_weather_41_fog"))
            {
                break label9;
            }
            a(xmlpullparser, a1.a(), 7);
        }
          goto _L2
        if (!s.equals("gw_weather_41_rain")) goto _L21; else goto _L20
_L20:
        a(xmlpullparser, a1.a(), 8);
          goto _L2
_L21:
        if (!s.equals("gw_weather_41_thunder_storm")) goto _L2; else goto _L22
_L22:
        a(xmlpullparser, a1.a(), 9);
          goto _L2
_L9:
        i = -100;
          goto _L23
_L11:
        j = -100;
          goto _L24
_L13:
        k = -100;
          goto _L25
        l = -100;
          goto _L26
    }
}
