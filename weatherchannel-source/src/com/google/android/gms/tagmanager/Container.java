// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzqf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg, zzcp, DataLayer, zzdf, 
//            zzbw, zzcb, zzbo, zzah

public class Container
{
    public static interface FunctionCallMacroCallback
    {

        public abstract Object getValue(String s, Map map);
    }

    public static interface FunctionCallTagCallback
    {

        public abstract void execute(String s, Map map);
    }

    private class zza
        implements zzt.zza
    {

        final Container zzaKF;

        public Object zzd(String s, Map map)
        {
            FunctionCallMacroCallback functioncallmacrocallback = zzaKF.zzef(s);
            if (functioncallmacrocallback == null)
            {
                return null;
            } else
            {
                return functioncallmacrocallback.getValue(s, map);
            }
        }

        private zza()
        {
            zzaKF = Container.this;
            super();
        }

    }

    private class zzb
        implements zzt.zza
    {

        final Container zzaKF;

        public Object zzd(String s, Map map)
        {
            FunctionCallTagCallback functioncalltagcallback = zzaKF.zzeg(s);
            if (functioncalltagcallback != null)
            {
                functioncalltagcallback.execute(s, map);
            }
            return zzdf.zzzP();
        }

        private zzb()
        {
            zzaKF = Container.this;
            super();
        }

    }


    private final Context mContext;
    private zzcp zzaKA;
    private Map zzaKB;
    private Map zzaKC;
    private volatile long zzaKD;
    private volatile String zzaKE;
    private final String zzaKy;
    private final DataLayer zzaKz;

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.zzaf.zzj zzj)
    {
        zzaKB = new HashMap();
        zzaKC = new HashMap();
        zzaKE = "";
        mContext = context;
        zzaKz = datalayer;
        zzaKy = s;
        zzaKD = l;
        zza(zzj.zziO);
        if (zzj.zziN != null)
        {
            zza(zzj.zziN);
        }
    }

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.zzqf.zzc zzc)
    {
        zzaKB = new HashMap();
        zzaKC = new HashMap();
        zzaKE = "";
        mContext = context;
        zzaKz = datalayer;
        zzaKy = s;
        zzaKD = l;
        zza(zzc);
    }

    private void zza(com.google.android.gms.internal.zzaf.zzf zzf)
    {
        if (zzf == null)
        {
            throw new NullPointerException();
        }
        com.google.android.gms.internal.zzqf.zzc zzc;
        try
        {
            zzc = zzqf.zzb(zzf);
        }
        catch (com.google.android.gms.internal.zzqf.zzg zzg)
        {
            zzbg.zzaz((new StringBuilder()).append("Not loading resource: ").append(zzf).append(" because it is invalid: ").append(zzg.toString()).toString());
            return;
        }
        zza(zzc);
    }

    private void zza(com.google.android.gms.internal.zzqf.zzc zzc)
    {
        zzaKE = zzc.getVersion();
        zzah zzah = zzei(zzaKE);
        zza(new zzcp(mContext, zzc, zzaKz, new zza(), new zzb(), zzah));
        if (getBoolean("_gtm.loadEventEnabled"))
        {
            zzaKz.pushEvent("gtm.load", DataLayer.mapOf(new Object[] {
                "gtm.id", zzaKy
            }));
        }
    }

    private void zza(zzcp zzcp1)
    {
        this;
        JVM INSTR monitorenter ;
        zzaKA = zzcp1;
        this;
        JVM INSTR monitorexit ;
        return;
        zzcp1;
        throw zzcp1;
    }

    private void zza(com.google.android.gms.internal.zzaf.zzi azzi[])
    {
        ArrayList arraylist = new ArrayList();
        int j = azzi.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(azzi[i]);
        }

        zzyn().zzs(arraylist);
    }

    private zzcp zzyn()
    {
        this;
        JVM INSTR monitorenter ;
        zzcp zzcp1 = zzaKA;
        this;
        JVM INSTR monitorexit ;
        return zzcp1;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean getBoolean(String s)
    {
        zzcp zzcp1 = zzyn();
        if (zzcp1 == null)
        {
            zzbg.zzaz("getBoolean called for closed container.");
            return zzdf.zzzN().booleanValue();
        }
        boolean flag;
        try
        {
            flag = zzdf.zzk((com.google.android.gms.internal.zzag.zza)zzcp1.zzeD(s).getObject()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzaz((new StringBuilder()).append("Calling getBoolean() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzzN().booleanValue();
        }
        return flag;
    }

    public String getContainerId()
    {
        return zzaKy;
    }

    public double getDouble(String s)
    {
        zzcp zzcp1 = zzyn();
        if (zzcp1 == null)
        {
            zzbg.zzaz("getDouble called for closed container.");
            return zzdf.zzzM().doubleValue();
        }
        double d;
        try
        {
            d = zzdf.zzj((com.google.android.gms.internal.zzag.zza)zzcp1.zzeD(s).getObject()).doubleValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzaz((new StringBuilder()).append("Calling getDouble() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzzM().doubleValue();
        }
        return d;
    }

    public long getLastRefreshTime()
    {
        return zzaKD;
    }

    public long getLong(String s)
    {
        zzcp zzcp1 = zzyn();
        if (zzcp1 == null)
        {
            zzbg.zzaz("getLong called for closed container.");
            return zzdf.zzzL().longValue();
        }
        long l;
        try
        {
            l = zzdf.zzi((com.google.android.gms.internal.zzag.zza)zzcp1.zzeD(s).getObject()).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzaz((new StringBuilder()).append("Calling getLong() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzzL().longValue();
        }
        return l;
    }

    public String getString(String s)
    {
        zzcp zzcp1 = zzyn();
        if (zzcp1 == null)
        {
            zzbg.zzaz("getString called for closed container.");
            return zzdf.zzzP();
        }
        try
        {
            s = zzdf.zzg((com.google.android.gms.internal.zzag.zza)zzcp1.zzeD(s).getObject());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzaz((new StringBuilder()).append("Calling getString() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzzP();
        }
        return s;
    }

    public boolean isDefault()
    {
        return getLastRefreshTime() == 0L;
    }

    public void registerFunctionCallMacroCallback(String s, FunctionCallMacroCallback functioncallmacrocallback)
    {
        if (functioncallmacrocallback == null)
        {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (zzaKB)
        {
            zzaKB.put(s, functioncallmacrocallback);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void registerFunctionCallTagCallback(String s, FunctionCallTagCallback functioncalltagcallback)
    {
        if (functioncalltagcallback == null)
        {
            throw new NullPointerException("Tag callback must be non-null");
        }
        synchronized (zzaKC)
        {
            zzaKC.put(s, functioncalltagcallback);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void release()
    {
        zzaKA = null;
    }

    public void unregisterFunctionCallMacroCallback(String s)
    {
        synchronized (zzaKB)
        {
            zzaKB.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void unregisterFunctionCallTagCallback(String s)
    {
        synchronized (zzaKC)
        {
            zzaKC.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallMacroCallback zzef(String s)
    {
        synchronized (zzaKB)
        {
            s = (FunctionCallMacroCallback)zzaKB.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallTagCallback zzeg(String s)
    {
        synchronized (zzaKC)
        {
            s = (FunctionCallTagCallback)zzaKC.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void zzeh(String s)
    {
        zzyn().zzeh(s);
    }

    zzah zzei(String s)
    {
        if (!zzcb.zzzf().zzzg().equals(zzcb.zza.zzaMK));
        return new zzbo();
    }

    String zzym()
    {
        return zzaKE;
    }
}
