// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlm;
import com.google.android.gms.internal.zzof;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzf, zzaf, zzy, zzr, 
//            zzan, zzb, zzv, zzai, 
//            zzn, zza, zzk, zzu

public class zzc
{

    private final zzf zzLy;

    protected zzc(zzf zzf1)
    {
        zzx.zzv(zzf1);
        zzLy = zzf1;
    }

    private void zza(int i, String s, Object obj, Object obj1, Object obj2)
    {
        zzaf zzaf1 = null;
        if (zzLy != null)
        {
            zzaf1 = zzLy.zzir();
        }
        if (zzaf1 != null)
        {
            zzaf1.zza(i, s, obj, obj1, obj2);
        } else
        {
            String s1 = (String)zzy.zzNa.get();
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
        return zzLy.getContext();
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

    public void zzaY(String s)
    {
        zza(2, s, null, null, null);
    }

    public void zzaZ(String s)
    {
        zza(3, s, null, null, null);
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

    public void zzba(String s)
    {
        zza(4, s, null, null, null);
    }

    public void zzbb(String s)
    {
        zza(5, s, null, null, null);
    }

    public void zzbc(String s)
    {
        zza(6, s, null, null, null);
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

    protected zzan zzhA()
    {
        return zzLy.zzhA();
    }

    public GoogleAnalytics zzhu()
    {
        return zzLy.zzis();
    }

    protected zzb zzhz()
    {
        return zzLy.zzhz();
    }

    public zzf zzia()
    {
        return zzLy;
    }

    protected void zzib()
    {
        if (zzif().zzjk())
        {
            throw new IllegalStateException("Call only supported on the client side");
        } else
        {
            return;
        }
    }

    protected void zzic()
    {
        zzLy.zzic();
    }

    protected zzlm zzid()
    {
        return zzLy.zzid();
    }

    protected zzaf zzie()
    {
        return zzLy.zzie();
    }

    protected zzr zzif()
    {
        return zzLy.zzif();
    }

    protected zzof zzig()
    {
        return zzLy.zzig();
    }

    protected zzv zzih()
    {
        return zzLy.zzih();
    }

    protected zzai zzii()
    {
        return zzLy.zzii();
    }

    protected zzn zzij()
    {
        return zzLy.zziv();
    }

    protected zza zzik()
    {
        return zzLy.zziu();
    }

    protected zzk zzil()
    {
        return zzLy.zzil();
    }

    protected zzu zzim()
    {
        return zzLy.zzim();
    }

    public boolean zzin()
    {
        return Log.isLoggable((String)zzy.zzNa.get(), 2);
    }
}
