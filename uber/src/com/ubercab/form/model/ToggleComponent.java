// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.form.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.form.model:
//            FieldComponent, Shape_ToggleComponent

public abstract class ToggleComponent extends FieldComponent
    implements Parcelable
{

    public static final String TYPE = "toggle";

    public ToggleComponent()
    {
    }

    public static ToggleComponent create()
    {
        return new Shape_ToggleComponent();
    }
}
