// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.e;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.playsdk.b.d;
import java.util.Calendar;
import java.util.TimeZone;

// Referenced classes of package com.jiubang.playsdk.e:
//            c, b

public class a
{

    public static String a()
    {
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        int i;
        try
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            i = calendar.get(1);
            s = String.valueOf(calendar.get(2) + 1);
            if (s.length() <= 1)
            {
                s = (new StringBuilder()).append("0").append(s).toString();
            }
            s1 = String.valueOf(calendar.get(5));
            if (s1.length() <= 1)
            {
                s1 = (new StringBuilder()).append("0").append(s1).toString();
            }
            s2 = String.valueOf(calendar.get(11));
            if (s2.length() <= 1)
            {
                s2 = (new StringBuilder()).append("0").append(s2).toString();
            }
            s3 = String.valueOf(calendar.get(12));
            if (s3.length() <= 1)
            {
                s3 = (new StringBuilder()).append("0").append(s3).toString();
            }
            s5 = String.valueOf(calendar.get(13));
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return "0";
        }
        s4 = s5;
        if (s5.length() <= 1)
        {
            s4 = (new StringBuilder()).append("0").append(s5).toString();
        }
        s = (new StringBuilder()).append(String.valueOf(i)).append("-").append(s).append("-").append(s1).append(" ").append(s2).append(":").append(s3).append(":").append(s4).toString();
        return s;
    }

    public static String a(int i)
    {
        byte byte0 = -1;
        i;
        JVM INSTR tableswitch 80 84: default 36
    //                   80 58
    //                   81 64
    //                   82 70
    //                   83 76
    //                   84 82;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        i = byte0;
_L8:
        return (new StringBuilder()).append(i).append("").toString();
_L2:
        i = 30;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 106;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 10;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 31;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 11;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static String a(Context context, String s)
    {
        if (context == null || TextUtils.isEmpty(s))
        {
            return "2_30";
        }
        int i = com.jiubang.playsdk.f.a.a(s);
        if (!com.jiubang.playsdk.f.a.a(context, s, null))
        {
            switch (i)
            {
            default:
                return "";

            case 80: // 'P'
                return "2_30";

            case 81: // 'Q'
                return "2_106";

            case 82: // 'R'
                return "2_10";

            case 83: // 'S'
                return "2_31";

            case 84: // 'T'
                return "2_11";
            }
        }
        switch (i)
        {
        default:
            return "";

        case 80: // 'P'
            return "1_30";

        case 81: // 'Q'
            return "1_106";

        case 82: // 'R'
            return "1_10";

        case 83: // 'S'
            return "1_31";

        case 84: // 'T'
            return "1_11";
        }
    }

    public static void a(Context context)
    {
    }

    public static void a(Context context, int i, int j, long l)
    {
        a(context, a(i), "", "more", "1", (new StringBuilder()).append(j).append("").toString(), (new StringBuilder()).append(l).append("").toString(), "", "0", "", "");
    }

    public static void a(Context context, int i, int j, String s, int k)
    {
        a(context, a(i), "", "h000", "1", (new StringBuilder()).append(j).append("").toString(), (new StringBuilder()).append(s).append("").toString(), (new StringBuilder()).append(k).append("").toString(), "0", "", "");
    }

    public static void a(Context context, int i, long l, int j, int k, String s)
    {
        a(context, a(i), (new StringBuilder()).append(l).append("").toString(), "a000", "1", (new StringBuilder()).append(j).append("").toString(), (new StringBuilder()).append(s).append("").toString(), (new StringBuilder()).append(k).append("").toString(), "0", "", "");
    }

    public static void a(Context context, int i, long l, int j, long l1, int k)
    {
        a(context, a(i), (new StringBuilder()).append(l).append("").toString(), "c000", "1", (new StringBuilder()).append(j).append("").toString(), (new StringBuilder()).append(l1).append("").toString(), (new StringBuilder()).append(k).append("").toString(), "0", "", "");
    }

    public static void a(Context context, String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9)
    {
        d.a(new c(context, s, s1, s2, s3, s4, s5, s6, s7, s8, s9));
    }

    public static void b(Context context, int i, long l, int j, long l1, int k)
    {
        a(context, a(i), (new StringBuilder()).append(l).append("").toString(), "a003", "1", (new StringBuilder()).append(j).append("").toString(), (new StringBuilder()).append(l1).append("").toString(), (new StringBuilder()).append(k).append("").toString(), "0", "", "");
    }

    public static void c(Context context, int i, long l, int j, long l1, int k)
    {
        d.a(new b(context, i, l, j, l1, k));
    }
}
