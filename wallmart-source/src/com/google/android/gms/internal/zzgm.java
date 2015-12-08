// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdv, zzbr, zzby, zzcd, 
//            zzbu, zzgl, zzdw, zzgs, 
//            zzgr, zzgo, zzgn, zzfh, 
//            zzbt, zzhi, zzgt, zzhu, 
//            zzgq, zzhf, zzgp, zzlm, 
//            zzhl, zzcc, zzbe, zzir, 
//            zzip, zziq, zzdf, zzbb

public final class zzgm extends com.google.android.gms.ads.internal.request.zzj.zza
{

    private static zzgm zzEL;
    private static final Object zzpm = new Object();
    private final Context mContext;
    private final zzgl zzEM;
    private final zzbr zzEN;
    private final zzdv zzqU;

    zzgm(Context context, zzbr zzbr1, zzgl zzgl1)
    {
        mContext = context;
        zzEM = zzgl1;
        zzEN = zzbr1;
        if (context.getApplicationContext() != null)
        {
            context = context.getApplicationContext();
        }
        zzqU = new zzdv(context, new VersionInfoParcel(0x7877d8, 0x7877d8, true), zzbr1.zzdb(), new zzdv.zzb() {

            final zzgm zzEW;

            public void zza(zzbb zzbb1)
            {
                zzbb1.zza("/log", zzdf.zzwP);
            }

            public void zzc(Object obj)
            {
                zza((zzbb)obj);
            }

            
            {
                zzEW = zzgm.this;
                super();
            }
        }, new zzdv.zzc());
    }

