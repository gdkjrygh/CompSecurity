// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            zzcs, zzct

private static class zzlW
    implements zzcs
{

    private IBinder zzlW;

    public IBinder asBinder()
    {
        return zzlW;
    }

    public void destroy()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        zzlW.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public zzd getView()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        zzd zzd1;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        zzlW.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        zzd1 = com.google.android.gms.dynamic..zzlW(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return zzd1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void pause()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        zzlW.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void resume()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        zzlW.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void showInterstitial()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        zzlW.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void zza(zzd zzd1, AdRequestParcel adrequestparcel, String s, zzct zzct1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (zzd1 == null) goto _L2; else goto _L1
_L1:
        zzd1 = zzd1.asBinder();
_L5:
        parcel.writeStrongBinder(zzd1);
        if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        zzd1 = obj;
        if (zzct1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        zzd1 = zzct1.asBinder();
        parcel.writeStrongBinder(zzd1);
        zzlW.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzd1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzd1;
        parcel1.recycle();
        parcel.recycle();
        throw zzd1;
          goto _L5
    }

    public void zza(zzd zzd1, AdRequestParcel adrequestparcel, String s, String s1, zzct zzct1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (zzd1 == null) goto _L2; else goto _L1
_L1:
        zzd1 = zzd1.asBinder();
_L5:
        parcel.writeStrongBinder(zzd1);
        if (adrequestparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L6:
        parcel.writeString(s);
        parcel.writeString(s1);
        zzd1 = obj;
        if (zzct1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        zzd1 = zzct1.asBinder();
        parcel.writeStrongBinder(zzd1);
        zzlW.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzd1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzd1;
        parcel1.recycle();
        parcel.recycle();
        throw zzd1;
          goto _L5
    }

    public void zza(zzd zzd1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, zzct zzct1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (zzd1 == null) goto _L2; else goto _L1
_L1:
        zzd1 = zzd1.asBinder();
_L5:
        parcel.writeStrongBinder(zzd1);
        if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adsizeparcel.writeToParcel(parcel, 0);
_L6:
        if (adrequestparcel == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L7:
        parcel.writeString(s);
        zzd1 = obj;
        if (zzct1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        zzd1 = zzct1.asBinder();
        parcel.writeStrongBinder(zzd1);
        zzlW.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzd1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzd1;
        parcel1.recycle();
        parcel.recycle();
        throw zzd1;
        parcel.writeInt(0);
          goto _L7
    }

    public void zza(zzd zzd1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, zzct zzct1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (zzd1 == null) goto _L2; else goto _L1
_L1:
        zzd1 = zzd1.asBinder();
_L5:
        parcel.writeStrongBinder(zzd1);
        if (adsizeparcel == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        adsizeparcel.writeToParcel(parcel, 0);
_L6:
        if (adrequestparcel == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L7:
        parcel.writeString(s);
        parcel.writeString(s1);
        zzd1 = obj;
        if (zzct1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        zzd1 = zzct1.asBinder();
        parcel.writeStrongBinder(zzd1);
        zzlW.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        zzd1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        zzd1;
        parcel1.recycle();
        parcel.recycle();
        throw zzd1;
        parcel.writeInt(0);
          goto _L7
    }

    RequestParcel(IBinder ibinder)
    {
        zzlW = ibinder;
    }
}
