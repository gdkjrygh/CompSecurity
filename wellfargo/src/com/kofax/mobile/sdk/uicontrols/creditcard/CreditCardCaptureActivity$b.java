// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import android.content.Intent;
import android.util.Log;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            CreditCardCaptureActivity, CreditCardSubmit

class <init>
    implements ImageCapturedListener
{

    final CreditCardCaptureActivity a;

    public void onImageCaptured(ImageCapturedEvent imagecapturedevent)
    {
        Log.i(a.a, "ImageCaptured (*)");
        com.kofax.kmc.ken.engines.data.Image image = imagecapturedevent.getImage();
        CreditCardCaptureActivity.a(a);
        imagecapturedevent = new CreditCardSubmit(CreditCardCaptureActivity.b(a));
        imagecapturedevent.a(image);
        if (CreditCardCaptureActivity.b(a) != null && !CreditCardCaptureActivity.b(a).isEmpty())
        {
            a.launchRingDialog(imagecapturedevent);
            return;
        } else
        {
            imagecapturedevent.a(unchRingDialog);
            Intent intent = new Intent();
            int i = imagecapturedevent.a(intent);
            a.setResult(i, intent);
            a.finish();
            return;
        }
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
