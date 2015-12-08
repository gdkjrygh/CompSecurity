// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzab, zzac

public final class zzae extends zzc
    implements DataItem
{

    private final int zzasz;

    public zzae(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        zzasz = j;
    }

    public Object freeze()
    {
        return zzCG();
    }

    public Map getAssets()
    {
        HashMap hashmap = new HashMap(zzasz);
        int i = 0;
        while (i < zzasz) 
        {
            zzab zzab1 = new zzab(zzYX, zzabg + i);
            if (zzab1.getDataItemKey() != null)
            {
                hashmap.put(zzab1.getDataItemKey(), zzab1);
            }
            i++;
        }
        return hashmap;
    }

    public byte[] getData()
    {
        return getByteArray("data");
    }

    public Uri getUri()
    {
        return Uri.parse(getString("path"));
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
        Object obj = getData();
        Object obj1 = getAssets();
        StringBuilder stringbuilder = new StringBuilder("DataItemInternal{ ");
        stringbuilder.append((new StringBuilder()).append("uri=").append(getUri()).toString());
        StringBuilder stringbuilder1 = (new StringBuilder()).append(", dataSz=");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(obj.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder()).append(", numAssets=").append(((Map) (obj1)).size()).toString());
        if (flag && !((Map) (obj1)).isEmpty())
        {
            stringbuilder.append(", assets=[");
            obj1 = ((Map) (obj1)).entrySet().iterator();
            for (obj = ""; ((Iterator) (obj1)).hasNext(); obj = ", ")
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                stringbuilder.append((new StringBuilder()).append(((String) (obj))).append((String)entry.getKey()).append(": ").append(((DataItemAsset)entry.getValue()).getId()).toString());
            }

            stringbuilder.append("]");
        }
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }

    public DataItem zzCG()
    {
        return new zzac(this);
    }
}
