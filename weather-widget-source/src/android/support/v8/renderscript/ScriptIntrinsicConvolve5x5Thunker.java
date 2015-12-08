// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.BaseObj;
import android.renderscript.RSRuntimeException;
import android.renderscript.Script;
import android.renderscript.ScriptIntrinsicConvolve5x5;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsicConvolve5x5, RenderScriptThunker, ElementThunker, ExceptionThunker, 
//            AllocationThunker, RenderScript, Element, Allocation

class ScriptIntrinsicConvolve5x5Thunker extends android.support.v8.renderscript.ScriptIntrinsicConvolve5x5
{

    ScriptIntrinsicConvolve5x5 mN;

    ScriptIntrinsicConvolve5x5Thunker(int i, RenderScript renderscript)
    {
        super(i, renderscript);
    }

    public static ScriptIntrinsicConvolve5x5Thunker create(RenderScript renderscript, Element element)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        element = (ElementThunker)element;
        renderscript = new ScriptIntrinsicConvolve5x5Thunker(0, renderscript);
        try
        {
            renderscript.mN = ScriptIntrinsicConvolve5x5.create(renderscriptthunker.mN, element.getNObj());
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
        return renderscript;
    }

    public void forEach(Allocation allocation)
    {
        allocation = (AllocationThunker)allocation;
        try
        {
            mN.forEach(allocation.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    public Script.FieldID getFieldID_Input()
    {
        Script.FieldID fieldid = createFieldID(1, null);
        try
        {
            fieldid.mN = mN.getFieldID_Input();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return fieldid;
    }

    public Script.KernelID getKernelID()
    {
        Script.KernelID kernelid = createKernelID(0, 2, null, null);
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

    ScriptIntrinsicConvolve5x5 getNObj()
    {
        return mN;
    }

    public void setCoefficients(float af[])
    {
        try
        {
            mN.setCoefficients(af);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (float af[])
        {
            throw ExceptionThunker.convertException(af);
        }
    }

    public void setInput(Allocation allocation)
    {
        allocation = (AllocationThunker)allocation;
        try
        {
            mN.setInput(allocation.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }
}
