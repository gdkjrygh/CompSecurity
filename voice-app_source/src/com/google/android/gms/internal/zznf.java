// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.SessionsApi;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            zzmd, zzng, zzmo

public class zznf
    implements SessionsApi
{
    private static class zza extends zzms.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(SessionReadResult sessionreadresult)
            throws RemoteException
        {
            zzOs.zzm(sessionreadresult);
        }

        private zza(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = zzb1;
        }

    }

    private static class zzb extends zzmt.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(SessionStopResult sessionstopresult)
        {
            zzOs.zzm(sessionstopresult);
        }

        private zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = zzb1;
        }

    }


    public zznf()
    {
    }

    private PendingResult zza(final GoogleApiClient final_googleapiclient, String s, String s1)
    {
        return final_googleapiclient.zzb(new zzmd.zza(s, s1) {

            final String val$name;
            final zznf zzalC;
            final String zzalD;

            protected Result createFailedResult(Status status)
            {
                return zzH(status);
            }

            protected SessionStopResult zzH(Status status)
            {
                return SessionStopResult.zzP(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmd)client);
            }

            protected void zza(zzmd zzmd1)
                throws RemoteException
            {
                zzb zzb1 = new zzb(this);
                String s2 = zzmd1.getContext().getPackageName();
                ((zzmo)zzmd1.zznM()).zza(new SessionStopRequest(name, zzalD, zzb1, s2));
            }

            
            {
                zzalC = zznf.this;
                name = s;
                zzalD = s1;
                super(final_googleapiclient);
            }
        });
    }

    public PendingResult insertSession(GoogleApiClient googleapiclient, SessionInsertRequest sessioninsertrequest)
    {
        return googleapiclient.zza(new zzmd.zzc(googleapiclient, sessioninsertrequest) {

            final zznf zzalC;
            final SessionInsertRequest zzalE;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmd)client);
            }

            protected void zza(zzmd zzmd1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzmd1.getContext().getPackageName();
                ((zzmo)zzmd1.zznM()).zza(new SessionInsertRequest(zzalE, zzng1, s));
            }

            
            {
                zzalC = zznf.this;
                zzalE = sessioninsertrequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult readSession(GoogleApiClient googleapiclient, SessionReadRequest sessionreadrequest)
    {
        return googleapiclient.zza(new zzmd.zza(googleapiclient, sessionreadrequest) {

            final zznf zzalC;
            final SessionReadRequest zzalF;

            protected Result createFailedResult(Status status)
            {
                return zzI(status);
            }

            protected SessionReadResult zzI(Status status)
            {
                return SessionReadResult.zzO(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmd)client);
            }

            protected void zza(zzmd zzmd1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s = zzmd1.getContext().getPackageName();
                ((zzmo)zzmd1.zznM()).zza(new SessionReadRequest(zzalF, zza1, s));
            }

            
            {
                zzalC = zznf.this;
                zzalF = sessionreadrequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult registerForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return zza(googleapiclient, pendingintent, 0);
    }

    public PendingResult startSession(GoogleApiClient googleapiclient, Session session)
    {
        zzu.zzb(session, "Session cannot be null");
        boolean flag;
        if (session.getEndTime(TimeUnit.MILLISECONDS) == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Cannot start a session which has already ended");
        return googleapiclient.zzb(new zzmd.zzc(googleapiclient, session) {

            final Session zzalB;
            final zznf zzalC;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmd)client);
            }

            protected void zza(zzmd zzmd1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzmd1.getContext().getPackageName();
                ((zzmo)zzmd1.zznM()).zza(new SessionStartRequest(zzalB, zzng1, s));
            }

            
            {
                zzalC = zznf.this;
                zzalB = session;
                super(googleapiclient);
            }
        });
    }

    public PendingResult stopSession(GoogleApiClient googleapiclient, String s)
    {
        return zza(googleapiclient, ((String) (null)), s);
    }

    public PendingResult unregisterForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zzmd.zzc(googleapiclient, pendingintent) {

            final zznf zzalC;
            final PendingIntent zzalv;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmd)client);
            }

            protected void zza(zzmd zzmd1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzmd1.getContext().getPackageName();
                ((zzmo)zzmd1.zznM()).zza(new SessionUnregistrationRequest(zzalv, zzng1, s));
            }

            
            {
                zzalC = zznf.this;
                zzalv = pendingintent;
                super(googleapiclient);
            }
        });
    }

    public PendingResult zza(GoogleApiClient googleapiclient, PendingIntent pendingintent, int i)
    {
        return googleapiclient.zzb(new zzmd.zzc(googleapiclient, pendingintent, i) {

            final zznf zzalC;
            final int zzalG;
            final PendingIntent zzalv;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzmd)client);
            }

            protected void zza(zzmd zzmd1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzmd1.getContext().getPackageName();
                ((zzmo)zzmd1.zznM()).zza(new SessionRegistrationRequest(zzalv, zzng1, s, zzalG));
            }

            
            {
                zzalC = zznf.this;
                zzalv = pendingintent;
                zzalG = i;
                super(googleapiclient);
            }
        });
    }
}
