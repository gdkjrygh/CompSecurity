// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import com.google.android.gms.drive.query.Filter;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            zzf, Operator

public class zzg
    implements zzf
{

    private Boolean zzaid;

    private zzg()
    {
        zzaid = Boolean.valueOf(false);
    }

    public static boolean zza(Filter filter)
    {
        if (filter == null)
        {
            return false;
        } else
        {
            return ((Boolean)filter.zza(new zzg())).booleanValue();
        }
    }

    public Object zzb(zzb zzb1, Object obj)
    {
        return zzc(zzb1, obj);
    }

    public Object zzb(Operator operator, MetadataField metadatafield, Object obj)
    {
        return zzc(operator, metadatafield, obj);
    }

    public Object zzb(Operator operator, List list)
    {
        return zzc(operator, list);
    }

    public Boolean zzc(zzb zzb1, Object obj)
    {
        return zzaid;
    }

    public Boolean zzc(Operator operator, MetadataField metadatafield, Object obj)
    {
        return zzaid;
    }

    public Boolean zzc(Operator operator, List list)
    {
        return zzaid;
    }

    public Object zzcC(String s)
    {
        return zzcD(s);
    }

    public Boolean zzcD(String s)
    {
        if (!s.isEmpty())
        {
            zzaid = Boolean.valueOf(true);
        }
        return zzaid;
    }

    public Boolean zzd(Boolean boolean1)
    {
        return zzaid;
    }

    public Object zzd(MetadataField metadatafield, Object obj)
    {
        return zze(metadatafield, obj);
    }

    public Boolean zze(MetadataField metadatafield, Object obj)
    {
        return zzaid;
    }

    public Object zze(MetadataField metadatafield)
    {
        return zzf(metadatafield);
    }

    public Boolean zzf(MetadataField metadatafield)
    {
        return zzaid;
    }

    public Object zzqe()
    {
        return zzqh();
    }

    public Object zzqf()
    {
        return zzqg();
    }

    public Boolean zzqg()
    {
        return zzaid;
    }

    public Boolean zzqh()
    {
        return zzaid;
    }

    public Object zzv(Object obj)
    {
        return zzd((Boolean)obj);
    }
}
