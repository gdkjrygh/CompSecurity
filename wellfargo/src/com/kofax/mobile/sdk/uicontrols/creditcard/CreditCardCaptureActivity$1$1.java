// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import android.content.Intent;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            CreditCardSubmit, CreditCardCaptureActivity

class a
    implements Runnable
{

    final sh a;

    public void run()
    {
        Intent intent = new Intent();
        int i = a.a.a(intent);
        a.a.setResult(i, intent);
        a.a.finish();
    }

    ( )
    {
        a = ;
        super();
    }
}
