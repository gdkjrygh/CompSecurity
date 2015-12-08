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
        Exception exception;
        try
        {
            if (PersistedCache.access$500(PersistedCache.this))
            {
                File file = new File(PersistedCache.access$300(PersistedCache.this));
                file.delete();
                file.mkdirs();
            }
            if (PersistedCache.access$600(PersistedCache.this))
            {
                File file1 = new File(PersistedCache.access$400(PersistedCache.this));
                file1.delete();
                file1.mkdirs();
            }
            PersistedCache.access$200(PersistedCache.this).close();
        }
        catch (Throwable throwable)
        {
            PersistedCache.access$700(PersistedCache.this);
            return;
        }
        finally
        {
            PersistedCache.access$700(PersistedCache.this);
        }
        PersistedCache.access$700(PersistedCache.this);
        return;
        throw exception;
    }

    ()
    {
        this$0 = PersistedCache.this;
        super();
    }
}
