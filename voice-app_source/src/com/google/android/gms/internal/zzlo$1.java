// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.zzb;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.internal:
//            zzlo

static final class nternal.zzb extends zzb
{

    protected Object zzc(DataHolder dataholder, int i, int j)
    {
        return zze(dataholder, i, j);
    }

    protected Boolean zze(DataHolder dataholder, int i, int j)
    {
        boolean flag;
        if (dataholder.zzc("trashed", i, j) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    Holder(String s, Collection collection, Collection collection1, int i)
    {
        super(s, collection, collection1, i);
    }
}
