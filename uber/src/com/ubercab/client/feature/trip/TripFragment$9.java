// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.content.DialogInterface;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripFragment

final class a
    implements android.content..OnClickListener
{

    final TripFragment a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }

    (TripFragment tripfragment)
    {
        a = tripfragment;
        super();
    }
}
