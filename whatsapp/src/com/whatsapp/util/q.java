// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.content.Context;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.whatsapp.App;
import com.whatsapp.abl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

// Referenced classes of package com.whatsapp.util:
//            Log

public class q
{

    private static final String z[];

    public static int a(long l1, long l2)
    {
        Time time = new Time();
        time.set(l1);
        int i1 = (int)((time.gmtoff * 1000L + l1) / 0x5265c00L);
        time.set(l2);
        return i1 - (int)((time.gmtoff * 1000L + l2) / 0x5265c00L);
    }

    public static CharSequence a(Context context, long l1, boolean flag)
    {
        int i1 = a(System.currentTimeMillis(), l1);
        if (flag)
        {
            return context.getString(0x7f0e04a3);
        }
        if (i1 == 0)
        {
            return context.getString(0x7f0e04a6, new Object[] {
                DateUtils.formatDateTime(context, l1, 1)
            });
        }
        if (i1 == 1)
        {
            return context.getString(0x7f0e04a7, new Object[] {
                DateUtils.formatDateTime(context, l1, 1)
            });
        } else
        {
            return context.getString(0x7f0e04a5, new Object[] {
                DateUtils.getRelativeDateTimeString(context, l1, 0x5265c00L, 0x5265c00L, 0)
            });
        }
    }

    public static String a()
    {
        Date date = new Date();
        return (new SimpleDateFormat(z[7], Locale.US)).format(date);
    }

    public static String a(Context context, long l1)
    {
        return DateUtils.formatDateTime(context, l1, 0x20014);
    }

