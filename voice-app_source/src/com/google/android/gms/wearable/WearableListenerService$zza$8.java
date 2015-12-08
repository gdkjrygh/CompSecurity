// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class zzaTp
    implements Runnable
{

    final aTg zzaTi;
    final ChannelEventParcelable zzaTp;

    public void run()
    {
        zzaTp.zza(zzaTi.aTg);
    }

    e(e e, ChannelEventParcelable channeleventparcelable)
    {
        zzaTi = e;
        zzaTp = channeleventparcelable;
        super();
    }
}
