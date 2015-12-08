// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;


// Referenced classes of package com.walmart.android.app.home:
//            MerchandisingAdapter

class this._cls0
    implements er
{

    final MerchandisingAdapter this$0;

    public void onBitmapLoaded(int i, int j)
    {
        if (MerchandisingAdapter.access$000(MerchandisingAdapter.this) != null)
        {
            MerchandisingAdapter.access$000(MerchandisingAdapter.this).onNewDimensions(i, j);
        }
    }

    nnerDimensionsListener()
    {
        this$0 = MerchandisingAdapter.this;
        super();
    }
}
