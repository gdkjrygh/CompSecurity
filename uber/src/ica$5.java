// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements icc
{

    final icd a;
    final ica b;

    private void a(ick ick1)
    {
        Object obj;
        Throwable throwable;
        try
        {
            ica.l();
            obj = (ick)ihy.a(a).a(ick1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (obj instanceof icz)
            {
                throw (icz)obj;
            } else
            {
                ick1.a(((Throwable) (obj)));
                return;
            }
        }
        ((ick) (obj)).d();
        b.a.call(obj);
        return;
        throwable;
        if (throwable instanceof icz)
        {
            throw (icz)throwable;
        }
        ((ick) (obj)).a(throwable);
        return;
    }

    public final void call(Object obj)
    {
        a((ick)obj);
    }

    (ica ica1, icd icd1)
    {
        b = ica1;
        a = icd1;
        super();
    }
}
