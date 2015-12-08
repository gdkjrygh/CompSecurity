// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.KmcException;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            CreditCardSubmit

class <init>
    implements com.kofax.kmc.ken.engines.eOutListener
{

    CountDownLatch a;
    final CreditCardSubmit b;

    public void imageOut(com.kofax.kmc.ken.engines.eOutEvent eoutevent)
    {
        if (b.i != null)
        {
            b.i.imageClearBitmap();
            try
            {
                b.i.imageClearFileBuffer();
            }
            catch (KmcException kmcexception)
            {
                CreditCardSubmit.a(b, kmcexception.toString());
            }
        }
        b.i = eoutevent.getImage();
        a.countDown();
    }

    private (CreditCardSubmit creditcardsubmit)
    {
        b = creditcardsubmit;
        super();
        a = null;
    }

    a(CreditCardSubmit creditcardsubmit, a a1)
    {
        this(creditcardsubmit);
    }
}
