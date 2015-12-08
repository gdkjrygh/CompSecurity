// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.model;


// Referenced classes of package com.facebook.model:
//            OpenGraphAction

public static final class 
{

    public static OpenGraphAction createForPost()
    {
        return createForPost(com/facebook/model/OpenGraphAction, null);
    }

    public static OpenGraphAction createForPost(Class class1, String s)
    {
        class1 = (OpenGraphAction)te(class1);
        if (s != null)
        {
            class1.setType(s);
        }
        return class1;
    }

    public static OpenGraphAction createForPost(String s)
    {
        return createForPost(com/facebook/model/OpenGraphAction, s);
    }

    public ()
    {
    }
}
