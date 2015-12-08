// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.d;

import a.a.a.a;

// Referenced classes of package a.a.a.d:
//            b, e, a

final class f extends b
{

    private final int e;
    private final int f;

    f(a a, String s, String as[], int i, int j)
    {
        super(a, s, as);
        e = i;
        f = j;
    }

    protected a.a.a.d.a b()
    {
        return d();
    }

    protected e d()
    {
        return new e(this, b, a, (String[])c.clone(), e, f, null);
    }
}
