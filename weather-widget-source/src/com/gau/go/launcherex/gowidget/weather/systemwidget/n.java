// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            o, p, q, r, 
//            s

public class n
{

    public static final String a[] = {
        "go_weatherex_widget_unknow", "go_weatherex_widget_sun", "go_weatherex_widget_sun_night", "go_weatherex_widget_cloud", "go_weatherex_widget_cloud_night", "go_weatherex_widget_dark_cloud", "go_weatherex_widget_snow", "go_weatherex_widget_fog", "go_weatherex_widget_rain", "go_weatherex_widget_thunderstorm"
    };
    public static final String b[] = {
        "go_weatherex_widget_unknow_forecast", "go_weatherex_widget_sun_forecast", "go_weatherex_widget_sun_night_forecast", "go_weatherex_widget_cloud_forecast", "go_weatherex_widget_cloud_night_forecast", "go_weatherex_widget_dark_cloud_forecast", "go_weatherex_widget_snow_forecast", "go_weatherex_widget_fog_forecast", "go_weatherex_widget_rain_forecast", "go_weatherex_widget_thunderstorm_forecast"
    };
    private boolean c;

    public n()
    {
    }

    private int a(String s1)
    {
        int i;
        try
        {
            i = Integer.parseInt(s1.substring(s1.length() - 1));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return 0;
        }
        return i;
    }

    private void a(XmlPullParser xmlpullparser, String as[], int i)
    {
        xmlpullparser = xmlpullparser.getAttributeValue(null, "src");
        if (xmlpullparser != null)
        {
            as[i] = xmlpullparser;
        }
    }

