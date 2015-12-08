// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            e, ac, i

public class w
{

    public w()
    {
    }

    private String a(XmlPullParser xmlpullparser)
    {
        return xmlpullparser.getAttributeValue(null, "src");
    }

    public void a(XmlPullParser xmlpullparser, i j)
    {
        if (xmlpullparser != null && j != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        do
        {
            if (xmlpullparser.next() == 1)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = xmlpullparser.getName();
        } while (obj == null);
        int k = xmlpullparser.getEventType();
        if (!((String) (obj)).equals("weather_icon") || k != 2) goto _L4; else goto _L3
_L3:
        if (xmlpullparser.next() == 1) goto _L2; else goto _L5
_L5:
        obj = xmlpullparser.getName();
        if (obj == null) goto _L3; else goto _L6
_L6:
        try
        {
            k = xmlpullparser.getEventType();
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            xmlpullparser.printStackTrace();
            return;
        }
        if (k != 2) goto _L8; else goto _L7
_L7:
label0:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_unknow"))
            {
                break label0;
            }
            e.a(j, 1, a(xmlpullparser));
        }
          goto _L3
label1:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_unknow_night"))
            {
                break label1;
            }
            e.b(j, 1, a(xmlpullparser));
        }
          goto _L3
label2:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_sun"))
            {
                break label2;
            }
            e.a(j, 2, a(xmlpullparser));
        }
          goto _L3
label3:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_sun_night"))
            {
                break label3;
            }
            e.b(j, 2, a(xmlpullparser));
        }
          goto _L3
label4:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_cloud"))
            {
                break label4;
            }
            e.a(j, 3, a(xmlpullparser));
        }
          goto _L3
label5:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_cloud_night"))
            {
                break label5;
            }
            e.b(j, 3, a(xmlpullparser));
        }
          goto _L3
label6:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_dark_cloud"))
            {
                break label6;
            }
            e.a(j, 4, a(xmlpullparser));
        }
          goto _L3
label7:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_dark_cloud_night"))
            {
                break label7;
            }
            e.b(j, 4, a(xmlpullparser));
        }
          goto _L3
label8:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_snow"))
            {
                break label8;
            }
            e.a(j, 5, a(xmlpullparser));
        }
          goto _L3
label9:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_snow_night"))
            {
                break label9;
            }
            e.b(j, 5, a(xmlpullparser));
        }
          goto _L3
label10:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_fog"))
            {
                break label10;
            }
            e.a(j, 6, a(xmlpullparser));
        }
          goto _L3
label11:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_fog_night"))
            {
                break label11;
            }
            e.b(j, 6, a(xmlpullparser));
        }
          goto _L3
label12:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_rain"))
            {
                break label12;
            }
            e.a(j, 7, a(xmlpullparser));
        }
          goto _L3
label13:
        {
            if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_rain_night"))
            {
                break label13;
            }
            e.b(j, 7, a(xmlpullparser));
        }
          goto _L3
        if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_thunderstorm")) goto _L10; else goto _L9
_L9:
        e.a(j, 8, a(xmlpullparser));
          goto _L3
_L10:
        if (!((String) (obj)).equals("go_weatherex_main_editcity_bg_thunderstorm_night")) goto _L3; else goto _L11
_L11:
        e.b(j, 8, a(xmlpullparser));
          goto _L3
_L8:
        if (!((String) (obj)).equals("weather_icon") || k != 3) goto _L3; else goto _L2
_L4:
        if (((String) (obj)).equals("sun_day_text_84") && k == 2) goto _L13; else goto _L12
_L12:
        if (((String) (obj)).equals("sun_night_text_84") && k == 2) goto _L13; else goto _L14
_L14:
        if (((String) (obj)).equals("cloud_day_text_84") && k == 2) goto _L13; else goto _L15
_L15:
        if (((String) (obj)).equals("cloud_night_text_84") && k == 2) goto _L13; else goto _L16
_L16:
        if (((String) (obj)).equals("dark_cloud_day_text_84") && k == 2) goto _L13; else goto _L17
_L17:
        if (((String) (obj)).equals("dark_cloud_night_text_84") && k == 2) goto _L13; else goto _L18
_L18:
        if (((String) (obj)).equals("snow_day_text_84") && k == 2) goto _L13; else goto _L19
_L19:
        if (((String) (obj)).equals("snow_night_text_84") && k == 2) goto _L13; else goto _L20
_L20:
        if (((String) (obj)).equals("fog_day_text_84") && k == 2) goto _L13; else goto _L21
_L21:
        if (((String) (obj)).equals("fog_night_text_84") && k == 2) goto _L13; else goto _L22
_L22:
        if (((String) (obj)).equals("rain_day_text_84") && k == 2) goto _L13; else goto _L23
_L23:
        if (((String) (obj)).equals("rain_night_text_84") && k == 2) goto _L13; else goto _L24
_L24:
        if (((String) (obj)).equals("thunderstorm_day_text_84") && k == 2) goto _L13; else goto _L25
_L25:
        if (!((String) (obj)).equals("thunderstorm_night_text_84") || k != 2) goto _L2; else goto _L13
_L13:
        obj = new ac();
_L28:
        if (xmlpullparser.next() == 1) goto _L2; else goto _L26
_L26:
        String s = xmlpullparser.getName();
        if (s == null) goto _L28; else goto _L27
_L27:
        String s1;
        k = xmlpullparser.getEventType();
        if (!s.equals("gw_weather_ex_main_selector") && !s.equals("go_weather_ex_main_shadowcolor"))
        {
            break MISSING_BLOCK_LABEL_766;
        }
        s1 = xmlpullparser.getAttributeValue(null, "src");
        if (s1 == null) goto _L28; else goto _L29
_L29:
        ((ac) (obj)).a(s, s1);
          goto _L28
        if (s.equals("sun_day_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("sun_night_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("cloud_day_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("cloud_night_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("dark_cloud_day_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("dark_cloud_night_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("snow_day_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("snow_night_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("fog_day_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("fog_night_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("rain_day_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("rain_night_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("thunderstorm_day_text_84") && k == 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s.equals("thunderstorm_night_text_84") || k != 3) goto _L28; else goto _L30
_L30:
        j.a(s, ((ac) (obj)));
          goto _L2
        if (true) goto _L1; else goto _L31
_L31:
    }
}
