// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.UsageInfo;

// Referenced classes of package com.google.android.gms.internal:
//            zziq, zzir

private static class zznF
    implements zziq
{

    private IBinder zznF;

    public IBinder asBinder()
    {
        return zznF;
    }

    public void zza(com.google.android.gms.appdatasearch.extCall.Request request, zzir zzir1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (request == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        request.writeToParcel(parcel, 0);
_L3:
        if (zzir1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        request = zzir1.asBinder();
_L4:
        parcel.writeStrongBinder(request);
        zznF.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        request;
        parcel1.recycle();
        parcel.recycle();
        throw request;
        request = null;
          goto _L4
    }

    public void zza(zzir zzir1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (zzir1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzir1 = zzir1.asBinder();
_L1:
        parcel.writeStrongBinder(zzir1);
        zznF.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzir1 = null;
          goto _L1
        zzir1;
        parcel1.recycle();
        parcel.recycle();
        throw zzir1;
    }

    public void zza(zzir zzir1, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (zzir1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        zzir1 = zzir1.asBinder();
_L1:
        parcel.writeStrongBinder(zzir1);
        parcel.writeString(s);
        parcel.writeString(s1);
        zznF.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzir1 = null;
          goto _L1
        zzir1;
        parcel1.recycle();
        parcel.recycle();
        throw zzir1;
    }

    public void zza(zzir zzir1, String s, UsageInfo ausageinfo[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (zzir1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        zzir1 = zzir1.asBinder();
_L1:
        parcel.writeStrongBinder(zzir1);
        parcel.writeString(s);
        parcel.writeTypedArray(ausageinfo, 0);
        zznF.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzir1 = null;
          goto _L1
        zzir1;
        parcel1.recycle();
        parcel.recycle();
        throw zzir1;
    }

    public void zza(zzir zzir1, boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (zzir1 == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        zzir1 = zzir1.asBinder();
_L1:
        parcel.writeStrongBinder(zzir1);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        zznF.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzir1 = null;
          goto _L1
        zzir1;
        parcel1.recycle();
        parcel.recycle();
        throw zzir1;
    }

    public void zzb(zzir zzir1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (zzir1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzir1 = zzir1.asBinder();
_L1:
        parcel.writeStrongBinder(zzir1);
        zznF.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzir1 = null;
          goto _L1
        zzir1;
        parcel1.recycle();
        parcel.recycle();
        throw zzir1;
    }

    o(IBinder ibinder)
    {
        zznF = ibinder;
    }
}
