// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import com.google.common.base.Predicate;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.commons.news.provider.Tags;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.Weather.hurricane.modules:
//            TropicalNewsModule

private static final class stormId
    implements Predicate
{

    private final String stormId;

    public boolean apply(ArticlePojo articlepojo)
    {
        if (articlepojo != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (stormId == null || articlepojo.tags == null || articlepojo.tags.getStorms().isEmpty())
        {
            return true;
        }
        articlepojo = articlepojo.tags.getStorms().iterator();
        String s;
        do
        {
            if (!articlepojo.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)articlepojo.next();
        } while (!stormId.equals(s));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public volatile boolean apply(Object obj)
    {
        return apply((ArticlePojo)obj);
    }

    (String s)
    {
        stormId = s;
    }
}
