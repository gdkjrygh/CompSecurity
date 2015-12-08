// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.quest.QuestBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

private static abstract class <init> extends com.google.android.gms.games.hodImpl
{

    public Result createFailedResult(Status status)
    {
        return zzap(status);
    }

    public com.google.android.gms.games.quest.lt zzap(Status status)
    {
        return new com.google.android.gms.games.quest.Quests.LoadQuestsResult(status) {

            final Status zzOl;
            final QuestsImpl.LoadsImpl zzarN;

            public QuestBuffer getQuests()
            {
                return new QuestBuffer(DataHolder.zzbi(zzOl.getStatusCode()));
            }

            public Status getStatus()
            {
                return zzOl;
            }

            public void release()
            {
            }

            
            {
                zzarN = QuestsImpl.LoadsImpl.this;
                zzOl = status;
                super();
            }
        };
    }

    private _cls1.zzOl(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    >(GoogleApiClient googleapiclient, > >)
    {
        this(googleapiclient);
    }
}
