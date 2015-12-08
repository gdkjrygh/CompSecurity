// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import java.io.File;
import java.io.IOException;

public interface CsvFileLineWriter
{

    public transient abstract void writeMetricsToFile(File file, String s, String s1, Object aobj[])
        throws IOException;
}
