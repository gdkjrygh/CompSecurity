// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ezq
{

    private final ezi a;
    private boolean b;

    public ezq(ezi ezi1)
    {
        a = ezi1;
    }

    public final ezi a()
    {
        return a;
    }

    public final void a(boolean flag)
    {
        b = flag;
    }

    public final boolean b()
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
            obj = (ezq)obj;
            if (b != ((ezq) (obj)).b)
            {
                return false;
            }
            if (a != ((ezq) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = a.hashCode();
        int i;
        if (b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }
}
