// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            Operator

public interface zzf
{

    public abstract Object zzb(zzb zzb1, Object obj);

    public abstract Object zzb(Operator operator, MetadataField metadatafield, Object obj);

    public abstract Object zzb(Operator operator, List list);

    public abstract Object zzcC(String s);

    public abstract Object zzd(MetadataField metadatafield, Object obj);

    public abstract Object zze(MetadataField metadatafield);

    public abstract Object zzqe();

    public abstract Object zzqf();

    public abstract Object zzv(Object obj);
}
