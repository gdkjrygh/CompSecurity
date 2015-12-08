// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractDataBuffer;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadgeRef, GameBadge

public final class GameBadgeBuffer extends AbstractDataBuffer
{

    public Object get(int i)
    {
        return zzfI(i);
    }

    public GameBadge zzfI(int i)
    {
        return new GameBadgeRef(zzWu, i);
    }
}
