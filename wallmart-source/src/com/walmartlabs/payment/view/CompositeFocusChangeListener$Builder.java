// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmartlabs.payment.view:
//            CompositeFocusChangeListener

public static class 
{

    private final List mListeners = new ArrayList();

    public  addListener(android.view.istener.Builder builder)
    {
        mListeners.add(builder);
        return this;
    }

    public CompositeFocusChangeListener build()
    {
        return new CompositeFocusChangeListener(this);
    }


    public ()
    {
    }
}
