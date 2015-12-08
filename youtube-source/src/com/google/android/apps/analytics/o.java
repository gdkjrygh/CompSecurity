// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import java.util.Locale;

// Referenced classes of package com.google.android.apps.analytics:
//            i, c, q, ac, 
//            d, e, ab

final class o
{

    private static String a(i j)
    {
        String s = "";
        if (j.c != null)
        {
            s = j.c;
        }
        j = s;
        if (!s.startsWith("/"))
        {
            j = (new StringBuilder("/")).append(s).toString();
        }
        return c.a(j, "UTF-8");
    }

    public static String a(i j, ab ab1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if ("__##GOOGLEPAGEVIEW##__".equals(j.d))
        {
            String s = b(j);
            Locale locale = Locale.getDefault();
            StringBuilder stringbuilder4 = new StringBuilder();
            stringbuilder4.append("/__utm.gif");
            stringbuilder4.append("?utmwv=4.9.1ma");
            stringbuilder4.append("&utmn=").append(j.a());
            if (s.length() > 0)
            {
                stringbuilder4.append("&utme=").append(s);
            }
            stringbuilder4.append("&utmcs=UTF-8");
            stringbuilder4.append(String.format("&utmsr=%dx%d", new Object[] {
                Integer.valueOf(j.h), Integer.valueOf(j.i)
            }));
            stringbuilder4.append(String.format("&utmul=%s-%s", new Object[] {
                locale.getLanguage(), locale.getCountry()
            }));
            stringbuilder4.append("&utmp=").append(a(j));
            stringbuilder4.append("&utmac=").append(j.b);
            stringbuilder4.append("&utmcc=").append(b(j, ab1));
            if (j.b() != 0)
            {
                stringbuilder4.append("&utmhid=").append(j.b());
            }
            stringbuilder.append(stringbuilder4.toString());
        } else
        if ("__##GOOGLEITEM##__".equals(j.d))
        {
            StringBuilder stringbuilder1 = new StringBuilder();
            stringbuilder1.append("/__utm.gif");
            stringbuilder1.append("?utmwv=4.9.1ma");
            stringbuilder1.append("&utmn=").append(j.a());
            stringbuilder1.append("&utmt=item");
            q q1 = j.k();
            if (q1 != null)
            {
                a(stringbuilder1, "&utmtid", q1.a());
                a(stringbuilder1, "&utmipc", q1.b());
                a(stringbuilder1, "&utmipn", q1.c());
                a(stringbuilder1, "&utmiva", q1.d());
                a(stringbuilder1, "&utmipr", q1.e());
                stringbuilder1.append("&utmiqt=");
                if (q1.f() != 0L)
                {
                    stringbuilder1.append(q1.f());
                }
            }
            stringbuilder1.append("&utmac=").append(j.b);
            stringbuilder1.append("&utmcc=").append(b(j, ab1));
            stringbuilder.append(stringbuilder1.toString());
        } else
        if ("__##GOOGLETRANSACTION##__".equals(j.d))
        {
            StringBuilder stringbuilder2 = new StringBuilder();
            stringbuilder2.append("/__utm.gif");
            stringbuilder2.append("?utmwv=4.9.1ma");
            stringbuilder2.append("&utmn=").append(j.a());
            stringbuilder2.append("&utmt=tran");
            ac ac1 = j.j();
            if (ac1 != null)
            {
                a(stringbuilder2, "&utmtid", ac1.a());
                a(stringbuilder2, "&utmtst", ac1.b());
                a(stringbuilder2, "&utmtto", ac1.c());
                a(stringbuilder2, "&utmttx", ac1.d());
                a(stringbuilder2, "&utmtsp", ac1.e());
                a(stringbuilder2, "&utmtci", "");
                a(stringbuilder2, "&utmtrg", "");
                a(stringbuilder2, "&utmtco", "");
            }
            stringbuilder2.append("&utmac=").append(j.b);
            stringbuilder2.append("&utmcc=").append(b(j, ab1));
            stringbuilder.append(stringbuilder2.toString());
        } else
        {
            Object obj = Locale.getDefault();
            StringBuilder stringbuilder3 = new StringBuilder();
            StringBuilder stringbuilder5 = new StringBuilder();
            stringbuilder5.append(String.format("5(%s*%s", new Object[] {
                c.a(a(j.d), "UTF-8"), c.a(a(j.e), "UTF-8")
            }));
            if (j.f != null)
            {
                stringbuilder5.append("*").append(c.a(a(j.f), "UTF-8"));
            }
            stringbuilder5.append(")");
            if (j.g >= 0)
            {
                stringbuilder5.append(String.format("(%d)", new Object[] {
                    Integer.valueOf(j.g)
                }));
            }
            stringbuilder5.append(b(j));
            stringbuilder3.append("/__utm.gif");
            stringbuilder3.append("?utmwv=4.9.1ma");
            stringbuilder3.append("&utmn=").append(j.a());
            stringbuilder3.append("&utmt=event");
            stringbuilder3.append("&utme=").append(stringbuilder5.toString());
            stringbuilder3.append("&utmcs=UTF-8");
            stringbuilder3.append(String.format("&utmsr=%dx%d", new Object[] {
                Integer.valueOf(j.h), Integer.valueOf(j.i)
            }));
            stringbuilder3.append(String.format("&utmul=%s-%s", new Object[] {
                ((Locale) (obj)).getLanguage(), ((Locale) (obj)).getCountry()
            }));
            obj = a(j);
            if (obj != null)
            {
                stringbuilder3.append("&utmp=").append(((String) (obj)));
            }
            stringbuilder3.append("&utmac=").append(j.b);
            stringbuilder3.append("&utmcc=").append(b(j, ab1));
            if (j.b() != 0)
            {
                stringbuilder3.append("&utmhid=").append(j.b());
            }
            stringbuilder.append(stringbuilder3.toString());
        }
        if (j.h())
        {
            stringbuilder.append("&aip=1");
        }
        if (!j.i())
        {
            stringbuilder.append((new StringBuilder("&utmht=")).append(System.currentTimeMillis()).toString());
        }
        return stringbuilder.toString();
    }

