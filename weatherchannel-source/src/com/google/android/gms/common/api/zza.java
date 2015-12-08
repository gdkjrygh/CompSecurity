// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api:
//            AbstractPendingResult, GoogleApiClient, Status, Result

public class com.google.android.gms.common.api.zza
{
    public static abstract class zza extends AbstractPendingResult
        implements zzb, zzg.zze
    {

        private final Api.ClientKey zzVu;
        private AtomicReference zzWm;

        private void zza(RemoteException remoteexception)
        {
            zzr(new Status(8, remoteexception.getLocalizedMessage(), null));
        }

        protected void onResultConsumed()
        {
            zzg.zzc zzc = (zzg.zzc)zzWm.getAndSet(null);
            if (zzc != null)
            {
                zzc.zzc(this);
            }
        }

        protected abstract void zza(Api.Client client)
            throws RemoteException;

        public void zza(zzg.zzc zzc)
        {
            zzWm.set(zzc);
        }

        public final void zzb(Api.Client client)
            throws DeadObjectException
        {
            try
            {
                zza(client);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Api.Client client)
            {
                zza(client);
                throw client;
            }
            // Misplaced declaration of an exception variable
            catch (Api.Client client)
            {
                zza(client);
            }
        }

        public void zzm(Object obj)
        {
            super.setResult((Result)obj);
        }

        public final Api.ClientKey zzms()
        {
            return zzVu;
        }

        public int zzmv()
        {
            return 0;
        }

        public final void zzr(Status status)
        {
            boolean flag;
            if (!status.isSuccess())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Failed result must not be success");
            setResult(createFailedResult(status));
        }

        protected zza(Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(((GoogleApiClient)zzu.zzb(googleapiclient, "GoogleApiClient must not be null")).getLooper());
            zzWm = new AtomicReference();
            zzVu = (Api.ClientKey)zzu.zzu(clientkey);
        }
    }

    public static interface zzb
    {

        public abstract void zzm(Object obj);

        public abstract void zzr(Status status);
    }

}
