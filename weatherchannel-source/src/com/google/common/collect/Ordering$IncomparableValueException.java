// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            Ordering

static class value extends ClassCastException
{

    private static final long serialVersionUID = 0L;
    final Object value;

    (Object obj)
    {
        String s = String.valueOf(String.valueOf(obj));
        super((new StringBuilder(s.length() + 22)).append("Cannot compare value: ").append(s).toString());
        value = obj;
    }
}
