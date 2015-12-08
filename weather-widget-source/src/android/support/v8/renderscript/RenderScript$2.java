// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            RenderScript

class r extends android.renderscript.ErrorHandler
{

    final RenderScript this$0;

    public void run()
    {
        mErrorCallback.mErrorMessage = mErrorMessage;
        mErrorCallback.mErrorNum = mErrorNum;
        mErrorCallback.run();
    }

    ErrorHandler()
    {
        this$0 = RenderScript.this;
        super();
    }
}
