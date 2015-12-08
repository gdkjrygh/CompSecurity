// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchConfig, TurnBasedMatchConfigImpl

public static final class <init>
{

    int zzauH;
    int zzaui;
    ArrayList zzaux;
    Bundle zzauy;

    public <init> addInvitedPlayer(String s)
    {
        zzu.zzu(s);
        zzaux.add(s);
        return this;
    }

    public zzaux addInvitedPlayers(ArrayList arraylist)
    {
        zzu.zzu(arraylist);
        zzaux.addAll(arraylist);
        return this;
    }

    public TurnBasedMatchConfig build()
    {
        return new TurnBasedMatchConfigImpl(this);
    }

    public t> setAutoMatchCriteria(Bundle bundle)
    {
        zzauy = bundle;
        return this;
    }

    public zzauy setVariant(int i)
    {
        boolean flag;
        if (i == -1 || i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
        zzaui = i;
        return this;
    }

    private ()
    {
        zzaui = -1;
        zzaux = new ArrayList();
        zzauy = null;
        zzauH = 2;
    }

    zzauH(zzauH zzauh)
    {
        this();
    }
}
