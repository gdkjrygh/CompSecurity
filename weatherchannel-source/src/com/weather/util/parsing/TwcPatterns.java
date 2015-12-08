// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.parsing;

import java.util.regex.Pattern;

public final class TwcPatterns
{

    public static final Pattern DOMAIN_NAME;
    private static final String GOOD_GTLD_CHAR = "a-zA-Z\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF";
    public static final String GOOD_IRI_CHAR = "a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF";
    public static final Pattern GOOD_IRI_PATTERN = Pattern.compile("[a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]([a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\\-]{0,61}[a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]){0,1}");
    private static final String GTLD = "[a-zA-Z\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]{2,63}";
    private static final String HOST_NAME = "([a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]([a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\\-]{0,61}[a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]){0,1}\\.)+[a-zA-Z\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]{2,63}";
    public static final Pattern IP_ADDRESS;
    private static final String IRI = "[a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]([a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\\-]{0,61}[a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]){0,1}";
    public static final Pattern LOCALE_GLOB_PATTERN = Pattern.compile("(?i)(([A-Z]{2})|(\\*))_(([A-Z]{2})|(\\*))");
    public static final Pattern UUID_PATTERN = Pattern.compile("(?i)[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}");
    public static final Pattern WEB_URL;

    private TwcPatterns()
    {
    }

    static 
    {
        IP_ADDRESS = Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))");
        DOMAIN_NAME = Pattern.compile((new StringBuilder()).append("(([a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]([a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\\-]{0,61}[a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]){0,1}\\.)+[a-zA-Z\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]{2,63}|").append(IP_ADDRESS).append(')').toString());
        WEB_URL = Pattern.compile((new StringBuilder()).append("((?:(http|https|Http|Https|rtsp|Rtsp):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:").append(DOMAIN_NAME).append(')').append("(?:\\:\\d{1,5})?)").append("(\\/(?:(?:[").append("a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF").append("\\;\\/\\?\\:\\@\\&\\=\\#\\~").append("\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?").append("(?:\\b|$)").toString());
    }
}
