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
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzmd;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.lang.ref.WeakReference;
import java.util.Collection;
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

        private final WeakReference zzQi;

        public void zza(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
        {
            authaccountresult = (zze)zzQi.get();
            if (authaccountresult == null)
            {
                return;
            } else
            {
                zze.zza(authaccountresult).zzQx.post(new Runnable(this, authaccountresult, connectionresult) {

                    final zze zzQj;
                    final ConnectionResult zzQk;
                    final zza zzQl;

                    public void run()
                    {
                        zze.zzc(zzQj, zzQk);
                    }

            
            {
                zzQl = zza1;
                zzQj = zze1;
                zzQk = connectionresult;
                super();
            }
                });
                return;
            }
        }

        zza(zze zze1)
        {
            zzQi = new WeakReference(zze1);
        }
    }

    private static class zzb extends com.google.android.gms.common.internal.zzr.zza
    {

        private final WeakReference zzQi;

        public void zzb(ResolveAccountResponse resolveaccountresponse)
        {
            zze zze1 = (zze)zzQi.get();
            if (zze1 == null)
            {
                return;
            } else
            {
                zze.zza(zze1).zzQx.post(new Runnable(this, zze1, resolveaccountresponse) {

                    final zze zzQj;
                    final ResolveAccountResponse zzQm;
                    final zzb zzQn;

                    public void run()
                    {
                        zze.zza(zzQj, zzQm);
                    }

            
            {
                zzQn = zzb1;
                zzQj = zze1;
                zzQm = resolveaccountresponse;
                super();
            }
                });
                return;
            }
        }

        zzb(zze zze1)
        {
            zzQi = new WeakReference(zze1);
        }
    }

    private static class zzc
        implements GoogleApiClient.zza
    {

        private final WeakReference zzQi;
        private final Api zzQo;
        private final int zzQp;

        public void zza(ConnectionResult connectionresult)
        {
            zze zze1;
            boolean flag = false;
            zze1 = (zze)zzQi.get();
            if (zze1 == null)
            {
                return;
            }
            if (Looper.myLooper() == zze.zza(zze1).getLooper())
            {
                flag = true;
            }
            zzv.zza(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zze.zzc(zze1).lock();
            boolean flag1 = zze.zza(zze1, 0);
            if (!flag1)
            {
                zze.zzc(zze1).unlock();
                return;
            }
            if (!connectionresult.isSuccess())
            {
                zze.zza(zze1, connectionresult, zzQo, zzQp);
            }
            if (zze.zzf(zze1))
            {
                zze.zzg(zze1);
            }
            zze.zzc(zze1).unlock();
            return;
            connectionresult;
            zze.zzc(zze1).unlock();
            throw connectionresult;
        }

        public void zzb(ConnectionResult connectionresult)
        {
            zze zze1;
            boolean flag = true;
            zze1 = (zze)zzQi.get();
            if (zze1 == null)
            {
                return;
            }
            if (Looper.myLooper() != zze.zza(zze1).getLooper())
            {
                flag = false;
            }
            zzv.zza(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
            zze.zzc(zze1).lock();
            flag = zze.zza(zze1, 1);
            if (!flag)
            {
                zze.zzc(zze1).unlock();
                return;
            }
            if (!connectionresult.isSuccess())
            {
                zze.zza(zze1, connectionresult, zzQo, zzQp);
            }
            if (zze.zzf(zze1))
            {
                zze.zzh(zze1);
            }
            zze.zzc(zze1).unlock();
            return;
            connectionresult;
            zze.zzc(zze1).unlock();
            throw connectionresult;
        }

        public zzc(zze zze1, Api api, int i)
        {
            zzQi = new WeakReference(zze1);
            zzQo = api;
            zzQp = i;
        }
    }

    private class zzd
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
    {

        final zze zzQq;

        public void onConnected(Bundle bundle)
        {
            zze.zzb(zzQq).zza(new zzb(zzQq));
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zze.zzc(zzQq).lock();
            if (!zze.zza(zzQq, connectionresult)) goto _L2; else goto _L1
_L1:
            zze.zzd(zzQq);
            zze.zze(zzQq);
_L4:
            zze.zzc(zzQq).unlock();
            return;
_L2:
            zze.zzb(zzQq, connectionresult);
            if (true) goto _L4; else goto _L3
_L3:
            connectionresult;
            zze.zzc(zzQq).unlock();
            throw connectionresult;
        }

        public void onConnectionSuspended(int i)
        {
        }

        private zzd()
        {
            zzQq = zze.this;
            super();
        }

    }


    private final Context mContext;
    private final Api.zzb zzPK;
    private final zzg zzPQ;
    private final Lock zzPR;
    private ConnectionResult zzPS;
    private int zzPT;
    private int zzPU;
    private boolean zzPV;
    private int zzPW;
    private final Bundle zzPX = new Bundle();
    private final Set zzPY = new HashSet();
    private zzmd zzPZ;
    private int zzQa;
    private boolean zzQb;
    private boolean zzQc;
    private zzo zzQd;
    private boolean zzQe;
    private boolean zzQf;
    private final com.google.android.gms.common.internal.zze zzQg;
    private final Map zzQh;

    public zze(zzg zzg1, com.google.android.gms.common.internal.zze zze1, Map map, Api.zzb zzb1, Lock lock, Context context)
    {
        zzPU = 0;
        zzPV = false;
        zzPQ = zzg1;
        zzQg = zze1;
        zzQh = map;
        zzPK = zzb1;
        zzPR = lock;
        mContext = context;
    }

    private void zzO(boolean flag)
    {
        if (zzPZ != null)
        {
            if (zzPZ.isConnected())
            {
                if (flag)
                {
                    zzPZ.zzwc();
                }
                zzPZ.disconnect();
            }
            zzQd = null;
        }
    }

    static zzg zza(zze zze1)
    {
        return zze1.zzPQ;
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
        connectionresult = resolveaccountresponse.zzmm();
        zzPR.lock();
        boolean flag = zzat(0);
        if (!flag)
        {
            zzPR.unlock();
            return;
        }
        if (!connectionresult.isSuccess()) goto _L2; else goto _L1
_L1:
        zzQd = resolveaccountresponse.zzml();
        zzQc = true;
        zzQe = resolveaccountresponse.zzmn();
        zzQf = resolveaccountresponse.zzmo();
        zzkQ();
_L3:
        zzPR.unlock();
        return;
_L2:
        if (!zze(connectionresult))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        zzkU();
        if (zzPW == 0)
        {
            zzkS();
        }
          goto _L3
        resolveaccountresponse;
        zzPR.unlock();
        throw resolveaccountresponse;
        zzf(connectionresult);
          goto _L3
    }

    private boolean zza(int i, int j, ConnectionResult connectionresult)
    {
        while (j == 1 && !zzd(connectionresult) || zzPS != null && i >= zzPT) 
        {
            return false;
        }
        return true;
    }

    static boolean zza(zze zze1, int i)
    {
        return zze1.zzat(i);
    }

    static boolean zza(zze zze1, ConnectionResult connectionresult)
    {
        return zze1.zze(connectionresult);
    }

    private boolean zzat(int i)
    {
        if (zzPU != i)
        {
            Log.wtf("GoogleApiClientConnecting", (new StringBuilder()).append("GoogleApiClient connecting is in step ").append(zzau(zzPU)).append(" but received callback for step ").append(zzau(i)).toString());
            zzf(new ConnectionResult(8, null));
            return false;
        } else
        {
            return true;
        }
    }

    private String zzau(int i)
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

    static zzmd zzb(zze zze1)
    {
        return zze1.zzPZ;
    }

    private void zzb(ConnectionResult connectionresult, Api api, int i)
    {
        if (i != 2)
        {
            int j = api.zzkB().getPriority();
            if (zza(j, i, connectionresult))
            {
                zzPS = connectionresult;
                zzPT = j;
            }
        }
        zzPQ.zzQA.put(api.zzkE(), connectionresult);
    }

    static void zzb(zze zze1, ConnectionResult connectionresult)
    {
        zze1.zzf(connectionresult);
    }

    static Lock zzc(zze zze1)
    {
        return zze1.zzPR;
    }

    private void zzc(ConnectionResult connectionresult)
    {
        zzPR.lock();
        boolean flag = zzat(2);
        if (!flag)
        {
            zzPR.unlock();
            return;
        }
        if (!connectionresult.isSuccess()) goto _L2; else goto _L1
_L1:
        zzkS();
_L3:
        zzPR.unlock();
        return;
_L2:
        if (!zze(connectionresult))
        {
            break MISSING_BLOCK_LABEL_81;
        }
        zzkU();
        zzkS();
          goto _L3
        connectionresult;
        zzPR.unlock();
        throw connectionresult;
        zzf(connectionresult);
          goto _L3
    }

    static void zzc(zze zze1, ConnectionResult connectionresult)
    {
        zze1.zzc(connectionresult);
    }

    static void zzd(zze zze1)
    {
        zze1.zzkU();
    }

    private static boolean zzd(ConnectionResult connectionresult)
    {
        while (connectionresult.hasResolution() || GooglePlayServicesUtil.zzar(connectionresult.getErrorCode()) != null) 
        {
            return true;
        }
        return false;
    }

    static void zze(zze zze1)
    {
        zze1.zzkS();
    }

    private boolean zze(ConnectionResult connectionresult)
    {
        return zzQa == 2 || zzQa == 1 && !connectionresult.hasResolution();
    }

    private void zzf(ConnectionResult connectionresult)
    {
        boolean flag = false;
        zzPV = false;
        zzPQ.zzQB.clear();
        if (!connectionresult.hasResolution())
        {
            flag = true;
        }
        zzO(flag);
        zzas(3);
        if (!zzPQ.zzla() || !GooglePlayServicesUtil.zze(mContext, connectionresult.getErrorCode()))
        {
            zzPQ.zzlc();
            zzPQ.zzQs.zzj(connectionresult);
        }
        zzPQ.zzQs.zzme();
    }

    static boolean zzf(zze zze1)
    {
        return zze1.zzkO();
    }

    static void zzg(zze zze1)
    {
        zze1.zzkP();
    }

    static void zzh(zze zze1)
    {
        zze1.zzkR();
    }

    private boolean zzkO()
    {
        zzPW = zzPW - 1;
        if (zzPW > 0)
        {
            return false;
        }
        if (zzPS != null)
        {
            zzf(zzPS);
            return false;
        } else
        {
            return true;
        }
    }

    private void zzkP()
    {
        if (zzQb)
        {
            zzkQ();
            return;
        } else
        {
            zzkS();
            return;
        }
    }

    private void zzkQ()
    {
        if (zzQc && zzPW == 0)
        {
            zzPU = 1;
            zzPW = zzPQ.zzQz.size();
            Iterator iterator = zzPQ.zzQz.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Api.zzc zzc1 = (Api.zzc)iterator.next();
                if (zzPQ.zzQA.containsKey(zzc1))
                {
                    if (zzkO())
                    {
                        zzkR();
                    }
                } else
                {
                    ((Api.zza)zzPQ.zzQz.get(zzc1)).zza(zzQd);
                }
            } while (true);
        }
    }

    private void zzkR()
    {
        zzPU = 2;
        zzPQ.zzQB = zzkV();
        zzPZ.zza(zzQd, zzPQ.zzQB, new zza(this));
    }

    private void zzkS()
    {
        Set set = zzPQ.zzQB;
        if (set.isEmpty())
        {
            set = zzkV();
        }
        zzPU = 3;
        zzPW = zzPQ.zzQz.size();
        Iterator iterator = zzPQ.zzQz.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api.zzc zzc1 = (Api.zzc)iterator.next();
            if (zzPQ.zzQA.containsKey(zzc1))
            {
                if (zzkO())
                {
                    zzkT();
                }
            } else
            {
                ((Api.zza)zzPQ.zzQz.get(zzc1)).zza(zzQd, set);
            }
        } while (true);
    }

    private void zzkT()
    {
        zzPQ.zzkZ();
        if (zzPZ != null)
        {
            if (zzQe)
            {
                zzPZ.zza(zzQd, zzQf);
            }
            zzO(false);
        }
        Api.zzc zzc1;
        for (Iterator iterator = zzPQ.zzQA.keySet().iterator(); iterator.hasNext(); ((Api.zza)zzPQ.zzQz.get(zzc1)).disconnect())
        {
            zzc1 = (Api.zzc)iterator.next();
        }

        if (zzPV)
        {
            zzPV = false;
            zzas(-1);
            return;
        }
        Bundle bundle;
        if (zzPX.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = zzPX;
        }
        zzPQ.zzQs.zzg(bundle);
    }

    private void zzkU()
    {
        zzQb = false;
        zzPQ.zzQB.clear();
        Iterator iterator = zzPY.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api.zzc zzc1 = (Api.zzc)iterator.next();
            if (!zzPQ.zzQA.containsKey(zzc1))
            {
                zzPQ.zzQA.put(zzc1, new ConnectionResult(17, null));
            }
        } while (true);
    }

    private Set zzkV()
    {
        HashSet hashset = new HashSet(zzQg.zzlF());
        Map map = zzQg.zzlH();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Api api = (Api)iterator.next();
            if (!zzPQ.zzQA.containsKey(api.zzkE()))
            {
                hashset.addAll(((com.google.android.gms.common.internal.zza)map.get(api)).zzPP);
            }
        } while (true);
        return hashset;
    }

    public void begin()
    {
        zzPQ.zzQs.zzmf();
        zzPQ.zzQA.clear();
        zzPV = false;
        zzQb = false;
        zzPS = null;
        zzPU = 0;
        zzQa = 2;
        zzQc = false;
        zzQe = false;
        Iterator iterator = zzQh.keySet().iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            Api api = (Api)iterator.next();
            Api.zza zza1 = (Api.zza)zzPQ.zzQz.get(api.zzkE());
            int i = ((Integer)zzQh.get(api)).intValue();
            zza1.zza(new zzc(this, api, i));
            boolean flag1;
            if (api.zzkB().getPriority() == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!zza1.zzjL())
            {
                continue;
            }
            zzQb = true;
            if (i < zzQa)
            {
                zzQa = i;
            }
            if (i != 0)
            {
                zzPY.add(api.zzkE());
            }
            flag = flag1 | flag;
        }
        if (flag)
        {
            zzQb = false;
        }
        if (zzQb)
        {
            zzQg.zza(Integer.valueOf(zzPQ.getSessionId()));
            zzd zzd1 = new zzd();
            zzPZ = (zzmd)zzPK.zza(mContext, zzPQ.getLooper(), zzQg, zzQg.zzlL(), zzd1, zzd1);
            zzPZ.connect();
        }
        zzPW = zzPQ.zzQz.size();
        for (Iterator iterator1 = zzPQ.zzQz.values().iterator(); iterator1.hasNext(); ((Api.zza)iterator1.next()).connect()) { }
    }

    public void connect()
    {
        zzPV = false;
    }

    public String getName()
    {
        return "CONNECTING";
    }

    public void onConnected(Bundle bundle)
    {
        if (zzat(3))
        {
            if (bundle != null)
            {
                zzPX.putAll(bundle);
            }
            if (zzkO())
            {
                zzkT();
                return;
            }
        }
    }

    public zza.zza zza(zza.zza zza1)
    {
        zzPQ.zzQt.add(zza1);
        return zza1;
    }

    public void zza(ConnectionResult connectionresult, Api api, int i)
    {
        if (zzat(3))
        {
            zzb(connectionresult, api, i);
            if (zzkO())
            {
                zzkT();
                return;
            }
        }
    }

    public void zzas(int i)
    {
        if (i == -1)
        {
            Iterator iterator = zzPQ.zzQt.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                zzg.zze zze1 = (zzg.zze)iterator.next();
                if (zze1.zzkH() != 1)
                {
                    zze1.cancel();
                    iterator.remove();
                }
            } while (true);
            zzPQ.zzkW();
            if (zzPS == null && !zzPQ.zzQt.isEmpty())
            {
                zzPV = true;
                return;
            }
            zzPQ.zzQA.clear();
            zzPS = null;
            zzO(true);
        }
        zzPQ.zzg(zzPS);
    }

    public zza.zza zzb(zza.zza zza1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
