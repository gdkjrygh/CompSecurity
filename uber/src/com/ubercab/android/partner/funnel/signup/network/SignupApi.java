// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.network;

import ica;
import java.util.Map;

public interface SignupApi
{

    public abstract ica getSignupForm();

    public abstract ica getUpgradeSignupForm(String s);

    public abstract ica postSignupForm(Map map);

    public abstract ica postUpgradeSignupForm(String s, Map map);
}
