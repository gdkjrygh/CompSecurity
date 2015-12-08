// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzns;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzf, zzaf, zzy, zzr, 
//            zzv, zzai, zzn, zza, 
//            zzk, zzu, zzb, zzan

public class zzc
{

    private final zzf zzJy;

    protected zzc(zzf zzf1)
    {
        zzu.zzu(zzf1);
        zzJy = zzf1;
    }

    private void zza(int i, String s, Object obj, Object obj1, Object obj2)
    {
        zzaf zzaf1 = null;
        if (zzJy != null)
        {
            zzaf1 = zzJy.zzid();
        }
        if (zzaf1 != null)
        {
            zzaf1.zza(i, s, obj, obj1, obj2);
        } else
        {
            String s1 = (String)zzy.zzLb.get();
            if (Log.isLoggable(s1, i))
            {
                Log.println(i, s1, zzc(s, obj, obj1, obj2));
                return;
            }
        }
    }

    protected static String zzc(String s, Object obj, Object obj1, Object obj2)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        String s2 = zzi(obj);
        obj1 = zzi(obj1);
        obj2 = zzi(obj2);
        StringBuilder stringbuilder = new StringBuilder();
        s = "";
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(s1);
            s = ": ";
        }
        obj = s;
        if (!TextUtils.isEmpty(s2))
        {
            stringbuilder.append(s);
            stringbuilder.append(s2);
            obj = ", ";
        }
        s = ((String) (obj));
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            stringbuilder.append(((String) (obj)));
            stringbuilder.append(((String) (obj1)));
            s = ", ";
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            stringbuilder.append(s);
            stringbuilder.append(((String) (obj2)));
        }
        return stringbuilder.toString();
    }

    private static String zzi(Object obj)
    {
        if (obj == null)
        {
            return "";
        }
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if (obj instanceof Boolean)
        {
            if (obj == Boolean.TRUE)
            {
                obj = "true";
            } else
            {
                obj = "false";
            }
            return ((String) (obj));
        }
        if (obj instanceof Throwable)
        {
            return ((Throwable)obj).toString();
        } else
        {
            return obj.toString();
        }
    }

    protected Context getContext()
    {
        return zzJy.getContext();
    }

    public void zza(String s, Object obj)
    {
        zza(2, s, obj, null, null);
    }

    public void zza(String s, Object obj, Object obj1)
    {
        zza(2, s, obj, obj1, null);
    }

    public void zza(String s, Object obj, Object obj1, Object obj2)
    {
        zza(3, s, obj, obj1, obj2);
    }

    public void zzaT(String s)
    {
        zza(2, s, null, null, null);
    }

    public void zzaU(String s)
    {
        zza(3, s, null, null, null);
    }

    public void zzaV(String s)
    {
        zza(4, s, null, null, null);
    }

    public void zzaW(String s)
    {
        zza(5, s, null, null, null);
    }

    public void zzaX(String s)
    {
        zza(6, s, null, null, null);
    }

    public void zzb(String s, Object obj)
    {
        zza(3, s, obj, null, null);
    }

    public void zzb(String s, Object obj, Object obj1)
    {
        zza(3, s, obj, obj1, null);
    }

    public void zzb(String s, Object obj, Object obj1, Object obj2)
    {
        zza(5, s, obj, obj1, obj2);
    }

    public void zzc(String s, Object obj)
    {
        zza(4, s, obj, null, null);
    }

    public void zzc(String s, Object obj, Object obj1)
    {
        zza(5, s, obj, obj1, null);
    }

    public void zzd(String s, Object obj)
    {
        zza(5, s, obj, null, null);
    }

    public void zzd(String s, Object obj, Object obj1)
    {
        zza(6, s, obj, obj1, null);
    }

    public void zze(String s, Object obj)
    {
        zza(6, s, obj, null, null);
    }

    public zzf zzhM()
    {
        return zzJy;
    }

    protected void zzhN()
    {
        if (zzhR().zziW())
        {
            throw new IllegalStateException("Call only supported on the client side");
        } else
        {
            return;
        }
    }

    protected void zzhO()
    {
        zzJy.zzhO();
    }

    protected zzlb zzhP()
    {
        return zzJy.zzhP();
    }

    protected zzaf zzhQ()
    {
        return zzJy.zzhQ();
    }

    protected zzr zzhR()
    {
        return zzJy.zzhR();
    }

    protected zzns zzhS()
    {
        return zzJy.zzhS();
    }

    protected zzv zzhT()
    {
        return zzJy.zzhT();
    }

    protected zzai zzhU()
    {
        return zzJy.zzhU();
    }

    protected zzn zzhV()
    {
        return zzJy.zzih();
    }

    protected zza zzhW()
    {
        return zzJy.zzig();
    }

    protected zzk zzhX()
    {
        return zzJy.zzhX();
    }

    protected com.google.android.gms.analytics.internal.zzu zzhY()
    {
        return zzJy.zzhY();
    }

    public boolean zzhZ()
    {
        return Log.isLoggable((String)zzy.zzLb.get(), 2);
    }

    public GoogleAnalytics zzhg()
    {
        return zzJy.zzie();
    }

    protected zzb zzhl()
    {
        return zzJy.zzhl();
    }

    protected zzan zzhm()
    {
        return zzJy.zzhm();
    }
}
