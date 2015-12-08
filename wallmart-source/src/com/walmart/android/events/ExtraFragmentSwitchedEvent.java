// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.events;

import com.walmartlabs.ui.FragmentSwitchedEvent;

public class ExtraFragmentSwitchedEvent extends FragmentSwitchedEvent
{

    private String mExtra;

    public ExtraFragmentSwitchedEvent(String s, String s1)
    {
        super(s);
        mExtra = s1;
    }

    public String getExtra()
    {
        return mExtra;
    }
}
