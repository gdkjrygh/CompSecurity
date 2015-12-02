// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Collections;
import java.util.Map;

public class 
{

    private final Map asM;
    private final com.google.android.gms.internal.a.asN asN;

    public void a(String s, com.google.android.gms.internal.a a1)
    {
        asM.put(s, a1);
    }

    public Map ql()
    {
        return Collections.unmodifiableMap(asM);
    }

    public com.google.android.gms.internal.a qm()
    {
        return asN;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Properties: ").append(ql()).append(" pushAfterEvaluate: ").append(asN).toString();
    }
}
