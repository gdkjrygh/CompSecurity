// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.form.model;

import android.os.Parcelable;
import com.ubercab.form.model.FieldComponent;
import java.util.List;

// Referenced classes of package com.ubercab.android.partner.funnel.signup.form.model:
//            Shape_ModalComponent

public abstract class ModalComponent extends FieldComponent
    implements Parcelable
{

    public static final String TYPE = "modal";

    public ModalComponent()
    {
    }

    public static ModalComponent create()
    {
        return new Shape_ModalComponent();
    }

    public abstract List getValues();

    public abstract void setValues(List list);
}
