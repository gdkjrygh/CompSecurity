// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;


final class cs
{

    static final int a[];

    static 
    {
        a = new int[com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment.AclType.values().length];
        try
        {
            a[com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment.AclType.PRIVATE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment.AclType.DOMAIN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment.AclType.EXTENDED_CIRCLES.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment.AclType.SQUARE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment.AclType.PUBLIC.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
