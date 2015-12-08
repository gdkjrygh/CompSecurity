// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.content.res.Resources;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;
import android.renderscript.ScriptC;

// Referenced classes of package android.support.v8.renderscript:
//            RenderScriptThunker, AllocationThunker, ExceptionThunker, ElementThunker, 
//            FieldPacker, BaseObj, Allocation, Element

class ScriptCThunker extends ScriptC
{

    private static final String TAG = "ScriptC";

    protected ScriptCThunker(RenderScriptThunker renderscriptthunker, Resources resources, int i)
    {
        super(renderscriptthunker.mN, resources, i);
    }

    void thunkBindAllocation(Allocation allocation, int i)
    {
        android.renderscript.Allocation allocation1 = null;
        if (allocation != null)
        {
            allocation1 = ((AllocationThunker)allocation).mN;
        }
        try
        {
            bindAllocation(allocation1, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Allocation allocation)
        {
            throw ExceptionThunker.convertException(allocation);
        }
    }

    android.renderscript.Script.FieldID thunkCreateFieldID(int i, Element element)
    {
        try
        {
            element = createFieldID(i, ((ElementThunker)element).getNObj());
        }
        // Misplaced declaration of an exception variable
        catch (Element element)
        {
            throw ExceptionThunker.convertException(element);
        }
        return element;
    }

    android.renderscript.Script.KernelID thunkCreateKernelID(int i, int j, Element element, Element element1)
    {
        android.renderscript.Element element2 = null;
        Object obj = null;
        if (element != null)
        {
            element2 = ((ElementThunker)element).mN;
        }
        element = obj;
        if (element1 != null)
        {
            element = ((ElementThunker)element1).mN;
        }
        try
        {
            element = createKernelID(i, j, element2, element);
        }
        // Misplaced declaration of an exception variable
        catch (Element element)
        {
            throw ExceptionThunker.convertException(element);
        }
        return element;
    }

    void thunkForEach(int i, Allocation allocation, Allocation allocation1, android.support.v8.renderscript.FieldPacker fieldpacker)
    {
        android.renderscript.Allocation allocation2;
        allocation2 = null;
        Object obj1 = null;
        Object obj = null;
        if (allocation != null)
        {
            allocation2 = ((AllocationThunker)allocation).mN;
        }
        allocation = obj1;
        if (allocation1 != null)
        {
            allocation = ((AllocationThunker)allocation1).mN;
        }
        allocation1 = obj;
        if (fieldpacker == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        allocation1 = new FieldPacker(fieldpacker.getData());
        forEach(i, allocation2, allocation, allocation1);
        return;
        allocation;
        throw ExceptionThunker.convertException(allocation);
    }

    void thunkForEach(int i, Allocation allocation, Allocation allocation1, android.support.v8.renderscript.FieldPacker fieldpacker, Script.LaunchOptions launchoptions)
    {
        android.renderscript.Script.LaunchOptions launchoptions1;
        launchoptions1 = null;
        if (launchoptions == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        launchoptions1 = new android.renderscript.Script.LaunchOptions();
        if (launchoptions.getXEnd() > 0)
        {
            launchoptions1.setX(launchoptions.getXStart(), launchoptions.getXEnd());
        }
        if (launchoptions.getYEnd() > 0)
        {
            launchoptions1.setY(launchoptions.getYStart(), launchoptions.getYEnd());
        }
        if (launchoptions.getZEnd() > 0)
        {
            launchoptions1.setZ(launchoptions.getZStart(), launchoptions.getZEnd());
        }
        Object obj;
        Object obj1;
        launchoptions = null;
        obj1 = null;
        obj = null;
        if (allocation == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        launchoptions = ((AllocationThunker)allocation).mN;
        allocation = obj1;
        if (allocation1 == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        allocation = ((AllocationThunker)allocation1).mN;
        allocation1 = obj;
        if (fieldpacker == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        allocation1 = new FieldPacker(fieldpacker.getData());
        forEach(i, launchoptions, allocation, allocation1, launchoptions1);
        return;
        allocation;
_L2:
        throw ExceptionThunker.convertException(allocation);
        allocation;
        if (true) goto _L2; else goto _L1
_L1:
    }

    void thunkInvoke(int i)
    {
        try
        {
            invoke(i);
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    void thunkInvoke(int i, android.support.v8.renderscript.FieldPacker fieldpacker)
    {
        try
        {
            invoke(i, new FieldPacker(fieldpacker.getData()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v8.renderscript.FieldPacker fieldpacker)
        {
            throw ExceptionThunker.convertException(fieldpacker);
        }
    }

    void thunkSetTimeZone(String s)
    {
        try
        {
            setTimeZone(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw ExceptionThunker.convertException(s);
        }
    }

    void thunkSetVar(int i, double d)
    {
        try
        {
            setVar(i, d);
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    void thunkSetVar(int i, float f)
    {
        try
        {
            setVar(i, f);
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    void thunkSetVar(int i, int j)
    {
        try
        {
            setVar(i, j);
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    void thunkSetVar(int i, long l)
    {
        try
        {
            setVar(i, l);
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }

    void thunkSetVar(int i, BaseObj baseobj)
    {
        if (baseobj == null)
        {
            try
            {
                setVar(i, 0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (BaseObj baseobj)
            {
                throw ExceptionThunker.convertException(baseobj);
            }
        }
        try
        {
            setVar(i, baseobj.getNObj());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BaseObj baseobj)
        {
            throw ExceptionThunker.convertException(baseobj);
        }
    }

    void thunkSetVar(int i, android.support.v8.renderscript.FieldPacker fieldpacker)
    {
        try
        {
            setVar(i, new FieldPacker(fieldpacker.getData()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v8.renderscript.FieldPacker fieldpacker)
        {
            throw ExceptionThunker.convertException(fieldpacker);
        }
    }

    void thunkSetVar(int i, android.support.v8.renderscript.FieldPacker fieldpacker, Element element, int ai[])
    {
        try
        {
            setVar(i, new FieldPacker(fieldpacker.getData()), ((ElementThunker)element).mN, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v8.renderscript.FieldPacker fieldpacker)
        {
            throw ExceptionThunker.convertException(fieldpacker);
        }
    }

    void thunkSetVar(int i, boolean flag)
    {
        try
        {
            setVar(i, flag);
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw ExceptionThunker.convertException(rsruntimeexception);
        }
    }
}
