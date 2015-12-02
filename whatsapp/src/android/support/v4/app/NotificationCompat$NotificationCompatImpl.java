// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

interface 
{

    public abstract Notification build( );

    public abstract Bundle getExtras(Notification notification);

    public abstract ArrayList getParcelableArrayListForActions( a[]);
}
