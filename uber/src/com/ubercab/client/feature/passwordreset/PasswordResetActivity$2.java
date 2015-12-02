// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.passwordreset;

import android.content.DialogInterface;

// Referenced classes of package com.ubercab.client.feature.passwordreset:
//            PasswordResetActivity

final class a
    implements android.content.istener
{

    final PasswordResetActivity a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.setResult(0);
        a.finish();
    }

    (PasswordResetActivity passwordresetactivity)
    {
        a = passwordresetactivity;
        super();
    }
}
