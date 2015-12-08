// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.location.places.PlacePhotoMetadata;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzf;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzd

public class zzp
    implements PlacePhotoMetadata
{

    private int mIndex;
    private final String zzaET;
    private final CharSequence zzaEU;
    private final int zzzT;
    private final int zzzU;

    public zzp(String s, int i, int j, CharSequence charsequence, int k)
    {
        zzaET = s;
        zzzT = i;
        zzzU = j;
        zzaEU = charsequence;
        mIndex = k;
    }

    static String zza(zzp zzp1)
    {
        return zzp1.zzaET;
    }

    static int zzb(zzp zzp1)
    {
        return zzp1.mIndex;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof zzp))
            {
                return false;
            }
            obj = (zzp)obj;
            if (((zzp) (obj)).zzzT != zzzT || ((zzp) (obj)).zzzU != zzzU || !zzw.equal(((zzp) (obj)).zzaET, zzaET) || !zzw.equal(((zzp) (obj)).zzaEU, zzaEU))
            {
                return false;
            }
        }
        return true;
    }

    public Object freeze()
    {
        return zzwu();
    }

    public CharSequence getAttributions()
    {
        return zzaEU;
    }

    public int getMaxHeight()
    {
        return zzzU;
    }

    public int getMaxWidth()
    {
        return zzzT;
    }

    public PendingResult getPhoto(GoogleApiClient googleapiclient)
    {
        return getScaledPhoto(googleapiclient, getMaxWidth(), getMaxHeight());
    }

    public PendingResult getScaledPhoto(GoogleApiClient googleapiclient, int i, int j)
    {
        return googleapiclient.zza(new com.google.android.gms.location.places.zzf.zza(Places.zzaDN, googleapiclient, i, j) {

            final int zzaEV;
            final int zzaEW;
            final zzp zzaEX;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzd)zzb1);
            }

            protected void zza(zzd zzd1)
                throws RemoteException
            {
                zzd1.zza(new zzf(this), zzp.zza(zzaEX), zzaEV, zzaEW, zzp.zzb(zzaEX));
            }

            
            {
                zzaEX = zzp.this;
                zzaEV = i;
                zzaEW = j;
                super(zzc, googleapiclient);
            }
        });
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(zzzT), Integer.valueOf(zzzU), zzaET, zzaEU
        });
    }

    public boolean isDataValid()
    {
        return true;
    }

    public PlacePhotoMetadata zzwu()
    {
        return this;
    }
}
