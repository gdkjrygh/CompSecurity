// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            Scope

public final class Api
{
    public static interface ApiOptions
    {
    }

    public static interface ApiOptions.HasOptions
        extends ApiOptions
    {
    }

    public static final class ApiOptions.NoOptions
        implements ApiOptions.NotRequiredOptions
    {

        private ApiOptions.NoOptions()
        {
        }
    }

    public static interface ApiOptions.NotRequiredOptions
        extends ApiOptions
    {
    }

    public static interface ApiOptions.Optional
        extends ApiOptions.HasOptions, ApiOptions.NotRequiredOptions
    {
    }

    public static interface Client
    {

        public abstract void connect(GoogleApiClient.ConnectionProgressReportCallbacks connectionprogressreportcallbacks);

        public abstract void disconnect();

        public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

        public abstract void getRemoteService(IAccountAccessor iaccountaccessor, Set set);

        public abstract boolean isConnected();

        public abstract boolean isConnecting();

        public abstract boolean requiresAccount();

        public abstract boolean requiresSignIn();

        public abstract void validateAccount(IAccountAccessor iaccountaccessor);
    }

    public static final class ClientKey
    {

        public ClientKey()
        {
        }
    }

    public static interface zza
    {

        public abstract int getPriority();

        public abstract Client zza(Context context, Looper looper, zze zze, Object obj, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener);
    }

    public static interface zzb
    {

        public abstract String getServiceDescriptor();

        public abstract String getStartServiceAction();

        public abstract IInterface zzT(IBinder ibinder);
    }

    public static interface zzc
    {

        public abstract zzb zzl(Object obj);

        public abstract int zzmu();
    }

    public static final class zzd
    {
    }


    private final String mName;
    private final ClientKey zzVu;
    private final zza zzWi;
    private final zzc zzWj = null;
    private final zzd zzWk = null;
    private final ArrayList zzWl;

    public transient Api(String s, zza zza1, ClientKey clientkey, Scope ascope[])
    {
        zzu.zzb(zza1, "Cannot construct an Api with a null ClientBuilder");
        zzu.zzb(clientkey, "Cannot construct an Api with a null ClientKey");
        mName = s;
        zzWi = zza1;
        zzVu = clientkey;
        zzWl = new ArrayList(Arrays.asList(ascope));
    }

    public String getName()
    {
        return mName;
    }

    public zza zzmp()
    {
        boolean flag;
        if (zzWi != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return zzWi;
    }

    public zzc zzmq()
    {
        boolean flag;
        if (zzWj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return zzWj;
    }

    public List zzmr()
    {
        return zzWl;
    }

    public ClientKey zzms()
    {
        boolean flag;
        if (zzVu != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return zzVu;
    }

    public boolean zzmt()
    {
        return zzWk != null;
    }
}
