// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.cache;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.google.android.apps.youtube.common.cache:
//            c

final class g
    implements FilenameFilter
{

    final String a;
    final c b;

    g(c c, String s)
    {
        b = c;
        a = s;
        super();
    }

    public final boolean accept(File file, String s)
    {
        return s.endsWith((new StringBuilder()).append(a).append(".cache").toString());
    }
}