    private static String a(String s, long l1)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l1);
        String s1 = s;
        if (calendar.get(10) == 1)
        {
            s1 = s.replace(z[6], z[5]);
        }
        return s1;
    }

    public static boolean a(long l1)
    {
        return a(System.currentTimeMillis(), l1) == 0;
    }

    public static String b(Context context, long l1)
    {
        int i1;
label0:
        {
            int k1 = a(System.currentTimeMillis(), l1);
            int j1 = 0x80001;
            i1 = j1;
            if (k1 <= 0)
            {
                break label0;
            }
            if (k1 < 7)
            {
                j1 = 0x80003;
                i1 = j1;
                if (!Log.f)
                {
                    break label0;
                }
            }
            i1 = j1 | 0x10;
        }
        return DateUtils.formatDateTime(context, l1, i1);
    }

    public static boolean b(long l1, long l2)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        gregoriancalendar.setTimeInMillis(l1);
        GregorianCalendar gregoriancalendar1 = new GregorianCalendar();
        gregoriancalendar1.setTimeInMillis(l2);
        return gregoriancalendar.get(1) == gregoriancalendar1.get(1) && gregoriancalendar.get(2) == gregoriancalendar1.get(2) && gregoriancalendar.get(5) == gregoriancalendar1.get(5);
    }

    public static String c(Context context, long l1)
    {
        return DateUtils.formatDateTime(context, l1, 20);
    }

    public static String d(Context context, long l1)
    {
        String s;
label0:
        {
            boolean flag = Log.f;
            int i1 = a(System.currentTimeMillis(), l1);
            if (i1 == 0)
            {
                s = context.getString(0x7f0e0449, new Object[] {
                    g(context, l1)
                });
                if (!flag)
                {
                    break label0;
                }
            }
            if (i1 == 1)
            {
                s = context.getString(0x7f0e04b7, new Object[] {
                    g(context, l1)
                });
                if (!flag)
                {
                    break label0;
                }
            }
            if (i1 <= 30)
            {
                s = l(context, l1);
                if (!flag)
                {
                    break label0;
                }
            }
            s = a(context, l1);
        }
        context = s;
        if (z[8].equals(Locale.getDefault().getLanguage()))
        {
            context = a(s, l1);
        }
        return context;
    }

    public static CharSequence e(Context context, long l1)
    {
        int i1 = a(System.currentTimeMillis(), l1);
        if (i1 == 0)
        {
            i1 = (int)((System.currentTimeMillis() - l1) / 60000L);
            if (i1 < 1)
            {
                return (new StringBuilder()).append(context.getString(0x7f0e0215)).append(z[1]).append(DateUtils.formatDateTime(context, l1, 1)).toString();
            }
            if (i1 < 60)
            {
                return (new StringBuilder()).append(String.format(App.j.a(0x7f0d0017, i1), new Object[] {
                    Integer.valueOf(i1)
                })).append(z[4]).append(DateUtils.formatDateTime(context, l1, 1)).toString();
            } else
            {
                return (new StringBuilder()).append(context.getString(0x7f0e0448)).append(z[2]).append(DateUtils.formatDateTime(context, l1, 1)).toString();
            }
        }
        if (i1 == 1)
        {
            return (new StringBuilder()).append(context.getString(0x7f0e04b6)).append(z[3]).append(DateUtils.formatDateTime(context, l1, 1)).toString();
        } else
        {
            return DateUtils.getRelativeDateTimeString(context, l1, 0x5265c00L, 0x5265c00L, 0);
        }
    }

    public static String f(Context context, long l1)
    {
        return DateUtils.formatDateTime(context, l1, 0x80001);
    }

    public static String g(Context context, long l1)
    {
        return DateUtils.formatDateTime(context, l1, 9);
    }

    public static String h(Context context, long l1)
    {
        String s;
label0:
        {
            boolean flag = Log.f;
            int i1 = a(System.currentTimeMillis(), l1);
            if (i1 == 0)
            {
                s = context.getString(0x7f0e0449, new Object[] {
                    g(context, l1)
                });
                if (!flag)
                {
                    break label0;
                }
            }
            if (i1 == 1)
            {
                s = context.getString(0x7f0e04b7, new Object[] {
                    g(context, l1)
                });
                if (!flag)
                {
                    break label0;
                }
            }
            s = l(context, l1);
        }
        context = s;
        if (z[0].equals(Locale.getDefault().getLanguage()))
        {
            context = a(s, l1);
        }
        return context;
    }

    public static String i(Context context, long l1)
    {
        long l3 = l1 / 0x36ee80L;
        long l2 = (l1 - 0x36ee80L * l3) / 60000L;
        if (l3 == 0L)
        {
            l1 = l2;
            if (l2 == 0L)
            {
                l1 = 1L;
            }
            return String.format(App.j.a(0x7f0d0016, (int)l1), new Object[] {
                Integer.valueOf((int)l1)
            });
        }
        if (l2 == 0L)
        {
            return String.format(App.j.a(0x7f0d0011, (int)l3), new Object[] {
                Integer.valueOf((int)l3)
            });
        } else
        {
            String s = String.format(App.j.a(0x7f0d0016, (int)l2), new Object[] {
                Integer.valueOf((int)l2)
            });
            return context.getString(0x7f0e01fb, new Object[] {
                String.format(App.j.a(0x7f0d0011, (int)l3), new Object[] {
                    Integer.valueOf((int)l3)
                }), s
            });
        }
    }

    public static String j(Context context, long l1)
    {
        return SimpleDateFormat.getDateInstance().format(new Date(l1));
    }

    public static String k(Context context, long l1)
    {
        int i1 = a(System.currentTimeMillis(), l1);
        if (i1 == 0)
        {
            return g(context, l1);
        }
        if (i1 == 1)
        {
            return context.getString(0x7f0e04b6);
        } else
        {
            return a(context, l1);
        }
    }

    public static String l(Context context, long l1)
    {
        return DateUtils.formatDateTime(context, l1, 0x20015);
    }

    public static String m(Context context, long l1)
    {
        return DateUtils.formatDateTime(context, l1, 0x80011);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[9];
        obj = "(\034";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "aO";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "aO";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "aO";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "aO";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "m\016\006Q1m";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "m\016\006Q1>O";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "4\026_D\035\000\013B";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "(\034";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 280
    //                   0 303
    //                   1 310
    //                   2 317
    //                   3 324;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_324;
_L3:
        byte byte1 = 80;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 77;
          goto _L9
_L5:
        byte1 = 111;
          goto _L9
_L6:
        byte1 = 38;
          goto _L9
        byte1 = 61;
          goto _L9
    }
}
