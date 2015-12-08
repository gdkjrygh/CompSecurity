// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            TrackingPingAuthenticationSettings

final class ax
    implements android.os.Parcelable.Creator
{

    ax()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new TrackingPingAuthenticationSettings(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new TrackingPingAuthenticationSettings[i];
    }
}
