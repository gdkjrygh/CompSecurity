// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import android.util.Log;

// Referenced classes of package com.walmartlabs.kangaroo.service:
//            Log

public static class  extends com.walmartlabs.kangaroo.service.Log
{

    static final int CHUNK_SIZE = 4000;
    private static final String EMPTY[] = new String[0];

    String[] chunkify(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        String as[] = EMPTY;
_L4:
        return as;
_L2:
        int j = s.length();
        int k = j / 4000;
        String as1[];
        int i;
        if (j % 4000 == 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        as1 = new String[k + i];
        i = 0;
        as = as1;
        if (i < as1.length)
        {
            k = i * 4000;
            as1[i] = s.substring(k, Math.min(j, k + 4000));
            i++;
            break MISSING_BLOCK_LABEL_48;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void exception(String s, String s1, Throwable throwable, boolean flag)
    {
        s1 = chunkify(s1);
        int j = s1.length;
        for (int i = 0; i < j; i++)
        {
            Log.e(s, s1[i], throwable);
        }

    }

    public void print(String s, String s1, boolean flag)
    {
        s1 = chunkify(s1);
        int j = s1.length;
        for (int i = 0; i < j; i++)
        {
            Log.d(s, s1[i]);
        }

    }


    public ( )
    {
        super();
    }
}
