// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;


public interface Person
{
    public static interface Image
    {

        public abstract String getUrl();
    }


    public abstract String getDisplayName();

    public abstract String getId();

    public abstract Image getImage();
}
