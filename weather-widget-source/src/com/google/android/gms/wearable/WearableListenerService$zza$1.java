// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, DataEventBuffer

class zzaZg
    implements Runnable
{

    final DataHolder zzaZg;
    final Changed zzaZh;

    public void run()
    {
        DataEventBuffer dataeventbuffer = new DataEventBuffer(zzaZg);
        zzaZh.aZf.onDataChanged(dataeventbuffer);
        dataeventbuffer.release();
        return;
        Exception exception;
        exception;
        dataeventbuffer.release();
        throw exception;
    }

    ( , DataHolder dataholder)
    {
        zzaZh = ;
        zzaZg = dataholder;
        super();
    }
}
