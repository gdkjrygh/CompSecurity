// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;

public class Typefaces
{
    public static final class Family extends Enum
    {

        private static final Family $VALUES[];
        public static final Family LIGHT;
        public static final Family MEDIUM;
        public static final Family REGULAR;
        private String familyName;
        private boolean platformFont;

        public static Family valueOf(String s)
        {
            return (Family)Enum.valueOf(com/walmart/android/wmui/Typefaces$Family, s);
        }

        public static Family[] values()
        {
            return (Family[])$VALUES.clone();
        }

        static 
        {
            REGULAR = new Family("REGULAR", 0, "sans-serif", true);
            MEDIUM = new Family("MEDIUM", 1, "fonts/Roboto-Medium.ttf", false);
            LIGHT = new Family("LIGHT", 2, "sans-serif-light", true);
            $VALUES = (new Family[] {
                REGULAR, MEDIUM, LIGHT
            });
        }



        private Family(String s, int i, String s1, boolean flag)
        {
            super(s, i);
            familyName = s1;
            platformFont = flag;
        }
    }


    private static final HashMap sTypefaceMap = new HashMap();

    public Typefaces()
    {
    }

    public static Typeface create(Context context, Family family)
    {
label0:
        {
            Typeface typeface1 = (Typeface)sTypefaceMap.get(family);
            Typeface typeface = typeface1;
            if (typeface1 == null)
            {
                if (!family.platformFont)
                {
                    break label0;
                }
                typeface = Typeface.create(family.familyName, 0);
            }
            return typeface;
        }
        context = Typeface.createFromAsset(context.getAssets(), family.familyName);
        sTypefaceMap.put(family, context);
        return context;
    }

}
