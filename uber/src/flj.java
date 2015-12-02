// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class flj
{

    private String a;
    private String b;
    private String c;
    private String d;

    public flj(String s, String s1, String s2, String s3)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
    }

    private String b()
    {
        return a;
    }

    private String c()
    {
        return b;
    }

    private String d()
    {
        return d;
    }

    public final String a()
    {
        String s;
        String s1;
        String s2;
        String s3;
        if (b() != null)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        if (b() != null)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        if (d() != null)
        {
            s2 = "1";
        } else
        {
            s2 = "0";
        }
        if (c() != null)
        {
            s3 = "1";
        } else
        {
            s3 = "0";
        }
        return (new StringBuilder()).append(s).append(":").append(s1).append(":").append(s2).append(":").append(s3).toString();
    }
}
