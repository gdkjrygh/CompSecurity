// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import com.ubercab.ui.EditText;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupPromoFragment

public final class a
    implements Runnable
{

    final String a;
    final SignupPromoFragment b;

    public final void run()
    {
        if (b.isAdded())
        {
            b.mEditTextPromo.setError(a);
        }
    }

    (SignupPromoFragment signuppromofragment, String s)
    {
        b = signuppromofragment;
        a = s;
        super();
    }
}
