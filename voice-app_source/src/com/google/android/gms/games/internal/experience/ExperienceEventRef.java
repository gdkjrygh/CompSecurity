// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.GameRef;

// Referenced classes of package com.google.android.gms.games.internal.experience:
//            ExperienceEvent

public final class ExperienceEventRef extends zzc
    implements ExperienceEvent
{

    private final GameRef zzasN;

    public ExperienceEventRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        if (zzbX("external_game_id"))
        {
            zzasN = null;
            return;
        } else
        {
            zzasN = new GameRef(zzWu, zzYs);
            return;
        }
    }

    public String getIconImageUrl()
    {
        return getString("icon_url");
    }
}
