// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;


// Referenced classes of package com.walmart.android.fragments:
//            PharmacyFragment

class this._cls0
    implements com.walmartlabs.android.pharmacy.ui.gListener
{

    final PharmacyFragment this$0;

    public void onClicked(int i, int j, Object aobj[])
    {
        popToRoot();
    }

    .DialogListener()
    {
        this$0 = PharmacyFragment.this;
        super();
    }
}
