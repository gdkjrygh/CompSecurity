// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api:
//            zza, GoogleApiClient, Status, Result

public class zzc
{
    public static abstract class zza extends com.google.android.gms.common.api.zza
        implements zzb, zzi.zze
    {

        private final Api.zzc zzXW;
        private AtomicReference zzYO;

        private void zza(RemoteException remoteexception)
        {
            zzx(new Status(8, remoteexception.getLocalizedMessage(), null));
        }

        protected abstract void zza(Api.zzb zzb1)
            throws RemoteException;

        public void zza(zzi.zzd zzd)
        {
            zzYO.set(zzd);
        }

        public final void zzb(Api.zzb zzb1)
            throws DeadObjectException
        {
            try
            {
                zza(zzb1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Api.zzb zzb1)
            {
                zza(zzb1);
                throw zzb1;
            }
            // Misplaced declaration of an exception variable
            catch (Api.zzb zzb1)
            {
                zza(zzb1);
            }
        }

        protected void zzmZ()
        {
            zzi.zzd zzd = (zzi.zzd)zzYO.getAndSet(null);
            if (zzd != null)
            {
                zzd.zzc(this);
            }
        }

        public void zzn(Object obj)
        {
            super.zza((Result)obj);
        }

        public final Api.zzc zznd()
        {
            return zzXW;
        }

        public int zzng()
        {
            return 0;
        }

        public final void zzx(Status status)
        {
            boolean flag;
            if (!status.isSuccess())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.gms.common.internal.zzx.zzb(flag, "Failed result must not be success");
            zza(zzb(status));
        }

        protected zza(Api.zzc zzc1, GoogleApiClient googleapiclient)
        {
            super(((GoogleApiClient)com.google.android.gms.common.internal.zzx.zzb(googleapiclient, "GoogleApiClient must not be null")).getLooper());
            zzYO = new AtomicReference();
            zzXW = (Api.zzc)com.google.android.gms.common.internal.zzx.zzv(zzc1);
        }
    }

    public static interface zzb
    {

        public abstract void zzn(Object obj);

        public abstract void zzx(Status status);
    }

}
