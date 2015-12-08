// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Properties;

public final class v
{

    public v()
    {
    }

    public static String a(String s)
    {
        ByteArrayInputStream bytearrayinputstream;
        Properties properties;
        properties = new Properties();
        bytearrayinputstream = new ByteArrayInputStream("suFileName=/system/xbin/su\r\nsuperUserApk=/system/app/Superuser.apk\r\nemptyIp=0.0.0.0".getBytes());
        properties.load(bytearrayinputstream);
        bytearrayinputstream.close();
        return properties.getProperty(s);
        s;
        bytearrayinputstream.close();
        throw s;
    }
}
