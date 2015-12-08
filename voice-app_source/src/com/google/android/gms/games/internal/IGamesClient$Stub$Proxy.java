// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.games.internal:
//            IGamesClient, PopupLocationInfoParcelable, PopupLocationInfoParcelableCreator

private static class zznF
    implements IGamesClient
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public PopupLocationInfoParcelable zzsq()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesClient");
        zznF.transact(1001, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        PopupLocationInfoParcelable popuplocationinfoparcelable = PopupLocationInfoParcelable.CREATOR.zzdD(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return popuplocationinfoparcelable;
_L2:
        popuplocationinfoparcelable = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    ble(IBinder ibinder)
    {
        zznF = ibinder;
    }
}
