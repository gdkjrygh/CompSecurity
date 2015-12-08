// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.TurnBasedMatchTurnStatus;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchBuffer

public final class LoadMatchesResponse
{

    private final InvitationBuffer zzauD;
    private final TurnBasedMatchBuffer zzauE;
    private final TurnBasedMatchBuffer zzauF;
    private final TurnBasedMatchBuffer zzauG;

    public LoadMatchesResponse(Bundle bundle)
    {
        DataHolder dataholder = zza(bundle, 0);
        if (dataholder != null)
        {
            zzauD = new InvitationBuffer(dataholder);
        } else
        {
            zzauD = null;
        }
        dataholder = zza(bundle, 1);
        if (dataholder != null)
        {
            zzauE = new TurnBasedMatchBuffer(dataholder);
        } else
        {
            zzauE = null;
        }
        dataholder = zza(bundle, 2);
        if (dataholder != null)
        {
            zzauF = new TurnBasedMatchBuffer(dataholder);
        } else
        {
            zzauF = null;
        }
        bundle = zza(bundle, 3);
        if (bundle != null)
        {
            zzauG = new TurnBasedMatchBuffer(bundle);
            return;
        } else
        {
            zzauG = null;
            return;
        }
    }

    private static DataHolder zza(Bundle bundle, int i)
    {
        String s = TurnBasedMatchTurnStatus.zzfG(i);
        if (!bundle.containsKey(s))
        {
            return null;
        } else
        {
            return (DataHolder)bundle.getParcelable(s);
        }
    }

    public void close()
    {
        release();
    }

    public TurnBasedMatchBuffer getCompletedMatches()
    {
        return zzauG;
    }

    public InvitationBuffer getInvitations()
    {
        return zzauD;
    }

    public TurnBasedMatchBuffer getMyTurnMatches()
    {
        return zzauE;
    }

    public TurnBasedMatchBuffer getTheirTurnMatches()
    {
        return zzauF;
    }

    public boolean hasData()
    {
        while (zzauD != null && zzauD.getCount() > 0 || zzauE != null && zzauE.getCount() > 0 || zzauF != null && zzauF.getCount() > 0 || zzauG != null && zzauG.getCount() > 0) 
        {
            return true;
        }
        return false;
    }

    public void release()
    {
        if (zzauD != null)
        {
            zzauD.release();
        }
        if (zzauE != null)
        {
            zzauE.release();
        }
        if (zzauF != null)
        {
            zzauF.release();
        }
        if (zzauG != null)
        {
            zzauG.release();
        }
    }
}
