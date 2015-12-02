// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.profiles;

import com.ubercab.rider.realtime.model.Profile;
import ezd;

// Referenced classes of package com.ubercab.client.feature.trip.profiles:
//            ProfilePickerDialogFragment

final class a
    implements Runnable
{

    final Profile a;
    final ProfilePickerDialogFragment b;

    public final void run()
    {
        b.dismiss();
        b.h.a(a, false);
    }

    (ProfilePickerDialogFragment profilepickerdialogfragment, Profile profile)
    {
        b = profilepickerdialogfragment;
        a = profile;
        super();
    }
}
