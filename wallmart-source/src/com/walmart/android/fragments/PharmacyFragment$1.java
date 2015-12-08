// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.Criteria;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.fragments:
//            PharmacyFragment

static final class 
    implements Criteria
{

    public boolean fullfilled(Presenter presenter)
    {
        return PharmacyFragment.sSecuredPresenters.contains(presenter.getClass());
    }

    public volatile boolean fullfilled(Object obj)
    {
        return fullfilled((Presenter)obj);
    }

    ()
    {
    }
}
