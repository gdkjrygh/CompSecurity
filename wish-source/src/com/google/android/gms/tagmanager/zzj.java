// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzdd, zzdf, zzbg, zzar, 
//            zzcv, zzz

class zzj extends zzdd
{
    public static interface zza
    {

        public abstract zzar zzwm();
    }


    private static final String ID;
    private static final String URL;
    private static final String zzaCd;
    private static final String zzaCe;
    static final String zzaCf;
    private static final Set zzaCg = new HashSet();
    private final Context mContext;
    private final zza zzaCh;

    public zzj(Context context)
    {
        this(context, new zza(context) {

            final Context zzoH;

            public zzar zzwm()
            {
                return zzz.zzao(zzoH);
            }

            
            {
                zzoH = context;
                super();
            }
        });
    }

    zzj(Context context, zza zza1)
    {
        super(ID, new String[] {
            URL
        });
        zzaCh = zza1;
        mContext = context;
    }

    private boolean zzdt(String s)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = zzdv(s);
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (zzdu(s))
        {
            zzaCg.add(s);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_44;
        s;
        throw s;
        flag = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void zzF(Map map)
    {
        String s;
        if (map.get(zzaCe) != null)
        {
            s = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaCe));
        } else
        {
            s = null;
        }
        if (s == null || !zzdt(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.net.Uri.Builder builder = Uri.parse(zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(URL))).buildUpon();
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzaCd);
        if (map != null)
        {
            map = ((Map) (zzdf.zzl(map)));
            if (!(map instanceof List))
            {
                zzbg.zzak((new StringBuilder()).append("ArbitraryPixel: additional params not a list: not sending partial hit: ").append(builder.build().toString()).toString());
                return;
            }
            for (map = ((List)map).iterator(); map.hasNext();)
            {
                Object obj = map.next();
                if (!(obj instanceof Map))
                {
                    zzbg.zzak((new StringBuilder()).append("ArbitraryPixel: additional params contains non-map: not sending partial hit: ").append(builder.build().toString()).toString());
                    return;
                }
                obj = ((Map)obj).entrySet().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                    builder.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                }
            }

        }
        map = builder.build().toString();
        zzaCh.zzwm().zzdK(map);
        zzbg.zzam((new StringBuilder()).append("ArbitraryPixel: url = ").append(map).toString());
        if (s == null) goto _L1; else goto _L3
_L3:
        com/google/android/gms/tagmanager/zzj;
        JVM INSTR monitorenter ;
        zzaCg.add(s);
        com.google.android.gms.tagmanager.zzcv.zza(mContext, zzaCf, s, "true");
        com/google/android/gms/tagmanager/zzj;
        JVM INSTR monitorexit ;
        return;
        map;
        com/google/android/gms/tagmanager/zzj;
        JVM INSTR monitorexit ;
        throw map;
    }

    boolean zzdu(String s)
    {
        return mContext.getSharedPreferences(zzaCf, 0).contains(s);
    }

    boolean zzdv(String s)
    {
        return zzaCg.contains(s);
    }

    static 
    {
        ID = com.google.android.gms.internal.zza.zzaD.toString();
        URL = zzb.zzfM.toString();
        zzaCd = zzb.zzbC.toString();
        zzaCe = zzb.zzfL.toString();
        zzaCf = (new StringBuilder()).append("gtm_").append(ID).append("_unrepeatable").toString();
    }
}
