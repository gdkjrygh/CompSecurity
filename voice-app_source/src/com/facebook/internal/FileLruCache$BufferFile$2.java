// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.facebook.internal:
//            FileLruCache

class 
    implements FilenameFilter
{

    public boolean accept(File file, String s)
    {
        return s.startsWith("buffer");
    }

    ()
    {
    }
}
