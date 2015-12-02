// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.os.Handler;
import android.text.Editable;
import hpb;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            AddressFlowEditText

final class a extends hpb
{

    final AddressFlowEditText a;

    public final void afterTextChanged(Editable editable)
    {
        AddressFlowEditText.c(a).removeCallbacks(AddressFlowEditText.b(a));
        AddressFlowEditText.c(a).postDelayed(AddressFlowEditText.b(a), 250L);
        AddressFlowEditText.d(a);
    }

    (AddressFlowEditText addressflowedittext)
    {
        a = addressflowedittext;
        super();
    }
}
