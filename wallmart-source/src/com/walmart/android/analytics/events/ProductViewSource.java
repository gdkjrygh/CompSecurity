// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.anivia.AniviaEventJackson;

// Referenced classes of package com.walmart.android.analytics.events:
//            Source

public class ProductViewSource extends AniviaEventJackson
{

    private static final String EVENT_NAME = "prodViewSource";
    private String mSource;

    public ProductViewSource(Source source)
    {
        super("prodViewSource");
        mSource = source.toString();
    }
}
