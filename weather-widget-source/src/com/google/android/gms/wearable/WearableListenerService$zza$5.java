// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class zzaZk
    implements Runnable
{

    final zzaZk zzaZh;
    final List zzaZk;

    public void run()
    {
        zzaZh.aZf.onConnectedNodes(zzaZk);
    }

    ( , List list)
    {
        zzaZh = ;
        zzaZk = list;
        super();
    }
}
