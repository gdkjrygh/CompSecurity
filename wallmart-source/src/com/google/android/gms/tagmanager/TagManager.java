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


    private static TagManager zzaSv;
    private final Context mContext;
    private final DataLayer zzaOT;
    private final zzs zzaRp;
    private final zza zzaSs;
    private final zzct zzaSt;
    private final ConcurrentMap zzaSu;

    TagManager(Context context, zza zza1, DataLayer datalayer, zzct zzct1)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            zzaSt = zzct1;
            zzaSs = zza1;
            zzaSu = new ConcurrentHashMap();
            zzaOT = datalayer;
            zzaOT.zza(new DataLayer.zzb() {

                final TagManager zzaSw;

                public void zzH(Map map)
                {
                    map = ((Map) (map.get("event")));
                    if (map != null)
                    {
                        TagManager.zza(zzaSw, map.toString());
                    }
                }

            
            {
                zzaSw = TagManager.this;
                super();
            }
            });
            zzaOT.zza(new zzd(mContext));
            zzaRp = new zzs();
            zzAU();
            return;
        }
    }

    public static TagManager getInstance(Context context)
    {
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorenter ;
        if (zzaSv != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        zzbg.e("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        throw context;
        zzaSv = new TagManager(context, new zza() {

            public zzp zza(Context context1, TagManager tagmanager, Looper looper, String s, int i, zzs zzs1)
            {
                return new zzp(context1, tagmanager, looper, s, i, zzs1);
            }

        }, new DataLayer(new zzw(context)), zzcu.zzAP());
        context = zzaSv;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        return context;
    }

    private void zzAU()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            mContext.registerComponentCallbacks(new ComponentCallbacks2() {

                final TagManager zzaSw;

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
                        zzaSw.dispatch();
                    }
                }

            
            {
                zzaSw = TagManager.this;
                super();
            }
            });
        }
    }

    static void zza(TagManager tagmanager, String s)
    {
        tagmanager.zzeU(s);
    }

    private void zzeU(String s)
    {
        for (Iterator iterator = zzaSu.keySet().iterator(); iterator.hasNext(); ((zzo)iterator.next()).zzew(s)) { }
    }

    public void dispatch()
    {
        zzaSt.dispatch();
    }

    public DataLayer getDataLayer()
    {
        return zzaOT;
    }

    public PendingResult loadContainerDefaultOnly(String s, int i)
    {
        s = zzaSs.zza(mContext, this, null, s, i, zzaRp);
        s.zzzH();
        return s;
    }

    public PendingResult loadContainerDefaultOnly(String s, int i, Handler handler)
    {
        s = zzaSs.zza(mContext, this, handler.getLooper(), s, i, zzaRp);
        s.zzzH();
        return s;
    }

    public PendingResult loadContainerPreferFresh(String s, int i)
    {
        s = zzaSs.zza(mContext, this, null, s, i, zzaRp);
        s.zzzJ();
        return s;
    }

    public PendingResult loadContainerPreferFresh(String s, int i, Handler handler)
    {
        s = zzaSs.zza(mContext, this, handler.getLooper(), s, i, zzaRp);
        s.zzzJ();
        return s;
    }

    public PendingResult loadContainerPreferNonDefault(String s, int i)
    {
        s = zzaSs.zza(mContext, this, null, s, i, zzaRp);
        s.zzzI();
        return s;
    }

    public PendingResult loadContainerPreferNonDefault(String s, int i, Handler handler)
    {
        s = zzaSs.zza(mContext, this, handler.getLooper(), s, i, zzaRp);
        s.zzzI();
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
        zzaSu.put(zzo1, Boolean.valueOf(true));
    }

    boolean zzb(zzo zzo1)
    {
        return zzaSu.remove(zzo1) != null;
    }

    public PendingResult zzc(String s, int i, String s1)
    {
        s = zzaSs.zza(mContext, this, null, s, i, zzaRp);
        s.load(s1);
        return s;
    }

    boolean zzm(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = zzcb.zzAv();
        if (!((zzcb) (obj)).zzm(uri)) goto _L2; else goto _L1
_L1:
        int i;
        uri = ((zzcb) (obj)).getContainerId();
        static class _cls4
        {

            static final int zzaSx[];

            static 
            {
                zzaSx = new int[zzcb.zza.values().length];
                try
                {
                    zzaSx[zzcb.zza.zzaRc.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    zzaSx[zzcb.zza.zzaRd.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    zzaSx[zzcb.zza.zzaRe.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        i = _cls4.zzaSx[((zzcb) (obj)).zzAw().ordinal()];
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
        obj = zzaSu.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            zzo zzo1 = (zzo)((Iterator) (obj)).next();
            if (zzo1.getContainerId().equals(uri))
            {
                zzo1.zzey(null);
                zzo1.refresh();
            }
        }
          goto _L3
        uri;
        throw uri;
_L5:
        Iterator iterator = zzaSu.keySet().iterator();
_L7:
        zzo zzo2;
        while (iterator.hasNext()) 
        {
            zzo2 = (zzo)iterator.next();
            if (!zzo2.getContainerId().equals(uri))
            {
                continue; /* Loop/switch isn't completed */
            }
            zzo2.zzey(((zzcb) (obj)).zzAx());
            zzo2.refresh();
        }
          goto _L3
        if (zzo2.zzzE() == null) goto _L7; else goto _L6
_L6:
        zzo2.zzey(null);
        zzo2.refresh();
        if (true) goto _L7; else goto _L8
_L8:
          goto _L3
_L2:
        flag = false;
          goto _L9
    }
}
