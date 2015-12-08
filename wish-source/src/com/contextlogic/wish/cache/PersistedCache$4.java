// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import java.io.File;

// Referenced classes of package com.contextlogic.wish.cache:
//            PersistedCache, DiskLruCache

class this._cls0
    implements Runnable
{

    final PersistedCache this$0;

    public void run()
    {
        try
        {
            PersistedCache.access$202(PersistedCache.this, DiskLruCache.open(new File(PersistedCache.access$300(PersistedCache.this)), 1, 1, 0x1e00000L));
            PersistedCache.access$102(PersistedCache.this, true);
            return;
        }
        catch (Throwable throwable)
        {
            PersistedCache.access$102(PersistedCache.this, false);
        }
    }

    ()
    {
        this$0 = PersistedCache.this;
        super();
    }
}
