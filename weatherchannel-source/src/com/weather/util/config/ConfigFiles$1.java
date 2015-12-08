// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.config;


// Referenced classes of package com.weather.util.config:
//            ConfigParser, ConfigFiles, ConfigException

static final class n
    implements ConfigParser
{

    public ConfigFiles parse(String s)
        throws ConfigException
    {
        return ConfigFiles.parse(s);
    }

    public volatile Object parse(String s)
        throws ConfigException
    {
        return parse(s);
    }

    n()
    {
    }
}
