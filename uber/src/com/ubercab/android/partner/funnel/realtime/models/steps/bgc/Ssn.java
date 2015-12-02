// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.models.steps.bgc;

import android.os.Parcelable;
import java.util.List;

public abstract class Ssn
    implements Parcelable
{

    public Ssn()
    {
    }

    public abstract String getActionText();

    public abstract String getDescription();

    public abstract String getInputTitle();

    public abstract List getSubtitles();

    public abstract String getTitle();

    abstract Ssn setActionText(String s);

    abstract Ssn setDescription(String s);

    abstract Ssn setInputTitle(String s);

    abstract Ssn setSubtitles(List list);

    abstract Ssn setTitle(String s);
}
