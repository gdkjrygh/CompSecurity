// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IStreetViewPanoramaViewDelegate, IStreetViewPanoramaDelegate, zzv

public static abstract class zza.zznI extends Binder
    implements IStreetViewPanoramaViewDelegate
{
    private static class zza
        implements IStreetViewPanoramaViewDelegate
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public IStreetViewPanoramaDelegate getStreetViewPanorama()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            IStreetViewPanoramaDelegate istreetviewpanoramadelegate;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            istreetviewpanoramadelegate = IStreetViewPanoramaDelegate.zza.zzcK(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return istreetviewpanoramadelegate;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void getStreetViewPanoramaAsync(zzv zzv1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            if (zzv1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            zzv1 = zzv1.asBinder();
_L1:
            parcel.writeStrongBinder(zzv1);
            zznI.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzv1 = null;
              goto _L1
            zzv1;
            parcel1.recycle();
            parcel.recycle();
            throw zzv1;
        }

        public zzd getView()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            zznI.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            zzd1 = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void onCreate(Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
    