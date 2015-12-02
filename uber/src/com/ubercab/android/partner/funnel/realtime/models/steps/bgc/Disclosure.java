// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.models.steps.bgc;

import android.os.Parcelable;

public abstract class Disclosure
    implements Parcelable
{

    public Disclosure()
    {
    }

    public abstract String getDescription();

    public abstract String getTitle();

    public abstract String getType();

    abstract Disclosure setDescription(String s);

    abstract Disclosure setTitle(String s);

    abstract Disclosure setType(String s);
}
