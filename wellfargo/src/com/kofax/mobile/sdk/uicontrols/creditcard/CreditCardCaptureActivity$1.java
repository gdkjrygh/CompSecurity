// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import android.app.ProgressDialog;
import android.os.Handler;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            CreditCardSubmit, CreditCardCaptureActivity

class b
    implements Runnable
{

    final CreditCardSubmit a;
    final ProgressDialog b;
    final CreditCardCaptureActivity c;

    public void run()
    {
        a.runAndSubmit();
        b.dismiss();
        class _cls1
            implements Runnable
        {

            final CreditCardCaptureActivity._cls1 a;

            public void run()
            {
                Intent intent = new Intent();
                int i = a.a.a(intent);
                a.c.setResult(i, intent);
                a.c.finish();
            }

            _cls1()
            {
                a = CreditCardCaptureActivity._cls1.this;
                super();
            }
        }

        CreditCardCaptureActivity.d(c).post(new _cls1());
    }

    _cls1(CreditCardCaptureActivity creditcardcaptureactivity, CreditCardSubmit creditcardsubmit, ProgressDialog progressdialog)
    {
        c = creditcardcaptureactivity;
        a = creditcardsubmit;
        b = progressdialog;
        super();
    }
}
