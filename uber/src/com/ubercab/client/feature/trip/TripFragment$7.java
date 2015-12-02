// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripFragment

final class a
    implements android.content..OnClickListener
{

    final String a;
    final TripFragment b;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(a));
        b.startActivity(dialoginterface);
    }

    (TripFragment tripfragment, String s)
    {
        b = tripfragment;
        a = s;
        super();
    }
}
