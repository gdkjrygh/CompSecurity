// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.common.io:
//            ByteSink, Files, FileWriteMode

private static final class <init> extends ByteSink
{

    private final File file;
    private final ImmutableSet modes;

    public FileOutputStream openStream()
        throws IOException
    {
        return new FileOutputStream(file, modes.contains(FileWriteMode.APPEND));
    }

    public volatile OutputStream openStream()
        throws IOException
    {
        return openStream();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(file));
        String s1 = String.valueOf(String.valueOf(modes));
        return (new StringBuilder(s.length() + 20 + s1.length())).append("Files.asByteSink(").append(s).append(", ").append(s1).append(")").toString();
    }

    private transient (File file1, FileWriteMode afilewritemode[])
    {
        file = (File)Preconditions.checkNotNull(file1);
        modes = ImmutableSet.copyOf(afilewritemode);
    }

    opyOf(File file1, FileWriteMode afilewritemode[], opyOf opyof)
    {
        this(file1, afilewritemode);
    }
}
