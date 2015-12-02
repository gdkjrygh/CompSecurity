// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.form.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.form.model:
//            FieldComponent, Shape_SelectComponent

public abstract class SelectComponent extends FieldComponent
    implements Parcelable
{

    public static final String TYPE = "select";

    public SelectComponent()
    {
    }

    public static SelectComponent create()
    {
        return new Shape_SelectComponent();
    }

    public abstract List getValues();

    public abstract void setValues(List list);
}
