// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.connection;


// Referenced classes of package com.google.android.gms.nearby.connection:
//            Connections

public static interface 
{

    public abstract void onDisconnected(String s);

    public abstract void onMessageReceived(String s, byte abyte0[], boolean flag);
}
