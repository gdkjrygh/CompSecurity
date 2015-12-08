// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            Media, MediaAnalytics

static final class val.fdata
    implements Runnable
{

    final Map val$fdata;
    final String val$name;

    public void run()
    {
        MediaAnalytics.sharedInstance().track(val$name, val$fdata);
    }

    lytics(String s, Map map)
    {
        val$name = s;
        val$fdata = map;
        super();
    }
}
