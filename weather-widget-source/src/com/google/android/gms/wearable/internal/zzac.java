// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class zzac
    implements DataItem
{

    private Uri mUri;
    private byte zzayG[];
    private Map zzbap;

    public zzac(DataItem dataitem)
    {
        mUri = dataitem.getUri();
        zzayG = dataitem.getData();
        HashMap hashmap = new HashMap();
        dataitem = dataitem.getAssets().entrySet().iterator();
        do
        {
            if (!dataitem.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)dataitem.next();
            if (entry.getKey() != null)
            {
                hashmap.put(entry.getKey(), ((DataItemAsset)entry.getValue()).freeze());
            }
        } while (true);
        zzbap = Collections.unmodifiableMap(hashmap);
    }

    public Object freeze()
    {
        return zzCG();
    }

    public Map getAssets()
    {
        return zzbap;
    }

    public byte[] getData()
    {
        return zzayG;
    }

    public Uri getUri()
    {
        return mUri;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataItem setData(byte abyte0[])
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        return toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("DataItemEntity{ ");
        stringbuilder.append((new StringBuilder()).append("uri=").append(mUri).toString());
        StringBuilder stringbuilder1 = (new StringBuilder()).append(", dataSz=");
        Object obj;
        if (zzayG == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(zzayG.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder()).append(", numAssets=").append(zzbap.size()).toString());
        if (flag && !zzbap.isEmpty())
        {
            stringbuilder.append(", assets=[");
            Iterator iterator = zzbap.entrySet().iterator();
            for (obj = ""; iterator.hasNext(); obj = ", ")
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                stringbuilder.append((new StringBuilder()).append(((String) (obj))).append((String)entry.getKey()).append(": ").append(((DataItemAsset)entry.getValue()).getId()).toString());
            }

            stringbuilder.append("]");
        }
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }

    public DataItem zzCG()
    {
        return this;
    }
}
