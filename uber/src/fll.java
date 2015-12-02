// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class fll
{

    private String a;
    private String b;

    public fll(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final boolean c()
    {
        return !TextUtils.isEmpty(a);
    }

    public final boolean d()
    {
        return !TextUtils.isEmpty(b);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (fll)obj;
            if (a == null ? ((fll) (obj)).a != null : !a.equals(((fll) (obj)).a))
            {
                return false;
            }
            if (b == null ? ((fll) (obj)).b != null : !b.equals(((fll) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i * 31 + j;
    }
}
