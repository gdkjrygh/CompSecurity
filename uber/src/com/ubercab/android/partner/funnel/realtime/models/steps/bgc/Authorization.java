// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.models.steps.bgc;

import android.os.Parcelable;

public abstract class Authorization
    implements Parcelable
{

    public Authorization()
    {
    }

    public abstract String getDescription();

    public abstract String getTitle();

    public abstract String getType();

    abstract Authorization setDescription(String s);

    abstract Authorization setTitle(String s);

    abstract Authorization setType(String s);
}
