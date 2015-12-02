// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.network;

import ica;
import java.util.Map;

public interface OnboardingApi
{

    public abstract ica postOnboardingForm(String s, Map map);

    public abstract ica requestNextForm(String s);
}
