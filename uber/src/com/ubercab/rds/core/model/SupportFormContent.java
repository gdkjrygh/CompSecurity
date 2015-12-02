// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_SupportFormContent

public abstract class SupportFormContent
    implements Parcelable
{

    public SupportFormContent()
    {
    }

    public static SupportFormContent create()
    {
        return new Shape_SupportFormContent();
    }

    public abstract String getCaption();

    public abstract String getLabel();

    public abstract String getPlaceholder();

    public abstract String getText();

    public abstract String getUrl();

    public abstract SupportFormContent setCaption(String s);

    public abstract SupportFormContent setLabel(String s);

    public abstract SupportFormContent setPlaceholder(String s);

    public abstract SupportFormContent setText(String s);

    public abstract SupportFormContent setUrl(String s);
}
