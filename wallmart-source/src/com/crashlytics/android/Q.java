// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android:
//            v

final class Q
    implements FilenameFilter
{

    private Q()
    {
    }

    Q(byte byte0)
    {
        this();
    }

    public final boolean accept(File file, String s)
    {
        return !v.a.accept(file, s) && v.i().matcher(s).matches();
    }
}
