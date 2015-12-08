// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.view.View;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewSnapshot

private static class scale
{

    public final String activityName;
    public final View rootView;
    public float scale;
    public scale screenshot;

    public (String s, View view)
    {
        activityName = s;
        rootView = view;
        screenshot = null;
        scale = 1.0F;
    }
}
