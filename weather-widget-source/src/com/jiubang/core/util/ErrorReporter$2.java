// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.util;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.jiubang.core.util:
//            ErrorReporter

class this._cls0
    implements FilenameFilter
{

    final ErrorReporter this$0;

    public boolean accept(File file, String s)
    {
        return s.endsWith("_stk.txt");
    }

    ()
    {
        this$0 = ErrorReporter.this;
        super();
    }
}
