// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.form.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.form.model:
//            Component, Shape_ContainerComponent

public abstract class ContainerComponent extends Component
    implements Parcelable
{

    public static final String TYPE = "container";

    public ContainerComponent()
    {
    }

    public static ContainerComponent create()
    {
        return new Shape_ContainerComponent();
    }

    public abstract List getAdditionalComponents();

    public abstract void setAdditionalComponents(List list);
}
