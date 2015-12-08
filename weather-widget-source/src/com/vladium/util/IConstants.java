// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.File;

public interface IConstants
{

    public static final File EMPTY_FILE_ARRAY[] = new File[0];
    public static final int EMPTY_INT_ARRAY[] = new int[0];
    public static final String EMPTY_STRING_ARRAY[] = new String[0];
    public static final String EOL = System.getProperty("line.separator", "\n");
    public static final String INDENT_INCREMENT = "  ";

}
