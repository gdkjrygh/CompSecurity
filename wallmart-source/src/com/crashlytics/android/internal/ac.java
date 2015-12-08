// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.File;
import java.util.Comparator;

final class ac
    implements Comparator
{

    ac()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (File)obj;
        obj1 = (File)obj1;
        return (int)(((File) (obj)).lastModified() - ((File) (obj1)).lastModified());
    }
}
