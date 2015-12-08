// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.main;

import com.jiubang.playsdk.f.c;
import java.io.File;

public final class b
{

    public static final String a = (new File(com.jiubang.playsdk.f.c.a(), "Themestore")).getAbsolutePath();
    public static final String b = (new StringBuilder()).append(a).append("/info/exception/").toString();
    public static final String c = (new StringBuilder()).append(a).append("/cache/dir/").toString();
    public static final String d = (new StringBuilder()).append(a).append("/cache/image/").toString();
    public static final String e = (new StringBuilder()).append(a).append("/home.txt").toString();

    static 
    {
        File file = new File(a);
        if (!file.exists())
        {
            file.mkdirs();
        }
    }
}
