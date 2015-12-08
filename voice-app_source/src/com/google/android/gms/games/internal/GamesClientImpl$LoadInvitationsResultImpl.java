// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzapu extends zzapu
    implements com.google.android.gms.games.multiplayer.pu
{

    private final InvitationBuffer zzapu;

    public InvitationBuffer getInvitations()
    {
        return zzapu;
    }

    (DataHolder dataholder)
    {
        super(dataholder);
        zzapu = new InvitationBuffer(dataholder);
    }
}
