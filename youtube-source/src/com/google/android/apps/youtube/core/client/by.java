// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.os.Parcel;

final class by
    implements android.os.Parcelable.Creator
{

    by()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new PlaybackTrackingUrlPingClient.PlaybackTrackingUrlPingClientState(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlaybackTrackingUrlPingClient.PlaybackTrackingUrlPingClientState[i];
    }
}
