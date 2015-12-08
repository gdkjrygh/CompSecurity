// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            GDataRequest, as

final class at
    implements b
{

    final b a;
    final as b;

    at(as as1, b b1)
    {
        b = as1;
        a = b1;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        obj = (GDataRequest)obj;
        a.a(obj, exception);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (GDataRequest)obj;
        obj1 = (Video)obj1;
        if (!((Video) (obj1)).paidContent && !((Video) (obj1)).isUpsell)
        {
            as.a(b, ((GDataRequest) (obj)), ((Video) (obj1)).streams);
        }
        a.a(obj, obj1);
    }
}
