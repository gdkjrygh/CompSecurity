// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class c extends ick
{

    final ick a;
    final ier b;
    private boolean c;

    public final void a()
    {
        if (c)
        {
            return;
        }
        try
        {
            ier.a(b).a();
        }
        catch (Throwable throwable)
        {
            a(throwable);
            return;
        }
        c = true;
        a.a();
    }

    public final void a(Object obj)
    {
        if (c)
        {
            return;
        }
        try
        {
            ier.a(b).a(obj);
        }
        catch (Throwable throwable)
        {
            a(ida.a(throwable, obj));
            return;
        }
        a.a(obj);
    }

    public final void a(Throwable throwable)
    {
        icw.a(throwable);
        if (c)
        {
            return;
        }
        c = true;
        try
        {
            ier.a(b).a(throwable);
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            a.a(throwable);
            return;
        }
        a.a(throwable);
    }

    (ier ier1, ick ick1, ick ick2)
    {
        b = ier1;
        a = ick2;
        super(ick1);
        c = false;
    }
}
