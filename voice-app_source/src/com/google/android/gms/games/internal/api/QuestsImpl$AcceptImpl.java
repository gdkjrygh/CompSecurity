// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.quest.Quest;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

private static abstract class <init> extends com.google.android.gms.games.odImpl
{

    public Result createFailedResult(Status status)
    {
        return zzan(status);
    }

    public com.google.android.gms.games.quest.lt zzan(Status status)
    {
        return new com.google.android.gms.games.quest.Quests.AcceptQuestResult(status) {

            final Status zzOl;
            final QuestsImpl.AcceptImpl zzarL;

            public Quest getQuest()
            {
                return null;
            }

            public Status getStatus()
            {
                return zzOl;
            }

            
            {
                zzarL = QuestsImpl.AcceptImpl.this;
                zzOl = status;
                super();
            }
        };
    }

    private _cls1.zzOl(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    (GoogleApiClient googleapiclient,  )
    {
        this(googleapiclient);
    }
}
