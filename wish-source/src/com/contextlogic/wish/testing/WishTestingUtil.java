// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.testing;

import android.view.View;
import com.contextlogic.wish.WishApplication;

public class WishTestingUtil
{

    public WishTestingUtil()
    {
    }

    public static void addContentDescription(View view, String s, String s1)
    {
        if (WishApplication.getAppInstance() != null && WishApplication.getAppInstance().isTestingBuild())
        {
            view.setContentDescription(String.format("%s.%s", new Object[] {
                s, s1
            }));
        }
    }
}
