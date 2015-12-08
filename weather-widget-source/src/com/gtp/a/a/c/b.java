// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.a.a.c;

import java.io.IOException;
import java.io.InputStream;

public class b
{

    public static String a()
    {
        Object obj = "";
        InputStream inputstream;
        inputstream = (new ProcessBuilder(new String[] {
            "/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
        })).start().getInputStream();
        for (byte abyte0[] = new byte[24]; inputstream.read(abyte0) != -1;)
        {
            obj = (new StringBuilder()).append(((String) (obj))).append(new String(abyte0)).toString();
        }

        try
        {
            inputstream.close();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            ioexception = "N/A";
        }
        return ((String) (obj)).trim();
    }
}
