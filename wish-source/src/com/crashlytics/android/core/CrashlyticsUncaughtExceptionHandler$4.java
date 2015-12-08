// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler

static final class 
    implements FilenameFilter
{

    public boolean accept(File file, String s)
    {
        return CrashlyticsUncaughtExceptionHandler.access$000().matcher(s).matches();
    }

    ()
    {
    }
}
