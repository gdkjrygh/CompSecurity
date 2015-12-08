// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//            ByteString

interface FileLogStore
{

    public abstract void closeLogFile();

    public abstract void deleteLogFile();

    public abstract ByteString getLogAsByteString();

    public abstract void writeToLog(long l, String s);
}
