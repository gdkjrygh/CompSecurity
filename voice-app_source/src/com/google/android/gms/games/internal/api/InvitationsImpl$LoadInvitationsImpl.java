// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            InvitationsImpl

private static abstract class <init> extends com.google.android.gms.games.itationsImpl
{

    public Result createFailedResult(Status status)
    {
        return zzaa(status);
    }

    public com.google.android.gms.games.multiplayer. zzaa(Status status)
    {
        return new com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult(status) {

            final Status zzOl;
            final InvitationsImpl.LoadInvitationsImpl zzaqY;

            public InvitationBuffer getInvitations()
            {
                return new InvitationBuffer(DataHolder.zzbi(14));
            }

            public Status getStatus()
            {
                return zzOl;
            }

            public void release()
            {
            }

            
            {
                zzaqY = InvitationsImpl.LoadInvitationsImpl.this;
                zzOl = status;
                super();
            }
        };
    }

    private _cls1.zzOl(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    _cls1.zzOl(GoogleApiClient googleapiclient, _cls1.zzOl zzol)
    {
        this(googleapiclient);
    }
}
