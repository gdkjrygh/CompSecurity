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
            return zzdW(parcel);
        }

        public Object[] newArray(int i)
        {
            return zzgi(i);
        }

        public PendingCallback zzdW(Parcel parcel)
        {
            return new PendingCallback(parcel);
        }

        public PendingCallback[] zzgi(int i)
        {
            return new PendingCallback[i];
        }

    };
    final IBinder zzZQ;

    public PendingCallback(Parcel parcel)
    {
        zzZQ = parcel.readStrongBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public IBinder getIBinder()
    {
        return zzZQ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStrongBinder(zzZQ);
    }

}
