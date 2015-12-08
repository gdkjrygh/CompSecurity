// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import java.util.ArrayList;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptGroup, Script

static class mScript
{

    int dagNumber;
    ArrayList mInputs;
    ArrayList mKernels;
    mScript mNext;
    ArrayList mOutputs;
    Script mScript;

    (Script script)
    {
        mKernels = new ArrayList();
        mInputs = new ArrayList();
        mOutputs = new ArrayList();
        mScript = script;
    }
}
