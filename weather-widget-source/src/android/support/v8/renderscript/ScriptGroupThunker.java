// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.BaseObj;
import android.renderscript.RSRuntimeException;
import android.renderscript.ScriptGroup;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptGroup, ExceptionThunker, AllocationThunker, RenderScript, 
//            Allocation, RenderScriptThunker, TypeThunker, Type

class ScriptGroupThunker extends android.support.v8.renderscript.ScriptGroup
{
    public static final class Builder
    {

        android.renderscript.ScriptGroup.Builder bN;
        RenderScript mRS;

        public Builder addConnection(Type type, Script.KernelID kernelid, Script.FieldID fieldid)
        {
            type = (TypeThunker)type;
            try
            {
                bN.addConnection(type.getNObj(), kernelid.mN, fieldid.mN);
            }
            // Misplaced declaration of an exception variable
            catch (Type type)
            {
                throw ExceptionThunker.convertException(type);
            }
            return this;
        }

        public Builder addConnection(Type type, Script.KernelID kernelid, Script.KernelID kernelid1)
        {
            type = (TypeThunker)type;
            try
            {
                bN.addConnection(type.getNObj(), kernelid.mN, kernelid1.mN);
            }
            // Misplaced declaration of an exception variable
            catch (Type type)
            {
                throw ExceptionThunker.convertException(type);
            }
            return this;
        }

        public Builder addKernel(Script.KernelID kernelid)
        {
            try
            {
                bN.addKernel(kernelid.mN);
            }
            // Misplaced declaration of an exception variable
            catch (Script.KernelID kernelid)
            {
                throw ExceptionThunker.convertException(kernelid);
            }
            return this;
        }

        public ScriptGroupThunker create()
        {
            ScriptGroupThunker scriptgroupthunker = new ScriptGroupThunker(0, mRS);
            try
            {
                scriptgroupthunker.mN = bN.create();
            }
            catch (RSRuntimeException rsruntimeexception)
            {
                throw ExceptionThunker.convertException(rsruntimeexception);
            }
            return scriptgroupthunker;
        }

        Builder(RenderScript renderscript)
        {
            RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
            mRS = renderscript;
            try
            {
                bN = new android.renderscript.ScriptGroup.Builder(renderscriptthunker.mN);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (RenderScript renderscript)
            {
                throw ExceptionThunker.convertException(renderscript);
            }
        }
    }


    ScriptGroup mN;

    ScriptGroupThunker(int i, RenderScript renderscript)
    {
        super(i, renderscript);
    }

    public void execute()
    {
        try
        {
            mN.execute();
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    volatile BaseObj getNObj()
    {
        return getNObj();
    }

    ScriptGroup getNObj()
    {
        return mN;
    }

    public void setInput(Script.KernelID kernelid, Allocation allocation)
    {
        allocation = (AllocationThunker)allocation;
        try
        {
            mN.setInput(kernelid.mN, allocation.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Script.KernelID kernelid)
        {
            throw ExceptionThunker.convertException(kernelid);
        }
    }

    public void setOutput(Script.KernelID kernelid, Allocation allocation)
    {
        allocation = (AllocationThunker)allocation;
        try
        {
            mN.setOutput(kernelid.mN, allocation.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Script.KernelID kernelid)
        {
            throw ExceptionThunker.convertException(kernelid);
        }
    }
}
