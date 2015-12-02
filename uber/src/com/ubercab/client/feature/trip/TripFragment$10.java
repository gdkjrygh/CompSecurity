// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import chp;
import cwm;
import n;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripFragment

final class a
    implements android.content.OnClickListener
{

    final TripFragment a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        try
        {
            a.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(a.getString(0x7f07043f))));
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            cwm.a(a.getActivity(), a.getString(0x7f0702d2));
        }
        a.d.a(n.gO);
    }

    (TripFragment tripfragment)
    {
        a = tripfragment;
        super();
    }
}
