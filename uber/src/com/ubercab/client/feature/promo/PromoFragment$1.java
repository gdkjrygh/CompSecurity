// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo;

import com.ubercab.ui.EditText;

// Referenced classes of package com.ubercab.client.feature.promo:
//            PromoFragment

public final class a
    implements Runnable
{

    final String a;
    final PromoFragment b;

    public final void run()
    {
        if (b.isAdded())
        {
            b.mEditTextCode.setError(a);
        }
    }

    (PromoFragment promofragment, String s)
    {
        b = promofragment;
        a = s;
        super();
    }
}
