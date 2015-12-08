// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.b;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.g.a;

// Referenced classes of package com.jiubang.commerce.b:
//            f

public class b extends com.jiubang.commerce.b.f
{

    public static String a(int i, int j)
    {
        if (i == 0)
        {
            return "500";
        }
        if (i == 1)
        {
            return "501";
        }
        if (i == 3)
        {
            return "502";
        }
        if (i == 4)
        {
            return "503";
        }
        if (i == 5)
        {
            return "504";
        }
        if (i == 6)
        {
            return "505";
        }
        if (i == 7)
        {
            return "506";
        }
        if (i == 12)
        {
            return "507";
        }
        if (i == 13)
        {
            return "508";
        }
        if (i == 14)
        {
            return "509";
        }
        if (i == 15)
        {
            return "510";
        }
        if (i == 11 || i == 2)
        {
            return "511";
        }
        if (i == 8)
        {
            return "512";
        }
        if (i == 9 || i == 10)
        {
            if (j > 0)
            {
                return "513";
            } else
            {
                return "514";
            }
        } else
        {
            return String.valueOf(i);
        }
    }

    public static String a(String s, String s1)
    {
        if (!"4".equals(s) && !"9".equals(s)) goto _L2; else goto _L1
_L1:
        if (!s1.equals("2")) goto _L4; else goto _L3
_L3:
        s1 = "1004";
_L6:
        return s1;
_L4:
        return "56";
_L2:
        if ("5".equals(s))
        {
            if (s1.equals("2"))
            {
                return "5";
            } else
            {
                return "11";
            }
        }
        if ("6".equals(s))
        {
            if (s1.equals("2"))
            {
                return "1003";
            } else
            {
                return "6";
            }
        }
        if ("7".equals(s))
        {
            if (s1.equals("2"))
            {
                return "1005";
            } else
            {
                return "26";
            }
        }
        if ("8".equals(s))
        {
            if (s1.equals("2"))
            {
                return "1007";
            } else
            {
                return "73";
            }
        }
        if ("10".equals(s))
        {
            return "47";
        }
        if ("11".equals(s))
        {
            if (s1.equals("2"))
            {
                return "1006";
            } else
            {
                return "13";
            }
        }
        if ("12".equals(s))
        {
            if (s1.equals("2"))
            {
                return "1002";
            } else
            {
                return "2";
            }
        }
        if ("13".equals(s))
        {
            if (s1.equals("2"))
            {
                return "1008";
            } else
            {
                return "83";
            }
        }
        if ("15".equals(s))
        {
            return "91";
        }
        if ("16".equals(s))
        {
            return "8";
        }
        s1 = s;
        if ("21".equals(s))
        {
            return "87";
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void a(Context context, String s, String s1, int i, f f1)
    {
        int j = f1.n();
        int k = f1.b();
        String s2 = f1.x();
        a(context, s, String.valueOf(j), s1, String.valueOf(k), a(f1.d(), f1.m()), String.valueOf(i), s2);
    }

    public static void a(Context context, String s, String s1, f f1)
    {
        int i = f1.n();
        int j = f1.b();
        String s2 = f1.x();
        a(context, s, String.valueOf(i), s1, String.valueOf(j), a(f1.d(), f1.m()), s2);
    }

    public static void a(Context context, String s, String s1, String s2, String s3, String s4)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            a(context, a(s), s1, s, 1, "", "", s2, "", s3, s4);
            return;
        }
    }

    public static void a(Context context, String s, String s1, String s2, String s3, String s4, String s5)
    {
        a(context, s, "ad_requst", 1, s1, s2, s3, s4, "", s5);
    }

    public static void a(Context context, String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        a(context, s, "ad_requst_re", 1, s1, s2, s3, s4, s5, s6);
    }

    public static void a(Context context, String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7)
    {
        if (!TextUtils.isEmpty(s))
        {
            a(context, s, "f000", 1, s1, s2, s3, s4, s5, s6);
            if (!TextUtils.isEmpty(s7))
            {
                d(context, s7);
                return;
            }
        }
    }

    public static void a(Context context, String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9)
    {
        if (!TextUtils.isEmpty(s))
        {
            a(context, s, "a000", 1, s1, s3, s4, s5, s6, s7);
            if (!TextUtils.isEmpty(s2))
            {
                a(context, a("b000"), s, s2, "b000", s1, s3, s4, s5, s6, s7, String.valueOf(105), s9);
            }
            if (!TextUtils.isEmpty(s8))
            {
                d(context, s8);
                return;
            }
        }
    }

    public static void b(Context context, String s, String s1, String s2, String s3, String s4)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            a(context, a(s), s1, s, 1, "", "", s2, "", s3, s4);
            return;
        }
    }

    public static boolean b(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            boolean flag = f.c(context, s);
            com.jiubang.commerce.ad.g.a.a(context, s);
            return flag;
        }
    }

    public static void c(Context context, String s, String s1)
    {
        if (!"sdk_inner_call".equals(s))
        {
            a(context, "", "cli_requst", 1, "", s, s1, "", "", "");
        }
    }
}
