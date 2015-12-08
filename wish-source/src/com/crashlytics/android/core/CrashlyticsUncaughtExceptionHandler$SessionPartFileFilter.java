// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler

static class sessionId
    implements FilenameFilter
{

    private final String sessionId;

    public boolean accept(File file, String s)
    {
        while (s.equals((new StringBuilder()).append(sessionId).append(".cls").toString()) || !s.contains(sessionId) || s.endsWith(".cls_temp")) 
        {
            return false;
        }
        return true;
    }

    public (String s)
    {
        sessionId = s;
    }
}
