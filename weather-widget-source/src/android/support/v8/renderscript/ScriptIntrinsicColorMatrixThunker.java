// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.BaseObj;
import android.renderscript.Matrix3f;
import android.renderscript.Matrix4f;
import android.renderscript.RSRuntimeException;
import android.renderscript.Script;
import android.renderscript.ScriptIntrinsicColorMatrix;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsicColorMatrix, RenderScriptThunker, ElementThunker, ExceptionThunker, 
//            AllocationThunker, Matrix3f, Matrix4f, RenderScript, 
//            Element, Allocation

class ScriptIntrinsicColorMatrixThunker extends android.support.v8.renderscript.ScriptIntrinsicColorMatrix
{

    ScriptIntrinsicColorMatrix mN;

    private ScriptIntrinsicColorMatrixThunker(int i, RenderScript renderscript)
    {
        super(i, renderscript);
    }

    public static ScriptIntrinsicColorMatrixThunker create(RenderScript renderscript, Element element)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        element = (ElementThunker)element;
        renderscript = new ScriptIntrinsicColorMatrixThunker(0, renderscript);
        try
        {
            renderscript.mN = ScriptIntrinsicColorMatrix.create(renderscriptthunker.mN, element.getNObj());
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

    ScriptIntrinsicColorMatrix getNObj()
    {
        return mN;
    }

    public void setColorMatrix(android.support.v8.renderscript.Matrix3f matrix3f)
    {
        try
        {
            mN.setColorMatrix(new Matrix3f(matrix3f.getArray()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v8.renderscript.Matrix3f matrix3f)
        {
            throw ExceptionThunker.convertException(matrix3f);
        }
    }

    public void setColorMatrix(android.support.v8.renderscript.Matrix4f matrix4f)
    {
        try
        {
            mN.setColorMatrix(new Matrix4f(matrix4f.getArray()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v8.renderscript.Matrix4f matrix4f)
        {
            throw ExceptionThunker.convertException(matrix4f);
        }
    }

    public void setGreyscale()
    {
        try
        {
            mN.setGreyscale();
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    public void setRGBtoYUV()
    {
        try
        {
            mN.setRGBtoYUV();
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    public void setYUVtoRGB()
    {
        try
        {
            mN.setYUVtoRGB();
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }
}
