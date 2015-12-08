// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


public interface IReportProperties
{

    public static final char ASC = 43;
    public static final String BLOCK_COVERAGE_COLUMN = "block";
    public static final String CLASS_COVERAGE_COLUMN = "class";
    public static final String CLS_VIEW = "class";
    public static final String COLUMNS = "columns";
    public static final String COUNT_UNITS = "count";
    public static final String DEFAULT_COLUMNS = "class,method,block,line,name";
    public static final String DEFAULT_DEPTH = "package";
    public static final String DEFAULT_HIDE_CLASSES = "true";
    public static final String DEFAULT_METRICS = "method:70,block:80,line:80,class:100";
    public static final String DEFAULT_SORT = "+block,+name";
    public static final String DEFAULT_UNITS_TYPE = "instr";
    public static final String DEFAULT_VIEW_TYPE = "source";
    public static final String DEPTH = "depth";
    public static final String DEPTH_ALL = "all";
    public static final String DEPTH_CLASS = "class";
    public static final String DEPTH_METHOD = "method";
    public static final String DEPTH_PACKAGE = "package";
    public static final String DEPTH_SRCFILE = "source";
    public static final char DESC = 45;
    public static final String HIDE_CLASSES = "hideclasses";
    public static final String INSTR_UNITS = "instr";
    public static final String ITEM_NAME_COLUMN = "name";
    public static final String LINE_COVERAGE_COLUMN = "line";
    public static final String METHOD_COVERAGE_COLUMN = "method";
    public static final String METRICS = "metrics";
    public static final char MSEPARATOR = 58;
    public static final String OUT_DIR = "out.dir";
    public static final String OUT_ENCODING = "out.encoding";
    public static final String OUT_FILE = "out.file";
    public static final String PREFIX = "report.";
    public static final String SORT = "sort";
    public static final String SRC_VIEW = "source";
    public static final String UNITS_TYPE = "units";
    public static final String VIEW_TYPE = "view";
}
