// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            BaseObj, Script, RenderScript

public static final class mSlot extends BaseObj
{

    android.renderscript.Obj mN;
    Script mScript;
    int mSlot;

    (int i, RenderScript renderscript, Script script, int j)
    {
        super(i, renderscript);
        mScript = script;
        mSlot = j;
    }
}
