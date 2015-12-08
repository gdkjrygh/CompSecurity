// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.Context;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.io.File;

// Referenced classes of package com.adobe.mobile:
//            WearableDataRequest, RemoteDownload

static class fileName extends WearableDataRequest
{

    protected String fileName;
    protected String url;

    protected DataMap getDataMap()
    {
        DataMap datamap = new DataMap();
        datamap.putString("Type", "File");
        datamap.putString("ID", uuid);
        datamap.putString("URL", url);
        datamap.putString("FileName", fileName);
        return datamap;
    }

    protected DataMap handle(Context context)
    {
        context = new DataMap();
        context.putString("ID", uuid);
        context.putString("Type", "File");
        File file = RemoteDownload.getFileForCachedURL(url);
        if (file == null)
        {
            context.putBoolean("FileFound", false);
        } else
        {
            context.putBoolean("FileFound", true);
            if (file.getName().equals(fileName))
            {
                context.putBoolean("Updated", false);
                return context;
            }
            context.putBoolean("Updated", true);
            context.putString("FileName", file.getName());
            byte abyte0[] = WearableDataRequest.access$000(file);
            if (abyte0 != null && abyte0.length > 0)
            {
                context.putAsset("FileContent", Asset.createFromBytes(abyte0));
                return context;
            }
        }
        return context;
    }

    protected (DataMap datamap)
    {
        uuid = datamap.getString("ID");
        fileName = datamap.getString("FileName");
        url = datamap.getString("URL");
    }

    protected String(String s, String s1, int i)
    {
        super(i);
        url = s;
        fileName = s1;
    }
}
