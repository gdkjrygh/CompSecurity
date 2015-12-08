// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.facebook.model.GraphObject;

// Referenced classes of package com.facebook.widget:
//            PickerFragment

class this._cls0
    implements r.Filter
{

    final PickerFragment this$0;

    public boolean includeItem(GraphObject graphobject)
    {
        return filterIncludesItem(graphobject);
    }

    public volatile boolean includeItem(Object obj)
    {
        return includeItem((GraphObject)obj);
    }

    r.Filter()
    {
        this$0 = PickerFragment.this;
        super();
    }
}
