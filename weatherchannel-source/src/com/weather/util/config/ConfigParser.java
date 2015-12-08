// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.config;


// Referenced classes of package com.weather.util.config:
//            ConfigException

public interface ConfigParser
{

    public abstract Object parse(String s)
        throws ConfigException;
}
