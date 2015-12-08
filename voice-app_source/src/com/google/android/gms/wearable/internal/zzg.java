// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzbk

public class zzg
    implements CapabilityApi
{
    private static final class zza extends com.google.android.gms.wearable.internal.zzf
    {

        private com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzaTC;
        private String zzaTD;

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzbk)client);
        }

        protected void zza(zzbk zzbk1)
            throws RemoteException
        {
            zzbk1.zza(this, zzaTC, zzaTD);
            zzaTC = null;
            zzaTD = null;
        }

        public Status zzb(Status status)
        {
            zzaTC = null;
            zzaTD = null;
            return status;
        }

        private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
        {
            super(googleapiclient);
            zzaTC = capabilitylistener;
            zzaTD = s;
        }

    }

    public static class zzb
        implements com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult, com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult
    {

        private final Status zzOt;

        public Status getStatus()
        {
            return zzOt;
        }

        public zzb(Status status)
        {
            zzOt = status;
        }
    }

    public static class zzc
        implements CapabilityInfo
    {

        private final String mName;
        private final Set zzaTE;

        public String getName()
        {
            return mName;
        }

        public Set getNodes()
        {
            return zzaTE;
        }

        public zzc(CapabilityInfo capabilityinfo)
        {
            this(capabilityinfo.getName(), capabilityinfo.getNodes());
        }

        public zzc(String s, Set set)
        {
            mName = s;
            zzaTE = set;
        }
    }

    public static class zzd
        implements com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult
    {

        private final Status zzOt;
        private final Map zzaTF;

        public Map getAllCapabilities()
        {
            return zzaTF;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zzd(Status status, Map map)
        {
            zzOt = status;
            zzaTF = map;
        }
    }

    public static class zze
        implements com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult
    {

        private final Status zzOt;
        private final CapabilityInfo zzaTG;

        public CapabilityInfo getCapability()
        {
            return zzaTG;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zze(Status status, CapabilityInfo capabilityinfo)
        {
            zzOt = status;
            zzaTG = capabilityinfo;
        }
    }

    private static final class zzf extends com.google.android.gms.wearable.internal.zzf
    {

        private com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzaTC;
        private String zzaTD;

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzbk)client);
        }

        protected void zza(zzbk zzbk1)
            throws RemoteException
        {
            zzbk1.zzb(this, zzaTC, zzaTD);
            zzaTC = null;
            zzaTD = null;
        }

        public Status zzb(Status status)
        {
            zzaTC = null;
            zzaTD = null;
            return status;
        }

        private zzf(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
        {
            super(googleapiclient);
            zzaTC = capabilitylistener;
            zzaTD = s;
        }

    }


    public zzg()
    {
    }

    public PendingResult addCapabilityListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
    {
        return googleapiclient.zza(new zza(googleapiclient, capabilitylistener, s));
    }

    public PendingResult addLocalCapability(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new com.google.android.gms.wearable.internal.zzf(googleapiclient, s) {

            final zzg zzaTB;
            final String zzaTz;

            protected Result createFailedResult(Status status)
            {
                return zzaY(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzr(this, zzaTz);
            }

            protected com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult zzaY(Status status)
            {
                return new zzb(status);
            }

            
            {
                zzaTB = zzg.this;
                zzaTz = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getAllCapabilities(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zza(new com.google.android.gms.wearable.internal.zzf(googleapiclient, i) {

            final int zzaTA;
            final zzg zzaTB;

            protected Result createFailedResult(Status status)
            {
                return zzaX(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzd(this, zzaTA);
            }

            protected com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult zzaX(Status status)
            {
                return new zzd(status, null);
            }

            
            {
                zzaTB = zzg.this;
                zzaTA = i;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getCapability(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.zza(new com.google.android.gms.wearable.internal.zzf(googleapiclient, s, i) {

            final int zzaTA;
            final zzg zzaTB;
            final String zzaTz;

            protected Result createFailedResult(Status status)
            {
                return zzaW(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzg(this, zzaTz, zzaTA);
            }

            protected com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult zzaW(Status status)
            {
                return new zze(status, null);
            }

            
            {
                zzaTB = zzg.this;
                zzaTz = s;
                zzaTA = i;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeCapabilityListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
    {
        return googleapiclient.zza(new zzf(googleapiclient, capabilitylistener, s));
    }

    public PendingResult removeLocalCapability(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new com.google.android.gms.wearable.internal.zzf(googleapiclient, s) {

            final zzg zzaTB;
            final String zzaTz;

            protected Result createFailedResult(Status status)
            {
                return zzaZ(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzbk)client);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zzs(this, zzaTz);
            }

            protected com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult zzaZ(Status status)
            {
                return new zzb(status);
            }

            
            {
                zzaTB = zzg.this;
                zzaTz = s;
                super(googleapiclient);
            }
        });
    }
}
