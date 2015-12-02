// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.form.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.form.model:
//            Shape_SelectOption

public abstract class SelectOption
    implements Parcelable
{

    public SelectOption()
    {
    }

    public static SelectOption create()
    {
        return new Shape_SelectOption();
    }

    public abstract String getLabel();

    public abstract String getOptionId();

    public abstract SelectOption setLabel(String s);

    public abstract SelectOption setOptionId(String s);
}
