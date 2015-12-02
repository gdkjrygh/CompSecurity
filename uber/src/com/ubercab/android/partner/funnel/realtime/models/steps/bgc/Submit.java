// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.models.steps.bgc;

import android.os.Parcelable;

public abstract class Submit
    implements Parcelable
{

    public Submit()
    {
    }

    public abstract String getReceiveCopy();

    public abstract String getSsnInputValue();

    abstract Submit setReceiveCopy(String s);

    abstract Submit setSsnInputValue(String s);
}
