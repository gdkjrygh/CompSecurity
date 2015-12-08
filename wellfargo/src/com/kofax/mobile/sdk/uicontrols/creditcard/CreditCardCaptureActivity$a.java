// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import com.kofax.kmc.kui.uicontrols.CameraInitializationEvent;
import com.kofax.kmc.kui.uicontrols.CameraInitializationListener;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.data.Flash;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            CreditCardCaptureActivity

class <init>
    implements CameraInitializationListener
{

    final CreditCardCaptureActivity a;

    public void onCameraInitialized(CameraInitializationEvent camerainitializationevent)
    {
        CreditCardCaptureActivity.c(a).setFlash(Flash.OFF);
    }

    private (CreditCardCaptureActivity creditcardcaptureactivity)
    {
        a = creditcardcaptureactivity;
        super();
    }

    a(CreditCardCaptureActivity creditcardcaptureactivity, a a1)
    {
        this(creditcardcaptureactivity);
    }
}
