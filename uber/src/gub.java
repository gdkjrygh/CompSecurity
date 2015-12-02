// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Calendar;

public final class gub
    implements gud, hrt
{

    private final Object a;

    public gub(Object obj)
    {
        a = obj;
    }

    public static boolean a(hsf hsf1)
    {
        hsf1 = (CharSequence)hsf1.b();
        return hsf1 != null && hsf1.toString().length() >= 2;
    }

    private Object b(hsf hsf1)
    {
        int i;
        boolean flag;
        flag = false;
        hsf1 = (CharSequence)hsf1.b();
        i = ((flag) ? 1 : 0);
        if (hsf1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        int j;
        i = Integer.parseInt(hsf1.toString());
        j = Calendar.getInstance().get(1);
        if (i >= j - 2000)
        {
            i = 1;
        } else
        {
            i = 0;
        }
_L2:
        if (i != 0)
        {
            return null;
        } else
        {
            return a;
        }
        hsf1;
        i = ((flag) ? 1 : 0);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final Object a(Object obj)
    {
        return b((hsf)obj);
    }

    public final boolean b(Object obj)
    {
        return a((hsf)obj);
    }
}
