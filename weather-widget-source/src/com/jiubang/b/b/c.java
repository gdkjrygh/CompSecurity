// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.b.b;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Calendar;
import java.util.Locale;

public class c
{

    private static final int a[] = {
        19416, 19168, 42352, 21717, 53856, 55632, 0x16554, 22176, 39632, 21970, 
        19168, 42422, 42192, 53840, 0x1d255, 46400, 54944, 44450, 38320, 0x14977, 
        18800, 42160, 46261, 27216, 27968, 0x1ab54, 11104, 38256, 21234, 18800, 
        25958, 54432, 59984, 28309, 23248, 11104, 0x186e3, 37600, 0x1c8d7, 51536, 
        54432, 0x1d8a6, 46416, 22176, 0x1a5b4, 9680, 37584, 53938, 43344, 46423, 
        27808, 46416, 0x15355, 19872, 42448, 0x14573, 21200, 43432, 59728, 27296, 
        44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 
        38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46496, 0x195a6, 
        38320, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 
        19189, 18800, 25776, 29859, 59984, 27480, 21952, 43872, 38613, 37600, 
        51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 
        43344, 46240, 47780, 44368, 21977, 19360, 42416, 0x15176, 21168, 43312, 
        31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 
        23200, 30371, 38608, 19415, 19152, 42192, 0x1d0b6, 53840, 54560, 56645, 
        46496, 22224, 21938, 18864, 42359, 42160, 43600, 0x1b255, 27936, 44448
    };
    private static final int b[] = new int[12];
    private static final int c[] = new int[30];
    private static final int d[] = new int[12];
    private static final int e[] = new int[24];
    private final int f = 348;
    private Context g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public c(Context context)
    {
        g = null;
        h = -1;
        i = -1;
        j = 0;
        k = 0;
        l = 0;
        g = context;
    }

    private int a(int i1)
    {
        if (i1 >= 0)
        {
            int l1 = a.length;
            boolean flag = false;
            int j1 = i1;
            i1 = ((flag) ? 1 : 0);
            while (i1 < l1) 
            {
                int k1 = c(a[i1]);
                if (j1 <= k1)
                {
                    return i1;
                }
                j1 -= k1;
                i1++;
            }
        }
        return -1;
    }

    private int a(int i1, int j1)
    {
        int k1 = 0;
        do
        {
            if (i1 >= j1)
            {
                return k1;
            }
            int l1 = k1;
            if (d(i1))
            {
                l1 = k1 + 1;
            }
            i1++;
            k1 = l1;
        } while (true);
    }

    private int a(long l1, int i1)
    {
        return ((long)(1 << 15 - i1) & l1) != 0L ? 30 : 29;
    }

    private boolean a(int i1, int j1, int k1)
    {
        i1 = b(i1, j1, k1);
        l = i1;
        l = l + 30;
        j1 = b(i1);
        i1 = a(i1);
        if (i1 != -1)
        {
            int l1 = a[i1];
            k1 = l1 & 0xf;
            if (k1 > 0)
            {
                i = k1 - 1;
                if ((0xf0000 & l1) == 1)
                {
                    k = 30;
                    i1 = 1;
                } else
                {
                    k = 29;
                    i1 = 1;
                }
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                i1 = 0;
                do
                {
                    if (i1 >= k1)
                    {
                        if (j1 <= k)
                        {
                            h = -1;
                            j = j1;
                            return true;
                        }
                        break;
                    }
                    int i2 = a(l1, i1);
                    if (j1 <= i2)
                    {
                        h = i1;
                        j = j1;
                        return true;
                    }
                    j1 -= i2;
                    i1++;
                } while (true);
                j1 -= k;
                i1 = k1;
            } else
            {
                i1 = 0;
            }
            while (i1 < 12) 
            {
                k1 = a(l1, i1);
                if (j1 <= k1)
                {
                    h = i1;
                    j = j1;
                    return true;
                }
                j1 -= k1;
                i1++;
            }
        }
        return false;
    }

    private boolean a(Resources resources, String s)
    {
        b(resources, s);
        c(resources, s);
        d(resources, s);
        e(resources, s);
        return true;
    }

    private int b(int i1)
    {
        if (i1 >= 0)
        {
            int k1 = a.length;
            int j1 = 0;
            while (j1 < k1) 
            {
                int l1 = c(a[j1]);
                if (i1 <= l1)
                {
                    return i1;
                }
                j1++;
                i1 -= l1;
            }
        }
        return -1;
    }

    private int b(int i1, int j1)
    {
        float f1 = i1 - 1900;
        float f2 = j1;
        return (int)((365.24200000000002D * (double)f1 + 6.2000000000000002D + 15.220000000000001D * (double)f2) - Math.sin((double)f2 * 0.26200000000000001D) * 1.8999999999999999D);
    }

