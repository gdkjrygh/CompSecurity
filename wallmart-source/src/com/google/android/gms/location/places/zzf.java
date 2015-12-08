// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacePhotoMetadataResult, PlacePhotoResult

public class zzf extends com.google.android.gms.location.places.internal.zzg.zza
{
    public static abstract class zza extends zzl.zzb
    {

        protected PlacePhotoResult zzaM(Status status)
        {
            return new PlacePhotoResult(status, null);
        }

        protected Result zzb(Status status)
        {
            return zzaM(status);
        }

        public zza(com.google.android.gms.common.api.Api.zzc zzc, GoogleApiClient googleapiclient)
        {
            super(zzc, googleapiclient);
        }
    }

    public static abstract class zzb extends zzl.zzb
    {

        protected PlacePhotoMetadataResult zzaN(Status status)
        {
            return new PlacePhotoMetadataResult(status, null);
        }

        protected Result zzb(Status status)
        {
            return zzaN(status);
        }

        public zzb(com.google.android.gms.common.api.Api.zzc zzc, GoogleApiClient googleapiclient)
        {
            super(zzc, googleapiclient);
        }
    }


    private final zzb zzaDw;
    private final zza zzaDx;

    public zzf(zza zza1)
    {
        zzaDw = null;
        zzaDx = zza1;
    }

    public zzf(zzb zzb1)
    {
        zzaDw = zzb1;
        zzaDx = null;
    }

    public void zza(PlacePhotoMetadataResult placephotometadataresult)
        throws RemoteException
    {
        zzaDw.zza(placephotometadataresult);
    }

    public void zza(PlacePhotoResult placephotoresult)
        throws RemoteException
    {
        zzaDx.zza(placephotoresult);
    }
}
