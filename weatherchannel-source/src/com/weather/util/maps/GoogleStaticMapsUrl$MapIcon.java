// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.maps;

import android.webkit.URLUtil;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.util.maps:
//            GoogleStaticMapsUrl

public static class 
    implements ing
{
    public static final class Decoration extends Enum
    {

        private static final Decoration $VALUES[];
        public static final Decoration NONE;
        public static final Decoration SHADOWED;
        private final String styleString;

        private String getStyleString()
        {
            return styleString;
        }

        public static Decoration valueOf(String s)
        {
            return (Decoration)Enum.valueOf(com/weather/util/maps/GoogleStaticMapsUrl$MapIcon$Decoration, s);
        }

        public static Decoration[] values()
        {
            return (Decoration[])$VALUES.clone();
        }

        static 
        {
            NONE = new Decoration("NONE", 0, "shadow:false");
            SHADOWED = new Decoration("SHADOWED", 1, "");
            $VALUES = (new Decoration[] {
                NONE, SHADOWED
            });
        }


        private Decoration(String s, int i, String s1)
        {
            super(s, i);
            styleString = s1;
        }
    }


    private final Decoration decoration;
    private final String iconSource;
    private final List locations;

    public String getParamString()
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        arraylist.add((new StringBuilder()).append("icon:").append(iconSource).toString());
        Object obj = decoration.getStyleString();
        if (!((String) (obj)).isEmpty())
        {
            arraylist.add(obj);
        }
        obj = Lists.newArrayList();
        for (Iterator iterator = locations.iterator(); iterator.hasNext(); ((List) (obj)).add(((ing)iterator.next()).getParamString())) { }
        return (new StringBuilder()).append("&markers=").append(Joiner.on("%7C").join(arraylist)).append("%7C").append(Joiner.on("%7C").join(((Iterable) (obj)))).toString();
    }

    public Decoration(String s, Decoration decoration1, ion ion)
    {
        this(s, decoration1, ((List) (ImmutableList.of(ion))));
    }

    public Decoration(String s, Decoration decoration1, List list)
    {
        decoration = (Decoration)Preconditions.checkNotNull(decoration1);
        Preconditions.checkArgument(URLUtil.isValidUrl((String)Preconditions.checkNotNull(s)));
        boolean flag;
        try
        {
            iconSource = URLEncoder.encode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException("UTF-8 encoding not found", s);
        }
        Preconditions.checkNotNull(list);
        locations = ImmutableList.copyOf(list);
        if (!locations.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }
}
