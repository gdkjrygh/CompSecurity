// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.BaseObj;
import android.renderscript.RSRuntimeException;
import android.renderscript.Script;
import android.renderscript.ScriptIntrinsicYuvToRGB;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsicYuvToRGB, RenderScriptThunker, ElementThunker, ExceptionThunker, 
//            AllocationThunker, RenderScript, Element, Allocation

public class ScriptIntrinsicYuvToRGBThunker extends android.support.v8.renderscript.ScriptIntrinsicYuvToRGB
{

    ScriptIntrinsicYuvToRGB mN;

    private ScriptIntrinsicYuvToRGBThunker(int i, RenderScript renderscript)
    {
        super(i, renderscript);
    }

    public static ScriptIntrinsicYuvToRGBThunker create(RenderScript renderscript, Element element)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        element = (ElementThunker)element;
        renderscript = new ScriptIntrinsicYuvToRGBThunker(0, renderscript);
        try
        {
            renderscript.mN = ScriptIntrinsicYuvToRGB.create(renderscriptthunker.mN, element.getNObj());
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
        Script.FieldID fieldid = createFieldID(0, null);
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

    ScriptIntrinsicYuvToRGB getNObj()
    {
        return mN;
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
