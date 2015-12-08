// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;


// Referenced classes of package com.contextlogic.wish.http:
//            LinkedBlockingQueue

static final class next
{

    Object item;
    next next;
    next prev;

    _cls9(Object obj, _cls9 _pcls9, _cls9 _pcls9_1)
    {
        item = obj;
        prev = _pcls9;
        next = _pcls9_1;
    }
}
