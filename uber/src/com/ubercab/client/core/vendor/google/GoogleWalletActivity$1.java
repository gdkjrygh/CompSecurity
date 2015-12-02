// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google;

import android.content.DialogInterface;

// Referenced classes of package com.ubercab.client.core.vendor.google:
//            GoogleWalletActivity

final class a
    implements android.content.lListener
{

    final GoogleWalletActivity a;

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.setResult(0);
        a.finish();
    }

    (GoogleWalletActivity googlewalletactivity)
    {
        a = googlewalletactivity;
        super();
    }
}
