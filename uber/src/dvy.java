// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dvy extends dvx
{

    private boolean a;
    private String b;

    dvy()
    {
    }

    final dvx a(String s)
    {
        b = s;
        return this;
    }

    final dvx a(boolean flag)
    {
        a = flag;
        return this;
    }

    public final boolean a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (dvx)obj;
            if (((dvx) (obj)).a() != a())
            {
                return false;
            }
            if (((dvx) (obj)).b() == null ? b() != null : !((dvx) (obj)).b().equals(b()))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        char c;
        int i;
        if (a)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        return i ^ 0xf4243 * (c ^ 0xf4243);
    }

    public final String toString()
    {
        return (new StringBuilder("BaiduTokenEvent{success=")).append(a).append(", authCode=").append(b).append("}").toString();
    }
}
