// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.pickupnote;

import android.text.Spanned;
import chp;
import l;

// Referenced classes of package com.ubercab.client.feature.trip.pickupnote:
//            PickupNoteComposeFragment

final class a extends android.text.e.PickupNoteComposeFragment._cls1
{

    final PickupNoteComposeFragment a;

    public final CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int i1)
    {
        charsequence = super.ter(charsequence, i, j, spanned, k, i1);
        if (charsequence != null && !PickupNoteComposeFragment.a(a))
        {
            PickupNoteComposeFragment.b(a);
            a.c.a(l.eF);
        }
        return charsequence;
    }

    (PickupNoteComposeFragment pickupnotecomposefragment, int i)
    {
        a = pickupnotecomposefragment;
        super(i);
    }
}
