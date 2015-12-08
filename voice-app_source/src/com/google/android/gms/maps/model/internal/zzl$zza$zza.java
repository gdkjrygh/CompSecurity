// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.zzm;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzl

private static class zznF
    implements zzl
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public Tile getTile(int i, int j, int k)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Tile tile = Tile.CREATOR.zzeX(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return tile;
_L2:
        tile = null;
        if (true) goto _L4; else goto _L3
_L3:
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