    private static AdResponseParcel zza(Context context, zzdv zzdv1, zzbr zzbr1, zzgl zzgl1, AdRequestInfoParcel adrequestinfoparcel)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Starting ad request from service.");
        zzby.zzw(context);
        zzcd zzcd1 = new zzcd(((Boolean)zzby.zzuB.get()).booleanValue(), "load_ad", adrequestinfoparcel.zzqf.zzsG);
        if (adrequestinfoparcel.versionCode > 10 && adrequestinfoparcel.zzDT != -1L)
        {
            zzcd1.zza(zzcd1.zzb(adrequestinfoparcel.zzDT), new String[] {
                "cts"
            });
        }
        zzcc zzcc = zzcd1.zzdl();
        zzgl1.zzEH.init();
        Object obj = zzp.zzbD().zzD(context);
        if (((zzgr) (obj)).zzFN == -1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Device is offline.");
            return new AdResponseParcel(2);
        }
        String s;
        zzgo zzgo1;
        if (adrequestinfoparcel.versionCode >= 7)
        {
            s = adrequestinfoparcel.zzDQ;
        } else
        {
            s = UUID.randomUUID().toString();
        }
        zzgo1 = new zzgo(s, adrequestinfoparcel.applicationInfo.packageName);
        if (adrequestinfoparcel.zzDy.extras != null)
        {
            String s1 = adrequestinfoparcel.zzDy.extras.getString("_ad");
            if (s1 != null)
            {
                return zzgn.zza(context, adrequestinfoparcel, s1);
            }
        }
        android.location.Location location = zzgl1.zzEH.zzc(250L);
        String s2 = zzgl1.zzEI.zzc(context, adrequestinfoparcel.zzDz.packageName);
        List list = zzgl1.zzEG.zza(adrequestinfoparcel);
        String s3 = zzgl1.zzEJ.zzau(adrequestinfoparcel.zzDA);
        obj = zzgn.zza(context, adrequestinfoparcel, ((zzgr) (obj)), zzgl1.zzEK.zzE(context), location, zzbr1, s2, s3, list);
        if (adrequestinfoparcel.versionCode < 7)
        {
            try
            {
                ((JSONObject) (obj)).put("request_id", s);
            }
            catch (JSONException jsonexception) { }
        }
        if (obj == null)
        {
            return new AdResponseParcel(0);
        }
        s = ((JSONObject) (obj)).toString();
        zzcd1.zza(zzcc, new String[] {
            "arc"
        });
        obj = zzcd1.zzdl();
        if (((Boolean)zzby.zztX.get()).booleanValue())
        {
            zzhu.zzHK.post(new Runnable(zzdv1, zzgo1, zzcd1, ((zzcc) (obj)), s) {

                final zzdv zzEO;
                final zzgo zzEP;
                final zzcc zzEQ;
                final String zzER;
                final zzcd zzoC;

                public void run()
                {
                    zzdv.zzd zzd = zzEO.zzdL();
                    zzEP.zzb(zzd);
                    zzoC.zza(zzEQ, new String[] {
                        "rwc"
                    });
                    zzd.zza(new zzij.zzc(this, zzoC.zzdl()) {

                        final zzcc zzES;
                        final _cls1 zzET;

                        public void zzb(zzbe zzbe1)
                        {
                            zzET.zzoC.zza(zzES, new String[] {
                                "jsf"
                            });
                            zzET.zzoC.zzdm();
                            zzbe1.zza("/invalidRequest", zzET.zzEP.zzFc);
                            zzbe1.zza("/loadAdURL", zzET.zzEP.zzFd);
                            try
                            {
                                zzbe1.zza("AFMA_buildAdURL", zzET.zzER);
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (zzbe zzbe1)
                            {
                                com.google.android.gms.ads.internal.util.client.zzb.zzb("Error requesting an ad url", zzbe1);
                            }
                        }

                        public void zzc(Object obj)
                        {
                            zzb((zzbe)obj);
                        }

            
            {
                zzET = _pcls1;
                zzES = zzcc;
                super();
            }
                    }, new zzij.zza(this) {

                        final _cls1 zzET;

                        public void run()
                        {
                        }

            
            {
                zzET = _pcls1;
                super();
            }
                    });
                }

            
            {
                zzEO = zzdv1;
                zzEP = zzgo1;
                zzoC = zzcd1;
                zzEQ = zzcc;
                zzER = s;
                super();
            }
            });
        } else
        {
            zzhu.zzHK.post(new Runnable(context, adrequestinfoparcel, zzgo1, zzcd1, ((zzcc) (obj)), s, zzbr1) {

                final zzgo zzEP;
                final zzcc zzEQ;
                final String zzER;
                final AdRequestInfoParcel zzEU;
                final zzbr zzEV;
                final zzcd zzoC;
                final Context zzrn;

                public void run()
                {
                    zzip zzip1 = zzp.zzby().zza(zzrn, new AdSizeParcel(), false, false, null, zzEU.zzqb);
                    if (zzp.zzbA().zzgi())
                    {
                        zzip1.getWebView().clearCache(true);
                    }
                    zzip1.setWillNotDraw(true);
                    zzEP.zze(zzip1);
                    zzoC.zza(zzEQ, new String[] {
                        "rwc"
                    });
                    Object obj1 = zzoC.zzdl();
                    obj1 = com.google.android.gms.internal.zzgm.zzb(zzER, zzoC, ((zzcc) (obj1)));
                    zziq zziq1 = zzip1.zzgS();
                    zziq1.zza("/invalidRequest", zzEP.zzFc);
                    zziq1.zza("/loadAdURL", zzEP.zzFd);
                    zziq1.zza("/log", zzdf.zzwP);
                    zziq1.zza(((zziq.zza) (obj1)));
                    com.google.android.gms.ads.internal.util.client.zzb.zzaC("Loading the JS library.");
                    zzip1.loadUrl(zzEV.zzdb());
                }

            
            {
                zzrn = context;
                zzEU = adrequestinfoparcel;
                zzEP = zzgo1;
                zzoC = zzcd1;
                zzEQ = zzcc;
                zzER = s;
                zzEV = zzbr1;
                super();
            }
            });
        }
        zzbr1 = (zzgq)zzgo1.zzfI().get(10L, TimeUnit.SECONDS);
        if (zzbr1 != null)
        {
            break MISSING_BLOCK_LABEL_527;
        }
        context = new AdResponseParcel(0);
        zzhu.zzHK.post(new Runnable(zzgo1) {

            final zzgo zzEP;

            public void run()
            {
                zzEP.zzfJ();
                if (zzEP.zzfH() != null)
                {
                    zzEP.zzfH().release();
                }
            }

            
            {
                zzEP = zzgo1;
                super();
            }
        });
        return context;
        context;
        context = new AdResponseParcel(0);
        zzhu.zzHK.post(new _cls3(zzgo1));
        return context;
        if (zzbr1.getErrorCode() == -2)
        {
            break MISSING_BLOCK_LABEL_566;
        }
        context = new AdResponseParcel(zzbr1.getErrorCode());
        zzhu.zzHK.post(new _cls3(zzgo1));
        return context;
        if (zzcd1.zzdo() != null)
        {
            zzcd1.zza(zzcd1.zzdo(), new String[] {
                "rur"
            });
        }
        zzdv1 = null;
        if (zzbr1.zzfM())
        {
            zzdv1 = zzgl1.zzEF.zzat(adrequestinfoparcel.zzDz.packageName);
        }
        zzdv1 = zza(adrequestinfoparcel, context, adrequestinfoparcel.zzqb.zzIz, zzbr1.getUrl(), ((String) (zzdv1)), s2, ((zzgq) (zzbr1)), zzcd1);
        if (((AdResponseParcel) (zzdv1)).zzEj == 1)
        {
            zzgl1.zzEI.clearToken(context, adrequestinfoparcel.zzDz.packageName);
        }
        zzcd1.zza(zzcc, new String[] {
            "tts"
        });
        zzdv1.zzEl = zzcd1.zzdn();
        zzhu.zzHK.post(new _cls3(zzgo1));
        return zzdv1;
        context;
        zzhu.zzHK.post(new _cls3(zzgo1));
        throw context;
    }

