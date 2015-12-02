// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.verification:
//            MobileVerificationTokenFragment

final class a extends DebouncingOnClickListener
{

    final MobileVerificationTokenFragment a;
    final endToken b;

    public final void doClick(View view)
    {
        a.onClickButtonResendToken();
    }

    ( , MobileVerificationTokenFragment mobileverificationtokenfragment)
    {
        b = ;
        a = mobileverificationtokenfragment;
        super();
    }
}
