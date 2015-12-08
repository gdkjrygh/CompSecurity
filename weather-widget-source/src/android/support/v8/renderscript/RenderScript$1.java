// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            RenderScript

class ler extends android.renderscript.MessageHandler
{

    final RenderScript this$0;

    public void run()
    {
        mMessageCallback.mData = mData;
        mMessageCallback.mID = mID;
        mMessageCallback.mLength = mLength;
        mMessageCallback.run();
    }

    MessageHandler()
    {
        this$0 = RenderScript.this;
        super();
    }
}
