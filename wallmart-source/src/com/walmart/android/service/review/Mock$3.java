// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.review;

import java.util.HashMap;

// Referenced classes of package com.walmart.android.service.review:
//            Mock, ReviewSort

static final class put extends HashMap
{

    ort()
    {
        put("sort", ReviewSort.HELPFULNESS_HIGHEST_FIRST.value());
        put("limit", "50");
        put("offset", "50");
    }
}
