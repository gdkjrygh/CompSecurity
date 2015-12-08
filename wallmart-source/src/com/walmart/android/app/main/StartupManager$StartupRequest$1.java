// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import com.walmart.android.service.AsyncCallback;

// Referenced classes of package com.walmart.android.app.main:
//            StartupManager

class this._cls0
    implements AsyncCallback
{

    final tResult this$0;

    public int getID()
    {
        return 0;
    }

    public void onCancelled()
    {
        if (cess._mth1000(this._cls0.this))
        {
            return;
        } else
        {
            tError(-1);
            return;
        }
    }

    public void onFailure(Integer integer, Object obj)
    {
        if (cess._mth1000(this._cls0.this))
        {
            return;
        } else
        {
            tError(integer.intValue());
            return;
        }
    }

    public volatile void onFailure(Object obj, Object obj1)
    {
        onFailure((Integer)obj, obj1);
    }

    public void onSuccess(Object obj)
    {
        if (cess._mth1000(this._cls0.this))
        {
            return;
        } else
        {
            tResult(obj);
            return;
        }
    }

    public void setID(int i)
    {
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
