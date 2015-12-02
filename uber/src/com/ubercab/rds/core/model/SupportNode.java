// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_SupportNode

public abstract class SupportNode
    implements Parcelable
{

    public SupportNode()
    {
    }

    public static SupportNode create()
    {
        return new Shape_SupportNode();
    }

    public abstract List getChildren();

    public abstract List getComponents();

    public abstract String getCreated();

    public abstract String getDescription();

    public abstract String getDeviceType();

    public abstract String getIconType();

    public abstract String getId();

    public abstract boolean getIsVisible();

    public abstract String getIssueType();

    public abstract Map getLabels();

    public abstract List getTerritories();

    public abstract String getType();

    public abstract String getUpdated();

    public abstract String getUpdatedBy();

    public abstract String getUserType();

    public abstract SupportNode setChildren(List list);

    public abstract SupportNode setComponents(List list);

    public abstract SupportNode setCreated(String s);

    public abstract SupportNode setDescription(String s);

    public abstract SupportNode setDeviceType(String s);

    public abstract SupportNode setIconType(String s);

    public abstract SupportNode setId(String s);

    public abstract SupportNode setIsVisible(boolean flag);

    public abstract SupportNode setIssueType(String s);

    public abstract SupportNode setLabels(Map map);

    public abstract SupportNode setTerritories(List list);

    public abstract SupportNode setType(String s);

    public abstract SupportNode setUpdated(String s);

    public abstract SupportNode setUpdatedBy(String s);

    public abstract SupportNode setUserType(String s);
}
