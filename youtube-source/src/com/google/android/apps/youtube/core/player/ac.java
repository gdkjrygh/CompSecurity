// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.os.Parcel;

final class ac
    implements android.os.Parcelable.Creator
{

    ac()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new PlaybackClientManager.PlaybackClientManagerState(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlaybackClientManager.PlaybackClientManagerState[i];
    }
}
