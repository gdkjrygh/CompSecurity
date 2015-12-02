// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class ihp
{

    private final ica a;

    private ihp(ica ica1)
    {
        a = ica1;
    }

    public static ihp a(ica ica1)
    {
        return new ihp(ica1);
    }

    private static void a(CountDownLatch countdownlatch, icl icl1)
    {
        if (countdownlatch.getCount() == 0L)
        {
            return;
        }
        try
        {
            countdownlatch.await();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CountDownLatch countdownlatch)
        {
            icl1.b();
        }
        Thread.currentThread().interrupt();
        throw new RuntimeException("Interrupted while waiting for subscription to complete.", countdownlatch);
    }

    private Object b(ica ica1)
    {
        AtomicReference atomicreference = new AtomicReference();
        AtomicReference atomicreference1 = new AtomicReference();
        CountDownLatch countdownlatch = new CountDownLatch(1);
        a(countdownlatch, ica1.b(new ick(countdownlatch, atomicreference1, atomicreference) {

            final CountDownLatch a;
            final AtomicReference b;
            final AtomicReference c;
            final ihp d;

            public final void a()
            {
                a.countDown();
            }

            public final void a(Object obj)
            {
                c.set(obj);
            }

            public final void a(Throwable throwable)
            {
                b.set(throwable);
                a.countDown();
            }

            
            {
                d = ihp.this;
                a = countdownlatch;
                b = atomicreference;
                c = atomicreference1;
                super();
            }
        }));
        if (atomicreference1.get() != null)
        {
            if (atomicreference1.get() instanceof RuntimeException)
            {
                throw (RuntimeException)atomicreference1.get();
            } else
            {
                throw new RuntimeException((Throwable)atomicreference1.get());
            }
        } else
        {
            return atomicreference.get();
        }
    }

    public final Object a()
    {
        return b(a.g());
    }
}
