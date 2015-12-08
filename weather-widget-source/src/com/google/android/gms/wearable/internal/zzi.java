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
//            zzh, zzbn

public class zzi
    implements CapabilityApi
{
    private static final class zza extends zzh
    {

        private com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzaZE;
        private String zzaZF;

        protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
            throws RemoteException
        {
            zza((zzbn)zzb1);
        }

        protected void zza(zzbn zzbn1)
            throws RemoteException
        {
            zzbn1.zza(this, zzaZE, zzaZF);
            zzaZE = null;
            zzaZF = null;
        }

        public Result zzb(Status status)
        {
            return zzd(status);
        }

        public Status zzd(Status status)
        {
            zzaZE = null;
            zzaZF = null;
            return status;
        }

        private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
        {
            super(googleapiclient);
            zzaZE = capabilitylistener;
            zzaZF = s;
        }

    }

    public static class zzb
        implements com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult, com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult
    {

        private final Status zzQA;

        public Status getStatus()
        {
            return zzQA;
        }

        public zzb(Status status)
        {
            zzQA = status;
        }
    }

    public static class zzc
        implements CapabilityInfo
    {

        private final String mName;
        private final Set zzaZG;

        public String getName()
        {
            return mName;
        }

        public Set getNodes()
        {
            return zzaZG;
        }

        public zzc(CapabilityInfo capabilityinfo)
        {
            this(capabilityinfo.getName(), capabilityinfo.getNodes());
        }

        public zzc(String s, Set set)
        {
            mName = s;
            zzaZG = set;
        }
    }

    public static class zzd
        implements com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult
    {

        private final Status zzQA;
        private final Map zzaZH;

        public Map getAllCapabilities()
        {
            return zzaZH;
        }

        public Status getStatus()
        {
            return zzQA;
        }

        public zzd(Status status, Map map)
        {
            zzQA = status;
            zzaZH = map;
        }
    }

    public static class zze
        implements com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult
    {

        private final Status zzQA;
        private final CapabilityInfo zzaZI;

        public CapabilityInfo getCapability()
        {
            return zzaZI;
        }

        public Status getStatus()
        {
            return zzQA;
        }

        public zze(Status status, CapabilityInfo capabilityinfo)
        {
            zzQA = status;
            zzaZI = capabilityinfo;
        }
    }

    private static final class zzf extends zzh
    {

        private com.google.android.gms.wearable.CapabilityApi.CapabilityListener zzaZE;
        private String zzaZF;

        protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
            throws RemoteException
        {
            zza((zzbn)zzb1);
        }

        protected void zza(zzbn zzbn1)
            throws RemoteException
        {
            zzbn1.zzb(this, zzaZE, zzaZF);
            zzaZE = null;
            zzaZF = null;
        }

        public Result zzb(Status status)
        {
            return zzd(status);
        }

        public Status zzd(Status status)
        {
            zzaZE = null;
            zzaZF = null;
            return status;
        }

        private zzf(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
        {
            super(googleapiclient);
            zzaZE = capabilitylistener;
            zzaZF = s;
        }

    }


    public zzi()
    {
    }

    public PendingResult addCapabilityListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, String s)
    {
        return googleapiclient.zza(new zza(googleapiclient, capabilitylistener, s));
    }

    public PendingResult addLocalCapability(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new zzh(googleapiclient, s) {

            final String zzaZB;
            final zzi zzaZD;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzr(this, zzaZB);
            }

            protected Result zzb(Status status)
            {
                return zzbk(status);
            }

            protected com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult zzbk(Status status)
            {
                return new zzb(status);
            }

            
            {
                zzaZD = zzi.this;
                zzaZB = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getAllCapabilities(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zza(new zzh(googleapiclient, i) {

            final int zzaZC;
            final zzi zzaZD;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzd(this, zzaZC);
            }

            protected Result zzb(Status status)
            {
                return zzbj(status);
            }

            protected com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult zzbj(Status status)
            {
                return new zzd(status, null);
            }

            
            {
                zzaZD = zzi.this;
                zzaZC = i;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getCapability(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.zza(new zzh(googleapiclient, s, i) {

            final String zzaZB;
            final int zzaZC;
            final zzi zzaZD;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzg(this, zzaZB, zzaZC);
            }

            protected Result zzb(Status status)
            {
                return zzbi(status);
            }

            protected com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult zzbi(Status status)
            {
                return new zze(status, null);
            }

            
            {
                zzaZD = zzi.this;
                zzaZB = s;
                zzaZC = i;
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
        return googleapiclient.zza(new zzh(googleapiclient, s) {

            final String zzaZB;
            final zzi zzaZD;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzbn)zzb1);
            }

            protected void zza(zzbn zzbn1)
                throws RemoteException
            {
                zzbn1.zzs(this, zzaZB);
            }

            protected Result zzb(Status status)
            {
                return zzbl(status);
            }

            protected com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult zzbl(Status status)
            {
                return new zzb(status);
            }

            
            {
                zzaZD = zzi.this;
                zzaZB = s;
                super(googleapiclient);
            }
        });
    }
}
