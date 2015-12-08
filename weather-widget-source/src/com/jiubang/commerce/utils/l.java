// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.os.Environment;

public class l
{

    public static boolean a()
    {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
