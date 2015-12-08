// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.BaseObj;
import android.renderscript.RSRuntimeException;
import android.renderscript.Script;
import android.renderscript.ScriptIntrinsicBlend;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsicBlend, RenderScriptThunker, ElementThunker, ExceptionThunker, 
//            AllocationThunker, RenderScript, Element, Allocation

class ScriptIntrinsicBlendThunker extends android.support.v8.renderscript.ScriptIntrinsicBlend
{

    ScriptIntrinsicBlend mN;

    ScriptIntrinsicBlendThunker(int i, RenderScript renderscript)
    {
        super(i, renderscript);
    }

    public static ScriptIntrinsicBlendThunker create(RenderScript renderscript, Element element)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        element = (ElementThunker)element;
        renderscript = new ScriptIntrinsicBlendThunker(0, renderscript);
        try
        {
            renderscript.mN = ScriptIntrinsicBlend.create(renderscriptthunker.mN, element.getNObj());
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        return renderscript;
    }

    public void forEachAdd(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachAdd(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachClear(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachClear(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachDst(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachDst(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachDstAtop(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachDstAtop(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachDstIn(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachDstIn(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachDstOut(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachDstOut(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachDstOver(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachDstOver(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachMultiply(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachMultiply(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachSrc(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachSrc(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachSrcAtop(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachSrcAtop(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachSrcIn(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachSrcIn(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachSrcOut(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachSrcOut(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachSrcOver(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachSrcOver(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachSubtract(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachSubtract(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public void forEachXor(Allocation allocation, Allocation allocation1)
    {
        allocation = (AllocationThunker)allocation;
        allocation1 = (AllocationThunker)allocation1;
        try
        {
            mN.forEachXor(allocation.getNObj(), allocation1.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public Script.KernelID getKernelIDAdd()
    {
        Script.KernelID kernelid = createKernelID(34, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDAdd();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDClear()
    {
        Script.KernelID kernelid = createKernelID(0, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDClear();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDDst()
    {
        Script.KernelID kernelid = createKernelID(2, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDDst();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDDstAtop()
    {
        Script.KernelID kernelid = createKernelID(10, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDDstAtop();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDDstIn()
    {
        Script.KernelID kernelid = createKernelID(6, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDDstIn();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDDstOut()
    {
        Script.KernelID kernelid = createKernelID(8, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDDstOut();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDDstOver()
    {
        Script.KernelID kernelid = createKernelID(4, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDDstOver();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDMultiply()
    {
        Script.KernelID kernelid = createKernelID(14, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDMultiply();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDSrc()
    {
        Script.KernelID kernelid = createKernelID(1, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDSrc();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDSrcAtop()
    {
        Script.KernelID kernelid = createKernelID(9, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDSrcAtop();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDSrcIn()
    {
        Script.KernelID kernelid = createKernelID(5, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDSrcIn();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDSrcOut()
    {
        Script.KernelID kernelid = createKernelID(7, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDSrcOut();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDSrcOver()
    {
        Script.KernelID kernelid = createKernelID(3, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDSrcOver();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDSubtract()
    {
        Script.KernelID kernelid = createKernelID(35, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDSubtract();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return kernelid;
    }

    public Script.KernelID getKernelIDXor()
    {
        Script.KernelID kernelid = createKernelID(11, 3, null, null);
        try
        {
            kernelid.mN = mN.getKernelIDXor();
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

    ScriptIntrinsicBlend getNObj()
    {
        return mN;
    }
}
