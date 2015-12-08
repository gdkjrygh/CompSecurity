// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad;

import android.os.Environment;
import java.io.File;

public class c
{

    public static final String a = (new StringBuilder()).append(e).append("/GoAdSdk").append("/config/").toString();
    public static final String b = (new StringBuilder()).append(e).append("/GoAdSdk").append("/advert/cacheFile/").toString();
    public static final String c = (new StringBuilder()).append(e).append("/GoAdSdk").append("/advert/cacheImage/").toString();
    public static final String d = (new StringBuilder()).append(e).append("/GoAdSdk").append("/debug/debug.ini").toString();
    private static final String e = Environment.getExternalStorageDirectory().getPath();

}
