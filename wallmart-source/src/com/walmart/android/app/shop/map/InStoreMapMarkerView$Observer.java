// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapMarkerView

private class <init> extends ver
{

    final InStoreMapMarkerView this$0;

    public void onChanged()
    {
        InStoreMapMarkerView.access$200(InStoreMapMarkerView.this);
    }

    public void onInvalidated()
    {
        setMarkers(Collections.emptyList());
    }

    public void onVisualChanged(List list)
    {
        InStoreMapMarkerView.access$300(InStoreMapMarkerView.this, list);
    }

    private ver()
    {
        this$0 = InStoreMapMarkerView.this;
        super();
    }

    ver(ver ver)
    {
        this();
    }
}
