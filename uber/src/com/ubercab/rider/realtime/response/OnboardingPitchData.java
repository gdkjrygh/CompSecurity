// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import java.util.List;

public abstract class OnboardingPitchData
{

    public OnboardingPitchData()
    {
    }

    public abstract String getBodyText();

    public abstract String getImageURL();

    public abstract List getPitchPoints();

    abstract void setBodyText(String s);

    abstract void setImageURL(String s);

    abstract void setPitchPoints(List list);
}
