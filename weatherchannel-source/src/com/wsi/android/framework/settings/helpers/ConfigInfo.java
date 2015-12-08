// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.settings.helpers;

import android.content.pm.ApplicationInfo;

public class ConfigInfo
{

    public static boolean DEBUG = false;
    public static boolean DEBUG_DATA = false;
    public static boolean DEBUG_RENDERING = false;
    public static boolean DEBUG_WW = false;
    public static boolean LOG_STATISTICS = false;

    public ConfigInfo()
    {
    }

    public static void updateDebugState(ApplicationInfo applicationinfo)
    {
        boolean flag;
        if ((applicationinfo.flags & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        DEBUG = flag;
    }

}
