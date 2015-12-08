// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.BaseObj;
import android.renderscript.RSRuntimeException;
import android.renderscript.Script;
import android.renderscript.ScriptIntrinsic3DLUT;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsic3DLUT, RenderScriptThunker, ElementThunker, ExceptionThunker, 
//            AllocationThunker, RenderScript, Element, Allocation

class ScriptIntrinsic3DLUTThunker extends android.support.v8.renderscript.ScriptIntrinsic3DLUT
{

    ScriptIntrinsic3DLUT mN;

    private ScriptIntrinsic3DLUTThunker(int i, RenderScript renderscript, Element element)
    {
        super(i, renderscript, element);
    }

    public static ScriptIntrinsic3DLUTThunker create(RenderScript renderscript, Element element)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        ElementThunker elementthunker = (ElementThunker)element;
        renderscript = new ScriptIntrinsic3DLUTThunker(0, renderscript, element);
        try
        {
            renderscript.mN = ScriptIntrinsic3DLUT.create(renderscriptthunker.mN, elementthunker.getNObj());
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        return renderscript;
    }

    public void forEach(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEach(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public Script.KernelID getKernelID()
    {
        Script.KernelID kernelid = createKernelID(0, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelID();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    volatile BaseObj getNObj()
    {
        return getNObj();
    }

    volatile Script getNObj()
    {
        return getNObj();
    }

    ScriptIntrinsic3DLUT getNObj()
    {
        return mN;
    }

    public void setLUT(Allocation allocation)
    {
        allocation = (AllocationThunker)allocation;
        try
        {
            mN.setLUT(allocation.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }
}
