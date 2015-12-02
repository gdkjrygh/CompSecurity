// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class duh
{

    public static final List a = gke.a("baidu_wallet");
    private static final List b = Arrays.asList(new String[] {
        "CN", "IN"
    });

    public static boolean a(gmg gmg1)
    {
        return gmg1.a(dbf.aR);
    }

    private static boolean a(gmg gmg1, gmv gmv, String s)
    {
        if (!TextUtils.isEmpty(s) && gmg1.a(gmv))
        {
            gmg1 = gmg1.b(gmv, "countries");
            if (!TextUtils.isEmpty(gmg1))
            {
                return (new HashSet(Arrays.asList(gmg1.replaceAll("\\s+", "").split(",")))).contains(s.toUpperCase(Locale.US));
            }
        }
        return false;
    }

    public static boolean a(gmg gmg1, String s)
    {
        return gmg1.a(dbf.o) || a(gmg1, ((gmv) (dbf.ap)), s) || a(s) || c(gmg1);
    }

    public static boolean a(gmg gmg1, List list)
    {
        boolean flag;
        if (gmg1.a(dbf.ax) && gmg1.a(dbf.aQ))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return false;
        }
        gmg1 = list.iterator();
_L4:
        if (!gmg1.hasNext()) goto _L2; else goto _L1
_L1:
        if (!a((gsa)gmg1.next())) goto _L4; else goto _L3
_L3:
        boolean flag1 = true;
_L6:
        return flag1;
_L2:
        flag1 = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean a(gsa gsa1)
    {
        gsa1 = gsa1.a();
        return a.indexOf(gsa1) != -1;
    }

    private static boolean a(String s)
    {
        return s != null && b.contains(s.toUpperCase(Locale.US));
    }

    public static boolean b(gmg gmg1)
    {
        return gmg1.a(dbf.am) || gmg1.a(dbf.an);
    }

    public static boolean b(gmg gmg1, String s)
    {
        return gmg1.a(dbf.r) || a(gmg1, dbf.ap, s) || a(s) || c(gmg1);
    }

    public static boolean c(gmg gmg1)
    {
        return gmg1.a(dbf.br);
    }

    public static boolean c(gmg gmg1, String s)
    {
        return gmg1.a(dbf.aW) || gmg1.a(dbf.bs) || a(gmg1, dbf.bt, s);
    }

    public static boolean d(gmg gmg1)
    {
        return gmg1.a(dbf.aW, dbi.b) || gmg1.a(dbf.bs, dbp.b);
    }

    public static boolean e(gmg gmg1)
    {
        return gmg1.a(dbf.ar) || gmg1.a(dbf.as);
    }

}
