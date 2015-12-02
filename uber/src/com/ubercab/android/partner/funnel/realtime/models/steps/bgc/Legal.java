// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.models.steps.bgc;

import android.os.Parcelable;

public abstract class Legal
    implements Parcelable
{

    public Legal()
    {
    }

    public abstract String getActionText();

    public abstract String getAgreeText();

    public abstract String getDescription();

    public abstract String getDisclosureTitle();

    public abstract String getImageUrl();

    public abstract String getReceiveCopyOptionText();

    public abstract String getTitle();

    abstract Legal setActionText(String s);

    abstract Legal setAgreeText(String s);

    abstract Legal setDescription(String s);

    abstract Legal setDisclosureTitle(String s);

    abstract Legal setImageUrl(String s);

    abstract Legal setReceiveCopyOptionText(String s);

    abstract Legal setTitle(String s);
}
