// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzbb;
import com.google.android.gms.internal.zzbe;
import com.google.android.gms.internal.zzbr;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzdh;
import com.google.android.gms.internal.zzdl;
import com.google.android.gms.internal.zzdt;
import com.google.android.gms.internal.zzgg;
import com.google.android.gms.internal.zzgl;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzid;
import com.google.android.gms.internal.zzlb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdRequestInfoParcel, AdResponseParcel

public class zzl extends zzhh
{
    public static class zza
        implements com.google.android.gms.internal.zzdt.zzb
    {

        public void zza(zzbb zzbb1)
        {
            zzl.zzd(zzbb1);
        }

        public void zzc(Object obj)
        {
            zza((zzbb)obj);
        }

        public zza()
        {
        }
    }

    public static class zzb
        implements com.google.android.gms.internal.zzdt.zzb
    {

        public void zza(zzbb zzbb1)
        {
            zzl.zzc(zzbb1);
        }

        public void zzc(Object obj)
        {
            zza((zzbb)obj);
        }

        public zzb()
        {
        }
    }

    public static class zzc
        implements zzdg
    {

        public void zza(zzid zzid, Map map)
        {
            zzid = (String)map.get("request_id");
            map = (String)map.get("errors");
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Invalid request: ").append(map).toString());
            zzl.zzfz().zzV(zzid);
        }

        public zzc()
        {
        }
    }


    static final long zzDf;
    private static boolean zzDg = false;
    private static zzdt zzDh = null;
    private static zzdh zzDi = null;
    private static zzdl zzDj = null;
    private static zzdg zzDk = null;
    private static final Object zzoW = new Object();
    private final Context mContext;
    private final Object zzBr;
    private final zza.zza zzCd;
    private final AdRequestInfoParcel.zza zzCe;
    private com.google.android.gms.internal.zzdt.zzd zzDl;

    public zzl(Context context, AdRequestInfoParcel.zza zza1, zza.zza zza2)
    {
        zzBr = new Object();
        zzCd = zza2;
        mContext = context;
        zzCe = zza1;
        synchronized (zzoW)
        {
            if (!zzDg)
            {
                zzDj = new zzdl();
                zzDi = new zzdh(context.getApplicationContext(), zza1.zzpJ);
                zzDk = new zzc();
                zzDh = new zzdt(mContext.getApplicationContext(), zzCe.zzpJ, (String)zzbz.zztD.get(), new zzb(), new zza());
                zzDg = true;
            }
        }
        return;
        context;
        zza2;
        JVM INSTR monitorexit ;
        throw context;
    }

    static zza.zza zza(zzl zzl1)
    {
        return zzl1.zzCd;
    }

    static com.google.android.gms.internal.zzdt.zzd zza(zzl zzl1, com.google.android.gms.internal.zzdt.zzd zzd1)
    {
        zzl1.zzDl = zzd1;
        return zzd1;
    }

    private JSONObject zza(AdRequestInfoParcel adrequestinfoparcel, String s)
    {
        Bundle bundle;
        String s1;
        bundle = adrequestinfoparcel.zzCm.extras.getBundle("sdk_less_server_data");
        s1 = adrequestinfoparcel.zzCm.extras.getString("sdk_less_network_id");
        if (bundle != null) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject;
        return null;
_L2:
        if ((jsonobject = zzgg.zza(adrequestinfoparcel, zzo.zzbB().zzC(mContext), null, new zzbr((String)zzbz.zztD.get()), null, null, new ArrayList())) == null) goto _L1; else goto _L3
_L3:
        adrequestinfoparcel = AdvertisingIdClient.getAdvertisingIdInfo(mContext);
_L4:
        HashMap hashmap = new HashMap();
        hashmap.put("request_id", s);
        hashmap.put("network_id", s1);
        hashmap.put("request_param", jsonobject);
        hashmap.put("data", bundle);
        if (adrequestinfoparcel != null)
        {
            hashmap.put("adid", adrequestinfoparcel.getId());
            int i;
            if (adrequestinfoparcel.isLimitAdTrackingEnabled())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            hashmap.put("lat", Integer.valueOf(i));
        }
        try
        {
            adrequestinfoparcel = zzo.zzbv().zzy(hashmap);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            return null;
        }
        return adrequestinfoparcel;
        adrequestinfoparcel;
_L5:
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot get advertising id info", adrequestinfoparcel);
        adrequestinfoparcel = null;
          goto _L4
        adrequestinfoparcel;
          goto _L5
        adrequestinfoparcel;
          goto _L5
        adrequestinfoparcel;
          goto _L5
    }

    static com.google.android.gms.internal.zzdt.zzd zzb(zzl zzl1)
    {
        return zzl1.zzDl;
    }

    protected static void zzc(zzbb zzbb1)
    {
        zzbb1.zza("/loadAd", zzDj);
        zzbb1.zza("/fetchHttpRequest", zzDi);
        zzbb1.zza("/invalidRequest", zzDk);
    }

    protected static void zzd(zzbb zzbb1)
    {
        zzbb1.zzb("/loadAd", zzDj);
        zzbb1.zzb("/fetchHttpRequest", zzDi);
        zzbb1.zzb("/invalidRequest", zzDk);
    }

