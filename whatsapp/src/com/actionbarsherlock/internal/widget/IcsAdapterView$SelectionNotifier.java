// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;


// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsAdapterView, AbsActionBarView

class <init>
    implements Runnable
{

    final IcsAdapterView this$0;

    public void run()
    {
label0:
        {
            if (mDataChanged)
            {
                if (getAdapter() == null)
                {
                    break label0;
                }
                post(this);
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            IcsAdapterView.access$200(IcsAdapterView.this);
        }
    }

    private ()
    {
        this$0 = IcsAdapterView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
