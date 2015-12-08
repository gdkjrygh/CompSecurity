// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import com.walmartlabs.kangaroo.service.Header;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.config:
//            WalmartNetServiceSettings

private static class <init>
{

    public final List cookiesAsHeaders;
    public final String host;
    public final String name;

    public (String s, String s1)
    {
        this(s, s1, Collections.emptyList());
    }

    public <init>(String s, String s1, List list)
    {
        name = s;
        host = s1;
        cookiesAsHeaders = list;
    }

    public cookiesAsHeaders(String s, String s1, Header aheader[])
    {
        this(s, s1, ((List) (new ArrayList(Arrays.asList(aheader)))));
    }
}
