// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import android.support.v4.util.LruCache;
import java.io.IOException;

// Referenced classes of package com.contextlogic.wish.cache:
//            PersistedCache, CachedObject, DiskLruCache

class this._cls0 extends LruCache
{

    final PersistedCache this$0;

    protected volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        entryRemoved(flag, (String)obj, (CachedObject)obj1, (CachedObject)obj2);
    }

    protected void entryRemoved(boolean flag, String s, CachedObject cachedobject, CachedObject cachedobject1)
    {
        super.entryRemoved(flag, s, cachedobject, cachedobject1);
        if (!flag || cachedobject == null) goto _L2; else goto _L1
_L1:
        cachedobject1 = PersistedCache.access$000(PersistedCache.this, s);
        if (!PersistedCache.access$100(PersistedCache.this)) goto _L2; else goto _L3
_L3:
        boolean flag1 = false;
        cachedobject1 = PersistedCache.access$200(PersistedCache.this).get(cachedobject1);
        if (cachedobject1 != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
_L9:
        if (flag1) goto _L2; else goto _L4
_L4:
        cachedobject = ((CachedObject) (cachedobject.getObject()));
        if (!(cachedobject instanceof String)) goto _L6; else goto _L5
_L5:
        cacheString(s, (String)cachedobject, true);
_L2:
        return;
_L6:
        if (!(cachedobject instanceof byte[])) goto _L2; else goto _L7
_L7:
        cacheBitmap(s, (byte[])(byte[])cachedobject, true);
        return;
        cachedobject1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected volatile int sizeOf(Object obj, Object obj1)
    {
        return sizeOf((String)obj, (CachedObject)obj1);
    }

    protected int sizeOf(String s, CachedObject cachedobject)
    {
        s = ((String) (cachedobject.getObject()));
        if (s instanceof byte[])
        {
            return ((byte[])(byte[])s).length;
        }
        if (s instanceof String)
        {
            return ((String)s).length() * 2;
        } else
        {
            return 1;
        }
    }

    (int i)
    {
        this$0 = PersistedCache.this;
        super(i);
    }
}
