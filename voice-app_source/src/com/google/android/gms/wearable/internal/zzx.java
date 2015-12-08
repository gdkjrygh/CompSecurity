// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class zzx
    implements DataItemAsset
{

    private final String zzKI;
    private final String zztw;

    public zzx(DataItemAsset dataitemasset)
    {
        zzKI = dataitemasset.getId();
        zztw = dataitemasset.getDataItemKey();
    }

    public Object freeze()
    {
        return zzBd();
    }

    public String getDataItemKey()
    {
        return zztw;
    }

    public String getId()
    {
        return zzKI;
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
        if (zzKI == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(zzKI);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(zztw);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public DataItemAsset zzBd()
    {
        return this;
    }
}
