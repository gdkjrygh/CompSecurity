// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.form.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.form.model:
//            FieldComponent, Shape_LinkComponent

public abstract class LinkComponent extends FieldComponent
    implements Parcelable
{

    public static final String TYPE = "link";

    public LinkComponent()
    {
    }

    public static LinkComponent create()
    {
        return new Shape_LinkComponent();
    }

    public abstract String getLink();

    public abstract void setLink(String s);
}
