// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.args;


// Referenced classes of package com.vladium.util.args:
//            IOptsParser

public static interface 
{

    public abstract String getCanonicalName();

    public abstract String getFirstValue();

    public abstract String getName();

    public abstract String getPatternPrefix();

    public abstract int getValueCount();

    public abstract String[] getValues();
}
