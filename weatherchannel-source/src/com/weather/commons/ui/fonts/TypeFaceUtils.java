// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui.fonts;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class TypeFaceUtils
{

    public static final String DEFAULT_FONT = "Roboto-Regular.ttf";
    private static final String TAG = "TypeFaceUtils";
    private static final Cache typeFaces = CacheBuilder.newBuilder().softValues().build();

    private TypeFaceUtils()
    {
    }

    private static void dumpAttrs(Context context, AttributeSet attributeset)
    {
        int j = attributeset.getAttributeCount();
        LogUtil.i("TypeFaceUtils", LoggingMetaTags.TWC_UI, "attrs=%s, count=%s", new Object[] {
            attributeset, Integer.valueOf(j)
        });
        int i = 0;
        while (i < j) 
        {
            String s1 = attributeset.getAttributeName(i);
            String s = attributeset.getAttributeValue(i);
            Object obj = s;
            if (s != null)
            {
                obj = s;
                if (s.startsWith("@"))
                {
                    obj = s;
                    if (s.length() > 1)
                    {
                        try
                        {
                            int k = Integer.parseInt(s.substring(1));
                            obj = context.getResources();
                            obj = (new StringBuilder()).append('@').append(((Resources) (obj)).getResourceTypeName(k)).append('/').append(((Resources) (obj)).getResourceEntryName(k)).toString();
                        }
                        catch (NumberFormatException numberformatexception)
                        {
                            numberformatexception = s;
                        }
                    }
                }
            }
            LogUtil.i("TypeFaceUtils", LoggingMetaTags.TWC_UI, "  i=%s, name=%s, value=%s", new Object[] {
                Integer.valueOf(i), s1, obj
            });
            i++;
        }
    }

    public static Typeface getCustomViewFont(String s, Context context, AttributeSet attributeset, int i)
    {
        String s1;
        String s2;
        s1 = "Roboto-Regular.ttf";
        s2 = s1;
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, com.weather.commons.R.styleable.TextViewWithFont);
        s2 = typedarray.getString(i);
        if (s2 == null) goto _L4; else goto _L3
_L3:
        attributeset = s2;
        LogUtil.v(s, LoggingMetaTags.TWC_UI, "using custom font: %s", new Object[] {
            attributeset
        });
        s = attributeset;
_L6:
        typedarray.recycle();
        s2 = s;
_L2:
        return getFont(context, s2);
_L4:
        LogUtil.i(s, LoggingMetaTags.TWC_UI, "font was not specified, using default font: %s, id=%s", new Object[] {
            "Roboto-Regular.ttf", attributeset.getIdAttribute()
        });
        dumpAttrs(context, attributeset);
        s = s1;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        typedarray.recycle();
        throw s;
    }

    public static Typeface getFont(Context context, String s)
    {
        try
        {
            context = (Typeface)typeFaces.get(s, new Callable(context, s) {

                final Context val$context;
                final String val$name;

                public Typeface call()
                {
                    return Typeface.createFromAsset(context.getAssets(), (new StringBuilder()).append("fonts/").append(name).toString());
                }

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                context = context1;
                name = s;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
        return context;
    }

}
