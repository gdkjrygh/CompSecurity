// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.zzn;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.zze;
import com.google.android.gms.internal.zzlo;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.drive:
//            Metadata, MetadataBuffer

private static class bh extends Metadata
{

    private final DataHolder zzWu;
    private final int zzYt;
    private final int zzadr;

    static int zza(bh bh)
    {
        return bh.zzadr;
    }

    public Object freeze()
    {
        return zzpl();
    }

    public boolean isDataValid()
    {
        return !zzWu.isClosed();
    }

    public Object zza(MetadataField metadatafield)
    {
        return metadatafield.zza(zzWu, zzadr, zzYt);
    }

    public Metadata zzpl()
    {
        MetadataBundle metadatabundle = MetadataBundle.zzpX();
        Iterator iterator = zze.zzpW().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MetadataField metadatafield = (MetadataField)iterator.next();
            if (metadatafield != zzlo.zzaho)
            {
                metadatafield.zza(zzWu, metadatabundle, zzadr, zzYt);
            }
        } while (true);
        return new zzn(metadatabundle);
    }

    public eld(DataHolder dataholder, int i)
    {
        zzWu = dataholder;
        zzadr = i;
        zzYt = dataholder.zzbh(i);
    }
}
