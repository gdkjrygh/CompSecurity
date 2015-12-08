// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.walmartlabs.android.photo.net:
//            EndpointsProvider, V1EndpointsProvider

public class EndpointsFactory
{

    public static final String API_V1 = "v1";
    private static Map sFlyweightMap = new HashMap();

    public EndpointsFactory()
    {
    }

    public static EndpointsProvider getDefaultEndpoints(Context context)
    {
        return getEndpoints(context, "v1");
    }

    public static EndpointsProvider getEndpoints(Context context, String s)
    {
        com/walmartlabs/android/photo/net/EndpointsFactory;
        JVM INSTR monitorenter ;
        if (!sFlyweightMap.containsKey(s)) goto _L2; else goto _L1
_L1:
        context = (EndpointsProvider)sFlyweightMap.get(s);
_L4:
        com/walmartlabs/android/photo/net/EndpointsFactory;
        JVM INSTR monitorexit ;
        return context;
_L2:
        V1EndpointsProvider v1endpointsprovider = null;
        if ("v1".equalsIgnoreCase(s))
        {
            v1endpointsprovider = new V1EndpointsProvider(context);
        }
        if (v1endpointsprovider == null)
        {
            break; /* Loop/switch isn't completed */
        }
        sFlyweightMap.put(s, v1endpointsprovider);
        context = v1endpointsprovider;
        if (true) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append("No such API version: ").append(s).toString());
        context;
        com/walmartlabs/android/photo/net/EndpointsFactory;
        JVM INSTR monitorexit ;
        throw context;
    }

}
