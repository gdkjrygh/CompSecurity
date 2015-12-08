// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.escape;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ArrayBasedEscaperMap
{

    private static final char EMPTY_REPLACEMENT_ARRAY[][];
    private final char replacementArray[][];

    private ArrayBasedEscaperMap(char ac[][])
    {
        replacementArray = ac;
    }

    public static ArrayBasedEscaperMap create(Map map)
    {
        return new ArrayBasedEscaperMap(createReplacementArray(map));
    }

    static char[][] createReplacementArray(Map map)
    {
        Preconditions.checkNotNull(map);
        if (!map.isEmpty()) goto _L2; else goto _L1
_L1:
        char ac[][] = EMPTY_REPLACEMENT_ARRAY;
_L4:
        return ac;
_L2:
        char ac1[][] = new char[((Character)Collections.max(map.keySet())).charValue() + 1][];
        Iterator iterator = map.keySet().iterator();
        do
        {
            ac = ac1;
            if (!iterator.hasNext())
            {
                continue;
            }
            char c = ((Character)iterator.next()).charValue();
            ac1[c] = ((String)map.get(Character.valueOf(c))).toCharArray();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    char[][] getReplacementArray()
    {
        return replacementArray;
    }

    static 
    {
        EMPTY_REPLACEMENT_ARRAY = (char[][])Array.newInstance(Character.TYPE, new int[] {
            0, 0
        });
    }
}
