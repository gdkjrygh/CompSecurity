// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.experience:
//            ExperienceEventRef, ExperienceEvent

public final class ExperienceEventBuffer extends AbstractDataBuffer
{

    public ExperienceEventBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Object get(int i)
    {
        return zzfH(i);
    }

    public ExperienceEvent zzfH(int i)
    {
        return new ExperienceEventRef(zzWu, i);
    }
}
