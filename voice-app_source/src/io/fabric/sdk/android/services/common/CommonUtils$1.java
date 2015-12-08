// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            CommonUtils

static final class _cls9
    implements Comparator
{

    public int compare(File file, File file1)
    {
        return (int)(file.lastModified() - file1.lastModified());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((File)obj, (File)obj1);
    }

    _cls9()
    {
    }
}
