// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;


// Referenced classes of package com.contextlogic.wish.cache:
//            PersistedCache, DiskLruCache

class val.value
    implements Runnable
{

    final PersistedCache this$0;
    final String val$cacheKey;
    final String val$value;

    public void run()
    {
        or or = null;
        or or1 = PersistedCache.access$200(PersistedCache.this).edit(val$cacheKey);
        if (or1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        or = or1;
        or1.set(0, val$value);
        or = or1;
        or1.commit();
_L1:
        return;
        Throwable throwable1;
        throwable1;
        if (or != null)
        {
            try
            {
                or.abort();
                return;
            }
            catch (Throwable throwable)
            {
                return;
            }
        }
          goto _L1
    }

    or()
    {
        this$0 = final_persistedcache;
        val$cacheKey = s;
        val$value = String.this;
        super();
    }
}
