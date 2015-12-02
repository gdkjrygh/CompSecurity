// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.form.model;

import android.os.Parcelable;
import com.ubercab.form.model.FieldComponent;

// Referenced classes of package com.ubercab.android.partner.funnel.signup.form.model:
//            Shape_ExtraTextComponent

public abstract class ExtraTextComponent extends FieldComponent
    implements Parcelable
{

    public static final String TYPE = "extratext";

    public ExtraTextComponent()
    {
    }

    public static ExtraTextComponent create()
    {
        return new Shape_ExtraTextComponent();
    }
}
