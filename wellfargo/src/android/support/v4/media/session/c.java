// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;

final class c
    implements android.os.Parcelable.Creator
{

    c()
    {
    }

    public MediaSessionCompat.ResultReceiverWrapper a(Parcel parcel)
    {
        return new MediaSessionCompat.ResultReceiverWrapper(parcel);
    }

    public MediaSessionCompat.ResultReceiverWrapper[] a(int i)
    {
        return new MediaSessionCompat.ResultReceiverWrapper[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
