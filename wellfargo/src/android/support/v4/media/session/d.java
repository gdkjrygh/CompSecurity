// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;

final class d
    implements android.os.Parcelable.Creator
{

    d()
    {
    }

    public MediaSessionCompat.Token a(Parcel parcel)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            parcel = parcel.readParcelable(null);
        } else
        {
            parcel = parcel.readStrongBinder();
        }
        return new MediaSessionCompat.Token(parcel);
    }

    public MediaSessionCompat.Token[] a(int i)
    {
        return new MediaSessionCompat.Token[i];
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
