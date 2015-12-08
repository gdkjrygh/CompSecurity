// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableList, RegularImmutableTable

private final class <init> extends ImmutableList
{

    final RegularImmutableTable this$0;

    public Object get(int i)
    {
        return getValue(i);
    }

    boolean isPartialView()
    {
        return true;
    }

    public int size()
    {
        return RegularImmutableTable.this.size();
    }

    private ()
    {
        this$0 = RegularImmutableTable.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