    private static String a(String s)
    {
        return s.replace("'", "'0").replace(")", "'1").replace("*", "'2").replace("!", "'3");
    }

    private static void a(StringBuilder stringbuilder, String s, double d1)
    {
        stringbuilder.append(s).append("=");
        d1 = Math.floor(d1 * 1000000D + 0.5D) / 1000000D;
        if (d1 != 0.0D)
        {
            stringbuilder.append(Double.toString(d1));
        }
    }

    private static void a(StringBuilder stringbuilder, String s, String s1)
    {
        stringbuilder.append(s).append("=");
        if (s1 != null && s1.trim().length() > 0)
        {
            stringbuilder.append(c.a(s1, "UTF-8"));
        }
    }

    private static void a(d ad[], StringBuilder stringbuilder, int j)
    {
        boolean flag;
        int k;
        stringbuilder.append(j).append("(");
        flag = true;
        k = 0;
_L9:
        boolean flag1;
        if (k >= ad.length)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        flag1 = flag;
        if (ad[k] == null) goto _L2; else goto _L1
_L1:
        d d1;
        d1 = ad[k];
        if (!flag)
        {
            stringbuilder.append("*");
        } else
        {
            flag = false;
        }
        stringbuilder.append(d1.d()).append("!");
        flag1 = flag;
        j;
        JVM INSTR tableswitch 8 11: default 104
    //                   8 127
    //                   9 151
    //                   10 108
    //                   11 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L4:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L3:
        flag1 = flag;
_L2:
        k++;
        flag = flag1;
        if (true) goto _L9; else goto _L8
_L8:
        stringbuilder.append(c.a(a(d1.b()), "UTF-8"));
        flag1 = flag;
          goto _L2
_L5:
        stringbuilder.append(c.a(a(d1.c()), "UTF-8"));
        flag1 = flag;
          goto _L2
        stringbuilder.append(d1.a());
        flag1 = flag;
          goto _L2
        stringbuilder.append(")");
        return;
    }

    private static String b(i j)
    {
        StringBuilder stringbuilder = new StringBuilder();
        j = j.j;
        if (j == null)
        {
            return "";
        }
        if (!j.b())
        {
            return "";
        } else
        {
            j = j.a();
            a(j, stringbuilder, 8);
            a(j, stringbuilder, 9);
            a(j, stringbuilder, 11);
            return stringbuilder.toString();
        }
    }

    private static String b(i j, ab ab1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("__utma=");
        stringbuilder.append("1.");
        stringbuilder.append(j.g()).append(".");
        stringbuilder.append(j.c()).append(".");
        stringbuilder.append(j.d()).append(".");
        stringbuilder.append(j.e()).append(".");
        stringbuilder.append(j.f()).append(";");
        if (ab1 != null)
        {
            stringbuilder.append("+__utmz=");
            stringbuilder.append("1.");
            stringbuilder.append(ab1.b()).append(".");
            stringbuilder.append(Integer.valueOf(ab1.c()).toString()).append(".");
            stringbuilder.append(Integer.valueOf(ab1.d()).toString()).append(".");
            stringbuilder.append(ab1.a()).append(";");
        }
        return c.a(stringbuilder.toString(), "UTF-8");
    }
}
