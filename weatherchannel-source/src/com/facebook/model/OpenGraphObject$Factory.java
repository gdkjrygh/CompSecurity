// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.model;

import java.util.Arrays;

// Referenced classes of package com.facebook.model:
//            OpenGraphObject

public static final class 
{

    public static OpenGraphObject createForPost(Class class1, String s)
    {
        return createForPost(class1, s, null, null, null, null);
    }

    public static OpenGraphObject createForPost(Class class1, String s, String s1, String s2, String s3, String s4)
    {
        class1 = (OpenGraphObject)te(class1);
        if (s != null)
        {
            class1.setType(s);
        }
        if (s1 != null)
        {
            class1.setTitle(s1);
        }
        if (s2 != null)
        {
            class1.setImageUrls(Arrays.asList(new String[] {
                s2
            }));
        }
        if (s3 != null)
        {
            class1.setUrl(s3);
        }
        if (s4 != null)
        {
            class1.setDescription(s4);
        }
        class1.setCreateObject(true);
        class1.setData(te());
        return class1;
    }

    public static OpenGraphObject createForPost(String s)
    {
        return createForPost(com/facebook/model/OpenGraphObject, s);
    }

    public ()
    {
    }
}
