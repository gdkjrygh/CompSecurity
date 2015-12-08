// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.maps;

import android.text.TextUtils;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.weather.util.TwcPreconditions;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.weather.util.maps:
//            GoogleStaticMapsUrl

public static class locations
    implements g
{

    private static final String MARKER_SIZE_DEFAULT = "normal";
    public static final char NO_LABEL = 32;
    public static final Set markerColors = GoogleStaticMapsUrl.access$000();
    public static final Set markerSizes = ImmutableSet.of("normal", "mid", "small", "tiny");
    public static final Set markerSizesWithLabel = ImmutableSet.of("normal", "mid");
    private final String color;
    private final char label;
    private final List locations;
    private final String size;

    private static String checkValidColor(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("empty color ").append(s).toString());
        }
        if (s.startsWith("0x") && s.length() == 8)
        {
            try
            {
                Long.parseLong(s.substring(2), 16);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("bad color string ").append(s).toString(), numberformatexception);
            }
            return s;
        } else
        {
            TwcPreconditions.checkAllowed(s, markerColors);
            return s;
        }
    }

    public String getParamString()
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        if (!"normal".equals(size))
        {
            arraylist.add((new StringBuilder()).append("size:").append(size).toString());
        }
        arraylist.add((new StringBuilder()).append("color:").append(color).toString());
        if (label != ' ' && markerSizesWithLabel.contains(size))
        {
            arraylist.add((new StringBuilder()).append("label:").append(label).toString());
        }
        java.util.ArrayList arraylist1 = Lists.newArrayList();
        for (Iterator iterator = locations.iterator(); iterator.hasNext(); arraylist1.add(((g)iterator.next()).getParamString())) { }
        return (new StringBuilder()).append("&markers=").append(Joiner.on("%7C").join(arraylist)).append("%7C").append(Joiner.on("%7C").join(arraylist1)).toString();
    }


    public n(char c, String s, String s1, n n)
    {
        this(c, s, s1, ((List) (ImmutableList.of(n))));
    }

    public <init>(char c, String s, String s1, List list)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (c == ' ' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        label = c;
        size = (String)TwcPreconditions.checkAllowed(s, markerSizes);
        color = checkValidColor(s1);
        Preconditions.checkNotNull(list);
        locations = ImmutableList.copyOf(list);
        if (!locations.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }
}
