// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.content:
//            ModernAsyncTask, Loader

class <init> extends Handler
{

    public void handleMessage(Message message)
    {
        <init> <init>1 = (<init>)message.obj;
        message.what;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 37
    //                   2 56;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        ModernAsyncTask.access$500(<init>1.mTask, <init>1.mData[0]);
        if (!Loader.a) goto _L1; else goto _L3
_L3:
        <init>1.mTask.onProgressUpdate(<init>1.mData);
        return;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
