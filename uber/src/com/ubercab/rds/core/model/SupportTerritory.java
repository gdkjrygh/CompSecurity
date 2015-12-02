// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_SupportTerritory

public abstract class SupportTerritory
    implements Parcelable
{

    public SupportTerritory()
    {
    }

    public static SupportTerritory create()
    {
        return new Shape_SupportTerritory();
    }

    public abstract String getId();

    public abstract int getOrdinal();

    public abstract SupportTerritory setId(String s);

    public abstract SupportTerritory setOrdinal(int i);
}
