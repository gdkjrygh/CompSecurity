// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcp, DataLayer, zzbg, zzdf, 
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

        final Container zzaCr;

        public Object zzc(String s, Map map)
        {
            FunctionCallMacroCallback functioncallmacrocallback = zzaCr.zzdx(s);
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
            zzaCr = Container.this;
            super();
        }

    }

    private class zzb
        implements zzt.zza
    {

        final Container zzaCr;

        public Object zzc(String s, Map map)
        {
            FunctionCallTagCallback functioncalltagcallback = zzaCr.zzdy(s);
            if (functioncalltagcallback != null)
            {
                functioncalltagcallback.execute(s, map);
            }
            return zzdf.zzxT();
        }

        private zzb()
        {
            zzaCr = Container.this;
            super();
        }

    }


    private final Context mContext;
    private final String zzaCk;
    private final DataLayer zzaCl;
    private zzcp zzaCm;
    private Map zzaCn;
    private Map zzaCo;
    private volatile long zzaCp;
    private volatile String zzaCq;

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.zzmq.zzc zzc)
    {
        zzaCn = new HashMap();
        zzaCo = new HashMap();
        zzaCq = "";
        mContext = context;
        zzaCl = datalayer;
        zzaCk = s;
        zzaCp = l;
        zza(zzc);
    }

    private void zza(com.google.android.gms.internal.zzmq.zzc zzc)
    {
        zzaCq = zzc.getVersion();
        zzah zzah = zzdA(zzaCq);
        zza(new zzcp(mContext, zzc, zzaCl, new zza(), new zzb(), zzah));
        if (getBoolean("_gtm.loadEventEnabled"))
        {
            zzaCl.pushEvent("gtm.load", DataLayer.mapOf(new Object[] {
                "gtm.id", zzaCk
            }));
        }
    }

    private void zza(zzcp zzcp1)
    {
        this;
        JVM INSTR monitorenter ;
        zzaCm = zzcp1;
        this;
        JVM INSTR monitorexit ;
        return;
        zzcp1;
        throw zzcp1;
    }

    private zzcp zzwr()
    {
        this;
        JVM INSTR monitorenter ;
        zzcp zzcp1 = zzaCm;
        this;
        JVM INSTR monitorexit ;
        return zzcp1;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean getBoolean(String s)
    {
        zzcp zzcp1 = zzwr();
        if (zzcp1 == null)
        {
            zzbg.zzak("getBoolean called for closed container.");
            return zzdf.zzxR().booleanValue();
        }
        boolean flag;
        try
        {
            flag = zzdf.zzk((com.google.android.gms.internal.zzd.zza)zzcp1.zzdV(s).getObject()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzak((new StringBuilder()).append("Calling getBoolean() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzxR().booleanValue();
        }
        return flag;
    }

    public long getLastRefreshTime()
    {
        return zzaCp;
    }

    public String getString(String s)
    {
        zzcp zzcp1 = zzwr();
        if (zzcp1 == null)
        {
            zzbg.zzak("getString called for closed container.");
            return zzdf.zzxT();
        }
        try
        {
            s = zzdf.zzg((com.google.android.gms.internal.zzd.zza)zzcp1.zzdV(s).getObject());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzak((new StringBuilder()).append("Calling getString() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzxT();
        }
        return s;
    }

    public boolean isDefault()
    {
        return getLastRefreshTime() == 0L;
    }

    void release()
    {
        zzaCm = null;
    }

    zzah zzdA(String s)
    {
        if (!zzcb.zzxj().zzxk().equals(zzcb.zza.zzaEw));
        return new zzbo();
    }

    FunctionCallMacroCallback zzdx(String s)
    {
        synchronized (zzaCn)
        {
            s = (FunctionCallMacroCallback)zzaCn.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallTagCallback zzdy(String s)
    {
        synchronized (zzaCo)
        {
            s = (FunctionCallTagCallback)zzaCo.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void zzdz(String s)
    {
        zzwr().zzdz(s);
    }
}
