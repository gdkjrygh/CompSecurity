// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.collect.TreeTraverser;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;

// Referenced classes of package com.google.common.io:
//            Files

static final class eTraverser extends TreeTraverser
{

    public Iterable children(File file)
    {
        if (file.isDirectory())
        {
            file = file.listFiles();
            if (file != null)
            {
                return Collections.unmodifiableList(Arrays.asList(file));
            }
        }
        return Collections.emptyList();
    }

    public volatile Iterable children(Object obj)
    {
        return children((File)obj);
    }

    public String toString()
    {
        return "Files.fileTreeTraverser()";
    }

    eTraverser()
    {
    }
}
