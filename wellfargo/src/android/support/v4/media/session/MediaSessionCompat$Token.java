// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.media.session:
//            d

public final class a
    implements Parcelable
{

    public static final android.os.iaSessionCompat.Token.a CREATOR = new d();
    private final Object a;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (android.os.iaSessionCompat.Token >= 21)
        {
            parcel.writeParcelable((Parcelable)a, i);
            return;
        } else
        {
            parcel.writeStrongBinder((IBinder)a);
            return;
        }
    }


    (Object obj)
    {
        a = obj;
    }
}
