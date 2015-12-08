// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer, zzd, zzs, zzbg, 
//            zzw, zzcu, zzo, zzct, 
//            zzp

public class TagManager
{
    public static interface zza
    {

        public abstract zzp zza(Context context, TagManager tagmanager, Looper looper, String s, int i, zzs zzs1);
    }


    private static TagManager zzaFN;
    private final Context mContext;
    private final DataLayer zzaCl;
    private final zzs zzaEH;
    private final zza zzaFK;
    private final zzct zzaFL;
    private final ConcurrentMap zzaFM;

    TagManager(Context context, zza zza1, DataLayer datalayer, zzct zzct1)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            zzaFL = zzct1;
            zzaFK = zza1;
            zzaFM = new ConcurrentHashMap();
            zzaCl = datalayer;
            zzaCl.zza(new DataLayer.zzb() {

                final TagManager zzaFO;

                public void zzE(Map map)
                {
                    map = ((Map) (map.get("event")));
                    if (map != null)
                    {
                        TagManager.zza(zzaFO, map.toString());
                    }
                }

            
            {
                zzaFO = TagManager.this;
                super();
            }
            });
            zzaCl.zza(new zzd(mContext));
            zzaEH = new zzs();
            zzxI();
            return;
        }
    }

    public static TagManager getInstance(Context context)
    {
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorenter ;
        if (zzaFN != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        zzbg.zzak("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        throw context;
        zzaFN = new TagManager(context, new zza() {

            public zzp zza(Context context1, TagManager tagmanager, Looper looper, String s, int i, zzs zzs1)
            {
                return new zzp(context1, tagmanager, looper, s, i, zzs1);
            }

        }, new DataLayer(new zzw(context)), zzcu.zzxD());
        context = zzaFN;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        return context;
    }

    static void zza(TagManager tagmanager, String s)
    {
        tagmanager.zzdX(s);
    }

    private void zzdX(String s)
    {
        for (Iterator iterator = zzaFM.keySet().iterator(); iterator.hasNext(); ((zzo)iterator.next()).zzdz(s)) { }
    }

    private void zzxI()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            mContext.registerComponentCallbacks(new ComponentCallbacks2() {

                final TagManager zzaFO;

                public void onConfigurationChanged(Configuration configuration)
                {
                }

                public void onLowMemory()
                {
                }

                public void onTrimMemory(int i)
                {
                    if (i == 20)
                    {
                        zzaFO.dispatch();
                    }
                }

            
            {
                zzaFO = TagManager.this;
                super();
            }
            });
        }
    }

    public void dispatch()
    {
        zzaFL.dispatch();
    }

    public DataLayer getDataLayer()
    {
        return zzaCl;
    }

    void zza(zzo zzo1)
    {
        zzaFM.put(zzo1, Boolean.valueOf(true));
    }

    boolean zzb(zzo zzo1)
    {
        return zzaFM.remove(zzo1) != null;
    }

    public PendingResult zzc(String s, int i, String s1)
    {
        s = zzaFK.zza(mContext, this, null, s, i, zzaEH);
        s.load(s1);
        return s;
    }
}
