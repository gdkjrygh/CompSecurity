// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzc;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zziy;
import com.google.android.gms.internal.zziz;
import com.google.android.gms.internal.zzja;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.internal.zzob;
import com.google.android.gms.internal.zzoh;
import com.google.android.gms.internal.zzok;
import com.google.android.gms.internal.zzol;
import com.google.android.gms.internal.zzom;
import com.google.android.gms.internal.zzon;
import com.google.android.gms.internal.zzoo;
import com.google.android.gms.internal.zzop;
import com.google.android.gms.internal.zzoq;
import com.google.android.gms.internal.zzor;
import com.google.android.gms.internal.zzos;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            zzc, GoogleAnalytics

public class zzb extends zzc
    implements zzoh
{

    private static DecimalFormat zzKk;
    private final zzf zzKa;
    private final Uri zzKl;
    private final boolean zzKm;
    private final boolean zzKn;
    private final String zztw;

    public zzb(zzf zzf1, String s)
    {
        this(zzf1, s, true, false);
    }

    public zzb(zzf zzf1, String s, boolean flag, boolean flag1)
    {
        super(zzf1);
        zzx.zzcs(s);
        zzKa = zzf1;
        zztw = s;
        zzKm = flag;
        zzKn = flag1;
        zzKl = zzaP(zztw);
    }

    private static void zza(Map map, String s, double d)
    {
        if (d != 0.0D)
        {
            map.put(s, zzb(d));
        }
    }

    private static void zza(Map map, String s, int i, int j)
    {
        if (i > 0 && j > 0)
        {
            map.put(s, (new StringBuilder()).append(i).append("x").append(j).toString());
        }
    }

    private static void zza(Map map, String s, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            map.put(s, s1);
        }
    }

    private static void zza(Map map, String s, boolean flag)
    {
        if (flag)
        {
            map.put(s, "1");
        }
    }

    static Uri zzaP(String s)
    {
        zzx.zzcs(s);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(s);
        return builder.build();
    }

    static String zzb(double d)
    {
        if (zzKk == null)
        {
            zzKk = new DecimalFormat("0.######");
        }
        return zzKk.format(d);
    }

    public static Map zzc(zzob zzob1)
    {
        HashMap hashmap = new HashMap();
        Object obj = (zzja)zzob1.zzd(com/google/android/gms/internal/zzja);
        if (obj != null)
        {
            obj = ((zzja) (obj)).zzhJ().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s = zzh(entry.getValue());
                if (s != null)
                {
                    hashmap.put(entry.getKey(), s);
                }
            } while (true);
        }
        obj = (zzjb)zzob1.zzd(com/google/android/gms/internal/zzjb);
        if (obj != null)
        {
            zza(hashmap, "t", ((zzjb) (obj)).zzhK());
            zza(hashmap, "cid", ((zzjb) (obj)).getClientId());
            zza(hashmap, "uid", ((zzjb) (obj)).getUserId());
            zza(hashmap, "sc", ((zzjb) (obj)).zzhN());
            zza(hashmap, "sf", ((zzjb) (obj)).zzhP());
            zza(hashmap, "ni", ((zzjb) (obj)).zzhO());
            zza(hashmap, "adid", ((zzjb) (obj)).zzhL());
            zza(hashmap, "ate", ((zzjb) (obj)).zzhM());
        }
        obj = (zzoq)zzob1.zzd(com/google/android/gms/internal/zzoq);
        if (obj != null)
        {
            zza(hashmap, "cd", ((zzoq) (obj)).zzxT());
            zza(hashmap, "a", ((zzoq) (obj)).zzbp());
            zza(hashmap, "dr", ((zzoq) (obj)).zzxW());
        }
        obj = (zzoo)zzob1.zzd(com/google/android/gms/internal/zzoo);
        if (obj != null)
        {
            zza(hashmap, "ec", ((zzoo) (obj)).zzxQ());
            zza(hashmap, "ea", ((zzoo) (obj)).getAction());
            zza(hashmap, "el", ((zzoo) (obj)).getLabel());
            zza(hashmap, "ev", ((zzoo) (obj)).getValue());
        }
        obj = (zzol)zzob1.zzd(com/google/android/gms/internal/zzol);
        if (obj != null)
        {
            zza(hashmap, "cn", ((zzol) (obj)).getName());
            zza(hashmap, "cs", ((zzol) (obj)).getSource());
            zza(hashmap, "cm", ((zzol) (obj)).zzxB());
            zza(hashmap, "ck", ((zzol) (obj)).zzxC());
            zza(hashmap, "cc", ((zzol) (obj)).getContent());
            zza(hashmap, "ci", ((zzol) (obj)).getId());
            zza(hashmap, "anid", ((zzol) (obj)).zzxD());
            zza(hashmap, "gclid", ((zzol) (obj)).zzxE());
            zza(hashmap, "dclid", ((zzol) (obj)).zzxF());
            zza(hashmap, "aclid", ((zzol) (obj)).zzxG());
        }
        obj = (zzop)zzob1.zzd(com/google/android/gms/internal/zzop);
        if (obj != null)
        {
            zza(hashmap, "exd", ((zzop) (obj)).getDescription());
            zza(hashmap, "exf", ((zzop) (obj)).zzxR());
        }
        obj = (zzor)zzob1.zzd(com/google/android/gms/internal/zzor);
        if (obj != null)
        {
            zza(hashmap, "sn", ((zzor) (obj)).zzya());
            zza(hashmap, "sa", ((zzor) (obj)).getAction());
            zza(hashmap, "st", ((zzor) (obj)).getTarget());
        }
        obj = (zzos)zzob1.zzd(com/google/android/gms/internal/zzos);
        if (obj != null)
        {
            zza(hashmap, "utv", ((zzos) (obj)).zzyb());
            zza(hashmap, "utt", ((zzos) (obj)).getTimeInMillis());
            zza(hashmap, "utc", ((zzos) (obj)).zzxQ());
            zza(hashmap, "utl", ((zzos) (obj)).getLabel());
        }
        obj = (zziy)zzob1.zzd(com/google/android/gms/internal/zziy);
        if (obj != null)
        {
            obj = ((zziy) (obj)).zzhH().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s1 = com.google.android.gms.analytics.zzc.zzP(((Integer)entry1.getKey()).intValue());
                if (!TextUtils.isEmpty(s1))
                {
                    hashmap.put(s1, entry1.getValue());
                }
            } while (true);
        }
        obj = (zziz)zzob1.zzd(com/google/android/gms/internal/zziz);
        if (obj != null)
        {
            obj = ((zziz) (obj)).zzhI().entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s2 = com.google.android.gms.analytics.zzc.zzR(((Integer)entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(s2))
                {
                    hashmap.put(s2, zzb(((Double)entry2.getValue()).doubleValue()));
                }
            } while (true);
        }
        obj = (zzon)zzob1.zzd(com/google/android/gms/internal/zzon);
        if (obj != null)
        {
            Object obj1 = ((zzon) (obj)).zzxM();
            if (obj1 != null)
            {
                for (obj1 = ((ProductAction) (obj1)).build().entrySet().iterator(); ((Iterator) (obj1)).hasNext();)
                {
                    java.util.Map.Entry entry4 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                    if (((String)entry4.getKey()).startsWith("&"))
                    {
                        hashmap.put(((String)entry4.getKey()).substring(1), entry4.getValue());
                    } else
                    {
                        hashmap.put(entry4.getKey(), entry4.getValue());
                    }
                }

            }
            obj1 = ((zzon) (obj)).zzxP().iterator();
            for (int i = 1; ((Iterator) (obj1)).hasNext(); i++)
            {
                hashmap.putAll(((Promotion)((Iterator) (obj1)).next()).zzaV(com.google.android.gms.analytics.zzc.zzV(i)));
            }

            obj1 = ((zzon) (obj)).zzxN().iterator();
            for (int j = 1; ((Iterator) (obj1)).hasNext(); j++)
            {
                hashmap.putAll(((Product)((Iterator) (obj1)).next()).zzaV(com.google.android.gms.analytics.zzc.zzT(j)));
            }

            obj = ((zzon) (obj)).zzxO().entrySet().iterator();
            for (int k = 1; ((Iterator) (obj)).hasNext(); k++)
            {
                java.util.Map.Entry entry3 = (java.util.Map.Entry)((Iterator) (obj)).next();
                Object obj2 = (List)entry3.getValue();
                String s3 = com.google.android.gms.analytics.zzc.zzY(k);
                obj2 = ((List) (obj2)).iterator();
                for (int l = 1; ((Iterator) (obj2)).hasNext(); l++)
                {
                    hashmap.putAll(((Product)((Iterator) (obj2)).next()).zzaV((new StringBuilder()).append(s3).append(com.google.android.gms.analytics.zzc.zzW(l)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry3.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s3).append("nm").toString(), entry3.getKey());
                }
            }

        }
        obj = (zzom)zzob1.zzd(com/google/android/gms/internal/zzom);
        if (obj != null)
        {
            zza(hashmap, "ul", ((zzom) (obj)).getLanguage());
            zza(hashmap, "sd", ((zzom) (obj)).zzxH());
            zza(hashmap, "sr", ((zzom) (obj)).zzxI(), ((zzom) (obj)).zzxJ());
            zza(hashmap, "vp", ((zzom) (obj)).zzxK(), ((zzom) (obj)).zzxL());
        }
        zzob1 = (zzok)zzob1.zzd(com/google/android/gms/internal/zzok);
        if (zzob1 != null)
        {
            zza(hashmap, "an", zzob1.zzjZ());
            zza(hashmap, "aid", zzob1.zztW());
            zza(hashmap, "aiid", zzob1.zzxA());
            zza(hashmap, "av", zzob1.zzkb());
        }
        return hashmap;
    }

    private static String zzh(Object obj)
    {
        if (obj == null)
        {
            obj = null;
        } else
        if (obj instanceof String)
        {
            String s = (String)obj;
            obj = s;
            if (TextUtils.isEmpty(s))
            {
                return null;
            }
        } else
        {
            if (obj instanceof Double)
            {
                obj = (Double)obj;
                if (((Double) (obj)).doubleValue() != 0.0D)
                {
                    return zzb(((Double) (obj)).doubleValue());
                } else
                {
                    return null;
                }
            }
            if (obj instanceof Boolean)
            {
                if (obj != Boolean.FALSE)
                {
                    return "1";
                } else
                {
                    return null;
                }
            } else
            {
                return String.valueOf(obj);
            }
        }
        return ((String) (obj));
    }

    private static String zzy(Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append((String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
            if (stringbuilder.length() != 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((String)entry.getKey());
            stringbuilder.append("=");
        }

        return stringbuilder.toString();
    }

    public void zzb(zzob zzob1)
    {
        zzx.zzv(zzob1);
        zzx.zzb(zzob1.zzxm(), "Can't deliver not submitted measurement");
        zzx.zzci("deliver should be called on worker thread");
        Object obj1 = zzob1.zzxh();
        Object obj = (zzjb)((zzob) (obj1)).zze(com/google/android/gms/internal/zzjb);
        if (TextUtils.isEmpty(((zzjb) (obj)).zzhK()))
        {
            zzie().zzh(zzc(((zzob) (obj1))), "Ignoring measurement without type");
        } else
        {
            if (TextUtils.isEmpty(((zzjb) (obj)).getClientId()))
            {
                zzie().zzh(zzc(((zzob) (obj1))), "Ignoring measurement without client id");
                return;
            }
            if (!zzKa.zzis().getAppOptOut())
            {
                double d = ((zzjb) (obj)).zzhP();
                if (zzam.zza(d, ((zzjb) (obj)).getClientId()))
                {
                    zzb("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
                    return;
                }
                obj1 = zzc(((zzob) (obj1)));
                ((Map) (obj1)).put("v", "1");
                ((Map) (obj1)).put("_v", zze.zzLB);
                ((Map) (obj1)).put("tid", zztw);
                if (zzKa.zzis().isDryRunEnabled())
                {
                    zzc("Dry run is enabled. GoogleAnalytics would have sent", zzy(((Map) (obj1))));
                    return;
                }
                HashMap hashmap = new HashMap();
                zzam.zzb(hashmap, "uid", ((zzjb) (obj)).getUserId());
                Object obj2 = (zzok)zzob1.zzd(com/google/android/gms/internal/zzok);
                if (obj2 != null)
                {
                    zzam.zzb(hashmap, "an", ((zzok) (obj2)).zzjZ());
                    zzam.zzb(hashmap, "aid", ((zzok) (obj2)).zztW());
                    zzam.zzb(hashmap, "av", ((zzok) (obj2)).zzkb());
                    zzam.zzb(hashmap, "aiid", ((zzok) (obj2)).zzxA());
                }
                obj2 = ((zzjb) (obj)).getClientId();
                String s = zztw;
                boolean flag;
                if (!TextUtils.isEmpty(((zzjb) (obj)).zzhL()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = new zzh(0L, ((String) (obj2)), s, flag, 0L, hashmap);
                ((Map) (obj1)).put("_s", String.valueOf(zzhz().zza(((zzh) (obj)))));
                zzob1 = new zzab(zzie(), ((Map) (obj1)), zzob1.zzxk(), true);
                zzhz().zza(zzob1);
                return;
            }
        }
    }

    public Uri zzhs()
    {
        return zzKl;
    }
}
