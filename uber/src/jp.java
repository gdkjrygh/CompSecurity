// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jp
{

    public static final jp a = new jp(-1, -2);
    public static final jp b = new jp(320, 50);
    public static final jp c = new jp(300, 250);
    public static final jp d = new jp(468, 60);
    public static final jp e = new jp(728, 90);
    public static final jp f = new jp(160, 600);
    private final kk g;

    private jp(int i, int j)
    {
        this(new kk(i, j));
    }

    public jp(kk kk1)
    {
        g = kk1;
    }

    public final int a()
    {
        return g.b();
    }

    public final int b()
    {
        return g.a();
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof jp))
        {
            return false;
        } else
        {
            obj = (jp)obj;
            return g.equals(((jp) (obj)).g);
        }
    }

    public final int hashCode()
    {
        return g.hashCode();
    }

    public final String toString()
    {
        return g.toString();
    }

}
