// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class guj
    implements gud, hrt
{

    private final Object a;
    private final int b;
    private final int c;

    public guj(int i, int j, Object obj)
    {
        c = i;
        b = j;
        a = obj;
    }

    private Object b(hsf hsf1)
    {
        hsf1 = (CharSequence)hsf1.b();
        boolean flag;
        if (hsf1 != null)
        {
            int i = hsf1.length();
            if (i >= c && i <= b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return null;
        } else
        {
            return a;
        }
    }

    public final Object a(Object obj)
    {
        return b((hsf)obj);
    }

    public final boolean a(hsf hsf1)
    {
        hsf1 = (CharSequence)hsf1.b();
        return hsf1 != null && hsf1.toString().length() >= b;
    }

    public final boolean b(Object obj)
    {
        return a((hsf)obj);
    }
}
