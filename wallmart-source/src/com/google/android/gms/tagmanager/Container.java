// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzqp;
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

        final Container zzaOZ;

        public Object zzd(String s, Map map)
        {
            FunctionCallMacroCallback functioncallmacrocallback = zzaOZ.zzeu(s);
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
            zzaOZ = Container.this;
            super();
        }

    }

    private class zzb
        implements zzt.zza
    {

        final Container zzaOZ;

        public Object zzd(String s, Map map)
        {
            FunctionCallTagCallback functioncalltagcallback = zzaOZ.zzev(s);
            if (functioncalltagcallback != null)
            {
                functioncalltagcallback.execute(s, map);
            }
            return zzdf.zzBf();
        }

        private zzb()
        {
            zzaOZ = Container.this;
            super();
        }

    }


    private final Context mContext;
    private final String zzaOS;
    private final DataLayer zzaOT;
    private zzcp zzaOU;
    private Map zzaOV;
    private Map zzaOW;
    private volatile long zzaOX;
    private volatile String zzaOY;

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.zzaf.zzj zzj)
    {
        zzaOV = new HashMap();
        zzaOW = new HashMap();
        zzaOY = "";
        mContext = context;
        zzaOT = datalayer;
        zzaOS = s;
        zzaOX = l;
        zza(zzj.zziR);
        if (zzj.zziQ != null)
        {
            zza(zzj.zziQ);
        }
    }

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.zzqp.zzc zzc)
    {
        zzaOV = new HashMap();
        zzaOW = new HashMap();
        zzaOY = "";
        mContext = context;
        zzaOT = datalayer;
        zzaOS = s;
        zzaOX = l;
        zza(zzc);
    }

    private void zza(com.google.android.gms.internal.zzaf.zzf zzf)
    {
        if (zzf == null)
        {
            throw new NullPointerException();
        }
        com.google.android.gms.internal.zzqp.zzc zzc;
        try
        {
            zzc = zzqp.zzb(zzf);
        }
        catch (com.google.android.gms.internal.zzqp.zzg zzg)
        {
            zzbg.e((new StringBuilder()).append("Not loading resource: ").append(zzf).append(" because it is invalid: ").append(zzg.toString()).toString());
            return;
        }
        zza(zzc);
    }

    private void zza(com.google.android.gms.internal.zzqp.zzc zzc)
    {
        zzaOY = zzc.getVersion();
        zzah zzah = zzex(zzaOY);
        zza(new zzcp(mContext, zzc, zzaOT, new zza(), new zzb(), zzah));
        if (getBoolean("_gtm.loadEventEnabled"))
        {
            zzaOT.pushEvent("gtm.load", DataLayer.mapOf(new Object[] {
                "gtm.id", zzaOS
            }));
        }
    }

    private void zza(zzcp zzcp1)
    {
        this;
        JVM INSTR monitorenter ;
        zzaOU = zzcp1;
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

        zzzD().zzs(arraylist);
    }

    private zzcp zzzD()
    {
        this;
        JVM INSTR monitorenter ;
        zzcp zzcp1 = zzaOU;
        this;
        JVM INSTR monitorexit ;
        return zzcp1;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean getBoolean(String s)
    {
        zzcp zzcp1 = zzzD();
        if (zzcp1 == null)
        {
            zzbg.e("getBoolean called for closed container.");
            return zzdf.zzBd().booleanValue();
        }
        boolean flag;
        try
        {
            flag = zzdf.zzk((com.google.android.gms.internal.zzag.zza)zzcp1.zzeS(s).getObject()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.e((new StringBuilder()).append("Calling getBoolean() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzBd().booleanValue();
        }
        return flag;
    }

    public String getContainerId()
    {
        return zzaOS;
    }

    public double getDouble(String s)
    {
        zzcp zzcp1 = zzzD();
        if (zzcp1 == null)
        {
            zzbg.e("getDouble called for closed container.");
            return zzdf.zzBc().doubleValue();
        }
        double d;
        try
        {
            d = zzdf.zzj((com.google.android.gms.internal.zzag.zza)zzcp1.zzeS(s).getObject()).doubleValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.e((new StringBuilder()).append("Calling getDouble() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzBc().doubleValue();
        }
        return d;
    }

    public long getLastRefreshTime()
    {
        return zzaOX;
    }

    public long getLong(String s)
    {
        zzcp zzcp1 = zzzD();
        if (zzcp1 == null)
        {
            zzbg.e("getLong called for closed container.");
            return zzdf.zzBb().longValue();
        }
        long l;
        try
        {
            l = zzdf.zzi((com.google.android.gms.internal.zzag.zza)zzcp1.zzeS(s).getObject()).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.e((new StringBuilder()).append("Calling getLong() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzBb().longValue();
        }
        return l;
    }

    public String getString(String s)
    {
        zzcp zzcp1 = zzzD();
        if (zzcp1 == null)
        {
            zzbg.e("getString called for closed container.");
            return zzdf.zzBf();
        }
        try
        {
            s = zzdf.zzg((com.google.android.gms.internal.zzag.zza)zzcp1.zzeS(s).getObject());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.e((new StringBuilder()).append("Calling getString() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzBf();
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
        synchronized (zzaOV)
        {
            zzaOV.put(s, functioncallmacrocallback);
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
        synchronized (zzaOW)
        {
            zzaOW.put(s, functioncalltagcallback);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void release()
    {
        zzaOU = null;
    }

    public void unregisterFunctionCallMacroCallback(String s)
    {
        synchronized (zzaOV)
        {
            zzaOV.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void unregisterFunctionCallTagCallback(String s)
    {
        synchronized (zzaOW)
        {
            zzaOW.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallMacroCallback zzeu(String s)
    {
        synchronized (zzaOV)
        {
            s = (FunctionCallMacroCallback)zzaOV.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallTagCallback zzev(String s)
    {
        synchronized (zzaOW)
        {
            s = (FunctionCallTagCallback)zzaOW.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void zzew(String s)
    {
        zzzD().zzew(s);
    }

    zzah zzex(String s)
    {
        if (!zzcb.zzAv().zzAw().equals(zzcb.zza.zzaRe));
        return new zzbo();
    }

    String zzzC()
    {
        return zzaOY;
    }
}
