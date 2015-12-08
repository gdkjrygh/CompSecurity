// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a;


final class d
{

    private final Object a;
    private final int b;

    public d(Object obj)
    {
        b = System.identityHashCode(obj);
        a = obj;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof d)
        {
            if (b == ((d) (obj = (d)obj)).b && a == ((d) (obj)).a)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return b;
    }
}
