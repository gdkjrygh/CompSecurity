// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.format.Time;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gau.go.launcherex.gowidget.weather.view.WeatherDetailActivity;
import java.util.Map;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            l

public class k
{

    private static final int o[] = {
        0x7f02039a, 0x7f0203a2, 0x7f0203a3, 0x7f020392, 0x7f020393, 0x7f02039c, 0x7f0203a0, 0x7f020398, 0x7f02039e, 0x7f0203a6
    };
    private static final int p[] = {
        0x7f02039b, 0x7f0203a5, 0x7f0203a4, 0x7f020395, 0x7f020394, 0x7f02039d, 0x7f0203a1, 0x7f020399, 0x7f02039f, 0x7f0203a7
    };
    private static final int q[] = {
        0x7f02029b, 0x7f020298, 0x7f020299, 0x7f020292, 0x7f020293, 0x7f020294, 0x7f020297, 0x7f020295, 0x7f020296, 0x7f02029a
    };
    private Context a;
    private l b;
    private NotificationManager c;
    private Notification d;
    private com.gau.go.launcherex.gowidget.weather.util.f e;
    private g f;
    private e g;
    private u h;
    private String i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int r[];
    private int s;
    private int t;
    private int u;
    private int v;

    public k(Context context)
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = 0;
        a = context;
    }

    private int a(int i1)
    {
        if (i1 <= 0)
        {
            switch (i1)
            {
            default:
                return 0;

            case 0: // '\0'
                return 0x7f0204a1;

            case -1: 
                return 0x7f020538;

            case -2: 
                return 0x7f020543;

            case -3: 
                return 0x7f02054e;

            case -4: 
                return 0x7f020559;

            case -5: 
                return 0x7f020564;

            case -6: 
                return 0x7f02056f;

            case -7: 
                return 0x7f02057a;

            case -8: 
                return 0x7f020585;

            case -9: 
                return 0x7f020590;

            case -10: 
                return 0x7f020539;

            case -11: 
                return 0x7f02053a;

            case -12: 
                return 0x7f02053b;

            case -13: 
                return 0x7f02053c;

            case -14: 
                return 0x7f02053d;

            case -15: 
                return 0x7f02053e;

            case -16: 
                return 0x7f02053f;

            case -17: 
                return 0x7f020540;

            case -18: 
                return 0x7f020541;

            case -19: 
                return 0x7f020542;

            case -20: 
                return 0x7f020544;

            case -21: 
                return 0x7f020545;

            case -22: 
                return 0x7f020546;

            case -23: 
                return 0x7f020547;

            case -24: 
                return 0x7f020548;

            case -25: 
                return 0x7f020549;

            case -26: 
                return 0x7f02054a;

            case -27: 
                return 0x7f02054b;

            case -28: 
                return 0x7f02054c;

            case -29: 
                return 0x7f02054d;

            case -30: 
                return 0x7f02054f;

            case -31: 
                return 0x7f020550;

            case -32: 
                return 0x7f020551;

            case -33: 
                return 0x7f020552;

            case -34: 
                return 0x7f020553;

            case -35: 
                return 0x7f020554;

            case -36: 
                return 0x7f020555;

            case -37: 
                return 0x7f020556;

            case -38: 
                return 0x7f020557;

            case -39: 
                return 0x7f020558;

            case -40: 
                return 0x7f02055a;

            case -41: 
                return 0x7f02055b;

            case -42: 
                return 0x7f02055c;

            case -43: 
                return 0x7f02055d;

            case -44: 
                return 0x7f02055e;

            case -45: 
                return 0x7f02055f;

            case -46: 
                return 0x7f020560;

            case -47: 
                return 0x7f020561;

            case -48: 
                return 0x7f020562;

            case -49: 
                return 0x7f020563;

            case -50: 
                return 0x7f020565;

            case -51: 
                return 0x7f020566;

            case -52: 
                return 0x7f020567;

            case -53: 
                return 0x7f020568;

            case -54: 
                return 0x7f020569;

            case -55: 
                return 0x7f02056a;

            case -56: 
                return 0x7f02056b;

            case -57: 
                return 0x7f02056c;

            case -58: 
                return 0x7f02056d;

            case -59: 
                return 0x7f02056e;

            case -60: 
                return 0x7f020570;

            case -61: 
                return 0x7f020571;

            case -62: 
                return 0x7f020572;

            case -63: 
                return 0x7f020573;

            case -64: 
                return 0x7f020574;

            case -65: 
                return 0x7f020575;

            case -66: 
                return 0x7f020576;

            case -67: 
                return 0x7f020577;

            case -68: 
                return 0x7f020578;

            case -69: 
                return 0x7f020579;

            case -70: 
                return 0x7f02057b;

            case -71: 
                return 0x7f02057c;

            case -72: 
                return 0x7f02057d;

            case -73: 
                return 0x7f02057e;

            case -74: 
                return 0x7f02057f;

            case -75: 
                return 0x7f020580;

            case -76: 
                return 0x7f020581;

            case -77: 
                return 0x7f020582;

            case -78: 
                return 0x7f020583;

            case -79: 
                return 0x7f020584;

            case -80: 
                return 0x7f020586;

            case -81: 
                return 0x7f020587;

            case -82: 
                return 0x7f020588;

            case -83: 
                return 0x7f020589;

            case -84: 
                return 0x7f02058a;

            case -85: 
                return 0x7f02058b;

            case -86: 
                return 0x7f02058c;

            case -87: 
                return 0x7f02058d;

            case -88: 
                return 0x7f02058e;

            case -89: 
                return 0x7f02058f;

            case -90: 
                return 0x7f020591;

            case -91: 
                return 0x7f020592;

            case -92: 
                return 0x7f020593;

            case -93: 
                return 0x7f020594;

            case -94: 
                return 0x7f020595;

            case -95: 
                return 0x7f020596;

            case -96: 
                return 0x7f020597;

            case -97: 
                return 0x7f020598;

            case -98: 
                return 0x7f020599;

            case -99: 
                return 0x7f02059a;
            }
        }
        switch (i1)
        {
        default:
            return 0;

        case 1: // '\001'
            return 0x7f0204a2;

        case 2: // '\002'
            return 0x7f0204e0;

        case 3: // '\003'
            return 0x7f0204eb;

        case 4: // '\004'
            return 0x7f0204f6;

        case 5: // '\005'
            return 0x7f020501;

        case 6: // '\006'
            return 0x7f02050c;

        case 7: // '\007'
            return 0x7f020517;

        case 8: // '\b'
            return 0x7f020522;

        case 9: // '\t'
            return 0x7f02052d;

        case 10: // '\n'
            return 0x7f0204a3;

        case 11: // '\013'
            return 0x7f0204ae;

        case 12: // '\f'
            return 0x7f0204b9;

        case 13: // '\r'
            return 0x7f0204c4;

        case 14: // '\016'
            return 0x7f0204cf;

        case 15: // '\017'
            return 0x7f0204da;

        case 16: // '\020'
            return 0x7f0204dc;

        case 17: // '\021'
            return 0x7f0204dd;

        case 18: // '\022'
            return 0x7f0204de;

        case 19: // '\023'
            return 0x7f0204df;

        case 20: // '\024'
            return 0x7f0204e1;

        case 21: // '\025'
            return 0x7f0204e2;

        case 22: // '\026'
            return 0x7f0204e3;

        case 23: // '\027'
            return 0x7f0204e4;

        case 24: // '\030'
            return 0x7f0204e5;

        case 25: // '\031'
            return 0x7f0204e6;

        case 26: // '\032'
            return 0x7f0204e7;

        case 27: // '\033'
            return 0x7f0204e8;

        case 28: // '\034'
            return 0x7f0204e9;

        case 29: // '\035'
            return 0x7f0204ea;

        case 30: // '\036'
            return 0x7f0204ec;

        case 31: // '\037'
            return 0x7f0204ed;

        case 32: // ' '
            return 0x7f0204ee;

        case 33: // '!'
            return 0x7f0204ef;

        case 34: // '"'
            return 0x7f0204f0;

        case 35: // '#'
            return 0x7f0204f1;

        case 36: // '$'
            return 0x7f0204f2;

        case 37: // '%'
            return 0x7f0204f3;

        case 38: // '&'
            return 0x7f0204f4;

        case 39: // '\''
            return 0x7f0204f5;

        case 40: // '('
            return 0x7f0204f7;

        case 41: // ')'
            return 0x7f0204f8;

        case 42: // '*'
            return 0x7f0204f9;

        case 43: // '+'
            return 0x7f0204fa;

        case 44: // ','
            return 0x7f0204fb;

        case 45: // '-'
            return 0x7f0204fc;

        case 46: // '.'
            return 0x7f0204fd;

        case 47: // '/'
            return 0x7f0204fe;

        case 48: // '0'
            return 0x7f0204ff;

        case 49: // '1'
            return 0x7f020500;

        case 50: // '2'
            return 0x7f020502;

        case 51: // '3'
            return 0x7f020503;

        case 52: // '4'
            return 0x7f020504;

        case 53: // '5'
            return 0x7f020505;

        case 54: // '6'
            return 0x7f020506;

        case 55: // '7'
            return 0x7f020507;

        case 56: // '8'
            return 0x7f020508;

        case 57: // '9'
            return 0x7f020509;

        case 58: // ':'
            return 0x7f02050a;

        case 59: // ';'
            return 0x7f02050b;

        case 60: // '<'
            return 0x7f02050d;

        case 61: // '='
            return 0x7f02050e;

        case 62: // '>'
            return 0x7f02050f;

        case 63: // '?'
            return 0x7f020510;

        case 64: // '@'
            return 0x7f020511;

        case 65: // 'A'
            return 0x7f020512;

        case 66: // 'B'
            return 0x7f020513;

        case 67: // 'C'
            return 0x7f020514;

        case 68: // 'D'
            return 0x7f020515;

        case 69: // 'E'
            return 0x7f020516;

        case 70: // 'F'
            return 0x7f020518;

        case 71: // 'G'
            return 0x7f020519;

        case 72: // 'H'
            return 0x7f02051a;

        case 73: // 'I'
            return 0x7f02051b;

        case 74: // 'J'
            return 0x7f02051c;

        case 75: // 'K'
            return 0x7f02051d;

        case 76: // 'L'
            return 0x7f02051e;

        case 77: // 'M'
            return 0x7f02051f;

        case 78: // 'N'
            return 0x7f020520;

        case 79: // 'O'
            return 0x7f020521;

        case 80: // 'P'
            return 0x7f020523;

        case 81: // 'Q'
            return 0x7f020524;

        case 82: // 'R'
            return 0x7f020525;

        case 83: // 'S'
            return 0x7f020526;

        case 84: // 'T'
            return 0x7f020527;

        case 85: // 'U'
            return 0x7f020528;

        case 86: // 'V'
            return 0x7f020529;

        case 87: // 'W'
            return 0x7f02052a;

        case 88: // 'X'
            return 0x7f02052b;

        case 89: // 'Y'
            return 0x7f02052c;

        case 90: // 'Z'
            return 0x7f02052e;

        case 91: // '['
            return 0x7f02052f;

        case 92: // '\\'
            return 0x7f020530;

        case 93: // ']'
            return 0x7f020531;

        case 94: // '^'
            return 0x7f020532;

        case 95: // '_'
            return 0x7f020533;

        case 96: // '`'
            return 0x7f020534;

        case 97: // 'a'
            return 0x7f020535;

        case 98: // 'b'
            return 0x7f020536;

        case 99: // 'c'
            return 0x7f020537;

        case 100: // 'd'
            return 0x7f0204a4;

        case 101: // 'e'
            return 0x7f0204a5;

        case 102: // 'f'
            return 0x7f0204a6;

        case 103: // 'g'
            return 0x7f0204a7;

        case 104: // 'h'
            return 0x7f0204a8;

        case 105: // 'i'
            return 0x7f0204a9;

        case 106: // 'j'
            return 0x7f0204aa;

        case 107: // 'k'
            return 0x7f0204ab;

        case 108: // 'l'
            return 0x7f0204ac;

        case 109: // 'm'
            return 0x7f0204ad;

        case 110: // 'n'
            return 0x7f0204af;

        case 111: // 'o'
            return 0x7f0204b0;

        case 112: // 'p'
            return 0x7f0204b1;

        case 113: // 'q'
            return 0x7f0204b2;

        case 114: // 'r'
            return 0x7f0204b3;

        case 115: // 's'
            return 0x7f0204b4;

        case 116: // 't'
            return 0x7f0204b5;

        case 117: // 'u'
            return 0x7f0204b6;

        case 118: // 'v'
            return 0x7f0204b7;

        case 119: // 'w'
            return 0x7f0204b8;

        case 120: // 'x'
            return 0x7f0204ba;

        case 121: // 'y'
            return 0x7f0204bb;

        case 122: // 'z'
            return 0x7f0204bc;

        case 123: // '{'
            return 0x7f0204bd;

        case 124: // '|'
            return 0x7f0204be;

        case 125: // '}'
            return 0x7f0204bf;

        case 126: // '~'
            return 0x7f0204c0;

        case 127: // '\177'
            return 0x7f0204c1;

        case 128: 
            return 0x7f0204c2;

        case 129: 
            return 0x7f0204c3;

        case 130: 
            return 0x7f0204c5;

        case 131: 
            return 0x7f0204c6;

        case 132: 
            return 0x7f0204c7;

        case 133: 
            return 0x7f0204c8;

        case 134: 
            return 0x7f0204c9;

        case 135: 
            return 0x7f0204ca;

        case 136: 
            return 0x7f0204cb;

        case 137: 
            return 0x7f0204cc;

        case 138: 
            return 0x7f0204cd;

        case 139: 
            return 0x7f0204ce;

        case 140: 
            return 0x7f0204d0;

        case 141: 
            return 0x7f0204d1;

        case 142: 
            return 0x7f0204d2;

        case 143: 
            return 0x7f0204d3;

        case 144: 
            return 0x7f0204d4;

        case 145: 
            return 0x7f0204d5;

        case 146: 
            return 0x7f0204d6;

        case 147: 
            return 0x7f0204d7;

        case 148: 
            return 0x7f0204d8;

        case 149: 
            return 0x7f0204d9;

        case 150: 
            return 0x7f0204db;
        }
    }

    private int a(int ai[], int i1, WeatherBean weatherbean)
    {
        return com.gau.go.launcherex.gowidget.weather.util.r.a(ai, i1, a(weatherbean));
    }

    static void a(k k1)
    {
        k1.g();
    }

    private boolean a(WeatherBean weatherbean)
    {
        if (weatherbean == null)
        {
            return true;
        }
        String s1 = weatherbean.l.j();
        String s2 = weatherbean.l.k();
        if (GoWidgetApplication.b(a.getApplicationContext()).b() && f.d())
        {
            int i1 = weatherbean.l.n();
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2, f.b(i1));
        } else
        {
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2);
        }
    }

    private void b(WeatherBean weatherbean)
    {
        String s1 = weatherbean.l.j();
        weatherbean = weatherbean.l.k();
        if (com.gau.go.launcherex.gowidget.weather.util.r.a(s1) && com.gau.go.launcherex.gowidget.weather.util.r.a(weatherbean))
        {
            try
            {
                String as[] = s1.split(":");
                k = Integer.parseInt(as[0]);
                l = Integer.parseInt(as[1]);
                weatherbean = weatherbean.split(":");
                m = Integer.parseInt(weatherbean[0]);
                n = Integer.parseInt(weatherbean[1]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WeatherBean weatherbean)
            {
                weatherbean.printStackTrace();
            }
            return;
        } else
        {
            k = 6;
            l = 0;
            m = 18;
            n = 0;
            return;
        }
    }

    static boolean b(k k1)
    {
        return k1.i();
    }

    private void c()
    {
        if (h.C.equals("notification_style_default"))
        {
            e();
            c();
        } else
        {
            if (h.C.equals("notification_style_default_black"))
            {
                Resources resources = a.getResources();
                r = p;
                s = resources.getColor(0x7f0a005e);
                t = resources.getColor(0x7f0a005f);
                u = resources.getColor(0x7f0a0060);
                v = 0x7f020397;
                return;
            }
            if (h.C.equals("notification_style_default_white"))
            {
                Resources resources1 = a.getResources();
                r = o;
                s = resources1.getColor(0x7f0a0061);
                t = resources1.getColor(0x7f0a0062);
                u = resources1.getColor(0x7f0a0063);
                v = 0x7f020396;
                return;
            }
        }
    }

    private void d()
    {
        c c1 = com.gau.go.launcherex.gowidget.weather.c.c.a(a.getApplicationContext());
        e = c1.h();
        f = c1.g();
        g = c1.f();
        h = g.a();
        i = h.n;
        j = h.p;
        if (b == null)
        {
            b = new l(this);
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT");
            intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
            intentfilter.addAction("android.intent.action.TIME_SET");
            intentfilter.addAction("android.intent.action.TIME_TICK");
            intentfilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED");
            a.registerReceiver(b, intentfilter);
        }
        if (c == null)
        {
            c = (NotificationManager)a.getSystemService("notification");
        }
        if (d == null)
        {
            d = new Notification();
            d.flags = 2;
        }
    }

    private void e()
    {
        TypedArray typedarray = a.obtainStyledAttributes(0x1030068, new int[] {
            0x1010098
        });
        int i1 = typedarray.getColor(0, 0);
        typedarray.recycle();
        if ((0xffffff & i1) < 0x7fffff)
        {
            h.C = "notification_style_default_white";
        } else
        {
            h.C = "notification_style_default_black";
        }
        g.a("notification_style", h.C);
    }

    private void f()
    {
        if (c == null)
        {
            c = (NotificationManager)a.getSystemService("notification");
        }
        c.cancel("com.gau.go.launcherex.gowidget.weather.handler.NotifyWeatherHandler", 1);
    }

    private void g()
    {
        String s1;
        String s2;
        String s3;
        Object obj;
        int j1;
        s3 = "--";
        s2 = a.getString(0x7f0801e2);
        s1 = a.getString(0x7f080514);
        j1 = r[0];
        obj = (WeatherBean)e.c().get(i);
        if (obj == null) goto _L2; else goto _L1
_L1:
        String s4;
        String s5;
        int i1;
        int k1;
label0:
        {
            b(((WeatherBean) (obj)));
            s5 = ((WeatherBean) (obj)).d();
            j1 = a(r, ((WeatherBean) (obj)).l.d(), ((WeatherBean) (obj)));
            i1 = h.g;
            if (i1 == 1)
            {
                s1 = "\260C";
            } else
            {
                s1 = "\260F";
            }
            k1 = com.gau.go.launcherex.gowidget.weather.util.q.a(((WeatherBean) (obj)).l.a(i1));
            s2 = com.gau.go.launcherex.gowidget.weather.util.r.a(a, ((WeatherBean) (obj)).l.f());
            if (!TextUtils.isEmpty(s2))
            {
                s3 = s2;
                if (!s2.equals("-10000"))
                {
                    break label0;
                }
            }
            s3 = "--";
        }
label1:
        {
            s4 = ((WeatherBean) (obj)).l.e();
            if (!TextUtils.isEmpty(s4) && !s4.equals("--"))
            {
                s2 = s4;
                if (!s4.equals("-10000"))
                {
                    break label1;
                }
            }
            s2 = a.getString(0x7f0801e2);
        }
        i1 = a(q, ((WeatherBean) (obj)).l.d(), ((WeatherBean) (obj)));
        s4 = s1;
        s1 = s5;
_L10:
        if (k1 != -10000) goto _L4; else goto _L3
_L3:
        if (j == 1)
        {
            d.icon = 0x7f02029b;
        } else
        if (j == 0)
        {
            d.icon = i1;
        }
        s5 = "--";
_L6:
        obj = new RemoteViews(a.getPackageName(), 0x7f0300da);
        ((RemoteViews) (obj)).setTextColor(0x7f090475, s);
        ((RemoteViews) (obj)).setTextColor(0x7f09047c, s);
        ((RemoteViews) (obj)).setTextColor(0x7f09047d, s);
        ((RemoteViews) (obj)).setTextColor(0x7f09047a, t);
        ((RemoteViews) (obj)).setTextColor(0x7f09047b, u);
        ((RemoteViews) (obj)).setTextViewText(0x7f090475, s1);
        ((RemoteViews) (obj)).setTextViewText(0x7f09047c, s5);
        ((RemoteViews) (obj)).setTextViewText(0x7f09047d, s4);
        ((RemoteViews) (obj)).setImageViewResource(0x7f090479, j1);
        ((RemoteViews) (obj)).setTextViewText(0x7f09047a, s2);
        ((RemoteViews) (obj)).setTextViewText(0x7f09047b, s3);
        ((RemoteViews) (obj)).setImageViewResource(0x7f090474, v);
        d.contentView = ((RemoteViews) (obj));
        d.contentIntent = h();
        if (c == null)
        {
            c = (NotificationManager)a.getSystemService("notification");
        }
        c.notify("com.gau.go.launcherex.gowidget.weather.handler.NotifyWeatherHandler", 1, d);
        return;
_L4:
        if (j != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        d.icon = a(k1);
_L8:
        s5 = String.valueOf(k1);
        if (true) goto _L6; else goto _L5
_L5:
        if (j != 0) goto _L8; else goto _L7
_L7:
        d.icon = i1;
          goto _L8
_L2:
        i1 = 0x7f02029b;
        s4 = "\260";
        k1 = -10000;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private PendingIntent h()
    {
        Intent intent = WeatherDetailActivity.a(a, i, true, 11, "", -1);
        intent.addFlags(0x4000000);
        return PendingIntent.getActivity(a, 6, intent, 0x8000000);
    }

    private boolean i()
    {
        Time time = f.c();
        return time.hour == k && time.minute == l || time.hour == m && time.minute == n;
    }

    public void a()
    {
        d();
        c();
        g();
    }

    public void b()
    {
        f();
        if (b != null)
        {
            a.unregisterReceiver(b);
            b = null;
        }
        if (d != null)
        {
            d = null;
        }
        if (c != null)
        {
            c = null;
        }
    }

}
