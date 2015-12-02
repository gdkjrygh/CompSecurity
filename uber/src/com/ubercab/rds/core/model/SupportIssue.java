// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_SupportIssue

public abstract class SupportIssue
    implements Parcelable
{

    public SupportIssue()
    {
    }

    public static SupportIssue create()
    {
        return new Shape_SupportIssue();
    }

    public abstract String getIcon();

    public abstract String getId();

    public abstract String getLabel();

    public abstract String getType();

    public abstract SupportIssue setIcon(String s);

    public abstract SupportIssue setId(String s);

    public abstract SupportIssue setLabel(String s);

    public abstract SupportIssue setType(String s);
}
