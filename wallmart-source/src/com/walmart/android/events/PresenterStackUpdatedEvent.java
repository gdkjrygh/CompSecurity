// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.events;

import com.walmart.android.ui.Presenter;

public class PresenterStackUpdatedEvent
{

    public final com.walmart.android.config.FragmentConfig.FragmentName fragmentName;
    public final Presenter onTop;

    public PresenterStackUpdatedEvent(Presenter presenter, com.walmart.android.config.FragmentConfig.FragmentName fragmentname)
    {
        onTop = presenter;
        fragmentName = fragmentname;
    }
}
