// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class esf extends Enum
{

    public static final esf a;
    private static final esf c[];
    private final String b;

    private esf(String s, String s1)
    {
        super(s, 0);
        b = s1;
    }

    public static boolean a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            esf aesf[] = values();
            int j = aesf.length;
            int i = 0;
            while (i < j) 
            {
                if (aesf[i].a().equals(s))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static esf valueOf(String s)
    {
        return (esf)Enum.valueOf(esf, s);
    }

    public static esf[] values()
    {
        return (esf[])c.clone();
    }

    public final String a()
    {
        return b;
    }

    static 
    {
        a = new esf("CONCUR", "concur");
        c = (new esf[] {
            a
        });
    }
}
