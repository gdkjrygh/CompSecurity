// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.form.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.form.model:
//            Shape_ComponentRequirement

public abstract class ComponentRequirement
    implements Parcelable
{

    public ComponentRequirement()
    {
    }

    public static ComponentRequirement create()
    {
        return new Shape_ComponentRequirement();
    }

    public abstract String getComponentId();

    public abstract List getConditions();

    public abstract ComponentRequirement setComponentId(String s);

    public abstract ComponentRequirement setConditions(List list);
}
