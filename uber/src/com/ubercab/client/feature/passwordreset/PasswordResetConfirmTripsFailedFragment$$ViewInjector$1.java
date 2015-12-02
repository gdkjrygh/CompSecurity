// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.passwordreset;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.passwordreset:
//            PasswordResetConfirmTripsFailedFragment

final class a extends DebouncingOnClickListener
{

    final PasswordResetConfirmTripsFailedFragment a;
    final etAccount b;

    public final void doClick(View view)
    {
        a.onClickButtonResetAccount();
    }

    ( , PasswordResetConfirmTripsFailedFragment passwordresetconfirmtripsfailedfragment)
    {
        b = ;
        a = passwordresetconfirmtripsfailedfragment;
        super();
    }
}
