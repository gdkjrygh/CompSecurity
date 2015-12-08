// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.f;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

class b
    implements FileFilter
{

    b()
    {
    }

    public boolean accept(File file)
    {
        return Pattern.matches("cpu[0-9]", file.getName());
    }
}
