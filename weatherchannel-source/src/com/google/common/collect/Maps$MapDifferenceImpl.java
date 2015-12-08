// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            MapDifference, Maps

static class differences
    implements MapDifference
{

    final Map differences;
    final Map onBoth;
    final Map onlyOnLeft;
    final Map onlyOnRight;

    public boolean areEqual()
    {
        return onlyOnLeft.isEmpty() && onlyOnRight.isEmpty() && differences.isEmpty();
    }

    public Map entriesDiffering()
    {
        return differences;
    }

    public Map entriesInCommon()
    {
        return onBoth;
    }

    public Map entriesOnlyOnLeft()
    {
        return onlyOnLeft;
    }

    public Map entriesOnlyOnRight()
    {
        return onlyOnRight;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof MapDifference)
            {
                if (!entriesOnlyOnLeft().equals(((MapDifference) (obj = (MapDifference)obj)).entriesOnlyOnLeft()) || !entriesOnlyOnRight().equals(((MapDifference) (obj)).entriesOnlyOnRight()) || !entriesInCommon().equals(((MapDifference) (obj)).entriesInCommon()) || !entriesDiffering().equals(((MapDifference) (obj)).entriesDiffering()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering()
        });
    }

    public String toString()
    {
        if (areEqual())
        {
            return "equal";
        }
        StringBuilder stringbuilder = new StringBuilder("not equal");
        if (!onlyOnLeft.isEmpty())
        {
            stringbuilder.append(": only on left=").append(onlyOnLeft);
        }
        if (!onlyOnRight.isEmpty())
        {
            stringbuilder.append(": only on right=").append(onlyOnRight);
        }
        if (!differences.isEmpty())
        {
            stringbuilder.append(": value differences=").append(differences);
        }
        return stringbuilder.toString();
    }

    (Map map, Map map1, Map map2, Map map3)
    {
        onlyOnLeft = Maps.access$100(map);
        onlyOnRight = Maps.access$100(map1);
        onBoth = Maps.access$100(map2);
        differences = Maps.access$100(map3);
    }
}
