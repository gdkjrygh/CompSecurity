// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.alipay;

import com.ubercab.client.core.vendor.alipay.model.AlipayAuthResult;
import iu;

// Referenced classes of package com.ubercab.client.core.vendor.alipay:
//            AlipayAuthorizationActivity

final class a
    implements Runnable
{

    final AlipayAuthResult a;
    final a b;

    public final void run()
    {
        AlipayAuthorizationActivity.a(b.b, a);
    }

    ( , AlipayAuthResult alipayauthresult)
    {
        b = ;
        a = alipayauthresult;
        super();
    }

    // Unreferenced inner class com/ubercab/client/core/vendor/alipay/AlipayAuthorizationActivity$1

/* anonymous class */
    final class AlipayAuthorizationActivity._cls1
        implements Runnable
    {

        final String a;
        final AlipayAuthorizationActivity b;

        public final void run()
        {
            AlipayAuthResult alipayauthresult = AlipayAuthResult.createFromRaw(b.j.a(a));
            b.runOnUiThread(new AlipayAuthorizationActivity._cls1._cls1(this, alipayauthresult));
        }

            
            {
                b = alipayauthorizationactivity;
                a = s;
                super();
            }
    }

}
