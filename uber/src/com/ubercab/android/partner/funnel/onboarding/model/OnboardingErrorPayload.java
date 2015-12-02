// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding.model:
//            Shape_OnboardingErrorPayload

public abstract class OnboardingErrorPayload
    implements Parcelable
{

    public OnboardingErrorPayload()
    {
    }

    public static OnboardingErrorPayload create()
    {
        return new Shape_OnboardingErrorPayload();
    }

    public abstract double getActivationProcessingTime();

    public abstract String getComponentId();

    public abstract int getErrorCode();

    public abstract String getExternalUrl();

    public abstract long getFinishTime();

    public abstract String getMessage();

    public abstract String getPartnerUuid();

    public abstract String getReason();

    public abstract String getVideoUrl();

    abstract OnboardingErrorPayload setActivationProcessingTime(double d);

    abstract OnboardingErrorPayload setComponentId(String s);

    abstract OnboardingErrorPayload setErrorCode(int i);

    abstract OnboardingErrorPayload setExternalUrl(String s);

    abstract OnboardingErrorPayload setFinishTime(long l);

    abstract OnboardingErrorPayload setMessage(String s);

    abstract OnboardingErrorPayload setPartnerUuid(String s);

    abstract OnboardingErrorPayload setReason(String s);

    abstract OnboardingErrorPayload setVideoUrl(String s);
}
