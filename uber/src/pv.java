// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class pv
{

    private static volatile pj a;

    public static pj a()
    {
        return a;
    }

    public static void a(String s)
    {
        pw pw1 = pw.b();
        if (pw1 == null) goto _L2; else goto _L1
_L1:
        pw1.e(s);
_L4:
        pj pj1 = a;
        if (pj1 != null)
        {
            pj1.a(s);
        }
        return;
_L2:
        if (a(2))
        {
            Log.w((String)re.c.a(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(String s, Object obj)
    {
        pw pw1 = pw.b();
        if (pw1 == null) goto _L2; else goto _L1
_L1:
        pw1.e(s, obj);
_L4:
        obj = a;
        if (obj != null)
        {
            ((pj) (obj)).b(s);
        }
        return;
_L2:
        if (a(3))
        {
            if (obj != null)
            {
                obj = (new StringBuilder()).append(s).append(":").append(obj).toString();
            } else
            {
                obj = s;
            }
            Log.e((String)re.c.a(), ((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(pj pj1)
    {
        a = pj1;
    }

    private static boolean a(int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a() != null)
        {
            flag = flag1;
            if (a().a() <= i)
            {
                flag = true;
            }
        }
        return flag;
    }

    static 
    {
        a(new qy());
    }
}
