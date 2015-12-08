// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzq;

// Referenced classes of package com.google.android.gms.location.places:
//            zzg

public class zzh extends AbstractDataBuffer
{

    public zzh(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Object get(int i)
    {
        return zzgP(i);
    }

    public zzg zzgP(int i)
    {
        return new zzq(zzWu, i);
    }
}
