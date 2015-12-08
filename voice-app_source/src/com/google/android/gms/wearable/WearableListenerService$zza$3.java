// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.NodeParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

class zzaTk
    implements Runnable
{

    final zzaTk zzaTi;
    final NodeParcelable zzaTk;

    public void run()
    {
        zzaTi.aTg.onPeerConnected(zzaTk);
    }

    ( , NodeParcelable nodeparcelable)
    {
        zzaTi = ;
        zzaTk = nodeparcelable;
        super();
    }
}
