// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.logging.Logger;

public class Version
{

    private static final Logger LOG;
    public static final String VERSION;

    public Version()
    {
    }

    static 
    {
        LOG = Logger.getLogger(com/googlecode/mp4parser/Version.getName());
        Object obj = new LineNumberReader(new InputStreamReader(com/googlecode/mp4parser/Version.getResourceAsStream("/version.txt")));
        try
        {
            obj = ((LineNumberReader) (obj)).readLine();
        }
        catch (IOException ioexception)
        {
            LOG.warning(ioexception.getMessage());
            ioexception = "unknown";
        }
        VERSION = ((String) (obj));
    }
}
