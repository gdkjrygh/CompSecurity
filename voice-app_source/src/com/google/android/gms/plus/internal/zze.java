// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal:
//            PlusSession, zzd, zza

public class com.google.android.gms.plus.internal.zze extends zzi
{
    static final class zza
        implements com.google.android.gms.plus.Moments.LoadMomentsResult
    {

        private final Status zzOt;
        private final String zzaHn;
        private final String zzaHo;
        private final MomentBuffer zzaHp;

        public MomentBuffer getMomentBuffer()
        {
            return zzaHp;
        }

        public String getNextPageToken()
        {
            return zzaHn;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public String getUpdated()
        {
            return zzaHo;
        }

        public void release()
        {
            if (zzaHp != null)
            {
                zzaHp.release();
            }
        }

        public zza(Status status, DataHolder dataholder, String s, String s1)
        {
            zzOt = status;
            zzaHn = s;
            zzaHo = s1;
            if (dataholder != null)
            {
                status = new MomentBuffer(dataholder);
            } else
            {
                status = null;
            }
            zzaHp = status;
        }
    }

    static final class zzb
        implements com.google.android.gms.plus.People.LoadPeopleResult
    {

        private final Status zzOt;
        private final String zzaHn;
        private final PersonBuffer zzaHq;

        public String getNextPageToken()
        {
            return zzaHn;
        }

        public PersonBuffer getPersonBuffer()
        {
            return zzaHq;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public void release()
        {
            if (zzaHq != null)
            {
                zzaHq.release();
            }
        }

        public zzb(Status status, DataHolder dataholder, String s)
        {
            zzOt = status;
            zzaHn = s;
            if (dataholder != null)
            {
                status = new PersonBuffer(dataholder);
            } else
            {
                status = null;
            }
            zzaHq = status;
        }
    }

    static final class zzc extends com.google.android.gms.plus.internal.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzayZ;

        public void zzaO(Status status)
        {
            zzayZ.zzm(status);
        }

        public zzc(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzayZ = zzb1;
        }
    }

    static final class zzd extends com.google.android.gms.plus.internal.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzayZ;

        public void zza(DataHolder dataholder, String s, String s1)
        {
            Object obj;
            Status status;
            if (dataholder.zznb() != null)
            {
                obj = (PendingIntent)dataholder.zznb().getParcelable("pendingIntent");
            } else
            {
                obj = null;
            }
            status = new Status(dataholder.getStatusCode(), null, ((PendingIntent) (obj)));
            obj = dataholder;
            if (!status.isSuccess())
            {
                obj = dataholder;
                if (dataholder != null)
                {
                    if (!dataholder.isClosed())
                    {
                        dataholder.close();
                    }
                    obj = null;
                }
            }
            zzayZ.zzm(new zza(status, ((DataHolder) (obj)), s, s1));
        }

        public zzd(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzayZ = zzb1;
        }
    }

    static final class zze extends com.google.android.gms.plus.internal.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzayZ;

        public void zza(DataHolder dataholder, String s)
        {
            Object obj;
            Status status;
            if (dataholder.zznb() != null)
            {
                obj = (PendingIntent)dataholder.zznb().getParcelable("pendingIntent");
            } else
            {
                obj = null;
            }
            status = new Status(dataholder.getStatusCode(), null, ((PendingIntent) (obj)));
            obj = dataholder;
            if (!status.isSuccess())
            {
                obj = dataholder;
                if (dataholder != null)
                {
                    if (!dataholder.isClosed())
                    {
                        dataholder.close();
                    }
                    obj = null;
                }
            }
            zzayZ.zzm(new zzb(status, ((DataHolder) (obj)), s));
        }

