// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package flow;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package flow:
//            Backstack, Parcer

private static class parcelable
    implements Parcelable
{

    public static final android.os.able CREATOR = new android.os.Parcelable.Creator() {

        public Backstack.ParcelableEntry createFromParcel(Parcel parcel)
        {
            return new Backstack.ParcelableEntry(parcel.readLong(), parcel.readParcelable(getClass().getClassLoader()));
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Backstack.ParcelableEntry[] newArray(int i)
        {
            return new Backstack.ParcelableEntry[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final long id;
    private final Parcelable parcelable;

    public int describeContents()
    {
        return 0;
    }

    public parcelable toRealEntry(Parcer parcer)
    {
        return new parcelable(id, parcer.unwrap(parcelable), null);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(id);
        parcel.writeParcelable(parcelable, i);
    }


    _cls1(long l, Parcelable parcelable1)
    {
        id = l;
        parcelable = parcelable1;
    }
}
