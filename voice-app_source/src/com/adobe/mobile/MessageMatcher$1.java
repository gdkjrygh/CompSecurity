// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;

// Referenced classes of package com.adobe.mobile:
//            MessageMatcher, MessageMatcherEquals, MessageMatcherNotEquals, MessageMatcherGreaterThan, 
//            MessageMatcherGreaterThanOrEqual, MessageMatcherLessThan, MessageMatcherLessThanOrEqual, MessageMatcherContains, 
//            MessageMatcherNotContains, MessageMatcherStartsWith, MessageMatcherEndsWith, MessageMatcherExists, 
//            MessageMatcherNotExists

static final class put extends HashMap
{

    Exists()
    {
        put("eq", com/adobe/mobile/MessageMatcherEquals);
        put("ne", com/adobe/mobile/MessageMatcherNotEquals);
        put("gt", com/adobe/mobile/MessageMatcherGreaterThan);
        put("ge", com/adobe/mobile/MessageMatcherGreaterThanOrEqual);
        put("lt", com/adobe/mobile/MessageMatcherLessThan);
        put("le", com/adobe/mobile/MessageMatcherLessThanOrEqual);
        put("co", com/adobe/mobile/MessageMatcherContains);
        put("nc", com/adobe/mobile/MessageMatcherNotContains);
        put("sw", com/adobe/mobile/MessageMatcherStartsWith);
        put("ew", com/adobe/mobile/MessageMatcherEndsWith);
        put("ex", com/adobe/mobile/MessageMatcherExists);
        put("nx", com/adobe/mobile/MessageMatcherNotExists);
    }
}
