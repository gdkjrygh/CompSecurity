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
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.common.internal.zzv;
import java.io.IOException;
import java.io.InputStream;
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
//            zzbi, zzfa, zzfs, zzy, 
//            zzat, zzap, zzz, zzft, 
//            zzfo, zzel, zzem, zzfu, 
//            zzk, zzfv, zzbs, zzgd, 
//            zzbe, zzhy

public class zzek
    implements Callable
{
    public static interface zza
    {

        public abstract zzbi.zza zza(zzek zzek1, JSONObject jsonobject)
            throws JSONException, InterruptedException, ExecutionException;
    }

    class zzb
    {

        final zzek zzyD;
        public zzbs zzyJ;

        zzb()
        {
            zzyD = zzek.this;
            super();
        }
    }


    private static final long zzyv;
    private final Context mContext;
    private final Object zzoe = new Object();
    private final com.google.android.gms.ads.internal.zza zzsS;
    private final zzk zzsW;
    private final zzfa.zza zzyh;
    private int zzyl;
    private final zzfo zzyw;
    private final zzz zzyx;
    private boolean zzyy;
    private List zzyz;

    public zzek(Context context, com.google.android.gms.ads.internal.zza zza1, zzz zzz1, zzfo zzfo1, zzk zzk, zzfa.zza zza2)
    {
        mContext = context;
        zzsS = zza1;
        zzyw = zzfo1;
        zzyx = zzz1;
        zzyh = zza2;
        zzsW = zzk;
        zzyy = false;
        zzyl = -2;
        zzyz = null;
    }

    private zzbi.zza zza(zzy zzy1, zza zza1, JSONObject jsonobject)
        throws ExecutionException, InterruptedException, JSONException
    {
        if (zzek())
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
        zzyz = list;
        zza1 = zza1.zza(this, jsonobject);
        if (zza1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzak("Failed to retrieve ad assets.");
            return null;
        } else
        {
            zza1.zza(new zzbi(mContext, zzsS, zzy1, zzsW, jsonobject, zza1));
            return zza1;
        }
    }

    private zzfa zza(zzbi.zza zza1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        int j = zzyl;
        int i;
        i = j;
        if (zza1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        i = j;
        if (zzyl == -2)
        {
            i = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        if (i != -2)
        {
            zza1 = null;
        }
        return new zzfa(zzyh.zzBy.zzyW, null, zzyh.zzBz.zzuC, i, zzyh.zzBz.zzuD, zzyz, zzyh.zzBz.orientation, zzyh.zzBz.zzuG, zzyh.zzBy.zzyZ, false, null, null, null, null, null, 0L, zzyh.zzmP, zzyh.zzBz.zzzs, zzyh.zzBv, zzyh.zzBw, zzyh.zzBz.zzzy, zzyh.zzBs, zza1, zzyh.zzBy.zzzm);
        zza1;
        obj;
        JVM INSTR monitorexit ;
        throw zza1;
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

    private JSONObject zzd(zzy zzy1)
        throws TimeoutException, JSONException
    {
        if (zzek())
        {
            return null;
        } else
        {
            zzfs zzfs1 = new zzfs();
            zzb zzb1 = new zzb();
            zzbs zzbs = new zzbs(zzy1, zzb1, zzfs1) {

                final zzy zzyA;
                final zzb zzyB;
                final zzfs zzyC;
                final zzek zzyD;

                public void zza(zzgd zzgd, Map map)
                {
                    zzyA.zzb("/nativeAdPreProcess", zzyB.zzyJ);
                    try
                    {
                        zzgd = (String)map.get("success");
                        if (!TextUtils.isEmpty(zzgd))
                        {
                            zzyC.zzc((new JSONObject(zzgd)).getJSONArray("ads").getJSONObject(0));
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (zzgd zzgd)
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzb("Malformed native JSON response.", zzgd);
                    }
                    zzyD.zzv(0);
                    com.google.android.gms.common.internal.zzv.zza(zzyD.zzek(), "Unable to set the ad state error!");
                    zzyC.zzc(null);
                }

            
            {
                zzyD = zzek.this;
                zzyA = zzy1;
                zzyB = zzb1;
                zzyC = zzfs1;
                super();
            }
            };
            zzb1.zzyJ = zzbs;
            zzy1.zza("/nativeAdPreProcess", zzbs);
            zzy1.zza("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(zzyh.zzBz.zzzr));
            return (JSONObject)zzfs1.get(zzyv, TimeUnit.MILLISECONDS);
        }
    }

    private zzy zzej()
        throws CancellationException, ExecutionException, InterruptedException, TimeoutException
    {
        if (zzek())
        {
            return null;
        }
        String s = (String)zzat.zzrU.get();
        Object obj;
        if (zzyh.zzBz.zzwB.indexOf("https") == 0)
        {
            obj = "https:";
        } else
        {
            obj = "http:";
        }
        obj = (new StringBuilder()).append(((String) (obj))).append(s).toString();
        obj = (zzy)zzyx.zza(mContext, zzyh.zzBy.zzmJ, ((String) (obj))).get(zzyv, TimeUnit.MILLISECONDS);
        ((zzy) (obj)).zza(zzsS, zzsS, zzsS, zzsS, false, zzsS, zzsS, null, zzsS);
        return ((zzy) (obj));
    }

    public Object call()
        throws Exception
    {
        return zzei();
    }

    public zzfv zza(JSONObject jsonobject, String s, boolean flag)
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
        if (flag)
        {
            jsonobject = s.getString("url");
        } else
        {
            jsonobject = s.optString("url");
        }
        if (TextUtils.isEmpty(jsonobject))
        {
            zza(0, flag);
            return new zzft(null);
        } else
        {
            return zzyw.zza(jsonobject, new zzfo.zza(flag) {

                final zzek zzyD;
                final boolean zzyI;

                public Drawable zza(InputStream inputstream)
                {
                    try
                    {
                        inputstream = zzhy.zzd(inputstream);
                    }
                    // Misplaced declaration of an exception variable
                    catch (InputStream inputstream)
                    {
                        inputstream = null;
                    }
                    if (inputstream == null)
                    {
                        zzyD.zza(2, zzyI);
                        return null;
                    }
                    inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
                    if (inputstream == null)
                    {
                        zzyD.zza(2, zzyI);
                        return null;
                    } else
                    {
                        return new BitmapDrawable(Resources.getSystem(), inputstream);
                    }
                }

                public Object zzb(InputStream inputstream)
                {
                    return zza(inputstream);
                }

                public Drawable zzel()
                {
                    zzyD.zza(2, zzyI);
                    return null;
                }

                public Object zzem()
                {
                    return zzel();
                }

            
            {
                zzyD = zzek.this;
                zzyI = flag;
                super();
            }
            });
        }
    }

    public void zza(int i, boolean flag)
    {
        if (flag)
        {
            zzv(i);
        }
    }

    protected zza zzd(JSONObject jsonobject)
        throws JSONException
    {
        if (zzek())
        {
            return null;
        }
        jsonobject = jsonobject.getString("template_id");
        if ("2".equals(jsonobject))
        {
            return new zzel();
        }
        if ("1".equals(jsonobject))
        {
            return new zzem();
        } else
        {
            zzv(0);
            return null;
        }
    }

    public zzfv zze(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONObject("attribution");
        if (jsonobject == null)
        {
            return new zzft(null);
        } else
        {
            String s = jsonobject.optString("text");
            int i = jsonobject.optInt("text_size", -1);
            Integer integer = zzb(jsonobject, "text_color");
            Integer integer1 = zzb(jsonobject, "bg_color");
            return com.google.android.gms.internal.zzfu.zza(zza(jsonobject, "image", false), new zzfu.zza(s, integer1, integer, i) {

                final zzek zzyD;
                final String zzyE;
                final Integer zzyF;
                final Integer zzyG;
                final int zzyH;

                public zzbe zza(Drawable drawable)
                {
                    Integer integer2 = null;
                    if (drawable == null || TextUtils.isEmpty(zzyE))
                    {
                        return null;
                    }
                    String s1 = zzyE;
                    Integer integer3 = zzyF;
                    Integer integer4 = zzyG;
                    if (zzyH > 0)
                    {
                        integer2 = Integer.valueOf(zzyH);
                    }
                    return new zzbe(s1, drawable, integer3, integer4, integer2);
                }

                public Object zzb(Object obj)
                {
                    return zza((Drawable)obj);
                }

            
            {
                zzyD = zzek.this;
                zzyE = s;
                zzyF = integer;
                zzyG = integer1;
                zzyH = i;
                super();
            }
            });
        }
    }

    public zzfa zzei()
    {
        Object obj;
        obj = zzej();
        JSONObject jsonobject = zzd(((zzy) (obj)));
        obj = zza(zza(((zzy) (obj)), zzd(jsonobject), jsonobject));
        return ((zzfa) (obj));
        Object obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Malformed native JSON response.", ((Throwable) (obj1)));
_L2:
        if (!zzyy)
        {
            zzv(0);
        }
        return zza(null);
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

    public boolean zzek()
    {
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzyy;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzv(int i)
    {
        synchronized (zzoe)
        {
            zzyy = true;
            zzyl = i;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        zzyv = TimeUnit.SECONDS.toMillis(60L);
    }
}
