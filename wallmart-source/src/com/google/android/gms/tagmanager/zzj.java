// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
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

        public abstract zzar zzzy();
    }


    private static final String ID;
    private static final String URL;
    private static final String zzaOL;
    private static final String zzaOM;
    static final String zzaON;
    private static final Set zzaOO = new HashSet();
    private final Context mContext;
    private final zza zzaOP;

    public zzj(Context context)
    {
        this(context, new zza(context) {

            final Context zzrn;

            public zzar zzzy()
            {
                return zzz.zzaM(zzrn);
            }

            
            {
                zzrn = context;
                super();
            }
        });
    }

    zzj(Context context, zza zza1)
    {
        super(ID, new String[] {
            URL
        });
        zzaOP = zza1;
        mContext = context;
    }

    private boolean zzeq(String s)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = zzes(s);
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (zzer(s))
        {
            zzaOO.add(s);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_44;
        s;
        throw s;
        flag = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void zzI(Map map)
    {
        String s;
        if (map.get(zzaOM) != null)
        {
            s = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaOM));
        } else
        {
            s = null;
        }
        if (s == null || !zzeq(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.net.Uri.Builder builder = Uri.parse(zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(URL))).buildUpon();
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaOL);
        if (map != null)
        {
            map = ((Map) (zzdf.zzl(map)));
            if (!(map instanceof List))
            {
                zzbg.e((new StringBuilder()).append("ArbitraryPixel: additional params not a list: not sending partial hit: ").append(builder.build().toString()).toString());
                return;
            }
            for (map = ((List)map).iterator(); map.hasNext();)
            {
                Object obj = map.next();
                if (!(obj instanceof Map))
                {
                    zzbg.e((new StringBuilder()).append("ArbitraryPixel: additional params contains non-map: not sending partial hit: ").append(builder.build().toString()).toString());
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
        zzaOP.zzzy().zzeH(map);
        zzbg.v((new StringBuilder()).append("ArbitraryPixel: url = ").append(map).toString());
        if (s == null) goto _L1; else goto _L3
_L3:
        com/google/android/gms/tagmanager/zzj;
        JVM INSTR monitorenter ;
        zzaOO.add(s);
        zzcv.zzb(mContext, zzaON, s, "true");
        com/google/android/gms/tagmanager/zzj;
        JVM INSTR monitorexit ;
        return;
        map;
        com/google/android/gms/tagmanager/zzj;
        JVM INSTR monitorexit ;
        throw map;
    }

    boolean zzer(String s)
    {
        return mContext.getSharedPreferences(zzaON, 0).contains(s);
    }

    boolean zzes(String s)
    {
        return zzaOO.contains(s);
    }

    static 
    {
        ID = zzad.zzco.toString();
        URL = zzae.zzhx.toString();
        zzaOL = zzae.zzdn.toString();
        zzaOM = zzae.zzhw.toString();
        zzaON = (new StringBuilder()).append("gtm_").append(ID).append("_unrepeatable").toString();
    }
}
