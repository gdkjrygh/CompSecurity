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
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzbb;
import com.google.android.gms.internal.zzbe;
import com.google.android.gms.internal.zzbr;
import com.google.android.gms.internal.zzbu;
import com.google.android.gms.internal.zzby;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzdh;
import com.google.android.gms.internal.zzdl;
import com.google.android.gms.internal.zzdv;
import com.google.android.gms.internal.zzgn;
import com.google.android.gms.internal.zzgs;
import com.google.android.gms.internal.zzhq;
import com.google.android.gms.internal.zzhu;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zzlm;
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

public class zzm extends zzhq
{
    public static class zza
        implements com.google.android.gms.internal.zzdv.zzb
    {

        public void zza(zzbb zzbb1)
        {
            zzm.zzd(zzbb1);
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
        implements com.google.android.gms.internal.zzdv.zzb
    {

        public void zza(zzbb zzbb1)
        {
            zzm.zzc(zzbb1);
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

        public void zza(zzip zzip, Map map)
        {
            zzip = (String)map.get("request_id");
            map = (String)map.get("errors");
            com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Invalid request: ").append(map).toString());
            zzm.zzfD().zzX(zzip);
        }

        public zzc()
        {
        }
    }


    static final long zzEu;
    private static boolean zzEv = false;
    private static zzdv zzEw = null;
    private static zzdh zzEx = null;
    private static zzdl zzEy = null;
    private static zzdg zzEz = null;
    private static final Object zzpm = new Object();
    private final Context mContext;
    private final Object zzCE;
    private final zza.zza zzDp;
    private final AdRequestInfoParcel.zza zzDq;
    private com.google.android.gms.internal.zzdv.zzd zzEA;

    public zzm(Context context, AdRequestInfoParcel.zza zza1, zza.zza zza2)
    {
        zzCE = new Object();
        zzDp = zza2;
        mContext = context;
        zzDq = zza1;
        synchronized (zzpm)
        {
            if (!zzEv)
            {
                zzEy = new zzdl();
                zzEx = new zzdh(context.getApplicationContext(), zza1.zzqb);
                zzEz = new zzc();
                zzEw = new zzdv(mContext.getApplicationContext(), zzDq.zzqb, (String)zzby.zztW.get(), new zzb(), new zza());
                zzEv = true;
            }
        }
        return;
        context;
        zza2;
        JVM INSTR monitorexit ;
        throw context;
    }

    static zza.zza zza(zzm zzm1)
    {
        return zzm1.zzDp;
    }

    static com.google.android.gms.internal.zzdv.zzd zza(zzm zzm1, com.google.android.gms.internal.zzdv.zzd zzd1)
    {
        zzm1.zzEA = zzd1;
        return zzd1;
    }

    private JSONObject zza(AdRequestInfoParcel adrequestinfoparcel, String s)
    {
        Bundle bundle;
        String s1;
        bundle = adrequestinfoparcel.zzDy.extras.getBundle("sdk_less_server_data");
        s1 = adrequestinfoparcel.zzDy.extras.getString("sdk_less_network_id");
        if (bundle != null) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject;
        return null;
_L2:
        if ((jsonobject = zzgn.zza(mContext, adrequestinfoparcel, zzp.zzbD().zzD(mContext), null, null, new zzbr((String)zzby.zztW.get()), null, null, new ArrayList())) == null) goto _L1; else goto _L3
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
            adrequestinfoparcel = zzp.zzbx().zzx(hashmap);
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

    static com.google.android.gms.internal.zzdv.zzd zzb(zzm zzm1)
    {
        return zzm1.zzEA;
    }

    protected static void zzc(zzbb zzbb1)
    {
        zzbb1.zza("/loadAd", zzEy);
        zzbb1.zza("/fetchHttpRequest", zzEx);
        zzbb1.zza("/invalidRequest", zzEz);
    }

    protected static void zzd(zzbb zzbb1)
    {
        zzbb1.zzb("/loadAd", zzEy);
        zzbb1.zzb("/fetchHttpRequest", zzEx);
        zzbb1.zzb("/invalidRequest", zzEz);
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
        long l = zzp.zzbB().elapsedRealtime();
        Future future = zzEy.zzW(((String) (obj)));
        com.google.android.gms.ads.internal.util.client.zza.zzIy.post(new Runnable(jsonobject, ((String) (obj))) {

            final zzm zzEB;
            final JSONObject zzEC;
            final String zzED;

            public void run()
            {
                com.google.android.gms.ads.internal.request.zzm.zza(zzEB, zzm.zzfE().zzdL());
                com.google.android.gms.ads.internal.request.zzm.zzb(zzEB).zza(new com.google.android.gms.internal.zzij.zzc(this) {

                    final _cls2 zzEE;

                    public void zzb(zzbe zzbe1)
                    {
                        try
                        {
                            zzbe1.zza("AFMA_getAdapterLessMediationAd", zzEE.zzEC);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (zzbe zzbe1)
                        {
                            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error requesting an ad url", zzbe1);
                        }
                        zzm.zzfD().zzX(zzEE.zzED);
                    }

                    public void zzc(Object obj)
                    {
                        zzb((zzbe)obj);
                    }

            
            {
                zzEE = _pcls2;
                super();
            }
                }, new com.google.android.gms.internal.zzij.zza(this) {

                    final _cls2 zzEE;

                    public void run()
                    {
                        zzm.zzfD().zzX(zzEE.zzED);
                    }

            
            {
                zzEE = _pcls2;
                super();
            }
                });
            }

            
            {
                zzEB = zzm.this;
                zzEC = jsonobject;
                zzED = s;
                super();
            }
        });
        long l1 = zzEu;
        long l2 = zzp.zzbB().elapsedRealtime();
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
        obj = zzgn.zza(mContext, adrequestinfoparcel, ((JSONObject) (obj)).toString());
        adrequestinfoparcel = ((AdRequestInfoParcel) (obj));
        if (((AdResponseParcel) (obj)).errorCode != -3)
        {
            adrequestinfoparcel = ((AdRequestInfoParcel) (obj));
            if (TextUtils.isEmpty(((AdResponseParcel) (obj)).body))
            {
                return new AdResponseParcel(3);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static zzdl zzfD()
    {
        return zzEy;
    }

    static zzdv zzfE()
    {
        return zzEw;
    }

    public void onStop()
    {
        synchronized (zzCE)
        {
            com.google.android.gms.ads.internal.util.client.zza.zzIy.post(new Runnable() {

                final zzm zzEB;

                public void run()
                {
                    if (com.google.android.gms.ads.internal.request.zzm.zzb(zzEB) != null)
                    {
                        com.google.android.gms.ads.internal.request.zzm.zzb(zzEB).release();
                        com.google.android.gms.ads.internal.request.zzm.zza(zzEB, null);
                    }
                }

            
            {
                zzEB = zzm.this;
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

    public void zzdG()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("SdkLessAdLoaderBackgroundTask started.");
        Object obj = new AdRequestInfoParcel(zzDq, null, null, -1L);
        AdResponseParcel adresponseparcel = zzf(((AdRequestInfoParcel) (obj)));
        long l = zzp.zzbB().elapsedRealtime();
        obj = new com.google.android.gms.internal.zzhj.zza(((AdRequestInfoParcel) (obj)), adresponseparcel, null, null, adresponseparcel.errorCode, l, adresponseparcel.zzEb, null);
        com.google.android.gms.ads.internal.util.client.zza.zzIy.post(new Runnable(((com.google.android.gms.internal.zzhj.zza) (obj))) {

            final zzm zzEB;
            final com.google.android.gms.internal.zzhj.zza zzoA;

            public void run()
            {
                com.google.android.gms.ads.internal.request.zzm.zza(zzEB).zza(zzoA);
                if (com.google.android.gms.ads.internal.request.zzm.zzb(zzEB) != null)
                {
                    com.google.android.gms.ads.internal.request.zzm.zzb(zzEB).release();
                    com.google.android.gms.ads.internal.request.zzm.zza(zzEB, null);
                }
            }

            
            {
                zzEB = zzm.this;
                zzoA = zza1;
                super();
            }
        });
    }

    static 
    {
        zzEu = TimeUnit.SECONDS.toMillis(10L);
    }
}