    public static AdResponseParcel zza(AdRequestInfoParcel adrequestinfoparcel, Context context, String s, String s1, String s2, String s3, zzgq zzgq1, zzcd zzcd1)
    {
        zzcc zzcc;
        zzgp zzgp1;
        byte abyte0[];
        Map map;
        BufferedOutputStream bufferedoutputstream;
        int i;
        int j;
        long l;
        if (zzcd1 != null)
        {
            zzcc = zzcd1.zzdl();
        } else
        {
            zzcc = null;
        }
        try
        {
            zzgp1 = new zzgp(adrequestinfoparcel);
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("AdRequestServiceImpl: Sending request: ").append(s1).toString());
            adrequestinfoparcel = new URL(s1);
            l = zzp.zzbB().elapsedRealtime();
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Error while connecting to ad server: ").append(adrequestinfoparcel.getMessage()).toString());
            return new AdResponseParcel(2);
        }
        i = 0;
        s1 = (HttpURLConnection)adrequestinfoparcel.openConnection();
        zzp.zzbx().zza(context, s, false, s1);
        if (!TextUtils.isEmpty(s2))
        {
            s1.addRequestProperty("x-afma-drt-cookie", s2);
        }
        if (!TextUtils.isEmpty(s3))
        {
            s1.addRequestProperty("Authorization", (new StringBuilder()).append("Bearer ").append(s3).toString());
        }
        if (zzgq1 == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        if (!TextUtils.isEmpty(zzgq1.zzfL()))
        {
            s1.setDoOutput(true);
            abyte0 = zzgq1.zzfL().getBytes();
            s1.setFixedLengthStreamingMode(abyte0.length);
            bufferedoutputstream = new BufferedOutputStream(s1.getOutputStream());
            bufferedoutputstream.write(abyte0);
            bufferedoutputstream.close();
        }
        j = s1.getResponseCode();
        map = s1.getHeaderFields();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        adrequestinfoparcel = adrequestinfoparcel.toString();
        context = zzp.zzbx().zza(new InputStreamReader(s1.getInputStream()));
        zza(((String) (adrequestinfoparcel)), map, ((String) (context)), j);
        zzgp1.zzb(adrequestinfoparcel, map, context);
        if (zzcd1 == null)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        zzcd1.zza(zzcc, new String[] {
            "ufe"
        });
        adrequestinfoparcel = zzgp1.zzj(l);
        s1.disconnect();
        return adrequestinfoparcel;
        zza(adrequestinfoparcel.toString(), map, null, j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        adrequestinfoparcel = s1.getHeaderField("Location");
        if (!TextUtils.isEmpty(adrequestinfoparcel))
        {
            break MISSING_BLOCK_LABEL_377;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("No location header to follow redirect.");
        adrequestinfoparcel = new AdResponseParcel(0);
        s1.disconnect();
        return adrequestinfoparcel;
        adrequestinfoparcel = new URL(adrequestinfoparcel);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_458;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("Too many redirects.");
        adrequestinfoparcel = new AdResponseParcel(0);
        s1.disconnect();
        return adrequestinfoparcel;
        com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Received error HTTP response code: ").append(j).toString());
        adrequestinfoparcel = new AdResponseParcel(0);
        s1.disconnect();
        return adrequestinfoparcel;
        zzgp1.zzh(map);
        s1.disconnect();
        break MISSING_BLOCK_LABEL_67;
        adrequestinfoparcel;
        s1.disconnect();
        throw adrequestinfoparcel;
    }

    public static zzgm zza(Context context, zzbr zzbr1, zzgl zzgl1)
    {
        Object obj = zzpm;
        obj;
        JVM INSTR monitorenter ;
        if (zzEL != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        Context context1 = context;
        if (context.getApplicationContext() != null)
        {
            context1 = context.getApplicationContext();
        }
        zzEL = new zzgm(context1, zzbr1, zzgl1);
        context = zzEL;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static zziq.zza zza(String s, zzcd zzcd1, zzcc zzcc)
    {
        return new zziq.zza(zzcd1, zzcc, s) {

            final String zzER;
            final zzcc zzES;
            final zzcd zzoC;

            public void zza(zzip zzip1, boolean flag)
            {
                zzoC.zza(zzES, new String[] {
                    "jsf"
                });
                zzoC.zzdm();
                zzip1.zza("AFMA_buildAdURL", zzER);
            }

            
            {
                zzoC = zzcd1;
                zzES = zzcc;
                zzER = s;
                super();
            }
        };
    }

    private static void zza(String s, Map map, String s1, int i)
    {
        if (com.google.android.gms.ads.internal.util.client.zzb.zzM(2))
        {
            com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("Http Response: {\n  URL:\n    ").append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s = map.keySet().iterator(); s.hasNext();)
                {
                    Object obj = (String)s.next();
                    com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("    ").append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("      ").append(s2).toString());
                    }
                }

            }
            com.google.android.gms.ads.internal.util.client.zzb.v("  Body:");
            if (s1 != null)
            {
                for (int j = 0; j < Math.min(s1.length(), 0x186a0); j += 1000)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.v(s1.substring(j, Math.min(s1.length(), j + 1000)));
                }

            } else
            {
                com.google.android.gms.ads.internal.util.client.zzb.v("    null");
            }
            com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("  Response Code:\n    ").append(i).append("\n}").toString());
        }
    }

    static zziq.zza zzb(String s, zzcd zzcd1, zzcc zzcc)
    {
        return zza(s, zzcd1, zzcc);
    }

    public void zza(AdRequestInfoParcel adrequestinfoparcel, zzk zzk)
    {
        zzp.zzbA().zzb(mContext, adrequestinfoparcel.zzqb);
        com.google.android.gms.internal.zzhu.zzb(new Runnable(adrequestinfoparcel, zzk) {

            final AdRequestInfoParcel zzEU;
            final zzgm zzEW;
            final zzk zzEX;

            public void run()
            {
                AdResponseParcel adresponseparcel;
                AdResponseParcel adresponseparcel1;
                try
                {
                    adresponseparcel = zzEW.zze(zzEU);
                }
                catch (Exception exception)
                {
                    zzp.zzbA().zzc(exception, true);
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response due to an Exception.", exception);
                    exception = null;
                }
                adresponseparcel1 = adresponseparcel;
                if (adresponseparcel == null)
                {
                    adresponseparcel1 = new AdResponseParcel(0);
                }
                try
                {
                    zzEX.zzb(adresponseparcel1);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to forward ad response.", remoteexception);
                }
            }

            
            {
                zzEW = zzgm.this;
                zzEU = adrequestinfoparcel;
                zzEX = zzk1;
                super();
            }
        });
    }

    public AdResponseParcel zze(AdRequestInfoParcel adrequestinfoparcel)
    {
        return zza(mContext, zzqU, zzEN, zzEM, adrequestinfoparcel);
    }

}
