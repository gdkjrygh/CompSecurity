// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            r, w, y, ak, 
//            aj

public final class s
{

    private final r a;
    private ak b;

    public s(r r1)
    {
        if (r1 == null)
        {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        } else
        {
            a = r1;
            b = null;
            return;
        }
    }

    public final int a()
    {
        return a.a().b();
    }

    public final aj a(int i, aj aj)
        throws y
    {
        return a.a(i, aj);
    }

    public final int b()
    {
        return a.a().c();
    }

    public final ak c()
        throws y
    {
        if (b == null)
        {
            b = a.b();
        }
        return b;
    }

    public final boolean d()
    {
        a.a();
        return false;
    }
}
