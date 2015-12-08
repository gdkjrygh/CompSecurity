// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.content.SharedPreferences;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            TransferService

final class j
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    final TransferService a;

    private j(TransferService transferservice)
    {
        a = transferservice;
        super();
    }

    j(TransferService transferservice, byte byte0)
    {
        this(transferservice);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if (s.equals(a.e()))
        {
            TransferService.d(a);
        } else
        {
            if (s.equals(a.f()))
            {
                TransferService.e(a);
                return;
            }
            if (s.equals(a.g()))
            {
                TransferService.f(a);
                return;
            }
            if (s.equals(a.i()))
            {
                TransferService.g(a);
                return;
            }
        }
    }
}
