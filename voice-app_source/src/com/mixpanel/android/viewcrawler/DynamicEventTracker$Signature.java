// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.view.View;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            DynamicEventTracker

private static class mHashCode
{

    private final int mHashCode;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof mHashCode)
        {
            flag = flag1;
            if (mHashCode == obj.hashCode())
            {
                flag = true;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return mHashCode;
    }

    public (View view, String s)
    {
        mHashCode = view.hashCode() ^ s.hashCode();
    }
}
