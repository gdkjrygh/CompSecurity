// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.view:
//            GestureDetectorCompat

private class this._cls1 extends Handler
{

    final this._cls1 this$1;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 56
    //                   2 76
    //                   3 84;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new RuntimeException((new StringBuilder("Unknown message ")).append(message).toString());
_L2:
        this._mth1(this._cls1.this)._mth1(this._mth1(this._cls1.this));
_L6:
        return;
_L3:
        this._mth1(this._cls1.this);
        return;
_L4:
        if (this._mth1(this._cls1.this) != null)
        {
            if (!this._mth1(this._cls1.this))
            {
                this._mth1(this._cls1.this)._mth1(this._mth1(this._cls1.this));
                return;
            } else
            {
                this._mth1(this._cls1.this, true);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }

    this._cls1(Handler handler)
    {
        this$1 = this._cls1.this;
        super(handler.getLooper());
    }
}
