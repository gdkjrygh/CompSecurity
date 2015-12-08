// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchConfigImpl

public abstract class TurnBasedMatchConfig
{
    public static final class Builder
    {

        int zzauH;
        int zzaui;
        ArrayList zzaux;
        Bundle zzauy;

        public Builder addInvitedPlayer(String s)
        {
            zzu.zzu(s);
            zzaux.add(s);
            return this;
        }

        public Builder addInvitedPlayers(ArrayList arraylist)
        {
            zzu.zzu(arraylist);
            zzaux.addAll(arraylist);
            return this;
        }

        public TurnBasedMatchConfig build()
        {
            return new TurnBasedMatchConfigImpl(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle)
        {
            zzauy = bundle;
            return this;
        }

        public Builder setVariant(int i)
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

        private Builder()
        {
            zzaui = -1;
            zzaux = new ArrayList();
            zzauy = null;
            zzauH = 2;
        }

    }


    protected TurnBasedMatchConfig()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static Bundle createAutoMatchCriteria(int i, int j, long l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("min_automatch_players", i);
        bundle.putInt("max_automatch_players", j);
        bundle.putLong("exclusive_bit_mask", l);
        return bundle;
    }

    public abstract Bundle getAutoMatchCriteria();

    public abstract String[] getInvitedPlayerIds();

    public abstract int getVariant();

    public abstract int zztL();
}
