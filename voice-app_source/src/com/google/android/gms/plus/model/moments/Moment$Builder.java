// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.plus.internal.model.moments.ItemScopeEntity;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            Moment, ItemScope

public static class opeEntity
{

    private String zzEl;
    private String zzKI;
    private final Set zzaHQ = new HashSet();
    private String zzaID;
    private ItemScopeEntity zzaIL;
    private ItemScopeEntity zzaIM;

    public Moment build()
    {
        return new MomentEntity(zzaHQ, zzKI, zzaIL, zzaID, zzaIM, zzEl);
    }

    public zzEl setId(String s)
    {
        zzKI = s;
        zzaHQ.add(Integer.valueOf(2));
        return this;
    }

    public zzaHQ setResult(ItemScope itemscope)
    {
        zzaIL = (ItemScopeEntity)itemscope;
        zzaHQ.add(Integer.valueOf(4));
        return this;
    }

    public zzaHQ setStartDate(String s)
    {
        zzaID = s;
        zzaHQ.add(Integer.valueOf(5));
        return this;
    }

    public zzaHQ setTarget(ItemScope itemscope)
    {
        zzaIM = (ItemScopeEntity)itemscope;
        zzaHQ.add(Integer.valueOf(6));
        return this;
    }

    public zzaHQ setType(String s)
    {
        zzEl = s;
        zzaHQ.add(Integer.valueOf(7));
        return this;
    }

    public opeEntity()
    {
    }
}
