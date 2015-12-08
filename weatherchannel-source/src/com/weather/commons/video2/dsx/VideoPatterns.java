// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import java.util.regex.Pattern;

public final class VideoPatterns
{

    static final Pattern COLLECTION_ID_PATTERN = Pattern.compile("[a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]{1,61}([\\-/][a-zA-Z0-9\240-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]{1,61}){0,50}");
    static final Pattern DMA = Pattern.compile("[A-Z]{2}\\.[0-9]{1,3}:[A-Z]{2}");

    private VideoPatterns()
    {
    }

}
