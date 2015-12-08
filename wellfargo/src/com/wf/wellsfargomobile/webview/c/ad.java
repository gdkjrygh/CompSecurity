// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import java.util.Comparator;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ab

public class ad
    implements Comparator
{

    public ad()
    {
    }

    public int a(ab ab1, ab ab2)
    {
        return Integer.valueOf(ab1.a()).compareTo(Integer.valueOf(ab2.a()));
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ab)obj, (ab)obj1);
    }
}