    public void a(XmlPullParser xmlpullparser, o o1)
    {
        if (xmlpullparser != null && o1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (xmlpullparser.next() == 1) goto _L1; else goto _L3
_L3:
        if (xmlpullparser.getName() == null) goto _L2; else goto _L4
_L4:
        String s1;
        int i;
        s1 = xmlpullparser.getName();
        i = xmlpullparser.getEventType();
        if (s1 == null) goto _L2; else goto _L5
_L5:
        if (!s1.equals("systemwidget") || i != 2) goto _L7; else goto _L6
_L6:
        String s2;
        int j;
        try
        {
            s2 = xmlpullparser.getAttributeValue(null, "style_id");
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
_L19:
        s2 = o1.a("systemwidget_style");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_553;
        }
        j = Integer.parseInt(o1.a("systemwidget_style"));
_L20:
        if (i != j || i == -100)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        c = true;
_L14:
        if (!c || !s1.equals("go_weatherex_widget_temp_minus") && !s1.equals("go_weatherex_widget_temp_unit_centigrade") && !s1.equals("go_weatherex_widget_temp_unit_fahrenheit") && !s1.equals("go_weatherex_widget_temp_unit") && !s1.equals("go_weatherex_widget_change_city") && !s1.equals("go_weatherex_widget_bg") && !s1.equals("go_weatherex_widget_bg_day") && !s1.equals("go_weatherex_widget_extreme_icon") && !s1.equals("go_weatherex_widget_bg_night")) goto _L11; else goto _L10
_L10:
        s2 = xmlpullparser.getAttributeValue(null, "src");
        if (s2 == null) goto _L2; else goto _L12
_L12:
        o1.a(s1, s2);
          goto _L2
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception.printStackTrace();
          goto _L9
        numberformatexception;
        numberformatexception.printStackTrace();
        break MISSING_BLOCK_LABEL_553;
_L7:
        if (!s1.equals("systemwidget") || i != 3) goto _L14; else goto _L13
_L13:
        if (!c) goto _L14; else goto _L15
_L15:
        c = false;
        return;
_L11:
label0:
        {
            if (!s1.startsWith("go_weatherex_widget_temp_num"))
            {
                break label0;
            }
            a(xmlpullparser, o1.b(), a(s1));
        }
          goto _L2
label1:
        {
            if (!s1.equals("go_weatherex_widget_unknow"))
            {
                break label1;
            }
            a(xmlpullparser, o1.a(), 0);
        }
          goto _L2
label2:
        {
            if (!s1.equals("go_weatherex_widget_sun"))
            {
                break label2;
            }
            a(xmlpullparser, o1.a(), 1);
        }
          goto _L2
label3:
        {
            if (!s1.equals("go_weatherex_widget_sun_night"))
            {
                break label3;
            }
            a(xmlpullparser, o1.a(), 2);
        }
          goto _L2
label4:
        {
            if (!s1.equals("go_weatherex_widget_cloud"))
            {
                break label4;
            }
            a(xmlpullparser, o1.a(), 3);
        }
          goto _L2
label5:
        {
            if (!s1.equals("go_weatherex_widget_cloud_night"))
            {
                break label5;
            }
            a(xmlpullparser, o1.a(), 4);
        }
          goto _L2
label6:
        {
            if (!s1.equals("go_weatherex_widget_dark_cloud"))
            {
                break label6;
            }
            a(xmlpullparser, o1.a(), 5);
        }
          goto _L2
label7:
        {
            if (!s1.equals("go_weatherex_widget_snow"))
            {
                break label7;
            }
            a(xmlpullparser, o1.a(), 6);
        }
          goto _L2
label8:
        {
            if (!s1.equals("go_weatherex_widget_fog"))
            {
                break label8;
            }
            a(xmlpullparser, o1.a(), 7);
        }
          goto _L2
        if (!s1.equals("go_weatherex_widget_rain")) goto _L17; else goto _L16
_L16:
        a(xmlpullparser, o1.a(), 8);
          goto _L2
_L17:
        if (!s1.equals("go_weatherex_widget_thunderstorm")) goto _L2; else goto _L18
_L18:
        a(xmlpullparser, o1.a(), 9);
          goto _L2
_L9:
        i = -100;
          goto _L19
        j = -100;
          goto _L20
    }

    public void a(XmlPullParser xmlpullparser, p p1)
    {
        if (xmlpullparser != null && p1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (xmlpullparser.next() == 1) goto _L1; else goto _L3
_L3:
        if (xmlpullparser.getName() == null) goto _L2; else goto _L4
_L4:
        String s1;
        int i;
        s1 = xmlpullparser.getName();
        i = xmlpullparser.getEventType();
        if (s1 == null) goto _L2; else goto _L5
_L5:
        if (!s1.equals("systemwidget") || i != 2) goto _L7; else goto _L6
_L6:
        String s2;
        int j;
        try
        {
            s2 = xmlpullparser.getAttributeValue(null, "style_id");
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
_L19:
        s2 = p1.a("systemwidget_style");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_668;
        }
        j = Integer.parseInt(p1.a("systemwidget_style"));
_L20:
        if (i != j || i == -100)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        c = true;
_L14:
        if ((!c || !s1.equals("go_weatherex_widget_temp_minus") && !s1.equals("go_weatherex_widget_temp_unit_centigrade") && !s1.equals("go_weatherex_widget_temp_unit_fahrenheit") && !s1.equals("go_weatherex_widget_temp_unit") && !s1.equals("go_weatherex_widget_time_bg") && !s1.equals("go_weatherex_widget_time_divider") && !s1.equals("go_weatherex_widget_time_bg") && !s1.equals("go_weatherex_widget_change_city") && !s1.equals("go_weatherex_widget_time_am") && !s1.equals("go_weatherex_widget_time_pm") && !s1.equals("go_weatherex_widget_time_ampm_empty") && !s1.equals("go_weatherex_widget_bg") && !s1.equals("go_weatherex_widget_bg_day") && !s1.equals("go_weatherex_widget_extreme_icon") && !s1.equals("go_weatherex_widget_bg_night")) && !s1.equals("go_weatherex_widget_date_style_color")) goto _L11; else goto _L10
_L10:
        s2 = xmlpullparser.getAttributeValue(null, "src");
        if (s2 == null) goto _L2; else goto _L12
_L12:
        p1.a(s1, s2);
          goto _L2
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception.printStackTrace();
          goto _L9
        numberformatexception;
        numberformatexception.printStackTrace();
        break MISSING_BLOCK_LABEL_668;
_L7:
        if (!s1.equals("systemwidget") || i != 3) goto _L14; else goto _L13
_L13:
        if (!c) goto _L14; else goto _L15
_L15:
        c = false;
        return;
_L11:
label0:
        {
            if (!s1.startsWith("go_weatherex_widget_time_num"))
            {
                break label0;
            }
            a(xmlpullparser, p1.b(), a(s1));
        }
          goto _L2
label1:
        {
            if (!s1.startsWith("go_weatherex_widget_time_min_num"))
            {
                break label1;
            }
            a(xmlpullparser, p1.d(), a(s1));
        }
          goto _L2
label2:
        {
            if (!s1.startsWith("go_weatherex_widget_temp_num"))
            {
                break label2;
            }
            a(xmlpullparser, p1.e(), a(s1));
        }
          goto _L2
label3:
        {
            if (!s1.equals("go_weatherex_widget_unknow"))
            {
                break label3;
            }
            a(xmlpullparser, p1.a(), 0);
        }
          goto _L2
label4:
        {
            if (!s1.equals("go_weatherex_widget_sun"))
            {
                break label4;
            }
            a(xmlpullparser, p1.a(), 1);
        }
          goto _L2
label5:
        {
            if (!s1.equals("go_weatherex_widget_sun_night"))
            {
                break label5;
            }
            a(xmlpullparser, p1.a(), 2);
        }
          goto _L2
label6:
        {
            if (!s1.equals("go_weatherex_widget_cloud"))
            {
                break label6;
            }
            a(xmlpullparser, p1.a(), 3);
        }
          goto _L2
label7:
        {
            if (!s1.equals("go_weatherex_widget_cloud_night"))
            {
                break label7;
            }
            a(xmlpullparser, p1.a(), 4);
        }
          goto _L2
label8:
        {
            if (!s1.equals("go_weatherex_widget_dark_cloud"))
            {
                break label8;
            }
            a(xmlpullparser, p1.a(), 5);
        }
          goto _L2
label9:
        {
            if (!s1.equals("go_weatherex_widget_snow"))
            {
                break label9;
            }
            a(xmlpullparser, p1.a(), 6);
        }
          goto _L2
label10:
        {
            if (!s1.equals("go_weatherex_widget_fog"))
            {
                break label10;
            }
            a(xmlpullparser, p1.a(), 7);
        }
          goto _L2
        if (!s1.equals("go_weatherex_widget_rain")) goto _L17; else goto _L16
_L16:
        a(xmlpullparser, p1.a(), 8);
          goto _L2
_L17:
        if (!s1.equals("go_weatherex_widget_thunderstorm")) goto _L2; else goto _L18
_L18:
        a(xmlpullparser, p1.a(), 9);
          goto _L2
_L9:
        i = -100;
          goto _L19
        j = -100;
          goto _L20
    }

    public void a(XmlPullParser xmlpullparser, q q1)
    {
        if (xmlpullparser != null && q1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (xmlpullparser.next() == 1) goto _L1; else goto _L3
_L3:
        if (xmlpullparser.getName() == null) goto _L2; else goto _L4
_L4:
        String s1;
        int i;
        s1 = xmlpullparser.getName();
        i = xmlpullparser.getEventType();
        if (s1 == null) goto _L2; else goto _L5
_L5:
        if (!s1.equals("systemwidget") || i != 2) goto _L7; else goto _L6
_L6:
        String s2;
        int j;
        try
        {
            s2 = xmlpullparser.getAttributeValue(null, "style_id");
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
_L19:
        s2 = q1.a("systemwidget_style");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_668;
        }
        j = Integer.parseInt(q1.a("systemwidget_style"));
_L20:
        if (i != j || i == -100)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        c = true;
_L14:
        if ((!c || !s1.equals("go_weatherex_widget_temp_minus") && !s1.equals("go_weatherex_widget_temp_unit_centigrade") && !s1.equals("go_weatherex_widget_temp_unit_fahrenheit") && !s1.equals("go_weatherex_widget_temp_unit") && !s1.equals("go_weatherex_widget_time_bg") && !s1.equals("go_weatherex_widget_time_divider") && !s1.equals("go_weatherex_widget_time_am") && !s1.equals("go_weatherex_widget_time_pm") && !s1.equals("go_weatherex_widget_time_ampm_empty") && !s1.equals("go_weatherex_widget_time_bg") && !s1.equals("go_weatherex_widget_change_city") && !s1.equals("go_weatherex_widget_bg") && !s1.equals("go_weatherex_widget_bg_day") && !s1.equals("go_weatherex_widget_extreme_icon") && !s1.equals("go_weatherex_widget_bg_night")) && !s1.equals("go_weatherex_widget_date_style_color")) goto _L11; else goto _L10
_L10:
        s2 = xmlpullparser.getAttributeValue(null, "src");
        if (s2 == null) goto _L2; else goto _L12
_L12:
        q1.a(s1, s2);
          goto _L2
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception.printStackTrace();
          goto _L9
        numberformatexception;
        numberformatexception.printStackTrace();
        break MISSING_BLOCK_LABEL_668;
_L7:
        if (!s1.equals("systemwidget") || i != 3) goto _L14; else goto _L13
_L13:
        if (!c) goto _L14; else goto _L15
_L15:
        c = false;
        return;
_L11:
label0:
        {
            if (!s1.startsWith("go_weatherex_widget_time_num"))
            {
                break label0;
            }
            a(xmlpullparser, q1.b(), a(s1));
        }
          goto _L2
label1:
        {
            if (!s1.startsWith("go_weatherex_widget_time_min_num"))
            {
                break label1;
            }
            a(xmlpullparser, q1.d(), a(s1));
        }
          goto _L2
label2:
        {
            if (!s1.startsWith("go_weatherex_widget_temp_num"))
            {
                break label2;
            }
            a(xmlpullparser, q1.e(), a(s1));
        }
          goto _L2
label3:
        {
            if (!s1.equals("go_weatherex_widget_unknow"))
            {
                break label3;
            }
            a(xmlpullparser, q1.a(), 0);
        }
          goto _L2
label4:
        {
            if (!s1.equals("go_weatherex_widget_sun"))
            {
                break label4;
            }
            a(xmlpullparser, q1.a(), 1);
        }
          goto _L2
label5:
        {
            if (!s1.equals("go_weatherex_widget_sun_night"))
            {
                break label5;
            }
            a(xmlpullparser, q1.a(), 2);
        }
          goto _L2
label6:
        {
            if (!s1.equals("go_weatherex_widget_cloud"))
            {
                break label6;
            }
            a(xmlpullparser, q1.a(), 3);
        }
          goto _L2
label7:
        {
            if (!s1.equals("go_weatherex_widget_cloud_night"))
            {
                break label7;
            }
            a(xmlpullparser, q1.a(), 4);
        }
          goto _L2
label8:
        {
            if (!s1.equals("go_weatherex_widget_dark_cloud"))
            {
                break label8;
            }
            a(xmlpullparser, q1.a(), 5);
        }
          goto _L2
label9:
        {
            if (!s1.equals("go_weatherex_widget_snow"))
            {
                break label9;
            }
            a(xmlpullparser, q1.a(), 6);
        }
          goto _L2
label10:
        {
            if (!s1.equals("go_weatherex_widget_fog"))
            {
                break label10;
            }
            a(xmlpullparser, q1.a(), 7);
        }
          goto _L2
        if (!s1.equals("go_weatherex_widget_rain")) goto _L17; else goto _L16
_L16:
        a(xmlpullparser, q1.a(), 8);
          goto _L2
_L17:
        if (!s1.equals("go_weatherex_widget_thunderstorm")) goto _L2; else goto _L18
_L18:
        a(xmlpullparser, q1.a(), 9);
          goto _L2
_L9:
        i = -100;
          goto _L19
        j = -100;
          goto _L20
    }

    public void a(XmlPullParser xmlpullparser, r r1)
    {
        if (xmlpullparser != null && r1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (xmlpullparser.next() == 1) goto _L1; else goto _L3
_L3:
        if (xmlpullparser.getName() == null) goto _L2; else goto _L4
_L4:
        String s1;
        int i;
        s1 = xmlpullparser.getName();
        i = xmlpullparser.getEventType();
        if (s1 == null) goto _L2; else goto _L5
_L5:
        if (!s1.equals("systemwidget") || i != 2) goto _L7; else goto _L6
_L6:
        String s2;
        int j;
        try
        {
            s2 = xmlpullparser.getAttributeValue(null, "style_id");
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
_L19:
        s2 = r1.a("systemwidget_style");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_910;
        }
        j = Integer.parseInt(r1.a("systemwidget_style"));
_L20:
        if (i != j || i == -100)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        c = true;
_L14:
        if ((!c || !s1.equals("go_weatherex_widget_temp_minus") && !s1.equals("go_weatherex_widget_temp_unit_centigrade") && !s1.equals("go_weatherex_widget_temp_unit_fahrenheit") && !s1.equals("go_weatherex_widget_temp_unit") && !s1.equals("go_weatherex_widget_time_bg") && !s1.equals("go_weatherex_widget_time_divider") && !s1.equals("go_weatherex_widget_time_am") && !s1.equals("go_weatherex_widget_time_pm") && !s1.equals("go_weatherex_widget_time_ampm_empty") && !s1.equals("go_weatherex_widget_time_bg") && !s1.equals("go_weatherex_widget_change_city") && !s1.equals("go_weatherex_widget_bg") && !s1.equals("go_weatherex_widget_bg_day") && !s1.equals("go_weatherex_widget_extreme_icon") && !s1.equals("go_weatherex_widget_bg_night") && !s1.equals("go_weatherex_widget_next_page") && !s1.equals("go_weatherex_widget_previous_page")) && !s1.equals("go_weatherex_widget_date_style_color")) goto _L11; else goto _L10
_L10:
        s2 = xmlpullparser.getAttributeValue(null, "src");
        if (s2 == null) goto _L2; else goto _L12
_L12:
        r1.a(s1, s2);
          goto _L2
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception.printStackTrace();
          goto _L9
        numberformatexception;
        numberformatexception.printStackTrace();
        break MISSING_BLOCK_LABEL_910;
_L7:
        if (!s1.equals("systemwidget") || i != 3) goto _L14; else goto _L13
_L13:
        if (!c) goto _L14; else goto _L15
_L15:
        c = false;
        return;
_L11:
label0:
        {
            if (!s1.startsWith("go_weatherex_widget_time_num"))
            {
                break label0;
            }
            a(xmlpullparser, r1.d(), a(s1));
        }
          goto _L2
label1:
        {
            if (!s1.startsWith("go_weatherex_widget_time_min_num"))
            {
                break label1;
            }
            a(xmlpullparser, r1.e(), a(s1));
        }
          goto _L2
label2:
        {
            if (!s1.startsWith("go_weatherex_widget_temp_num"))
            {
                break label2;
            }
            a(xmlpullparser, r1.f(), a(s1));
        }
          goto _L2
label3:
        {
            if (!s1.equals("go_weatherex_widget_unknow"))
            {
                break label3;
            }
            a(xmlpullparser, r1.b(), 0);
        }
          goto _L2
label4:
        {
            if (!s1.equals("go_weatherex_widget_sun"))
            {
                break label4;
            }
            a(xmlpullparser, r1.b(), 1);
        }
          goto _L2
label5:
        {
            if (!s1.equals("go_weatherex_widget_sun_night"))
            {
                break label5;
            }
            a(xmlpullparser, r1.b(), 2);
        }
          goto _L2
label6:
        {
            if (!s1.equals("go_weatherex_widget_cloud"))
            {
                break label6;
            }
            a(xmlpullparser, r1.b(), 3);
        }
          goto _L2
label7:
        {
            if (!s1.equals("go_weatherex_widget_cloud_night"))
            {
                break label7;
            }
            a(xmlpullparser, r1.b(), 4);
        }
          goto _L2
label8:
        {
            if (!s1.equals("go_weatherex_widget_dark_cloud"))
            {
                break label8;
            }
            a(xmlpullparser, r1.b(), 5);
        }
          goto _L2
label9:
        {
            if (!s1.equals("go_weatherex_widget_snow"))
            {
                break label9;
            }
            a(xmlpullparser, r1.b(), 6);
        }
          goto _L2
label10:
        {
            if (!s1.equals("go_weatherex_widget_fog"))
            {
                break label10;
            }
            a(xmlpullparser, r1.b(), 7);
        }
          goto _L2
label11:
        {
            if (!s1.equals("go_weatherex_widget_rain"))
            {
                break label11;
            }
            a(xmlpullparser, r1.b(), 8);
        }
          goto _L2
label12:
        {
            if (!s1.equals("go_weatherex_widget_thunderstorm"))
            {
                break label12;
            }
            a(xmlpullparser, r1.b(), 9);
        }
          goto _L2
label13:
        {
            if (!s1.equals("go_weatherex_widget_unknow_forecast"))
            {
                break label13;
            }
            a(xmlpullparser, r1.a(), 0);
        }
          goto _L2
label14:
        {
            if (!s1.equals("go_weatherex_widget_sun_forecast"))
            {
                break label14;
            }
            a(xmlpullparser, r1.a(), 1);
        }
          goto _L2
label15:
        {
            if (!s1.equals("go_weatherex_widget_sun_night_forecast"))
            {
                break label15;
            }
            a(xmlpullparser, r1.a(), 2);
        }
          goto _L2
label16:
        {
            if (!s1.equals("go_weatherex_widget_cloud_forecast"))
            {
                break label16;
            }
            a(xmlpullparser, r1.a(), 3);
        }
          goto _L2
label17:
        {
            if (!s1.equals("go_weatherex_widget_cloud_night_forecast"))
            {
                break label17;
            }
            a(xmlpullparser, r1.a(), 4);
        }
          goto _L2
label18:
        {
            if (!s1.equals("go_weatherex_widget_dark_cloud_forecast"))
            {
                break label18;
            }
            a(xmlpullparser, r1.a(), 5);
        }
          goto _L2
label19:
        {
            if (!s1.equals("go_weatherex_widget_snow_forecast"))
            {
                break label19;
            }
            a(xmlpullparser, r1.a(), 6);
        }
          goto _L2
label20:
        {
            if (!s1.equals("go_weatherex_widget_fog_forecast"))
            {
                break label20;
            }
            a(xmlpullparser, r1.a(), 7);
        }
          goto _L2
        if (!s1.equals("go_weatherex_widget_rain_forecast")) goto _L17; else goto _L16
_L16:
        a(xmlpullparser, r1.a(), 8);
          goto _L2
_L17:
        if (!s1.equals("go_weatherex_widget_thunderstorm_forecast")) goto _L2; else goto _L18
_L18:
        a(xmlpullparser, r1.a(), 9);
          goto _L2
_L9:
        i = -100;
          goto _L19
        j = -100;
          goto _L20
    }

    public void a(XmlPullParser xmlpullparser, s s1)
    {
        if (xmlpullparser != null && s1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (xmlpullparser.next() == 1) goto _L1; else goto _L3
_L3:
        if (xmlpullparser.getName() == null) goto _L2; else goto _L4
_L4:
        String s2;
        int i;
        s2 = xmlpullparser.getName();
        i = xmlpullparser.getEventType();
        if (s2 == null) goto _L2; else goto _L5
_L5:
        if (!s2.equals("systemwidget") || i != 2) goto _L7; else goto _L6
_L6:
        String s3;
        int j;
        try
        {
            s3 = xmlpullparser.getAttributeValue(null, "style_id");
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            xmlpullparser.printStackTrace();
            return;
        }
        if (s3 == null) goto _L9; else goto _L8
_L8:
        i = Integer.parseInt(s3);
_L19:
        s3 = s1.a("systemwidget_style");
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_910;
        }
        j = Integer.parseInt(s1.a("systemwidget_style"));
_L20:
        if (i != j || i == -100)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        c = true;
_L14:
        if ((!c || !s2.equals("go_weatherex_widget_temp_minus") && !s2.equals("go_weatherex_widget_temp_unit_centigrade") && !s2.equals("go_weatherex_widget_temp_unit_fahrenheit") && !s2.equals("go_weatherex_widget_temp_unit") && !s2.equals("go_weatherex_widget_time_bg") && !s2.equals("go_weatherex_widget_time_divider") && !s2.equals("go_weatherex_widget_time_am") && !s2.equals("go_weatherex_widget_time_pm") && !s2.equals("go_weatherex_widget_time_ampm_empty") && !s2.equals("go_weatherex_widget_time_bg") && !s2.equals("go_weatherex_widget_change_city") && !s2.equals("go_weatherex_widget_bg") && !s2.equals("go_weatherex_widget_bg_day") && !s2.equals("go_weatherex_widget_extreme_icon") && !s2.equals("go_weatherex_widget_bg_night") && !s2.equals("go_weatherex_widget_next_page") && !s2.equals("go_weatherex_widget_previous_page")) && !s2.equals("go_weatherex_widget_date_style_color")) goto _L11; else goto _L10
_L10:
        s3 = xmlpullparser.getAttributeValue(null, "src");
        if (s3 == null) goto _L2; else goto _L12
_L12:
        s1.a(s2, s3);
          goto _L2
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception.printStackTrace();
          goto _L9
        numberformatexception;
        numberformatexception.printStackTrace();
        break MISSING_BLOCK_LABEL_910;
_L7:
        if (!s2.equals("systemwidget") || i != 3) goto _L14; else goto _L13
_L13:
        if (!c) goto _L14; else goto _L15
_L15:
        c = false;
        return;
_L11:
label0:
        {
            if (!s2.startsWith("go_weatherex_widget_time_num"))
            {
                break label0;
            }
            a(xmlpullparser, s1.d(), a(s2));
        }
          goto _L2
label1:
        {
            if (!s2.startsWith("go_weatherex_widget_time_min_num"))
            {
                break label1;
            }
            a(xmlpullparser, s1.e(), a(s2));
        }
          goto _L2
label2:
        {
            if (!s2.startsWith("go_weatherex_widget_temp_num"))
            {
                break label2;
            }
            a(xmlpullparser, s1.f(), a(s2));
        }
          goto _L2
label3:
        {
            if (!s2.equals("go_weatherex_widget_unknow"))
            {
                break label3;
            }
            a(xmlpullparser, s1.b(), 0);
        }
          goto _L2
label4:
        {
            if (!s2.equals("go_weatherex_widget_sun"))
            {
                break label4;
            }
            a(xmlpullparser, s1.b(), 1);
        }
          goto _L2
label5:
        {
            if (!s2.equals("go_weatherex_widget_sun_night"))
            {
                break label5;
            }
            a(xmlpullparser, s1.b(), 2);
        }
          goto _L2
label6:
        {
            if (!s2.equals("go_weatherex_widget_cloud"))
            {
                break label6;
            }
            a(xmlpullparser, s1.b(), 3);
        }
          goto _L2
label7:
        {
            if (!s2.equals("go_weatherex_widget_cloud_night"))
            {
                break label7;
            }
            a(xmlpullparser, s1.b(), 4);
        }
          goto _L2
label8:
        {
            if (!s2.equals("go_weatherex_widget_dark_cloud"))
            {
                break label8;
            }
            a(xmlpullparser, s1.b(), 5);
        }
          goto _L2
label9:
        {
            if (!s2.equals("go_weatherex_widget_snow"))
            {
                break label9;
            }
            a(xmlpullparser, s1.b(), 6);
        }
          goto _L2
label10:
        {
            if (!s2.equals("go_weatherex_widget_fog"))
            {
                break label10;
            }
            a(xmlpullparser, s1.b(), 7);
        }
          goto _L2
label11:
        {
            if (!s2.equals("go_weatherex_widget_rain"))
            {
                break label11;
            }
            a(xmlpullparser, s1.b(), 8);
        }
          goto _L2
label12:
        {
            if (!s2.equals("go_weatherex_widget_thunderstorm"))
            {
                break label12;
            }
            a(xmlpullparser, s1.b(), 9);
        }
          goto _L2
label13:
        {
            if (!s2.equals("go_weatherex_widget_unknow_forecast"))
            {
                break label13;
            }
            a(xmlpullparser, s1.a(), 0);
        }
          goto _L2
label14:
        {
            if (!s2.equals("go_weatherex_widget_sun_forecast"))
            {
                break label14;
            }
            a(xmlpullparser, s1.a(), 1);
        }
          goto _L2
label15:
        {
            if (!s2.equals("go_weatherex_widget_sun_night_forecast"))
            {
                break label15;
            }
            a(xmlpullparser, s1.a(), 2);
        }
          goto _L2
label16:
        {
            if (!s2.equals("go_weatherex_widget_cloud_forecast"))
            {
                break label16;
            }
            a(xmlpullparser, s1.a(), 3);
        }
          goto _L2
label17:
        {
            if (!s2.equals("go_weatherex_widget_cloud_night_forecast"))
            {
                break label17;
            }
            a(xmlpullparser, s1.a(), 4);
        }
          goto _L2
label18:
        {
            if (!s2.equals("go_weatherex_widget_dark_cloud_forecast"))
            {
                break label18;
            }
            a(xmlpullparser, s1.a(), 5);
        }
          goto _L2
label19:
        {
            if (!s2.equals("go_weatherex_widget_snow_forecast"))
            {
                break label19;
            }
            a(xmlpullparser, s1.a(), 6);
        }
          goto _L2
label20:
        {
            if (!s2.equals("go_weatherex_widget_fog_forecast"))
            {
                break label20;
            }
            a(xmlpullparser, s1.a(), 7);
        }
          goto _L2
        if (!s2.equals("go_weatherex_widget_rain_forecast")) goto _L17; else goto _L16
_L16:
        a(xmlpullparser, s1.a(), 8);
          goto _L2
_L17:
        if (!s2.equals("go_weatherex_widget_thunderstorm_forecast")) goto _L2; else goto _L18
_L18:
        a(xmlpullparser, s1.a(), 9);
          goto _L2
_L9:
        i = -100;
          goto _L19
        j = -100;
          goto _L20
    }

}
