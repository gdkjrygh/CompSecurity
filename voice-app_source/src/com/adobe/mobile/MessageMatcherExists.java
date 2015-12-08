// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            MessageMatcher

class MessageMatcherExists extends MessageMatcher
{

    MessageMatcherExists()
    {
    }

    protected transient boolean matchesInMaps(Map amap[])
    {
        Object obj1 = null;
        if (amap != null && amap.length > 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        int j;
        j = amap.length;
        i = 0;
_L4:
        Object obj;
        obj = obj1;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = amap[i];
          goto _L3
_L6:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (obj == null || !((Map) (obj)).containsKey(key)) goto _L6; else goto _L5
_L5:
        obj = ((Map) (obj)).get(key);
        if (obj == null) goto _L1; else goto _L7
_L7:
        return true;
    }
}
