// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.model;

import android.os.Parcelable;
import hnx;
import hny;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding.model:
//            Shape_OnboardingError, OnboardingErrorPayload

public abstract class OnboardingError extends hnx
    implements Parcelable
{

    public OnboardingError()
    {
    }

    public static OnboardingError create()
    {
        return new Shape_OnboardingError();
    }

    public abstract String getErrorName();

    public abstract OnboardingErrorPayload getPayload();

    protected Object onGet(hny hny, Object obj)
    {
        _cls1..SwitchMap.com.ubercab.android.partner.funnel.onboarding.model.Shape_OnboardingError.Property[((Shape_OnboardingError.Property)hny).ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 30;
           goto _L1 _L2
_L1:
        return obj;
_L2:
        if (obj == null)
        {
            return OnboardingErrorPayload.create();
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    abstract void setErrorName(String s);

    abstract void setPayload(OnboardingErrorPayload onboardingerrorpayload);

    /* member class not found */
    class _cls1 {}

}
