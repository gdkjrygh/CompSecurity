// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.anivia.AniviaEventJackson;
import java.util.ArrayList;
import java.util.Locale;

public class ShelfRefinementEvent extends AniviaEventJackson
{

    private static final String EVENT_NAME = "refineItems";
    private String mRefinements[];
    private ArrayList mTemp;

    public ShelfRefinementEvent()
    {
        super("refineItems");
        mTemp = new ArrayList();
    }

    public ShelfRefinementEvent addRefinement(String s, String s1)
    {
        mTemp.add(String.format(Locale.US, "%s:%s", new Object[] {
            s, s1
        }));
        return this;
    }

    public ShelfRefinementEvent build()
    {
        mRefinements = new String[mTemp.size()];
        mRefinements = (String[])mTemp.toArray(mRefinements);
        return this;
    }
}
