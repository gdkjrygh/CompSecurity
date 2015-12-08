// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.weeklyad;

import com.walmartlabs.kangaroo.service.Transformer;

// Referenced classes of package com.walmart.android.service.weeklyad:
//            WeeklyAdService, WeeklyAdItem, WeeklyAdWireItem

class this._cls0
    implements Transformer
{

    final WeeklyAdService this$0;

    public WeeklyAdItem transform(WeeklyAdWireItem weeklyadwireitem)
    {
        return WeeklyAdItem.from(weeklyadwireitem);
    }

    public volatile Object transform(Object obj)
    {
        return transform((WeeklyAdWireItem)obj);
    }

    ()
    {
        this$0 = WeeklyAdService.this;
        super();
    }
}
