// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.tabbar;

import io.theholygrail.jsbridge.JSLog;

public class TabBarBridge
{

    public static final String NAMESPACE = "tabBar";
    private static final String TAG = io/theholygrail/dingo/tabbar/TabBarBridge.getSimpleName();

    public TabBarBridge()
    {
    }

    public void hide()
    {
        JSLog.d(TAG, "hide()");
    }

    public void show()
    {
        JSLog.d(TAG, "show()");
    }

}
