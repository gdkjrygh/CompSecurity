// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.Pair;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewCrawler

private static class variantId
{

    public final String activityName;
    public final JSONObject change;
    public final Pair variantId;

    public (String s, JSONObject jsonobject, Pair pair)
    {
        activityName = s;
        change = jsonobject;
        variantId = pair;
    }
}
