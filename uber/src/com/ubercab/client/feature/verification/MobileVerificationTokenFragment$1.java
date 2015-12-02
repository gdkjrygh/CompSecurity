// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import android.text.Editable;
import hpb;

// Referenced classes of package com.ubercab.client.feature.verification:
//            MobileVerificationTokenFragment

public final class a extends hpb
{

    final MobileVerificationTokenFragment a;

    public final void afterTextChanged(Editable editable)
    {
        editable = editable.toString();
        if (editable.length() == 4)
        {
            MobileVerificationTokenFragment.a(a, editable);
        }
    }

    (MobileVerificationTokenFragment mobileverificationtokenfragment)
    {
        a = mobileverificationtokenfragment;
        super();
    }
}
