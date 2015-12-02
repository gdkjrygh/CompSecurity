// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.form.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.form.model:
//            FieldComponent, Shape_TextComponent

public abstract class TextComponent extends FieldComponent
    implements Parcelable
{

    public static final String TYPE = "text";

    public TextComponent()
    {
    }

    public static TextComponent create()
    {
        return new Shape_TextComponent();
    }
}
