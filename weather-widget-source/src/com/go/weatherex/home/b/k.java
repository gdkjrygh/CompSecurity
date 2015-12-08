// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.b;

import android.os.Environment;
import java.io.File;

public class k
{

    public static final String a = Environment.getExternalStorageDirectory().getPath();
    public static final String b = (new StringBuilder()).append(a).append("/GOWeatherEX/ad/").toString();

}
