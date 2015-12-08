// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

// Referenced classes of package android.support.v4.media.session:
//            b, a

public final class <init>
    implements Parcelable
{

    public static final android.os.ssionCompat.QueueItem.b CREATOR = new b();
    private final MediaDescriptionCompat a;
    private final long b;

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MediaSession.QueueItem {Description=").append(a).append(", Id=").append(b).append(" }").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.writeToParcel(parcel, i);
        parcel.writeLong(b);
    }


    private (Parcel parcel)
    {
        a = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.Parcel(parcel);
        b = parcel.readLong();
    }

    b(Parcel parcel, a a1)
    {
        this(parcel);
    }
}
