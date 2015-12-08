// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.maps;

import android.text.TextUtils;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.weather.util.TwcPreconditions;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.weather.util.maps:
//            GoogleStaticMapsUrl

public static final class 
    implements ing
{

    private static final int DEFAULT_WEIGHT = 5;
    public static final Set pathColors = GoogleStaticMapsUrl.access$000();
    private final String color;
    private final String encodedLocations;
    private final String fillColor;
    private final List locations;
    private final int weight;

    private static String checkValidColor(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("empty color ").append(s).toString());
        }
        if (s.startsWith("0x") && (s.length() == 8 || s.length() == 10))
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
            TwcPreconditions.checkAllowed(s, pathColors);
            return s;
        }
    }

    public String getParamString()
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        arraylist.add((new StringBuilder()).append("color:").append(color).toString());
        if (fillColor != null)
        {
            arraylist.add((new StringBuilder()).append("fillcolor:").append(fillColor).toString());
        }
        if (weight != 5)
        {
            arraylist.add((new StringBuilder()).append("weight:").append(weight).toString());
        }
        if (locations != null)
        {
            for (Iterator iterator = locations.iterator(); iterator.hasNext(); arraylist.add(((ing)iterator.next()).getParamString())) { }
        } else
        {
            try
            {
                arraylist.add((new StringBuilder()).append("enc:").append(URLEncoder.encode(encodedLocations, "UTF-8")).toString());
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                throw new IllegalStateException(unsupportedencodingexception);
            }
        }
        return (new StringBuilder()).append("&path=").append(Joiner.on("%7C").join(arraylist)).toString();
    }


    public ing(String s, String s1, int i, String s2)
    {
        boolean flag;
        if (s1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        weight = i;
        color = checkValidColor(s);
        if (flag)
        {
            s = null;
        } else
        {
            s = checkValidColor(s1);
        }
        fillColor = s;
        locations = null;
        encodedLocations = (String)Preconditions.checkNotNull(s2);
    }

    public encodedLocations(String s, String s1, int i, List list)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (s1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        weight = i;
        color = checkValidColor(s);
        if (flag)
        {
            s = null;
        } else
        {
            s = checkValidColor(s1);
        }
        fillColor = s;
        locations = ImmutableList.copyOf(list);
        encodedLocations = null;
        if (flag)
        {
            i = 2;
        } else
        {
            i = 3;
        }
        if (locations.size() < i)
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1);
    }
}