        public zze(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzayZ = zzb1;
        }
    }

    static final class zzf extends com.google.android.gms.plus.internal.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzayZ;

        public void zzi(int i, Bundle bundle)
        {
            if (bundle != null)
            {
                bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
            } else
            {
                bundle = null;
            }
            bundle = new Status(i, null, bundle);
            zzayZ.zzm(bundle);
        }

        public zzf(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzayZ = zzb1;
        }
    }


    private Person zzaHl;
    private final PlusSession zzaHm;

    public com.google.android.gms.plus.internal.zze(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, PlusSession plussession, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 2, connectioncallbacks, onconnectionfailedlistener, zze1);
        zzaHm = plussession;
    }

    public static boolean zze(Set set)
    {
        while (set == null || set.isEmpty() || set.size() == 1 && set.contains(new Scope("plus_one_placeholder_scope"))) 
        {
            return false;
        }
        return true;
    }

    private Bundle zzkS()
    {
        Bundle bundle = zzaHm.zzxE();
        bundle.putStringArray("request_visible_actions", zzaHm.zzxy());
        bundle.putString("auth_package", zzaHm.zzxA());
        return bundle;
    }

    public String getAccountName()
    {
        zznL();
        String s;
        try
        {
            s = ((com.google.android.gms.plus.internal.zzd)zznM()).getAccountName();
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return s;
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.plus.service.START";
    }

    public boolean requiresSignIn()
    {
        return zze(zznK().zzb(Plus.API));
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzdu(ibinder);
    }

    public ICancelToken zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, String s)
    {
        zznL();
        zzb1 = new zze(zzb1);
        try
        {
            s = ((com.google.android.gms.plus.internal.zzd)zznM()).zza(zzb1, 1, i, -1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb1.zza(DataHolder.zzbi(8), null);
            return null;
        }
        return s;
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle, int j)
    {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person"))
        {
            zzaHl = PersonEntity.zzp(bundle.getByteArray("loaded_person"));
        }
        super.zza(i, ibinder, bundle, j);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, String s, Uri uri, String s1, String s2)
    {
        zznL();
        if (zzb1 != null)
        {
            zzb1 = new zzd(zzb1);
        } else
        {
            zzb1 = null;
        }
        try
        {
            ((com.google.android.gms.plus.internal.zzd)zznM()).zza(zzb1, i, s, uri, s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb1.zza(DataHolder.zzbi(8), null, null);
        }
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, Moment moment)
    {
        zznL();
        if (zzb1 != null)
        {
            zzb1 = new zzc(zzb1);
        } else
        {
            zzb1 = null;
        }
        try
        {
            moment = SafeParcelResponse.zza((MomentEntity)moment);
            ((com.google.android.gms.plus.internal.zzd)zznM()).zza(zzb1, moment);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Moment moment) { }
        if (zzb1 == null)
        {
            throw new IllegalStateException(moment);
        } else
        {
            zzb1.zzaO(new Status(8, null, null));
            return;
        }
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, Collection collection)
    {
        zznL();
        zzb1 = new zze(zzb1);
        try
        {
            ((com.google.android.gms.plus.internal.zzd)zznM()).zza(zzb1, new ArrayList(collection));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            zzb1.zza(DataHolder.zzbi(8), null);
        }
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, String as[])
    {
        zza(zzb1, Arrays.asList(as));
    }

    public void zzdX(String s)
    {
        zznL();
        try
        {
            ((com.google.android.gms.plus.internal.zzd)zznM()).zzdX(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException(s);
        }
    }

    protected com.google.android.gms.plus.internal.zzd zzdu(IBinder ibinder)
    {
        return com.google.android.gms.plus.internal.zzd.zza.zzdt(ibinder);
    }

    public void zzi(com.google.android.gms.common.api.zza.zzb zzb1)
    {
        zza(zzb1, 20, null, null, null, "me");
    }

    public void zzj(com.google.android.gms.common.api.zza.zzb zzb1)
    {
        zznL();
        zzb1 = new zze(zzb1);
        try
        {
            ((com.google.android.gms.plus.internal.zzd)zznM()).zza(zzb1, 2, 1, -1, null);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb1.zza(DataHolder.zzbi(8), null);
        }
    }

    public void zzk(com.google.android.gms.common.api.zza.zzb zzb1)
    {
        zznL();
        zzxr();
        zzb1 = new zzf(zzb1);
        try
        {
            ((com.google.android.gms.plus.internal.zzd)zznM()).zzb(zzb1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb1.zzi(8, null);
        }
    }

    protected Bundle zzkR()
    {
        return zzkS();
    }

    protected Bundle zznN()
    {
        return zzkS();
    }

    public ICancelToken zzq(com.google.android.gms.common.api.zza.zzb zzb1, String s)
    {
        return zza(zzb1, 0, s);
    }

    public void zzxr()
    {
        zznL();
        try
        {
            zzaHl = null;
            ((com.google.android.gms.plus.internal.zzd)zznM()).zzxr();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public Person zzxu()
    {
        zznL();
        return zzaHl;
    }
}
