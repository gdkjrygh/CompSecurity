// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.quest.QuestBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

class zzOl
    implements com.google.android.gms.games.quest.
{

    final Status zzOl;
    final zzOl zzarN;

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

    ( , Status status)
    {
        zzarN = ;
        zzOl = status;
        super();
    }
}
