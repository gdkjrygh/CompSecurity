// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.Context;
import com.google.android.gms.wearable.DataMap;

// Referenced classes of package com.adobe.mobile:
//            WearableDataRequest, ConfigSynchronizer

static class  extends WearableDataRequest
{

    protected DataMap getDataMap()
    {
        DataMap datamap = new DataMap();
        datamap.putString("Type", "Config");
        datamap.putString("ID", uuid);
        return datamap;
    }

    protected DataMap handle(Context context)
    {
        context = new DataMap();
        context.putString("ID", uuid);
        context.putString("Type", "Config");
        context.putAll(ConfigSynchronizer.getSharedConfig());
        return context;
    }

    protected (int i)
    {
        super(i);
    }

    protected (DataMap datamap)
    {
        uuid = datamap.getString("ID");
    }
}
