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

        public abstract zzar zzyi();
    }


    private static final String ID;
    private static final String URL;
    private static final String zzaKr;
    private static final String zzaKs;
    static final String zzaKt;
    private static final Set zzaKu = new HashSet();
    private final Context mContext;
    private final zza zzaKv;

    public zzj(Context context)
    {
        this(context, new zza(context) {

            final Context zzqV;

            public zzar zzyi()
            {
                return zzz.zzaF(zzqV);
            }

            
            {
                zzqV = context;
                super();
            }
        });
    }

    zzj(Context context, zza zza1)
    {
        super(ID, new String[] {
            URL
        });
        zzaKv = zza1;
        mContext = context;
    }

    private boolean zzeb(String s)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = zzed(s);
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (zzec(s))
        {
            zzaKu.add(s);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_44;
        s;
        throw s;
        flag = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void zzG(Map map)
    {
        String s;
        if (map.get(zzaKs) != null)
        {
            s = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaKs));
        } else
        {
            s = null;
        }
        if (s == null || !zzeb(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.net.Uri.Builder builder = Uri.parse(zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(URL))).buildUpon();
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaKr);
        if (map != null)
        {
            map = ((Map) (zzdf.zzl(map)));
            if (!(map instanceof List))
            {
                zzbg.zzaz((new StringBuilder()).append("ArbitraryPixel: additional params not a list: not sending partial hit: ").append(builder.build().toString()).toString());
                return;
            }
            for (map = ((List)map).iterator(); map.hasNext();)
            {
                Object obj = map.next();
                if (!(obj instanceof Map))
                {
                    zzbg.zzaz((new StringBuilder()).append("ArbitraryPixel: additional params contains non-map: not sending partial hit: ").append(builder.build().toString()).toString());
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
        zzaKv.zzyi().zzes(map);
        zzbg.zzaB((new StringBuilder()).append("ArbitraryPixel: url = ").append(map).toString());
        if (s == null) goto _L1; else goto _L3
_L3:
        com/google/android/gms/tagmanager/zzj;
        JVM INSTR monitorenter ;
        zzaKu.add(s);
        zzcv.zza(mContext, zzaKt, s, "true");
        com/google/android/gms/tagmanager/zzj;
        JVM INSTR monitorexit ;
        return;
        map;
        com/google/android/gms/tagmanager/zzj;
        JVM INSTR monitorexit ;
        throw map;
    }

    boolean zzec(String s)
    {
        return mContext.getSharedPreferences(zzaKt, 0).contains(s);
    }

    boolean zzed(String s)
    {
        return zzaKu.contains(s);
    }

    static 
    {
        ID = zzad.zzcl.toString();
        URL = zzae.zzhu.toString();
        zzaKr = zzae.zzdk.toString();
        zzaKs = zzae.zzht.toString();
        zzaKt = (new StringBuilder()).append("gtm_").append(ID).append("_unrepeatable").toString();
    }
}