    private AdResponseParcel zzf(AdRequestInfoParcel adrequestinfoparcel)
    {
        Object obj;
        JSONObject jsonobject;
        obj = UUID.randomUUID().toString();
        jsonobject = zza(adrequestinfoparcel, ((String) (obj)));
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        adrequestinfoparcel = new AdResponseParcel(0);
_L4:
        return adrequestinfoparcel;
_L2:
        long l = zzo.zzbz().elapsedRealtime();
        Future future = zzDj.zzU(((String) (obj)));
        com.google.android.gms.ads.internal.util.client.zza.zzGF.post(new Runnable(jsonobject, ((String) (obj))) {

            final zzl zzDm;
            final JSONObject zzDn;
            final String zzDo;

            public void run()
            {
                com.google.android.gms.ads.internal.request.zzl.zza(zzDm, zzl.zzfA().zzdU());
                com.google.android.gms.ads.internal.request.zzl.zzb(zzDm).zza(new com.google.android.gms.internal.zzhx.zzc(this) {

                    final _cls2 zzDp;

                    public void zzb(zzbe zzbe1)
                    {
                        try
                        {
                            zzbe1.zza("AFMA_getAdapterLessMediationAd", zzDp.zzDn);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (zzbe zzbe1)
                        {
                            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error requesting an ad url", zzbe1);
                        }
                        zzl.zzfz().zzV(zzDp.zzDo);
                    }

                    public void zzc(Object obj)
                    {
                        zzb((zzbe)obj);
                    }

            
            {
                zzDp = _pcls2;
                super();
            }
                }, new com.google.android.gms.internal.zzhx.zza(this) {

                    final _cls2 zzDp;

                    public void run()
                    {
                        zzl.zzfz().zzV(zzDp.zzDo);
                    }

            
            {
                zzDp = _pcls2;
                super();
            }
                });
            }

            
            {
                zzDm = zzl.this;
                zzDn = jsonobject;
                zzDo = s;
                super();
            }
        });
        long l1 = zzDf;
        long l2 = zzo.zzbz().elapsedRealtime();
        try
        {
            obj = (JSONObject)future.get(l1 - (l2 - l), TimeUnit.MILLISECONDS);
            break MISSING_BLOCK_LABEL_102;
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel) { }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel) { }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            return new AdResponseParcel(2);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            return new AdResponseParcel(0);
        }
        return new AdResponseParcel(-1);
        if (obj == null)
        {
            return new AdResponseParcel(-1);
        }
        obj = zzgg.zza(mContext, adrequestinfoparcel, ((JSONObject) (obj)).toString());
        adrequestinfoparcel = ((AdRequestInfoParcel) (obj));
        if (((AdResponseParcel) (obj)).errorCode != -3)
        {
            adrequestinfoparcel = ((AdRequestInfoParcel) (obj));
            if (TextUtils.isEmpty(((AdResponseParcel) (obj)).zzCI))
            {
                return new AdResponseParcel(3);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static zzdt zzfA()
    {
        return zzDh;
    }

    static zzdl zzfz()
    {
        return zzDj;
    }

    public void onStop()
    {
        synchronized (zzBr)
        {
            com.google.android.gms.ads.internal.util.client.zza.zzGF.post(new Runnable() {

                final zzl zzDm;

                public void run()
                {
                    if (com.google.android.gms.ads.internal.request.zzl.zzb(zzDm) != null)
                    {
                        com.google.android.gms.ads.internal.request.zzl.zzb(zzDm).release();
                        com.google.android.gms.ads.internal.request.zzl.zza(zzDm, null);
                    }
                }

            
            {
                zzDm = zzl.this;
                super();
            }
            });
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzdP()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("SdkLessAdLoaderBackgroundTask started.");
        Object obj = new AdRequestInfoParcel(zzCe, null, null);
        AdResponseParcel adresponseparcel = zzf(((AdRequestInfoParcel) (obj)));
        long l = zzo.zzbz().elapsedRealtime();
        obj = new com.google.android.gms.internal.zzha.zza(((AdRequestInfoParcel) (obj)), adresponseparcel, null, null, adresponseparcel.errorCode, l, adresponseparcel.zzCO, null);
        com.google.android.gms.ads.internal.util.client.zza.zzGF.post(new Runnable(((com.google.android.gms.internal.zzha.zza) (obj))) {

            final com.google.android.gms.internal.zzha.zza zzCh;
            final zzl zzDm;

            public void run()
            {
                com.google.android.gms.ads.internal.request.zzl.zza(zzDm).zza(zzCh);
                if (com.google.android.gms.ads.internal.request.zzl.zzb(zzDm) != null)
                {
                    com.google.android.gms.ads.internal.request.zzl.zzb(zzDm).release();
                    com.google.android.gms.ads.internal.request.zzl.zza(zzDm, null);
                }
            }

            
            {
                zzDm = zzl.this;
                zzCh = zza1;
                super();
            }
        });
    }

    static 
    {
        zzDf = TimeUnit.SECONDS.toMillis(10L);
    }
}
