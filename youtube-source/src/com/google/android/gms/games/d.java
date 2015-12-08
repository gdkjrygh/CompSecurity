// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;

// Referenced classes of package com.google.android.gms.games:
//            Player, g, PlayerEntity

public final class d extends e
    implements Player
{

    private final g xY;

    public d(DataHolder dataholder, int i)
    {
        this(dataholder, i, null);
    }

    public d(DataHolder dataholder, int i, String s)
    {
        super(dataholder, i);
        xY = new g(s);
    }

    public final int dc()
    {
        return getInteger(xY.f);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return PlayerEntity.a(this, obj);
    }

    public final Player freeze()
    {
        return new PlayerEntity(this);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final String getDisplayName()
    {
        return getString(xY.b);
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        a(xY.b, chararraybuffer);
    }

    public final Uri getHiResImageUri()
    {
        return S(xY.d);
    }

    public final Uri getIconImageUri()
    {
        return S(xY.c);
    }

    public final long getLastPlayedWithTimestamp()
    {
        if (!hasColumn(xY.g))
        {
            return -1L;
        } else
        {
            return getLong(xY.g);
        }
    }

    public final String getPlayerId()
    {
        return getString(xY.a);
    }

    public final long getRetrievedTimestamp()
    {
        return getLong(xY.e);
    }

    public final boolean hasHiResImage()
    {
        return getHiResImageUri() != null;
    }

    public final boolean hasIconImage()
    {
        return getIconImageUri() != null;
    }

    public final int hashCode()
    {
        return PlayerEntity.a(this);
    }

    public final String toString()
    {
        return PlayerEntity.b(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((PlayerEntity)freeze()).writeToParcel(parcel, i);
    }
}
