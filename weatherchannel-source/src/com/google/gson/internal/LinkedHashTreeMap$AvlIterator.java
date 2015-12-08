// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;


// Referenced classes of package com.google.gson.internal:
//            LinkedHashTreeMap

static class 
{

    private stackTop stackTop;

    public  next()
    {
         2 = stackTop;
        if (2 == null)
        {
            return null;
        }
         1 = 2.stackTop;
        2.stackTop = null;
        for (  = 2.stackTop;  != null;  = .stackTop)
        {
            .stackTop = 1;
            1 = ;
        }

        stackTop = 1;
        return 2;
    }

    void reset(stackTop stacktop)
    {
        stackTop stacktop1 = null;
        for (; stacktop != null; stacktop = stacktop.stackTop)
        {
            stacktop.stackTop = stacktop1;
            stacktop1 = stacktop;
        }

        stackTop = stacktop1;
    }

    ()
    {
    }
}
