// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class zzz
    implements DataItemAsset
{

    private final String zztP;
    private final String zzwj;

    public zzz(DataItemAsset dataitemasset)
    {
        zzwj = dataitemasset.getId();
        zztP = dataitemasset.getDataItemKey();
    }

    public Object freeze()
    {
        return zzCF();
    }

    public String getDataItemKey()
    {
        return zztP;
    }

    public String getId()
    {
        return zzwj;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetEntity[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (zzwj == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(zzwj);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(zztP);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public DataItemAsset zzCF()
    {
        return this;
    }
}
