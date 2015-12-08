// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.net.Uri;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataItem;
import java.util.Iterator;

// Referenced classes of package com.adobe.mobile:
//            ConfigSynchronizer

public final class DataListenerWearable
{

    public DataListenerWearable()
    {
    }

    public static void onDataChanged(DataEventBuffer dataeventbuffer)
    {
        if (dataeventbuffer != null)
        {
            dataeventbuffer = dataeventbuffer.iterator();
            while (dataeventbuffer.hasNext()) 
            {
                Object obj = (DataEvent)dataeventbuffer.next();
                if (((DataEvent) (obj)).getType() == 1)
                {
                    obj = ((DataEvent) (obj)).getDataItem();
                    if (obj != null)
                    {
                        Uri uri = ((DataItem) (obj)).getUri();
                        if (uri != null && uri.getPath() != null && uri.getPath().startsWith("/abdmobile/data/config/"))
                        {
                            ConfigSynchronizer.restoreConfig(((DataItem) (obj)));
                        }
                    }
                }
            }
        }
    }
}
