// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api:
//            AbstractPendingResult, GoogleApiClient, Status, Result

public class com.google.android.gms.common.api.zza
{
    public static abstract class zza extends AbstractPendingResult
        implements zzb, zzg.zze
    {

        private final Api.zzc zzPn;
        private AtomicReference zzPq;

        private void zza(RemoteException remoteexception)
        {
            zzk(new Status(8, remoteexception.getLocalizedMessage(), null));
        }

        protected void onResultConsumed()
        {
            zzg.zzc zzc = (zzg.zzc)zzPq.getAndSet(null);
            if (zzc != null)
            {
                zzc.zzc(this);
            }
        }

        protected abstract void zza(Api.zza zza1)
            throws RemoteException;

        public void zza(zzg.zzc zzc)
        {
            zzPq.set(zzc);
        }

        public final void zzb(Api.zza zza1)
            throws DeadObjectException
        {
            try
            {
                zza(zza1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Api.zza zza1)
            {
                zza(zza1);
                throw zza1;
            }
            // Misplaced declaration of an exception variable
            catch (Api.zza zza1)
            {
                zza(zza1);
            }
        }

        public void zzj(Object obj)
        {
            super.setResult((Result)obj);
        }

        public final void zzk(Status status)
        {
            boolean flag;
            if (!status.isSuccess())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzv.zzb(flag, "Failed result must not be success");
            setResult(createFailedResult(status));
        }

        public final Api.zzc zzkE()
        {
            return zzPn;
        }

        public int zzkH()
        {
            return 0;
        }

        protected zza(Api.zzc zzc, GoogleApiClient googleapiclient)
        {
            super(((GoogleApiClient)zzv.zzb(googleapiclient, "GoogleApiClient must not be null")).getLooper());
            zzPq = new AtomicReference();
            zzPn = (Api.zzc)zzv.zzr(zzc);
        }
    }

    public static interface zzb
    {

        public abstract void zzj(Object obj);
    }

}
