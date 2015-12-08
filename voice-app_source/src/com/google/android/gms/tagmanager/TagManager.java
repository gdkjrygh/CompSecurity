// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Handler;
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
//            zzp, zzcb

public class TagManager
{
    public static interface zza
    {

        public abstract zzp zza(Context context, TagManager tagmanager, Looper looper, String s, int i, zzs zzs1);
    }


    private static TagManager zzaOb;
    private final Context mContext;
    private final DataLayer zzaKz;
    private final zzs zzaMV;
    private final zza zzaNY;
    private final zzct zzaNZ;
    private final ConcurrentMap zzaOa;

    TagManager(Context context, zza zza1, DataLayer datalayer, zzct zzct1)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            zzaNZ = zzct1;
            zzaNY = zza1;
            zzaOa = new ConcurrentHashMap();
            zzaKz = datalayer;
            zzaKz.zza(new DataLayer.zzb() {

                final TagManager zzaOc;

                public void zzF(Map map)
                {
                    map = ((Map) (map.get("event")));
                    if (map != null)
                    {
                        TagManager.zza(zzaOc, map.toString());
                    }
                }

            
            {
                zzaOc = TagManager.this;
                super();
            }
            });
            zzaKz.zza(new zzd(mContext));
            zzaMV = new zzs();
            zzzE();
            return;
        }
    }

    public static TagManager getInstance(Context context)
    {
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorenter ;
        if (zzaOb != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        zzbg.zzaz("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        throw context;
        zzaOb = new TagManager(context, new zza() {

            public zzp zza(Context context1, TagManager tagmanager, Looper looper, String s, int i, zzs zzs1)
            {
                return new zzp(context1, tagmanager, looper, s, i, zzs1);
            }

        }, new DataLayer(new zzw(context)), zzcu.zzzz());
        context = zzaOb;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        return context;
    }

    static void zza(TagManager tagmanager, String s)
    {
        tagmanager.zzeF(s);
    }

    private void zzeF(String s)
    {
        for (Iterator iterator = zzaOa.keySet().iterator(); iterator.hasNext(); ((zzo)iterator.next()).zzeh(s)) { }
    }

    private void zzzE()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            mContext.registerComponentCallbacks(new ComponentCallbacks2() {

                final TagManager zzaOc;

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
                        zzaOc.dispatch();
                    }
                }

            
            {
                zzaOc = TagManager.this;
                super();
            }
            });
        }
    }

    public void dispatch()
    {
        zzaNZ.dispatch();
    }

    public DataLayer getDataLayer()
    {
        return zzaKz;
    }

    public PendingResult loadContainerDefaultOnly(String s, int i)
    {
        s = zzaNY.zza(mContext, this, null, s, i, zzaMV);
        s.zzyr();
        return s;
    }

    public PendingResult loadContainerDefaultOnly(String s, int i, Handler handler)
    {
        s = zzaNY.zza(mContext, this, handler.getLooper(), s, i, zzaMV);
        s.zzyr();
        return s;
    }

    public PendingResult loadContainerPreferFresh(String s, int i)
    {
        s = zzaNY.zza(mContext, this, null, s, i, zzaMV);
        s.zzyt();
        return s;
    }

    public PendingResult loadContainerPreferFresh(String s, int i, Handler handler)
    {
        s = zzaNY.zza(mContext, this, handler.getLooper(), s, i, zzaMV);
        s.zzyt();
        return s;
    }

    public PendingResult loadContainerPreferNonDefault(String s, int i)
    {
        s = zzaNY.zza(mContext, this, null, s, i, zzaMV);
        s.zzys();
        return s;
    }

    public PendingResult loadContainerPreferNonDefault(String s, int i, Handler handler)
    {
        s = zzaNY.zza(mContext, this, handler.getLooper(), s, i, zzaMV);
        s.zzys();
        return s;
    }

    public void setVerboseLoggingEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 5;
        }
        zzbg.setLogLevel(byte0);
    }

    void zza(zzo zzo1)
    {
        zzaOa.put(zzo1, Boolean.valueOf(true));
    }

    boolean zzb(zzo zzo1)
    {
        return zzaOa.remove(zzo1) != null;
    }

    public PendingResult zzc(String s, int i, String s1)
    {
        s = zzaNY.zza(mContext, this, null, s, i, zzaMV);
        s.load(s1);
        return s;
    }

    boolean zzl(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = zzcb.zzzf();
        if (!((zzcb) (obj)).zzl(uri)) goto _L2; else goto _L1
_L1:
        int i;
        uri = ((zzcb) (obj)).getContainerId();
        static class _cls4
        {

            static final int zzaOd[];

            static 
            {
                zzaOd = new int[zzcb.zza.values().length];
                try
                {
                    zzaOd[zzcb.zza.zzaMI.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    zzaOd[zzcb.zza.zzaMJ.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    zzaOd[zzcb.zza.zzaMK.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        i = _cls4.zzaOd[((zzcb) (obj)).zzzg().ordinal()];
        i;
        JVM INSTR tableswitch 1 3: default 60
    //                   1 68
    //                   2 130
    //                   3 130;
           goto _L3 _L4 _L5 _L5
_L3:
        boolean flag = true;
_L9:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        obj = zzaOa.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            zzo zzo1 = (zzo)((Iterator) (obj)).next();
            if (zzo1.getContainerId().equals(uri))
            {
                zzo1.zzej(null);
                zzo1.refresh();
            }
        }
          goto _L3
        uri;
        throw uri;
_L5:
        Iterator iterator = zzaOa.keySet().iterator();
_L7:
        zzo zzo2;
        while (iterator.hasNext()) 
        {
            zzo2 = (zzo)iterator.next();
            if (!zzo2.getContainerId().equals(uri))
            {
                continue; /* Loop/switch isn't completed */
            }
            zzo2.zzej(((zzcb) (obj)).zzzh());
            zzo2.refresh();
        }
          goto _L3
        if (zzo2.zzyo() == null) goto _L7; else goto _L6
_L6:
        zzo2.zzej(null);
        zzo2.refresh();
        if (true) goto _L7; else goto _L8
_L8:
          goto _L3
_L2:
        flag = false;
          goto _L9
    }
}
