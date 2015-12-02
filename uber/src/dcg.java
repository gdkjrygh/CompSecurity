// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dcg extends Enum
{

    public static final dcg a;
    public static final dcg b;
    public static final dcg c;
    public static final dcg d;
    public static final dcg e;
    public static final dcg f;
    private static final dcg h[];
    private final String g;

    private dcg(String s, int i, String s1)
    {
        super(s, i);
        g = s1;
    }

    public static dcg a(String s)
    {
        dcg adcg[] = values();
        int j = adcg.length;
        for (int i = 0; i < j; i++)
        {
            dcg dcg1 = adcg[i];
            if (s.equals(dcg1.g))
            {
                return dcg1;
            }
        }

        return a;
    }

    public static dcg valueOf(String s)
    {
        return (dcg)Enum.valueOf(dcg, s);
    }

    public static dcg[] values()
    {
        return (dcg[])h.clone();
    }

    public final String a()
    {
        return g;
    }

    static 
    {
        a = new dcg("UNKNOWN", 0, "");
        b = new dcg("CHINA", 1, "CN");
        c = new dcg("INDIA", 2, "IN");
        d = new dcg("JAPAN", 3, "JP");
        e = new dcg("KOREA", 4, "KR");
        f = new dcg("TAIWAN", 5, "TW");
        h = (new dcg[] {
            a, b, c, d, e, f
        });
    }
}
