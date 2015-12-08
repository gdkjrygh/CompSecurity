// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameInstanceRef, GameInstance

public final class GameInstanceBuffer extends AbstractDataBuffer
{

    public GameInstanceBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Object get(int i)
    {
        return zzfK(i);
    }

    public GameInstance zzfK(int i)
    {
        return new GameInstanceRef(zzWu, i);
    }
}
