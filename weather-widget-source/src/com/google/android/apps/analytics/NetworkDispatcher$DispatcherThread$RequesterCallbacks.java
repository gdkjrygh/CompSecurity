// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            Hit

class <init>
    implements <init>
{

    final this._cls0 this$0;

    public void pipelineModeChanged(boolean flag)
    {
        if (flag)
        {
            <init>(this._cls0.this, 30);
            return;
        } else
        {
            this._mth0(this._cls0.this, 1);
            return;
        }
    }

    public void requestSent()
    {
        Hit hit;
        if (this._mth0(this._cls0.this) != null)
        {
            if ((hit = this._mth0(this._cls0.this).emoveNextHit()) != null)
            {
                emoveNextHit(this._cls0.this)._mth0(hit.hitId);
                return;
            }
        }
    }

    public void serverError(int i)
    {
        this._mth0(this._cls0.this, i);
    }

    private ()
    {
        this$0 = this._cls0.this;
        super();
    }

    this._cls0(this._cls0 _pcls0_1)
    {
        this();
    }
}
