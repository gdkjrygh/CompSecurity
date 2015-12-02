// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.form.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.form.model:
//            FieldComponent, Shape_TextInputComponent

public abstract class TextInputComponent extends FieldComponent
    implements Parcelable
{

    public static final String TYPE = "textinput";

    public TextInputComponent()
    {
    }

    public static TextInputComponent create()
    {
        return new Shape_TextInputComponent();
    }

    public abstract String getHint();

    public abstract void setHint(String s);
}
