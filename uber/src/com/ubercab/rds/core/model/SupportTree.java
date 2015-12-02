// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_SupportTree

public abstract class SupportTree
    implements Parcelable
{

    public SupportTree()
    {
    }

    public static SupportTree create()
    {
        return new Shape_SupportTree();
    }

    public abstract String getSupportNumber();

    public abstract List getTrees();

    public abstract SupportTree setSupportNumber(String s);

    public abstract SupportTree setTrees(List list);
}
