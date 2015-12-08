// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            SerializingExecutor

class this._cls0
{

    final SerializingExecutor this$0;

    public String toString()
    {
        String s = String.valueOf(super.toString());
        if (s.length() != 0)
        {
            return "SerializingExecutor lock: ".concat(s);
        } else
        {
            return new String("SerializingExecutor lock: ");
        }
    }

    ()
    {
        this$0 = SerializingExecutor.this;
        super();
    }
}
