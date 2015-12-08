// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.common.collect.ImmutableMap;
import com.weather.commons.video2.ThumbnailSize;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.parsing.Validation;
import com.weather.util.parsing.ValidationException;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

class ImageVariants
{

    private static final Pattern COMPILE = Pattern.compile("h=356", 16);
    private static final String FIELD_NAME_10 = "10";
    private static final String FIELD_NAME_11 = "11";
    private static final String FIELD_NAME_12 = "12";
    private static final String FIELD_NAME_16 = "16";
    private static final String FIELD_NAME_2 = "2";
    private static final String FIELD_NAME_8 = "8";
    private static final String FIELD_NAME_9 = "9";
    private static final Map sizeVariants = new EnumMap(com/weather/commons/video2/ThumbnailSize);
    private final Map variantUrls;

    private ImageVariants(String s, String s1, String s2, String s3, String s4, String s5, String s6)
        throws ValidationException
    {
        variantUrls = ImmutableMap.builder().put("2", Validation.validateWebUrl("2", s)).put("8", Validation.validateWebUrl("8", s1)).put("9", Validation.validateWebUrl("9", s2)).put("10", COMPILE.matcher(Validation.validateWebUrl("10", s3)).replaceAll("h=366")).put("11", Validation.validateWebUrl("11", s4)).put("12", Validation.validateWebUrl("12", s5)).put("16", Validation.validateWebUrl("16", s6)).build();
    }

    public static ImageVariants fromJson(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        return new ImageVariants(jsonobject.getString("2"), jsonobject.getString("8"), jsonobject.getString("9"), jsonobject.getString("10"), jsonobject.getString("11"), jsonobject.getString("12"), jsonobject.getString("16"));
    }

    void clearSizeVariants()
    {
        synchronized (sizeVariants)
        {
            sizeVariants.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getThumbnailUrl(ThumbnailSize thumbnailsize)
    {
        Map map = sizeVariants;
        map;
        JVM INSTR monitorenter ;
        String s = (String)sizeVariants.get(thumbnailsize);
        Object obj = s;
        if (s != null) goto _L2; else goto _L1
_L1:
        int i;
        obj = AbstractTwcApplication.getRootContext().getResources();
        i = ((Resources) (obj)).getDisplayMetrics().densityDpi;
        if ((((Resources) (obj)).getConfiguration().screenLayout & 0xf) < 3 && i < 320) goto _L4; else goto _L3
_L3:
        sizeVariants.put(ThumbnailSize.MEDIUM, "10");
        sizeVariants.put(ThumbnailSize.LARGE, "12");
_L5:
        obj = (String)sizeVariants.get(thumbnailsize);
_L2:
        map;
        JVM INSTR monitorexit ;
        return (String)variantUrls.get(obj);
_L4:
        if (i < 240)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        sizeVariants.put(ThumbnailSize.MEDIUM, "9");
        sizeVariants.put(ThumbnailSize.LARGE, "11");
          goto _L5
        thumbnailsize;
        map;
        JVM INSTR monitorexit ;
        throw thumbnailsize;
        sizeVariants.put(ThumbnailSize.MEDIUM, "8");
        sizeVariants.put(ThumbnailSize.LARGE, "9");
          goto _L5
    }

    public String toString()
    {
        return (new StringBuilder()).append("ImageVariants{variantUrls=").append(variantUrls).append(", getThumbnailUrl(MEDIUM)='").append(getThumbnailUrl(ThumbnailSize.MEDIUM)).append('\'').append(", getThumbnailUrl(LARGE)='").append(getThumbnailUrl(ThumbnailSize.LARGE)).append('\'').append('}').toString();
    }

}