    private int b(int i1, int j1, int k1)
    {
        int l1 = i1;
        if (i1 < 1900)
        {
            l1 = i1 + 1900;
        }
        k1 = ((l1 - 1900) * 365 - 30) + a(1900, l1) + e(j1) + k1;
        i1 = k1;
        if (d(l1))
        {
            i1 = k1;
            if (j1 > 1)
            {
                i1 = k1 + 1;
            }
        }
        return i1;
    }

    private void b(Resources resources, String s)
    {
        b[0] = resources.getIdentifier("lunar_Jan", "string", s);
        b[1] = resources.getIdentifier("lunar_Feb", "string", s);
        b[2] = resources.getIdentifier("lunar_Mar", "string", s);
        b[3] = resources.getIdentifier("lunar_Apr", "string", s);
        b[4] = resources.getIdentifier("lunar_May", "string", s);
        b[5] = resources.getIdentifier("lunar_Jun", "string", s);
        b[6] = resources.getIdentifier("lunar_Jul", "string", s);
        b[7] = resources.getIdentifier("lunar_Aug", "string", s);
        b[8] = resources.getIdentifier("lunar_Sep", "string", s);
        b[9] = resources.getIdentifier("lunar_Oct", "string", s);
        b[10] = resources.getIdentifier("lunar_Nov", "string", s);
        b[11] = resources.getIdentifier("lunar_Dec", "string", s);
    }

    private int c(int i1)
    {
        int j1 = 348;
        long l1;
        if ((long)(i1 & 0xf) > 0L)
        {
            if (i1 >> 16 == 1)
            {
                j1 = 378;
            } else
            {
                j1 = 377;
            }
        }
        l1 = 16L;
        do
        {
            if (l1 > 32768L)
            {
                return j1;
            }
            int k1 = j1;
            if (((long)i1 & l1) > 0L)
            {
                k1 = j1 + 1;
            }
            l1 <<= 1;
            j1 = k1;
        } while (true);
    }

    private void c(Resources resources, String s)
    {
        c[0] = resources.getIdentifier("lunar_day1", "string", s);
        c[1] = resources.getIdentifier("lunar_day2", "string", s);
        c[2] = resources.getIdentifier("lunar_day3", "string", s);
        c[3] = resources.getIdentifier("lunar_day4", "string", s);
        c[4] = resources.getIdentifier("lunar_day5", "string", s);
        c[5] = resources.getIdentifier("lunar_day6", "string", s);
        c[6] = resources.getIdentifier("lunar_day7", "string", s);
        c[7] = resources.getIdentifier("lunar_day8", "string", s);
        c[8] = resources.getIdentifier("lunar_day9", "string", s);
        c[9] = resources.getIdentifier("lunar_day10", "string", s);
        c[10] = resources.getIdentifier("lunar_day11", "string", s);
        c[11] = resources.getIdentifier("lunar_day12", "string", s);
        c[12] = resources.getIdentifier("lunar_day13", "string", s);
        c[13] = resources.getIdentifier("lunar_day14", "string", s);
        c[14] = resources.getIdentifier("lunar_day15", "string", s);
        c[15] = resources.getIdentifier("lunar_day16", "string", s);
        c[16] = resources.getIdentifier("lunar_day17", "string", s);
        c[17] = resources.getIdentifier("lunar_day18", "string", s);
        c[18] = resources.getIdentifier("lunar_day19", "string", s);
        c[19] = resources.getIdentifier("lunar_day20", "string", s);
        c[20] = resources.getIdentifier("lunar_day21", "string", s);
        c[21] = resources.getIdentifier("lunar_day22", "string", s);
        c[22] = resources.getIdentifier("lunar_day23", "string", s);
        c[23] = resources.getIdentifier("lunar_day24", "string", s);
        c[24] = resources.getIdentifier("lunar_day25", "string", s);
        c[25] = resources.getIdentifier("lunar_day26", "string", s);
        c[26] = resources.getIdentifier("lunar_day27", "string", s);
        c[27] = resources.getIdentifier("lunar_day28", "string", s);
        c[28] = resources.getIdentifier("lunar_day29", "string", s);
        c[29] = resources.getIdentifier("lunar_day30", "string", s);
    }

