// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.crashlytics.android.core:
//            ClsFileOutputStream

static final class 
    implements FilenameFilter
{

    public boolean accept(File file, String s)
    {
        return s.endsWith(".cls_temp");
    }

    ()
    {
    }
}
