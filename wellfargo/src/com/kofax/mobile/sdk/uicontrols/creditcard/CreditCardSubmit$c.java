// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import android.os.Looper;
import com.kofax.kmc.ken.engines.data.Image;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            CreditCardSubmit

class <init>
    implements Runnable
{

    ArrayList a;
    final CreditCardSubmit b;

    private void a(String s)
    {
        String s1 = Thread.currentThread().getName();
        System.out.format("%s: %s%n", new Object[] {
            s1, s
        });
    }

    public void run()
    {
        Looper.prepare();
        Iterator iterator;
        boolean flag;
        if (b.b != null)
        {
            try
            {
                b.b.await();
            }
            catch (InterruptedException interruptedexception)
            {
                b.a(interruptedexception.toString());
            }
        }
        iterator = a.iterator();
        flag = false;
        while (iterator.hasNext()) 
        {
            Image image = (Image)iterator.next();
            if (flag)
            {
                continue;
            }
            CountDownLatch countdownlatch = new CountDownLatch(1);
            try
            {
                b.a(image, countdownlatch);
            }
            catch (Exception exception)
            {
                b.a(exception.toString());
            }
            try
            {
                countdownlatch.await();
            }
            catch (InterruptedException interruptedexception1)
            {
                b.a(interruptedexception1.toString());
            }
            if (b.resultCode != a)
            {
                flag = true;
            }
            b.c.countDown();
        }
    }

    private (CreditCardSubmit creditcardsubmit)
    {
        b = creditcardsubmit;
        super();
    }

    b(CreditCardSubmit creditcardsubmit, b b1)
    {
        this(creditcardsubmit);
    }
}
