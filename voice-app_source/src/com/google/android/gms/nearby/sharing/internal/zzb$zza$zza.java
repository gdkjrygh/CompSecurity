// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.SharedContent;
import java.util.List;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            zzb

private static class zznF
    implements zzb
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public List zzxh()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        java.util.ArrayList arraylist;
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.IContentProvider");
        zznF.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        arraylist = parcel1.createTypedArrayList(SharedContent.CREATOR);
        parcel1.recycle();
        parcel.recycle();
        return arraylist;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    (IBinder ibinder)
    {
        zznF = ibinder;
    }
}
