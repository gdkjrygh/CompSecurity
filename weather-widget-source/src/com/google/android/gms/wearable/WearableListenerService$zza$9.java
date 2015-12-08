// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class zzaZp
    implements Runnable
{

    final aZf zzaZh;
    final ChannelEventParcelable zzaZp;

    public void run()
    {
        zzaZp.zza(zzaZh.aZf);
    }

    e(e e, ChannelEventParcelable channeleventparcelable)
    {
        zzaZh = e;
        zzaZp = channeleventparcelable;
        super();
    }
}
