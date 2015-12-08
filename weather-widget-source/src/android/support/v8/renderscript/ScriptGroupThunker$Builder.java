// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.RSRuntimeException;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptGroupThunker, RenderScriptThunker, ExceptionThunker, TypeThunker, 
//            RenderScript, Type

public static final class eption
{

    android.renderscript..convertException bN;
    RenderScript mRS;

    public eption addConnection(Type type, eption eption, eption eption1)
    {
        type = (TypeThunker)type;
        try
        {
            bN.ection(type.getNObj(), eption.bN, eption1.bN);
        }
        // Misplaced declaration of an exception variable
        catch (Type type)
        {
            throw ExceptionThunker.convertException(type);
        }
        return this;
    }

    public eption addConnection(Type type, eption eption, eption eption1)
    {
        type = (TypeThunker)type;
        try
        {
            bN.ection(type.getNObj(), eption.bN, eption1.bN);
        }
        // Misplaced declaration of an exception variable
        catch (Type type)
        {
            throw ExceptionThunker.convertException(type);
        }
        return this;
    }

    public eption addKernel(eption eption)
    {
        try
        {
            bN.el(eption.bN);
        }
        // Misplaced declaration of an exception variable
        catch (eption eption)
        {
            throw ExceptionThunker.convertException(eption);
        }
        return this;
    }

    public ScriptGroupThunker create()
    {
        ScriptGroupThunker scriptgroupthunker = new ScriptGroupThunker(0, mRS);
        try
        {
            scriptgroupthunker.mN = bN.bN();
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
        return scriptgroupthunker;
    }

    (RenderScript renderscript)
    {
        RenderScriptThunker renderscriptthunker = (RenderScriptThunker)renderscript;
        mRS = renderscript;
        try
        {
            bN = new android.renderscript.er.Builder.bN(renderscriptthunker.mN);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw ExceptionThunker.convertException(renderscript);
        }
    }
}
