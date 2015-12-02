// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintStream;
import java.util.Arrays;

public final class ihs extends ick
{

    boolean a;
    private final ick b;

    public ihs(ick ick1)
    {
        super(ick1);
        a = false;
        b = ick1;
    }

    private void b(Throwable throwable)
    {
        try
        {
            iia.a().b();
        }
        catch (Throwable throwable1)
        {
            c(throwable1);
        }
        try
        {
            b.a(throwable);
        }
        catch (Throwable throwable2)
        {
            if (throwable2 instanceof icz)
            {
                try
                {
                    b();
                }
                // Misplaced declaration of an exception variable
                catch (Throwable throwable2)
                {
                    try
                    {
                        iia.a().b();
                    }
                    catch (Throwable throwable4)
                    {
                        c(throwable4);
                    }
                    throw new RuntimeException("Observer.onError not implemented and error while unsubscribing.", new icr(Arrays.asList(new Throwable[] {
                        throwable, throwable2
                    }), (byte)0));
                }
                throw (icz)throwable2;
            }
            try
            {
                iia.a().b();
            }
            catch (Throwable throwable5)
            {
                c(throwable5);
            }
            try
            {
                b();
            }
            catch (Throwable throwable6)
            {
                try
                {
                    iia.a().b();
                }
                catch (Throwable throwable7)
                {
                    c(throwable7);
                }
                throw new icy("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new icr(Arrays.asList(new Throwable[] {
                    throwable, throwable2, throwable6
                }), (byte)0));
            }
            throw new icy("Error occurred when trying to propagate error to Observer.onError", new icr(Arrays.asList(new Throwable[] {
                throwable, throwable2
            }), (byte)0));
        }
        try
        {
            b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        try
        {
            iia.a().b();
        }
        catch (Throwable throwable3)
        {
            c(throwable3);
        }
        throw new icy(throwable);
    }

    private static void c(Throwable throwable)
    {
        System.err.println((new StringBuilder("RxJavaErrorHandler threw an Exception. It shouldn't. => ")).append(throwable.getMessage()).toString());
        throwable.printStackTrace();
    }

    public final void a()
    {
        if (a)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        a = true;
        b.a();
        b();
        return;
        Object obj;
        obj;
        icw.a(((Throwable) (obj)));
        b(((Throwable) (obj)));
        b();
        return;
        obj;
        b();
        throw obj;
    }

    public final void a(Object obj)
    {
        try
        {
            if (!a)
            {
                b.a(obj);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            icw.a(((Throwable) (obj)));
        }
        a(((Throwable) (obj)));
    }

    public final void a(Throwable throwable)
    {
        icw.a(throwable);
        if (!a)
        {
            a = true;
            b(throwable);
        }
    }
}
