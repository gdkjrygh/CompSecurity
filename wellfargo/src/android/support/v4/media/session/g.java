// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;

final class g
    implements android.os.Parcelable.Creator
{

    g()
    {
    }

    public PlaybackStateCompat.CustomAction a(Parcel parcel)
    {
        return new PlaybackStateCompat.CustomAction(parcel, null);
    }

    public PlaybackStateCompat.CustomAction[] a(int i)
    {
        return new PlaybackStateCompat.CustomAction[i];
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
