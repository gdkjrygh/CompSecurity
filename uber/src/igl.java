// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class igl
    implements idd
{

    private final ick a;
    private final Object b;

    private igl(ick ick1, Object obj)
    {
        a = ick1;
        b = obj;
    }

    igl(ick ick1, Object obj, byte byte0)
    {
        this(ick1, obj);
    }

    public final void a()
    {
        try
        {
            a.a(b);
        }
        catch (Throwable throwable)
        {
            a.a(throwable);
            return;
        }
        a.a();
    }
}
