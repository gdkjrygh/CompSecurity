// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import java.io.File;
import java.io.FileFilter;

final class f
    implements FileFilter
{

    final String a;

    f(String s)
    {
        a = s;
        super();
    }

    public boolean accept(File file)
    {
        return !file.getName().startsWith(a);
    }
}
