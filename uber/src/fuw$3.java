// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fux a;
    final fuw b;

    private drc b()
    {
        drc drc = fux.a(a).aN();
        if (drc == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return drc;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fuw fuw1, fux fux1)
    {
        b = fuw1;
        a = fux1;
        super();
    }
}
