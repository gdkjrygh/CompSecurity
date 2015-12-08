// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class PendingCallback
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Object createFromParcel(Parcel parcel)
        {
            return zzei(parcel);
        }

        public Object[] newArray(int i)
        {
            return zzgu(i);
        }

        public PendingCallback zzei(Parcel parcel)
        {
            return new PendingCallback(parcel);
        }

        public PendingCallback[] zzgu(int i)
        {
            return new PendingCallback[i];
        }

    };
    final IBinder zzacE;

    public PendingCallback(Parcel parcel)
    {
        zzacE = parcel.readStrongBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public IBinder getIBinder()
    {
        return zzacE;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStrongBinder(zzacE);
    }

}
