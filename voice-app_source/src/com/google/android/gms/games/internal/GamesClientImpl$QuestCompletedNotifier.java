// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzapb
    implements com.google.android.gms.common.api.ier
{

    private final Quest zzapb;

    public void zza(QuestUpdateListener questupdatelistener)
    {
        questupdatelistener.onQuestCompleted(zzapb);
    }

    public void zzmw()
    {
    }

    public void zzn(Object obj)
    {
        zza((QuestUpdateListener)obj);
    }

    (Quest quest)
    {
        zzapb = quest;
    }
}
