// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.commute;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.feature.commute:
//            Shape_CommuteDisclaimerStrings, CommuteDisclaimerStrings

final class I
    implements android.os.muteDisclaimerStrings._cls1
{

    private static CommuteDisclaimerStrings a(Parcel parcel)
    {
        return new Shape_CommuteDisclaimerStrings(parcel, (byte)0);
    }

    private static CommuteDisclaimerStrings[] a(int i)
    {
        return new CommuteDisclaimerStrings[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }

    I()
    {
    }
}
