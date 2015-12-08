// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Predicate;
import java.io.File;

// Referenced classes of package com.google.common.io:
//            Files

private static abstract class <init> extends Enum
    implements Predicate
{

    private static final IS_FILE $VALUES[];
    public static final IS_FILE IS_DIRECTORY;
    public static final IS_FILE IS_FILE;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/io/Files$FilePredicate, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        IS_DIRECTORY = new Files.FilePredicate("IS_DIRECTORY", 0) {

            public boolean apply(File file)
            {
                return file.isDirectory();
            }

            public volatile boolean apply(Object obj)
            {
                return apply((File)obj);
            }

            public String toString()
            {
                return "Files.isDirectory()";
            }

        };
        IS_FILE = new Files.FilePredicate("IS_FILE", 1) {

            public boolean apply(File file)
            {
                return file.isFile();
            }

            public volatile boolean apply(Object obj)
            {
                return apply((File)obj);
            }

            public String toString()
            {
                return "Files.isFile()";
            }

        };
        $VALUES = (new .VALUES[] {
            IS_DIRECTORY, IS_FILE
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, _cls2 _pcls2)
    {
        this(s, i);
    }
}
