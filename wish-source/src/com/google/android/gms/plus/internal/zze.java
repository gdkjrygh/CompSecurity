// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.content.Context;
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
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal:
//            PlusSession, zzd, zza

public class com.google.android.gms.plus.internal.zze extends zzi
{
    static final class zzb
        implements com.google.android.gms.plus.People.LoadPeopleResult
    {

        private final Status zzKr;
        private final String zzayZ;
        private final PersonBuffer zzazc;

        public String getNextPageToken()
        {
            return zzayZ;
        }

        public PersonBuffer getPersonBuffer()
        {
            return zzazc;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        public void release()
        {
            if (zzazc != null)
            {
                zzazc.release();
            }
        }

        public zzb(Status status, DataHolder dataholder, String s)
        {
            zzKr = status;
            zzayZ = s;
            if (dataholder != null)
            {
                status = new PersonBuffer(dataholder);
            } else
            {
                status = null;
            }
            zzazc = status;
        }
    }

    static final class zze extends zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzari;

        public void zza(DataHolder dataholder, String s)
        {
            Object obj;
            Status status;
            if (dataholder.zzll() != null)
            {
                obj = (PendingIntent)dataholder.zzll().getParcelable("pendingIntent");
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
            zzari.zzj(new zzb(status, ((DataHolder) (obj)), s));
        }

        public zze(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzari = zzb1;
        }
    }

    static final class zzf extends zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzari;

        public void zzj(int i, Bundle bundle)
        {
            if (bundle != null)
            {
                bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
            } else
            {
                bundle = null;
            }
            bundle = new Status(i, null, bundle);
            zzari.zzj(bundle);
        }

        public zzf(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzari = zzb1;
        }
    }


    private Person zzayX;
    private final PlusSession zzayY;

    public com.google.android.gms.plus.internal.zze(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, PlusSession plussession, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 2, connectioncallbacks, onconnectionfailedlistener, zze1);
        zzayY = plussession;
    }

    public static boolean zze(Set set)
    {
        while (set == null || set.isEmpty() || set.size() == 1 && set.contains(new Scope("plus_one_placeholder_scope"))) 
        {
            return false;
        }
        return true;
    }

    private Bundle zzvx()
    {
        Bundle bundle = zzayY.zzvI();
        bundle.putStringArray("request_visible_actions", zzayY.zzvB());
        bundle.putString("auth_package", zzayY.zzvD());
        return bundle;
    }

    public String getAccountName()
    {
        zzlV();
        String s;
        try
        {
            s = ((zzd)zzlW()).getAccountName();
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return s;
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzcy(ibinder);
    }

    public ICancelToken zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, String s)
    {
        zzlV();
        zzb1 = new zze(zzb1);
        try
        {
            s = ((zzd)zzlW()).zza(zzb1, 1, i, -1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb1.zza(DataHolder.zzaE(8), null);
            return null;
        }
        return s;
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle)
    {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person"))
        {
            zzayX = PersonEntity.zzl(bundle.getByteArray("loaded_person"));
        }
        super.zza(i, ibinder, bundle);
    }

    protected zzd zzcy(IBinder ibinder)
    {
        return zzd.zza.zzcx(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.plus.service.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    public boolean zzjL()
    {
        return zze(zzlT().zzb(Plus.API));
    }

    protected Bundle zzjZ()
    {
        return zzvx();
    }

    public void zzk(com.google.android.gms.common.api.zza.zzb zzb1)
    {
        zzlV();
        zzvt();
        zzb1 = new zzf(zzb1);
        try
        {
            ((zzd)zzlW()).zzb(zzb1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb1.zzj(8, null);
        }
    }

    protected Bundle zzlX()
    {
        return zzvx();
    }

    public void zzvt()
    {
        zzlV();
        try
        {
            zzayX = null;
            ((zzd)zzlW()).zzvt();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public Person zzvw()
    {
        zzlV();
        return zzayX;
    }
}
