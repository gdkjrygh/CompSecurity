// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzz

public class zzab extends zzc
    implements DataItemAsset
{

    public zzab(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public Object freeze()
    {
        return zzCF();
    }

    public String getDataItemKey()
    {
        return getString("asset_key");
    }

    public String getId()
    {
        return getString("asset_id");
    }

    public DataItemAsset zzCF()
    {
        return new zzz(this);
    }
}
