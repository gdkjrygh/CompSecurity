// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.os.Parcel;

final class bg
    implements android.os.Parcelable.Creator
{

    bg()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new HeartbeatClient.HeartbeatClientState(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new HeartbeatClient.HeartbeatClientState[i];
    }
}
