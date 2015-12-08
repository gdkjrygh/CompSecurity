// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.zzi;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class zzafi extends AbstractGamesCallbacks
{

    private final zzi zzafi;

    private Quest zzW(DataHolder dataholder)
    {
        QuestBuffer questbuffer;
        questbuffer = new QuestBuffer(dataholder);
        dataholder = null;
        if (questbuffer.getCount() > 0)
        {
            dataholder = (Quest)((Quest)questbuffer.get(0)).freeze();
        }
        questbuffer.release();
        return dataholder;
        dataholder;
        questbuffer.release();
        throw dataholder;
    }

    public void zzP(DataHolder dataholder)
    {
        dataholder = zzW(dataholder);
        if (dataholder != null)
        {
            zzafi.zza(new it>(dataholder));
        }
    }

    (zzi zzi1)
    {
        zzafi = zzi1;
    }
}
