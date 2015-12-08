// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzlo

public static class ernal.zzb extends zzb
    implements SearchableMetadataField
{

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zze(dataholder, i, j);
    }

    protected Boolean zze(DataHolder dataholder, int i, int j)
    {
        boolean flag;
        if (dataholder.zzc(getName(), i, j) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public lder(String s, int i)
    {
        super(s, i);
    }
}
