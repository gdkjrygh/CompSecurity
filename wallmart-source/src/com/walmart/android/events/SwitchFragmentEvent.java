// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.events;

import android.os.Bundle;

public class SwitchFragmentEvent
{

    public final Bundle arguments;
    public final boolean backToCurrentFragment;
    public final com.walmart.android.config.FragmentConfig.FragmentName fragmentName;

    public SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName fragmentname)
    {
        this(fragmentname, null);
    }

    public SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName fragmentname, Bundle bundle)
    {
        this(fragmentname, bundle, false);
    }

    public SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName fragmentname, Bundle bundle, boolean flag)
    {
        fragmentName = fragmentname;
        arguments = bundle;
        backToCurrentFragment = flag;
    }
}
