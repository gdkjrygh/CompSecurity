// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.Context;
import android.graphics.Typeface;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.HashMap;
import java.util.Map;

public final class Typefaces extends Enum
{

    private static final Typefaces $VALUES[];
    public static final Typefaces ROBOTO_LIGHT;
    public static final Typefaces ROBOTO_REGULAR;
    private static final Map typefaceMap = new HashMap();
    private final String fontName;

    private Typefaces(String s, int i, String s1)
    {
        super(s, i);
        fontName = s1;
    }

    public static Typefaces valueOf(String s)
    {
        return (Typefaces)Enum.valueOf(com/google/android/apps/youtube/core/utils/Typefaces, s);
    }

    public static Typefaces[] values()
    {
        return (Typefaces[])$VALUES.clone();
    }

    public final Typeface toTypeface(Context context)
    {
        c.a();
        if (!typefaceMap.containsKey(fontName))
        {
            try
            {
                context = Typeface.createFromAsset(context.getAssets(), fontName);
                typefaceMap.put(fontName, context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                typefaceMap.put(fontName, null);
            }
        }
        return (Typeface)typefaceMap.get(fontName);
    }

    static 
    {
        ROBOTO_LIGHT = new Typefaces("ROBOTO_LIGHT", 0, "Roboto-Light.ttf");
        ROBOTO_REGULAR = new Typefaces("ROBOTO_REGULAR", 1, "Roboto-Regular.ttf");
        $VALUES = (new Typefaces[] {
            ROBOTO_LIGHT, ROBOTO_REGULAR
        });
    }
}
