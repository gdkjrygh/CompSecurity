// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap

private static class count
{

    int count;
    count head;
    count tail;

    ( )
    {
        head = ;
        tail = ;
        .viousSibling = null;
        .tSibling = null;
        count = 1;
    }
}
