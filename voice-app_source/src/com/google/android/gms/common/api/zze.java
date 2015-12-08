// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzps;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzh, Api, zzg

public class zze
    implements zzh
{
    private static class zza extends com.google.android.gms.signin.internal.zzb
    {

        private final WeakReference zzXe;

        public void zza(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
        {
            authaccountresult = (zze)zzXe.get();
            if (authaccountresult == null)
            {
                return;
            } else
            {
                zze.zzb(authaccountresult).zzXs.post(new Runnable(this, authaccountresult, connectionresult) {

                    final zze zzXf;
                    final ConnectionResult zzXg;
                    final zza zzXh;

                    public void run()
                    {
                        zze.zzc(zzXf, zzXg);
                    }

            
            {
                zzXh = zza1;
                zzXf = zze1;
                zzXg = connectionresult;
                super();
            }
                });
                return;
            }
        }

        zza(zze zze1)
        {
            zzXe = new WeakReference(zze1);
        }
    }

    private static class zzb extends com.google.android.gms.common.internal.zzq.zza
    {

        private final WeakReference zzXe;

        public void zzb(ResolveAccountResponse resolveaccountresponse)
        {
            zze zze1 = (zze)zzXe.get();
            if (zze1 == null)
            {
                return;
            } else
            {
                zze.zzb(zze1).zzXs.post(new Runnable(this, zze1, resolveaccountresponse) {

                    final zze zzXf;
                    final ResolveAccountResponse zzXi;
                    final zzb zzXj;

                    public void run()
                    {
                        zze.zza(zzXf, zzXi);
                    }

            
            {
                zzXj = zzb1;
                zzXf = zze1;
                zzXi = resolveaccountresponse;
                super();
            }
                });
                return;
            }
        }

        zzb(zze zze1)
        {
            zzXe = new WeakReference(zze1);
        }
    }

    private static class zzc
        implements GoogleApiClient.ConnectionProgressReportCallbacks
    {

        private final WeakReference zzXe;
        private final Api zzXk;
        private final int zzXl;

        public void onReportAccountValidation(ConnectionResult connectionresult)
        {
            zze zze1;
            boolean flag = true;
            zze1 = (zze)zzXe.get();
            if (zze1 == null)
            {
                return;
            }
            if (Looper.myLooper() != zze.zzb(zze1).getLooper())
            {
                flag = false;
            }
            zzu.zza(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
            zze.zza(zze1).lock();
            flag = zze.zza(zze1, 1);
            if (!flag)
            {
                zze.zza(zze1).unlock();
                return;
            }
            if (!connectionresult.isSuccess())
            {
                zze.zza(zze1, connectionresult, zzXk, zzXl);
            }
            if (zze.zzf(zze1))
            {
                zze.zzh(zze1);
            }
            zze.zza(zze1).unlock();
            return;
            connectionresult;
            zze.zza(zze1).unlock();
            throw connectionresult;
        }

        public void onReportServiceBinding(ConnectionResult connectionresult)
        {
            zze zze1;
            boolean flag = false;
            zze1 = (zze)zzXe.get();
            if (zze1 == null)
            {
                return;
            }
            if (Looper.myLooper() == zze.zzb(zze1).getLooper())
            {
                flag = true;
            }
            zzu.zza(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zze.zza(zze1).lock();
            boolean flag1 = zze.zza(zze1, 0);
            if (!flag1)
            {
                zze.zza(zze1).unlock();
                return;
            }
            if (!connectionresult.isSuccess())
            {
                zze.zza(zze1, connectionresult, zzXk, zzXl);
            }
            if (zze.zzf(zze1))
            {
                zze.zzg(zze1);
            }
            zze.zza(zze1).unlock();
            return;
            connectionresult;
            zze.zza(zze1).unlock();
            throw connectionresult;
        }

        public zzc(zze zze1, Api api, int i)
        {
            zzXe = new WeakReference(zze1);
            zzXk = api;
            zzXl = i;
        }
    }

    private class zzd
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
    {

        final zze zzXd;

        public void onConnected(Bundle bundle)
        {
            zze.zzc(zzXd).zza(new zzb(zzXd));
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zze.zza(zzXd).lock();
            if (!zze.zzb(zzXd, connectionresult)) goto _L2; else goto _L1
_L1:
            zze.zzd(zzXd);
            zze.zze(zzXd);
_L4:
            zze.zza(zzXd).unlock();
            return;
_L2:
            zze.zza(zzXd, connectionresult);
            if (true) goto _L4; else goto _L3
_L3:
            connectionresult;
            zze.zza(zzXd).unlock();
            throw connectionresult;
        }

        public void onConnectionSuspended(int i)
        {
        }

        private zzd()
        {
            zzXd = zze.this;
            super();
        }

    }


    private final Context mContext;
    private final Api.zza zzWE;
    private final zzg zzWK;
    private final Lock zzWL;
    private ConnectionResult zzWM;
    private int zzWN;
    private int zzWO;
    private boolean zzWP;
    private int zzWQ;
    private final Bundle zzWR = new Bundle();
    private final Set zzWS = new HashSet();
    private zzps zzWT;
    private int zzWU;
    private boolean zzWV;
    private boolean zzWW;
    private IAccountAccessor zzWX;
    private boolean zzWY;
    private boolean zzWZ;
    private final com.google.android.gms.common.internal.zze zzXa;
    private final Map zzXb;

    public zze(zzg zzg1, com.google.android.gms.common.internal.zze zze1, Map map, Api.zza zza1, Lock lock, Context context)
    {
        zzWO = 0;
        zzWP = false;
        zzWK = zzg1;
        zzXa = zze1;
        zzXb = map;
        zzWE = zza1;
        zzWL = lock;
        mContext = context;
    }

    private void zzT(boolean flag)
    {
        if (zzWT != null)
        {
            if (zzWT.isConnected())
            {
                if (flag)
                {
                    zzWT.zzxY();
                }
                zzWT.disconnect();
            }
            zzWX = null;
        }
    }

    static Lock zza(zze zze1)
    {
        return zze1.zzWL;
    }

    private void zza(ConnectionResult connectionresult)
    {
        zzWL.lock();
        boolean flag = zzaW(2);
        if (!flag)
        {
            zzWL.unlock();
            return;
        }
        if (!connectionresult.isSuccess()) goto _L2; else goto _L1
_L1:
        zzmG();
_L3:
        zzWL.unlock();
        return;
_L2:
        if (!zzc(connectionresult))
        {
            break MISSING_BLOCK_LABEL_81;
        }
        zzmI();
        zzmG();
          goto _L3
        connectionresult;
        zzWL.unlock();
        throw connectionresult;
        zzd(connectionresult);
          goto _L3
    }

    static void zza(zze zze1, ConnectionResult connectionresult)
    {
        zze1.zzd(connectionresult);
    }

    static void zza(zze zze1, ConnectionResult connectionresult, Api api, int i)
    {
        zze1.zzb(connectionresult, api, i);
    }

    static void zza(zze zze1, ResolveAccountResponse resolveaccountresponse)
    {
        zze1.zza(resolveaccountresponse);
    }

    private void zza(ResolveAccountResponse resolveaccountresponse)
    {
        ConnectionResult connectionresult;
        connectionresult = resolveaccountresponse.zzoa();
        zzWL.lock();
        boolean flag = zzaW(0);
        if (!flag)
        {
            zzWL.unlock();
            return;
        }
        if (!connectionresult.isSuccess()) goto _L2; else goto _L1
_L1:
        zzWX = resolveaccountresponse.zznZ();
        zzWW = true;
        zzWY = resolveaccountresponse.zzob();
        zzWZ = resolveaccountresponse.zzoc();
        zzmE();
_L3:
        zzWL.unlock();
        return;
_L2:
        if (!zzc(connectionresult))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        zzmI();
        if (zzWQ == 0)
        {
            zzmG();
        }
          goto _L3
        resolveaccountresponse;
        zzWL.unlock();
        throw resolveaccountresponse;
        zzd(connectionresult);
          goto _L3
    }

    private boolean zza(int i, int j, ConnectionResult connectionresult)
    {
        while (j == 1 && !zzb(connectionresult) || zzWM != null && i >= zzWN) 
        {
            return false;
        }
        return true;
    }

    static boolean zza(zze zze1, int i)
    {
        return zze1.zzaW(i);
    }

    private boolean zzaW(int i)
    {
        if (zzWO != i)
        {
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder()).append("GoogleApiClient connecting is in step ").append(zzaX(zzWO)).append(" but received callback for step ").append(zzaX(i)).toString());
            zzd(new ConnectionResult(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    private String zzaX(int i)
    {
        switch (i)
        {
        default:
            return "UNKNOWN";

        case 0: // '\0'
            return "STEP_GETTING_SERVICE_BINDINGS";

        case 1: // '\001'
            return "STEP_VALIDATING_ACCOUNT";

        case 2: // '\002'
            return "STEP_AUTHENTICATING";

        case 3: // '\003'
            return "STEP_GETTING_REMOTE_SERVICE";
        }
    }

    static zzg zzb(zze zze1)
    {
        return zze1.zzWK;
    }

    private void zzb(ConnectionResult connectionresult, Api api, int i)
    {
        if (i != 2)
        {
            int j = api.zzmp().getPriority();
            if (zza(j, i, connectionresult))
            {
                zzWM = connectionresult;
                zzWN = j;
            }
        }
        zzWK.zzXv.put(api.zzms(), connectionresult);
    }

    private static boolean zzb(ConnectionResult connectionresult)
    {
        while (connectionresult.hasResolution() || GooglePlayServicesUtil.zzaT(connectionresult.getErrorCode()) != null) 
        {
            return true;
        }
        return false;
    }

    static boolean zzb(zze zze1, ConnectionResult connectionresult)
    {
        return zze1.zzc(connectionresult);
    }

    static zzps zzc(zze zze1)
    {
        return zze1.zzWT;
    }

    static void zzc(zze zze1, ConnectionResult connectionresult)
    {
        zze1.zza(connectionresult);
    }

    private boolean zzc(ConnectionResult connectionresult)
    {
        return zzWU == 2 || zzWU == 1 && !connectionresult.hasResolution();
    }

    private void zzd(ConnectionResult connectionresult)
    {
        boolean flag = false;
        zzWP = false;
        zzWK.zzXw.clear();
        zzWM = connectionresult;
        if (!connectionresult.hasResolution())
        {
            flag = true;
        }
        zzT(flag);
        zzaV(3);
        if (!zzWK.zzmO() || !GooglePlayServicesUtil.zze(mContext, connectionresult.getErrorCode()))
        {
            zzWK.zzmR();
            zzWK.zzXn.zzh(connectionresult);
        }
        zzWK.zzXn.zznT();
    }

    static void zzd(zze zze1)
    {
        zze1.zzmI();
    }

    static void zze(zze zze1)
    {
        zze1.zzmG();
    }

    static boolean zzf(zze zze1)
    {
        return zze1.zzmC();
    }

    static void zzg(zze zze1)
    {
        zze1.zzmD();
    }

    static void zzh(zze zze1)
    {
        zze1.zzmF();
    }

    private boolean zzmC()
    {
        zzWQ = zzWQ - 1;
        if (zzWQ > 0)
        {
            return false;
        }
        if (zzWQ < 0)
        {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
            zzd(new ConnectionResult(8, null));
            return false;
        }
        if (zzWM != null)
        {
            zzd(zzWM);
            return false;
        } else
        {
            return true;
        }
    }

    private void zzmD()
    {
        if (zzWV)
        {
            zzmE();
            return;
        } else
        {
            zzmG();
            return;
        }
    }

    private void zzmE()
    {
        if (zzWW && zzWQ == 0)
        {
            zzWO = 1;
            zzWQ = zzWK.zzXu.size();
            Iterator iterator = zzWK.zzXu.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Api.ClientKey clientkey = (Api.ClientKey)iterator.next();
                if (zzWK.zzXv.containsKey(clientkey))
                {
                    if (zzmC())
                    {
                        zzmF();
                    }
                } else
                {
                    ((Api.Client)zzWK.zzXu.get(clientkey)).validateAccount(zzWX);
                }
            } while (true);
        }
    }

    private void zzmF()
    {
        zzWO = 2;
        zzWK.zzXw = zzmJ();
        zzWT.zza(zzWX, zzWK.zzXw, new zza(this));
    }

    private void zzmG()
    {
        Set set = zzWK.zzXw;
        if (set.isEmpty())
        {
            set = zzmJ();
        }
        zzWO = 3;
        zzWQ = zzWK.zzXu.size();
        Iterator iterator = zzWK.zzXu.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api.ClientKey clientkey = (Api.ClientKey)iterator.next();
            if (zzWK.zzXv.containsKey(clientkey))
            {
                if (zzmC())
                {
                    zzmH();
                }
            } else
            {
                ((Api.Client)zzWK.zzXu.get(clientkey)).getRemoteService(zzWX, set);
            }
        } while (true);
    }

    private void zzmH()
    {
        zzWK.zzmN();
        if (zzWT != null)
        {
            if (zzWY)
            {
                zzWT.zza(zzWX, zzWZ);
            }
            zzT(false);
        }
        Api.ClientKey clientkey;
        for (Iterator iterator = zzWK.zzXv.keySet().iterator(); iterator.hasNext(); ((Api.Client)zzWK.zzXu.get(clientkey)).disconnect())
        {
            clientkey = (Api.ClientKey)iterator.next();
        }

        if (zzWP)
        {
            zzWP = false;
            zzaV(-1);
            return;
        }
        Bundle bundle;
        if (zzWR.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = zzWR;
        }
        zzWK.zzXn.zzg(bundle);
    }

    private void zzmI()
    {
        zzWV = false;
        zzWK.zzXw.clear();
        Iterator iterator = zzWS.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api.ClientKey clientkey = (Api.ClientKey)iterator.next();
            if (!zzWK.zzXv.containsKey(clientkey))
            {
                zzWK.zzXv.put(clientkey, new ConnectionResult(17, null));
            }
        } while (true);
    }

    private Set zzmJ()
    {
        HashSet hashset = new HashSet(zzXa.zznv());
        Map map = zzXa.zznx();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api api = (Api)iterator.next();
            if (!zzWK.zzXv.containsKey(api.zzms()))
            {
                hashset.addAll(((com.google.android.gms.common.internal.zza)map.get(api)).zzWJ);
            }
        } while (true);
        return hashset;
    }

    public void begin()
    {
        zzWK.zzXn.zznU();
        zzWK.zzXv.clear();
        zzWP = false;
        zzWV = false;
        zzWM = null;
        zzWO = 0;
        zzWU = 2;
        zzWW = false;
        zzWY = false;
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        if (i != 0)
        {
            ConnectionResult connectionresult = new ConnectionResult(i, null);
            zzWK.zzXs.post(new Runnable(connectionresult) {

                final ConnectionResult zzXc;
                final zze zzXd;

                public void run()
                {
                    zze.zza(zzXd).lock();
                    zze.zza(zzXd, zzXc);
                    zze.zza(zzXd).unlock();
                    return;
                    Exception exception;
                    exception;
                    zze.zza(zzXd).unlock();
                    throw exception;
                }

            
            {
                zzXd = zze.this;
                zzXc = connectionresult;
                super();
            }
            });
        } else
        {
            HashMap hashmap = new HashMap();
            Object obj = zzXb.keySet().iterator();
            boolean flag = false;
            while (((Iterator) (obj)).hasNext()) 
            {
                Api api = (Api)((Iterator) (obj)).next();
                Api.Client client1 = (Api.Client)zzWK.zzXu.get(api.zzms());
                int j = ((Integer)zzXb.get(api)).intValue();
                boolean flag1;
                if (api.zzmp().getPriority() == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (client1.requiresSignIn())
                {
                    zzWV = true;
                    if (j < zzWU)
                    {
                        zzWU = j;
                    }
                    if (j != 0)
                    {
                        zzWS.add(api.zzms());
                    }
                }
                hashmap.put(client1, new zzc(this, api, j));
                flag = flag1 | flag;
            }
            if (flag)
            {
                zzWV = false;
            }
            if (zzWV)
            {
                zzXa.zza(Integer.valueOf(zzWK.getSessionId()));
                obj = new zzd();
                zzWT = (zzps)zzWE.zza(mContext, zzWK.getLooper(), zzXa, zzXa.zznB(), ((GoogleApiClient.ConnectionCallbacks) (obj)), ((GoogleApiClient.OnConnectionFailedListener) (obj)));
                zzWT.connect();
            }
            zzWQ = zzWK.zzXu.size();
            obj = zzWK.zzXu.values().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                Api.Client client = (Api.Client)((Iterator) (obj)).next();
                client.connect((GoogleApiClient.ConnectionProgressReportCallbacks)hashmap.get(client));
            }
        }
    }

    public void connect()
    {
        zzWP = false;
    }

    public String getName()
    {
        return "CONNECTING";
    }

    public void onConnected(Bundle bundle)
    {
        if (zzaW(3))
        {
            if (bundle != null)
            {
                zzWR.putAll(bundle);
            }
            if (zzmC())
            {
                zzmH();
                return;
            }
        }
    }

    public void onConnectionSuspended(int i)
    {
        zzd(new ConnectionResult(8, null));
    }

    public zza.zza zza(zza.zza zza1)
    {
        zzWK.zzXo.add(zza1);
        return zza1;
    }

    public void zza(ConnectionResult connectionresult, Api api, int i)
    {
        if (zzaW(3))
        {
            zzb(connectionresult, api, i);
            if (zzmC())
            {
                zzmH();
                return;
            }
        }
    }

    public void zzaV(int i)
    {
        if (i == -1)
        {
            Iterator iterator = zzWK.zzXo.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                zzg.zze zze1 = (zzg.zze)iterator.next();
                if (zze1.zzmv() != 1)
                {
                    zze1.cancel();
                    iterator.remove();
                }
            } while (true);
            zzWK.zzmK();
            if (zzWM == null && !zzWK.zzXo.isEmpty())
            {
                zzWP = true;
                return;
            }
            zzWK.zzXv.clear();
            zzWM = null;
            zzT(true);
        }
        zzWK.zze(zzWM);
    }

    public zza.zza zzb(zza.zza zza1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
