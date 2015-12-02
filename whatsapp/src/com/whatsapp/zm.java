// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.io.File;
import java.util.Comparator;

final class zm
    implements Comparator
{

    zm()
    {
    }

    public int a(File file, File file1)
    {
        return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file1.lastModified()));
    }

    public int compare(Object obj, Object obj1)
    {
        return a((File)obj, (File)obj1);
    }
}
