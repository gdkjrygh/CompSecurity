// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.logging;


public interface ILogLevels
{

    public static final int ALL = 7;
    public static final String ALL_STRING = "all";
    public static final int INFO = 2;
    public static final String INFO_STRING = "info";
    public static final int NONE = -1;
    public static final String NONE_STRING = "none";
    public static final String QUIET_STRING = "quiet";
    public static final int SEVERE = 0;
    public static final String SEVERE_STRING = "severe";
    public static final String SILENT_STRING = "silent";
    public static final int TRACE1 = 4;
    public static final String TRACE1_STRING = "trace1";
    public static final int TRACE2 = 5;
    public static final String TRACE2_STRING = "trace2";
    public static final int TRACE3 = 6;
    public static final String TRACE3_STRING = "trace3";
    public static final int VERBOSE = 3;
    public static final String VERBOSE_STRING = "verbose";
    public static final int WARNING = 1;
    public static final String WARNING_STRING = "warning";
}
