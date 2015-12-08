// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo;


public interface JsonTransformer
{

    public abstract Object fromJson(String s, Class class1);

    public abstract String toJson(Object obj);
}
