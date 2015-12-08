// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzbc;
import com.google.android.gms.internal.zzdr;
import com.google.android.gms.internal.zzdv;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzn, AdSizeParcel, zzl, zzm, 
//            zzp, zzq, AdRequestParcel, zzg

private static class zzlW
    implements zzn
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
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        zzlW.transact(2, parcel, parcel1, 0);
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

    public String getMediationAdapterClassName()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        zzlW.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean isReady()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        zzlW.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
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
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
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

    public void resume()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        zzlW.transact(6, parcel, parcel1, 0);
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
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
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

    public void stopLoading()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        zzlW.transact(10, parcel, parcel1, 0);
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

    public void zza(AdSizeParcel adsizeparcel)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        if (adsizeparcel == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        adsizeparcel.writeToParcel(parcel, 0);
_L1:
        zzlW.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        adsizeparcel;
        parcel1.recycle();
        parcel.recycle();
        throw adsizeparcel;
    }

    public void zza(zzl zzl1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        if (zzl1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzl1 = zzl1.asBinder();
_L1:
        parcel.writeStrongBinder(zzl1);
        zzlW.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzl1 = null;
          goto _L1
        zzl1;
        parcel1.recycle();
        parcel.recycle();
        throw zzl1;
    }

    public void zza(zzm zzm1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        if (zzm1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzm1 = zzm1.asBinder();
_L1:
        parcel.writeStrongBinder(zzm1);
        zzlW.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzm1 = null;
          goto _L1
        zzm1;
        parcel1.recycle();
        parcel.recycle();
        throw zzm1;
    }

    public void zza(zzp zzp1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        if (zzp1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzp1 = zzp1.asBinder();
_L1:
        parcel.writeStrongBinder(zzp1);
        zzlW.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzp1 = null;
          goto _L1
        zzp1;
        parcel1.recycle();
        parcel.recycle();
        throw zzp1;
    }

    public void zza(zzq zzq1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        if (zzq1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzq1 = zzq1.asBinder();
_L1:
        parcel.writeStrongBinder(zzq1);
        zzlW.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzq1 = null;
          goto _L1
        zzq1;
        parcel1.recycle();
        parcel.recycle();
        throw zzq1;
    }

    public void zza(zzbc zzbc1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        if (zzbc1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzbc1 = zzbc1.asBinder();
_L1:
        parcel.writeStrongBinder(zzbc1);
        zzlW.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzbc1 = null;
          goto _L1
        zzbc1;
        parcel1.recycle();
        parcel.recycle();
        throw zzbc1;
    }

    public void zza(zzdr zzdr1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        if (zzdr1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzdr1 = zzdr1.asBinder();
_L1:
        parcel.writeStrongBinder(zzdr1);
        zzlW.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzdr1 = null;
          goto _L1
        zzdr1;
        parcel1.recycle();
        parcel.recycle();
        throw zzdr1;
    }

    public void zza(zzdv zzdv1, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        if (zzdv1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        zzdv1 = zzdv1.asBinder();
_L1:
        parcel.writeStrongBinder(zzdv1);
        parcel.writeString(s);
        zzlW.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzdv1 = null;
          goto _L1
        zzdv1;
        parcel1.recycle();
        parcel.recycle();
        throw zzdv1;
    }

    public boolean zza(AdRequestParcel adrequestparcel)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        if (adrequestparcel == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        parcel.writeInt(1);
        adrequestparcel.writeToParcel(parcel, 0);
_L1:
        int i;
        zzlW.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        parcel.writeInt(0);
          goto _L1
        adrequestparcel;
        parcel1.recycle();
        parcel.recycle();
        throw adrequestparcel;
    }

    public zzd zzag()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        zzd zzd;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        zzlW.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        zzd = com.google.android.gms.dynamic.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return zzd;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public AdSizeParcel zzah()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        zzlW.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        AdSizeParcel adsizeparcel = AdSizeParcel.CREATOR.zzc(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return adsizeparcel;
_L2:
        adsizeparcel = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void zzar()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
        zzlW.transact(11, parcel, parcel1, 0);
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

    (IBinder ibinder)
    {
        zzlW = ibinder;
    }
}
