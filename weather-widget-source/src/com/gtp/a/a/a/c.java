// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.a.a.a;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class c
{

    public static String a = "application/zip";
    private static String b = "/mnt/sdcard/.android_secure";

    public static byte[] a(String s)
    {
        FileInputStream fileinputstream;
        BufferedInputStream bufferedinputstream;
        s = new File(s);
        fileinputstream = new FileInputStream(s);
        bufferedinputstream = new BufferedInputStream(new DataInputStream(fileinputstream));
        s = new byte[(int)s.length()];
        bufferedinputstream.read(s);
        fileinputstream.close();
        return s;
        Object obj;
        obj;
        s = null;
_L8:
        ((FileNotFoundException) (obj)).printStackTrace();
        return s;
        obj;
        s = null;
_L6:
        ((SecurityException) (obj)).printStackTrace();
        return s;
        obj;
        s = null;
_L4:
        ((IOException) (obj)).printStackTrace();
        return s;
        obj;
        s = null;
_L2:
        ((Exception) (obj)).printStackTrace();
        return s;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
