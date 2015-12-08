// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;


// Referenced classes of package com.contextlogic.wish.util:
//            StateSerializer

class this._cls0
    implements Runnable
{

    final StateSerializer this$0;

    public void run()
    {
        deleteAllSerializedStateSync();
    }

    ()
    {
        this$0 = StateSerializer.this;
        super();
    }
}
