// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.File;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

// Referenced classes of package com.vladium.util:
//            IPathEnumerator

public static interface 
{

    public abstract void handleArchiveEnd(File file, File file1);

    public abstract void handleArchiveEntry(JarInputStream jarinputstream, ZipEntry zipentry);

    public abstract void handleArchiveStart(File file, File file1, Manifest manifest);

    public abstract void handleDirEnd(File file, File file1);

    public abstract void handleDirStart(File file, File file1);

    public abstract void handleFile(File file, File file1);
}
