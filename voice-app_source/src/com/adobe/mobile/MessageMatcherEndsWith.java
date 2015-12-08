// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

// Referenced classes of package com.adobe.mobile:
//            MessageMatcher

final class MessageMatcherEndsWith extends MessageMatcher
{

    MessageMatcherEndsWith()
    {
    }

    protected boolean matches(Object obj)
    {
        boolean flag;
        boolean flag1;
        flag = obj instanceof String;
        flag1 = obj instanceof Number;
        if (flag || flag1) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = obj.toString();
        Iterator iterator = values.iterator();
        Object obj1;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = iterator.next();
        } while (!(obj1 instanceof String) || !((String) (obj)).matches((new StringBuilder()).append("(?i).*").append(Pattern.quote(obj1.toString())).toString()));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }
}
