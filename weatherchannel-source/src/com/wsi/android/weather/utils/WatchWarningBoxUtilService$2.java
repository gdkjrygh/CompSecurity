// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.utils;

import java.io.File;
import java.io.FileFilter;

// Referenced classes of package com.wsi.android.weather.utils:
//            WatchWarningBoxUtilService

class tFileNamePrefix
    implements FileFilter
{

    String prefix;
    final WatchWarningBoxUtilService this$0;

    public boolean accept(File file)
    {
        return file.getName().startsWith(prefix);
    }

    ()
    {
        this$0 = WatchWarningBoxUtilService.this;
        super();
        prefix = getFileNamePrefix().toString();
    }
}