    private void d(Resources resources, String s)
    {
        d[0] = resources.getIdentifier("lunar_double1", "string", s);
        d[1] = resources.getIdentifier("lunar_double2", "string", s);
        d[2] = resources.getIdentifier("lunar_double3", "string", s);
        d[3] = resources.getIdentifier("lunar_double4", "string", s);
        d[4] = resources.getIdentifier("lunar_double5", "string", s);
        d[5] = resources.getIdentifier("lunar_double6", "string", s);
        d[6] = resources.getIdentifier("lunar_double7", "string", s);
        d[7] = resources.getIdentifier("lunar_double8", "string", s);
        d[8] = resources.getIdentifier("lunar_double9", "string", s);
        d[9] = resources.getIdentifier("lunar_double10", "string", s);
        d[10] = resources.getIdentifier("lunar_double11", "string", s);
        d[11] = resources.getIdentifier("lunar_double12", "string", s);
    }

    private boolean d(int i1)
    {
        return i1 % 4 == 0 && i1 % 100 != 0 || i1 % 400 == 0;
    }

    private int e(int i1)
    {
        int ai[] = new int[12];
        ai[1] = 31;
        ai[2] = 59;
        ai[3] = 90;
        ai[4] = 120;
        ai[5] = 151;
        ai[6] = 181;
        ai[7] = 212;
        ai[8] = 243;
        ai[9] = 273;
        ai[10] = 304;
        ai[11] = 334;
        return ai[i1];
    }

    private void e(Resources resources, String s)
    {
        e[0] = resources.getIdentifier("lunar_xiaohan", "string", s);
        e[1] = resources.getIdentifier("lunar_dahan", "string", s);
        e[2] = resources.getIdentifier("lunar_licun", "string", s);
        e[3] = resources.getIdentifier("lunar_yushui", "string", s);
        e[4] = resources.getIdentifier("lunar_jingzhe", "string", s);
        e[5] = resources.getIdentifier("lunar_chunfen", "string", s);
        e[6] = resources.getIdentifier("lunar_qingming", "string", s);
        e[7] = resources.getIdentifier("lunar_guyu", "string", s);
        e[8] = resources.getIdentifier("lunar_lixia", "string", s);
        e[9] = resources.getIdentifier("lunar_xiaoman", "string", s);
        e[10] = resources.getIdentifier("lunar_mangzhong", "string", s);
        e[11] = resources.getIdentifier("lunar_xiazhi", "string", s);
        e[12] = resources.getIdentifier("lunar_xiaoshu", "string", s);
        e[13] = resources.getIdentifier("lunar_dashu", "string", s);
        e[14] = resources.getIdentifier("lunar_liqiu", "string", s);
        e[15] = resources.getIdentifier("lunar_chushu", "string", s);
        e[16] = resources.getIdentifier("lunar_bailu", "string", s);
        e[17] = resources.getIdentifier("lunar_qiufen", "string", s);
        e[18] = resources.getIdentifier("lunar_hanlu", "string", s);
        e[19] = resources.getIdentifier("lunar_shuangjiang", "string", s);
        e[20] = resources.getIdentifier("lunar_lidong", "string", s);
        e[21] = resources.getIdentifier("lunar_xiaoxue", "string", s);
        e[22] = resources.getIdentifier("lunar_daxue", "string", s);
        e[23] = resources.getIdentifier("lunar_dongzhi", "string", s);
    }

    public int a(Calendar calendar)
    {
        if (!a(calendar.get(1), calendar.get(2), calendar.get(5)))
        {
            return -1;
        } else
        {
            return l;
        }
    }

    public String a(Calendar calendar, boolean flag)
    {
        int i1;
        int j1;
        i1 = calendar.get(1);
        j1 = calendar.get(2);
        if (a(i1, j1, calendar.get(5))) goto _L2; else goto _L1
_L1:
        calendar = null;
_L4:
        return calendar;
_L2:
        String s;
        Resources resources = g.getResources();
        a(resources, g.getPackageName());
        j1 = (j1 * 2) % 24;
        if (l == b(i1, j1))
        {
            return resources.getString(e[j1]);
        }
        j1++;
        if (l == b(i1, j1))
        {
            return resources.getString(e[j1]);
        }
        if (h == -1)
        {
            calendar = resources.getString(d[i]);
        } else
        {
            calendar = resources.getString(b[h]);
        }
        s = resources.getString(c[j - 1]);
        if (resources.getConfiguration().locale.getLanguage().equals("ko"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            return (new StringBuilder(String.valueOf(calendar))).append(s).toString();
        }
        if (j != 1)
        {
            return s;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            return (new StringBuilder(String.valueOf(calendar))).append(".").append(s).toString();
        }
        if (j != 1)
        {
            return s;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public int b(Calendar calendar)
    {
        if (!a(calendar.get(1), calendar.get(2), calendar.get(5)))
        {
            return -1;
        } else
        {
            return h;
        }
    }

    public int c(Calendar calendar)
    {
        if (!a(calendar.get(1), calendar.get(2), calendar.get(5)))
        {
            return -1;
        } else
        {
            return j;
        }
    }

}
