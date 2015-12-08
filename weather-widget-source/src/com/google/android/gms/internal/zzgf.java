// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzhj, zzif, zzhy, zzbb, 
//            zzie, zzcr, zzcv, zzby, 
//            zzbu, zzbc, zzgg, zzgh, 
//            zzhu, zzgi, zzig, zzan, 
//            zzih, zzdg, zzip, zzlh, 
//            zzlr

public class zzgf
    implements Callable
{
    public static interface zza
    {

        public abstract com.google.android.gms.ads.internal.formats.zzh.zza zza(zzgf zzgf1, JSONObject jsonobject)
            throws JSONException, InterruptedException, ExecutionException;
    }

    class zzb
    {

        final zzgf zzDb;
        public zzdg zzDk;

        zzb()
        {
            zzDb = zzgf.this;
            super();
        }
    }


    private static final long zzCS;
    private final Context mContext;
    private final zzhj.zza zzCF;
    private int zzCI;
    private final zzhy zzCT;
    private final zzn zzCU;
    private final zzbc zzCV;
    private boolean zzCW;
    private List zzCX;
    private final Object zzpc = new Object();
    private final zzan zzwh;

    public zzgf(Context context, zzn zzn1, zzbc zzbc1, zzhy zzhy1, zzan zzan, zzhj.zza zza1)
    {
        mContext = context;
        zzCU = zzn1;
        zzCT = zzhy1;
        zzCV = zzbc1;
        zzCF = zza1;
        zzwh = zzan;
        zzCW = false;
        zzCI = -2;
        zzCX = null;
    }

    private com.google.android.gms.ads.internal.formats.zzh.zza zza(zzbb zzbb1, zza zza1, JSONObject jsonobject)
        throws ExecutionException, InterruptedException, JSONException
    {
        if (zzft())
        {
            return null;
        }
        List list = zzc(jsonobject.getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
        if (list == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(list);
        }
        zzCX = list;
        zza1 = zza1.zza(this, jsonobject);
        if (zza1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.e("Failed to retrieve ad assets.");
            return null;
        } else
        {
            zza1.zza(new zzh(mContext, zzCU, zzbb1, zzwh, jsonobject, zza1, zzCF.zzGL.zzqb));
            return zza1;
        }
    }

    static zzn zza(zzgf zzgf1)
    {
        return zzgf1.zzCU;
    }

    private zzhj zza(com.google.android.gms.ads.internal.formats.zzh.zza zza1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        int j = zzCI;
        int i;
        i = j;
        if (zza1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        i = j;
        if (zzCI == -2)
        {
            i = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        if (i != -2)
        {
            zza1 = null;
        }
        return new zzhj(zzCF.zzGL.zzDy, null, zzCF.zzGM.zzyw, i, zzCF.zzGM.zzyx, zzCX, zzCF.zzGM.orientation, zzCF.zzGM.zzyA, zzCF.zzGL.zzDB, false, null, null, null, null, null, 0L, zzCF.zzqf, zzCF.zzGM.zzDW, zzCF.zzGI, zzCF.zzGJ, zzCF.zzGM.zzEc, zzCF.zzGF, zza1, zzCF.zzGL.zzDO);
        zza1;
        obj;
        JVM INSTR monitorexit ;
        throw zza1;
    }

    private zzih zza(JSONObject jsonobject, boolean flag, boolean flag1)
        throws JSONException
    {
        if (flag)
        {
            jsonobject = jsonobject.getString("url");
        } else
        {
            jsonobject = jsonobject.optString("url");
        }
        if (TextUtils.isEmpty(jsonobject))
        {
            zza(0, flag);
            return new zzif(null);
        }
        if (flag1)
        {
            return new zzif(new zzc(null, Uri.parse(jsonobject)));
        } else
        {
            return zzCT.zza(jsonobject, new zzhy.zza(flag, jsonobject) {

                final zzgf zzDb;
                final boolean zzDj;
                final String zzzF;

                public zzc zzfu()
                {
                    zzDb.zza(2, zzDj);
                    return null;
                }

                public Object zzfv()
                {
                    return zzfu();
                }

                public zzc zzg(InputStream inputstream)
                {
                    try
                    {
                        inputstream = zzlr.zzk(inputstream);
                    }
                    // Misplaced declaration of an exception variable
                    catch (InputStream inputstream)
                    {
                        inputstream = null;
                    }
                    if (inputstream == null)
                    {
                        zzDb.zza(2, zzDj);
                        return null;
                    }
                    inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
                    if (inputstream == null)
                    {
                        zzDb.zza(2, zzDj);
                        return null;
                    } else
                    {
                        return new zzc(new BitmapDrawable(Resources.getSystem(), inputstream), Uri.parse(zzzF));
                    }
                }

                public Object zzh(InputStream inputstream)
                {
                    return zzg(inputstream);
                }

            
            {
                zzDb = zzgf.this;
                zzDj = flag;
                zzzF = s;
                super();
            }
            });
        }
    }

    private void zza(com.google.android.gms.ads.internal.formats.zzh.zza zza1, zzbb zzbb1)
    {
        if (!(zza1 instanceof zzf))
        {
            return;
        } else
        {
            Object obj = (zzf)zza1;
            zza1 = new zzb();
            obj = new zzdg(((zzf) (obj))) {

                final zzgf zzDb;
                final zzf zzDe;

                public void zza(zzip zzip, Map map)
                {
                    zzip = (String)map.get("asset");
                    zzgf.zza(zzDb, zzDe, zzip);
                }

            
            {
                zzDb = zzgf.this;
                zzDe = zzf1;
                super();
            }
            };
            zza1.zzDk = ((zzdg) (obj));
            zzbb1.zza("/nativeAdCustomClick", ((zzdg) (obj)));
            return;
        }
    }

    static void zza(zzgf zzgf1, zzcr zzcr1, String s)
    {
        zzgf1.zzb(zzcr1, s);
    }

    private Integer zzb(JSONObject jsonobject, String s)
    {
        int i;
        try
        {
            jsonobject = jsonobject.getJSONObject(s);
            i = Color.rgb(jsonobject.getInt("r"), jsonobject.getInt("g"), jsonobject.getInt("b"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return Integer.valueOf(i);
    }

    private JSONObject zzb(zzbb zzbb1)
        throws TimeoutException, JSONException
    {
        if (zzft())
        {
            return null;
        } else
        {
            zzie zzie1 = new zzie();
            zzb zzb1 = new zzb();
            zzdg zzdg = new zzdg(zzbb1, zzb1, zzie1) {

                final zzbb zzCY;
                final zzb zzCZ;
                final zzie zzDa;
                final zzgf zzDb;

                public void zza(zzip zzip, Map map)
                {
                    zzCY.zzb("/nativeAdPreProcess", zzCZ.zzDk);
                    try
                    {
                        zzip = (String)map.get("success");
                        if (!TextUtils.isEmpty(zzip))
                        {
                            zzDa.zzf((new JSONObject(zzip)).getJSONArray("ads").getJSONObject(0));
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (zzip zzip)
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzb("Malformed native JSON response.", zzip);
                    }
                    zzDb.zzB(0);
                    zzx.zza(zzDb.zzft(), "Unable to set the ad state error!");
                    zzDa.zzf(null);
                }

            
            {
                zzDb = zzgf.this;
                zzCY = zzbb1;
                zzCZ = zzb1;
                zzDa = zzie1;
                super();
            }
            };
            zzb1.zzDk = zzdg;
            zzbb1.zza("/nativeAdPreProcess", zzdg);
            zzbb1.zza("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(zzCF.zzGM.body));
            return (JSONObject)zzie1.get(zzCS, TimeUnit.MILLISECONDS);
        }
    }

    private void zzb(zzcr zzcr1, String s)
    {
        zzcv zzcv1;
        try
        {
            zzcv1 = zzCU.zzr(zzcr1.getCustomTemplateId());
        }
        // Misplaced declaration of an exception variable
        catch (zzcr zzcr1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Failed to call onCustomClick for asset ").append(s).append(".").toString(), zzcr1);
            return;
        }
        if (zzcv1 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        zzcv1.zza(zzcr1, s);
    }

    private String[] zzc(JSONObject jsonobject, String s)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray(s);
        if (jsonobject == null)
        {
            return null;
        }
        s = new String[jsonobject.length()];
        for (int i = 0; i < jsonobject.length(); i++)
        {
            s[i] = jsonobject.getString(i);
        }

        return s;
    }

    private zzbb zzfs()
        throws CancellationException, ExecutionException, InterruptedException, TimeoutException
    {
        if (zzft())
        {
            return null;
        }
        String s = (String)zzby.zzuU.get();
        Object obj;
        if (zzCF.zzGM.zzAT.indexOf("https") == 0)
        {
            obj = "https:";
        } else
        {
            obj = "http:";
        }
        obj = (new StringBuilder()).append(((String) (obj))).append(s).toString();
        obj = (zzbb)zzCV.zza(mContext, zzCF.zzGL.zzqb, ((String) (obj)), zzwh).get(zzCS, TimeUnit.MILLISECONDS);
        ((zzbb) (obj)).zza(zzCU, zzCU, zzCU, zzCU, false, null, null, null, null);
        return ((zzbb) (obj));
    }

    public Object call()
        throws Exception
    {
        return zzfr();
    }

    public void zzB(int i)
    {
        synchronized (zzpc)
        {
            zzCW = true;
            zzCI = i;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzih zza(JSONObject jsonobject, String s, boolean flag, boolean flag1)
        throws JSONException
    {
        if (flag)
        {
            jsonobject = jsonobject.getJSONObject(s);
        } else
        {
            jsonobject = jsonobject.optJSONObject(s);
        }
        s = jsonobject;
        if (jsonobject == null)
        {
            s = new JSONObject();
        }
        return zza(((JSONObject) (s)), flag, flag1);
    }

    public List zza(JSONObject jsonobject, String s, boolean flag, boolean flag1, boolean flag2)
        throws JSONException
    {
        ArrayList arraylist;
        if (flag)
        {
            jsonobject = jsonobject.getJSONArray(s);
        } else
        {
            jsonobject = jsonobject.optJSONArray(s);
        }
        arraylist = new ArrayList();
        if (jsonobject == null || jsonobject.length() == 0)
        {
            zza(0, flag);
            return arraylist;
        }
        int i;
        int j;
        if (flag2)
        {
            i = jsonobject.length();
        } else
        {
            i = 1;
        }
        for (j = 0; j < i; j++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(j);
            s = jsonobject1;
            if (jsonobject1 == null)
            {
                s = new JSONObject();
            }
            arraylist.add(zza(((JSONObject) (s)), flag, flag1));
        }

        return arraylist;
    }

    public Future zza(JSONObject jsonobject, String s, boolean flag)
        throws JSONException
    {
        s = jsonobject.getJSONObject(s);
        boolean flag1 = s.optBoolean("require", true);
        jsonobject = s;
        if (s == null)
        {
            jsonobject = new JSONObject();
        }
        return zza(jsonobject, flag1, flag);
    }

    public void zza(int i, boolean flag)
    {
        if (flag)
        {
            zzB(i);
        }
    }

    protected zza zzd(JSONObject jsonobject)
        throws JSONException, TimeoutException
    {
        if (zzft())
        {
            return null;
        }
        String s = jsonobject.getString("template_id");
        boolean flag;
        boolean flag1;
        if (zzCF.zzGL.zzqt != null)
        {
            flag = zzCF.zzGL.zzqt.zzwn;
        } else
        {
            flag = false;
        }
        if (zzCF.zzGL.zzqt != null)
        {
            flag1 = zzCF.zzGL.zzqt.zzwp;
        } else
        {
            flag1 = false;
        }
        if ("2".equals(s))
        {
            return new zzgg(flag, flag1);
        }
        if ("1".equals(s))
        {
            return new zzgh(flag, flag1);
        }
        if ("3".equals(s))
        {
            String s1 = jsonobject.getString("custom_template_id");
            zzie zzie1 = new zzie();
            zzhu.zzHK.post(new Runnable(zzie1, s1) {

                final zzgf zzDb;
                final zzie zzDc;
                final String zzDd;

                public void run()
                {
                    zzDc.zzf(zzgf.zza(zzDb).zzbq().get(zzDd));
                }

            
            {
                zzDb = zzgf.this;
                zzDc = zzie1;
                zzDd = s;
                super();
            }
            });
            if (zzie1.get(zzCS, TimeUnit.MILLISECONDS) != null)
            {
                return new zzgi(flag);
            }
            com.google.android.gms.ads.internal.util.client.zzb.e((new StringBuilder()).append("No handler for custom template: ").append(jsonobject.getString("custom_template_id")).toString());
        } else
        {
            zzB(0);
        }
        return null;
    }

    public zzih zze(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONObject("attribution");
        if (jsonobject == null)
        {
            return new zzif(null);
        } else
        {
            String s = jsonobject.optString("text");
            int i = jsonobject.optInt("text_size", -1);
            Integer integer = zzb(jsonobject, "text_color");
            Integer integer1 = zzb(jsonobject, "bg_color");
            return zzig.zza(zza(jsonobject, "image", false, false), new zzig.zza(s, integer1, integer, i) {

                final zzgf zzDb;
                final String zzDf;
                final Integer zzDg;
                final Integer zzDh;
                final int zzDi;

                public com.google.android.gms.ads.internal.formats.zza zza(zzc zzc1)
                {
                    if (zzc1 == null) goto _L2; else goto _L1
_L1:
                    if (!TextUtils.isEmpty(zzDf)) goto _L3; else goto _L2
_L3:
                    String s1;
                    Drawable drawable;
                    Integer integer2;
                    Integer integer3;
                    s1 = zzDf;
                    drawable = (Drawable)com.google.android.gms.dynamic.zze.zzp(zzc1.zzdr());
                    integer2 = zzDg;
                    integer3 = zzDh;
                    if (zzDi <= 0) goto _L5; else goto _L4
_L4:
                    zzc1 = Integer.valueOf(zzDi);
_L6:
                    zzc1 = new com.google.android.gms.ads.internal.formats.zza(s1, drawable, integer2, integer3, zzc1);
                    break MISSING_BLOCK_LABEL_94;
                    zzc1;
                    com.google.android.gms.ads.internal.util.client.zzb.zzb("Could not get attribution icon", zzc1);
                    return null;
_L5:
                    zzc1 = null;
                    if (true) goto _L6; else goto _L2
_L2:
                    zzc1 = null;
                    return zzc1;
                }

                public Object zze(Object obj)
                {
                    return zza((zzc)obj);
                }

            
            {
                zzDb = zzgf.this;
                zzDf = s;
                zzDg = integer;
                zzDh = integer1;
                zzDi = i;
                super();
            }
            });
        }
    }

    public zzhj zzfr()
    {
        Object obj;
        obj = zzfs();
        Object obj2 = zzb(((zzbb) (obj)));
        obj2 = zza(((zzbb) (obj)), zzd(((JSONObject) (obj2))), ((JSONObject) (obj2)));
        zza(((com.google.android.gms.ads.internal.formats.zzh.zza) (obj2)), ((zzbb) (obj)));
        obj = zza(((com.google.android.gms.ads.internal.formats.zzh.zza) (obj2)));
        return ((zzhj) (obj));
        Object obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Malformed native JSON response.", ((Throwable) (obj1)));
_L2:
        if (!zzCW)
        {
            zzB(0);
        }
        return zza(((com.google.android.gms.ads.internal.formats.zzh.zza) (null)));
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Timeout when loading native ad.", ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean zzft()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzCW;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        zzCS = TimeUnit.SECONDS.toMillis(60L);
    }
}
