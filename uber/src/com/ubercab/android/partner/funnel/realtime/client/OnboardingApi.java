// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.client;

import com.ubercab.android.partner.funnel.realtime.request.body.EmptyBody;
import ica;

public interface OnboardingApi
{

    public abstract ica getNextStep(String s);

    public abstract ica postVehicleInspectionFormEmail(String s, EmptyBody emptybody);
}
